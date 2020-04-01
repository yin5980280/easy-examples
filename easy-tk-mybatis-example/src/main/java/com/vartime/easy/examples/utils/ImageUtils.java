package com.vartime.easy.examples.utils;

import org.springframework.util.Base64Utils;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * @author : yinlin
 * @version : 1.0
 * @date : 2019-06-26 16:16
 * @Description :
 * @Copyright : Copyright (c) 2018
 * @Company : EasySite Technology Chengdu Co. Ltd.
 * @link : com.vartime.easy.examples.utils.ImageUtils
 */
public class ImageUtils {

    public static String drawBase64Image(String str, int width, int height, int fontWeight) throws IOException {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Graphics graphics = image.createGraphics();
        graphics.setClip(0, 0, width, height);
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, width, height);
        graphics.setColor(Color.BLACK);
        Font font = new Font("微软雅黑", Font.BOLD, fontWeight);
        graphics.setFont(font);
        Rectangle rectangle = graphics.getClipBounds();
        FontMetrics fontMetrics = graphics.getFontMetrics(font);
        int ascent = fontMetrics.getAscent();
        int descent = fontMetrics.getDescent();
        int y = (rectangle.height - (ascent + descent)) / 2 + ascent;
        graphics.drawString(str, 30, y);
        graphics.dispose();
        ImageIO.write(image, "png", outputStream);
        return "data:image/png;base64," + Base64Utils.encodeToString(outputStream.toByteArray());
    }

    public static void main(String[] args) throws IOException {
        System.out.println(drawBase64Image("殷林", 300, 200, 30).replaceAll("[\\s*\t\n\r]", ""));

    }
}
