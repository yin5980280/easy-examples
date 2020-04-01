package com.vartime.easy.examples.DES3util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author wanglin
 * @version 1.0
 * @date 2018/11/26.
 */
public class Disguiser {
    public static final String ENCODE = "UTF-8";
    private static final String KEY = "8data998mnwepxugnk03-2zirb";

    public static String disguiseMD5(String message) {

        if (null == message) {

            return null;
        }

        return disguiseMD5(message, ENCODE);
    }

    public static String disguise(String message){
        return disguise(message+KEY,ENCODE);

    }
    public static String disguise(String message,String encoding){
        message = message.trim();
        byte value[];
        try{
            value = message.getBytes(encoding);
        }
        catch(UnsupportedEncodingException e){
            value = message.getBytes();
        }
        MessageDigest md = null;
        try{
            md = MessageDigest.getInstance("SHA");
        }catch(NoSuchAlgorithmException e){
            e.printStackTrace();
            return null;
        }
        return ConvertUtils.toHex(md.digest(value));
    }

    public static String disguiseMD5(String message, String encoding) {

        if (null == message || null == encoding) {

            return null;
        }

        message = message.trim();
        byte value[];
        try {
            value = message.getBytes(encoding);
        } catch (UnsupportedEncodingException e) {
            value = message.getBytes();
        }
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
        return ConvertUtils.toHex(md.digest(value));
    }

    public static void main(String[] args) {
        System.out.println(disguiseMD5("&MerchantSettlement&0003&E1800010627&p_20171222191544&" + "fd95Gv3ZAGE02kv8oTM6yFfMKeU63XW0"));
    }

}
