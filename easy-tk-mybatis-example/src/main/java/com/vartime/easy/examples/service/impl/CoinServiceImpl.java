package com.vartime.easy.examples.service.impl;

import com.vartime.easy.examples.entity.Coin;
import com.vartime.easy.examples.service.CoinService;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.InetAddress;

import cn.org.easysite.spring.boot.tk.mybatis.core.repository.impl.AbstractBaseLogicRepositoryImpl;

/**
 * @author : yinlin
 * @version : 1.0
 * @date : 2019-01-29 10:54
 * @Description :
 * @Copyright : Copyright (c) 2018
 * @Company : 熊猫科技 Technology(Beijing) Chengdu Co. Ltd.
 * @link : com.vartime.easy.examples.service.impl.UserServiceImpl
 */
@Service
public class CoinServiceImpl extends AbstractBaseLogicRepositoryImpl<Coin> implements CoinService {

    @Override
    @Async
    public void processor() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://www.chainwhy.com/coin?page=";
        String coinUrl = "https://www.chainwhy.com";

        for (int i = 1; i <= 24; i ++) {

            String body = restTemplate.getForObject(url + i, String.class);
            //System.out.println(body);
            Document doc = Jsoup.parse(body);

            Elements elements = doc.select("div.main div.list-pro ul.ta-c li");

            for (Element element : elements) {
                try {
                    Coin coin = new Coin();
                    Element a = element.selectFirst("a");
                    Element a2 = element.selectFirst("p a");
                    // System.out.println(a.attr("href"));
                    // System.out.println(a2.text());
                    coin.setName(a2.text());
                    if (selectOne(coin) != null) {
                        continue;
                    }
                    String coinBody = restTemplate.getForObject(coinUrl + a.attr("href"), String.class);
                    Document coinDoc = Jsoup.parse(coinBody);
                    Element coinAddr = coinDoc.selectFirst("div.main div.row dd ul.row li.cor a");
                    //System.out.println(coinAddr.attr("href"));
                    String coinUrlAddr = coinAddr.attr("href");
                    coin.setSite(coinUrlAddr);
                    coinUrlAddr = coinUrlAddr.replaceAll("https://", "");
                    coinUrlAddr = coinUrlAddr.replaceAll("http://", "");
                    if (coinUrlAddr.endsWith("/")) {
                        coinUrlAddr = coinUrlAddr.substring(0, coinUrlAddr.length() - 1);
                    }
                    InetAddress ia2 = null;
                    ia2 = InetAddress.getByName(coinUrlAddr);
                   // System.out.println(ia2.toString());
                    //System.out.println(ia2.getHostName());//域名               127
                    //System.out.println(ia2.getHostAddress());//ip地址
                    coin.setIp(ia2.getHostAddress());
                    insert(coin);
                    System.out.println(coin.toString());
                } catch (Exception e) {
                    System.out.println(element.toString());
                    e.printStackTrace();
                }

            }
        }
    }
}
