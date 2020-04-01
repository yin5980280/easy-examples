package com.vartime.easy.examples.DES3util;


import java.io.UnsupportedEncodingException;
import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;


public class Des3Encryption {

	/**
	 * 不能改不能改不能改不能改不能改
	 */
	public static final String key = "sv0MZSKWy7AaHRIESbr0nbrj";

	public static final String CHAR_ENCODING = "UTF-8";
	public static final String CHAR_ENCODING2 = "GBK";

	public static byte[] encode(byte[] key, byte[] data) throws Exception {
		return MessageAuthenticationCode.des3Encryption(key, data);
	}


	public static void main(String[] args) throws UnsupportedEncodingException {
		//System.out.println(Des3Encryption.decode("sv0MZSKWy7AaHRIESbr0nbrj", "16864110548832799"));
		//String end = Des3Encryption.encode("sv0MZSKWy7AaHRIESbr0nbrj", "16864110548832799");
		//System.out.println(Des3Encryption.decode("sv0MZSKWy7AaHRIESbr0nbrj", end));
		String sign = "pjZraxRc94utt8vfN+p9yLcQ1GA/HUlxNAke8iKa2bLpJY5UtwD9ozhsDERXTrXYGrKjUSlGPWcngPo9YR8am1j4/iS5Cgun8fDM+pgfHIAmB4+wmYAMBZEV624t1c/6FF1PHWBvZSRHC/Nq1yrfPrk9xYWx/a9WunkhKGfW5GJbNxM5MeGN2/QH0tQGdAzEkhmLbBSJgg3ssqmwEWXB85oLjEfoB+kZP3BT86P5ExaFSzdWQYUJEJEO1CGAOlO+7WsWTaR2PIPm/+13JecBbJDOUZDmBzsBflOYljGrKXegZMSzro5Z4w==";
		String desStr = Des3Encryption.decode("YFQIiGXsyy2CMzSjhpOh6cVw", sign);
		System.out.println(desStr);
	}

	public static byte[] decode(byte[] key, byte[] value) throws Exception {
		return MessageAuthenticationCode.des3Decryption(key, value);
	}

	public static String encode(String key, String data) {
		try {
			byte[] keyByte = key.getBytes(CHAR_ENCODING);
			byte[] dataByte = data.getBytes(CHAR_ENCODING);
			byte[] valueByte = MessageAuthenticationCode.des3Encryption(
					keyByte, dataByte);
			String value = new String(Base64.encode(valueByte), CHAR_ENCODING);
			return value;
		} catch (Exception e) {
			return null;
		}
	}

	public static String decode(String key, String value){
		try {
			byte[] keyByte = key.getBytes(CHAR_ENCODING);
			byte[] valueByte = Base64.decode(value.getBytes(CHAR_ENCODING));
			byte[] dataByte = MessageAuthenticationCode.des3Decryption(keyByte,
					valueByte);
			String data = new String(dataByte, CHAR_ENCODING);
			return data;
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * des3解密方法
	 * @param key
	 * @param value
	 * @return
	 * @throws Exception 解密失败抛出异常
     */
	public static String decodeByDes3Key(String key, String value) throws Exception{

		byte[] keyByte = key.getBytes(CHAR_ENCODING);
		byte[] valueByte = Base64.decode(value.getBytes(CHAR_ENCODING));
		byte[] dataByte = MessageAuthenticationCode.des3Decryption(keyByte,
				valueByte);
		String data = new String(dataByte, CHAR_ENCODING);
		return data;
	}

	public static String encryptToHex(String key, String data){
		try {
			byte[] keyByte = key.getBytes(CHAR_ENCODING);
			byte[] dataByte = data.getBytes(CHAR_ENCODING);
			byte[] valueByte = MessageAuthenticationCode.des3Encryption(
					keyByte, dataByte);
			String value = ConvertUtils.toHex(valueByte);
			return value;
		} catch (Exception e) {
			return null;
		}
	}
	public static String encryptToHexByGBK(String key, String data){
		try {
			byte[] keyByte = key.getBytes(CHAR_ENCODING2);
			byte[] dataByte = data.getBytes(CHAR_ENCODING2);
			byte[] valueByte = MessageAuthenticationCode.des3Encryption(
					keyByte, dataByte);
			String value = ConvertUtils.toHex(valueByte);
			return value;
		} catch (Exception e) {
			return null;
		}
	}


	public static String udpEncrypt(String key, String data){
		try {
			Key k = updGenerateKey(key);
			IvParameterSpec IVSpec = new IvParameterSpec(new byte[8]);
			//加密
			Cipher c = Cipher.getInstance("DESede/CBC/PKCS5Padding");
			c.init(1,k,((java.security.spec.AlgorithmParameterSpec) (IVSpec)));
			byte output[] = c.doFinal(data.getBytes("UTF-8"));
			return new String(Base64.encode(output), "UTF-8");
		} catch (Exception e) {
			return null;
		}
	}

	public static Key updGenerateKey(String key){
		try{
			DESedeKeySpec KeySpec = new DESedeKeySpec(UdpHexDecode(key));
			SecretKeyFactory KeyFactory = SecretKeyFactory.getInstance("DESede");
			// 生成密钥
			Key k = ((Key) (KeyFactory.generateSecret(((java.security.spec.KeySpec) (KeySpec)))));
			return k;
		}catch(Exception e){
			return null;
		}
	}

	public static String udpDecrypt(String key, String data){
		try{
			byte[] input = Base64.decode(data.getBytes("UTF-8"));
			Key k = updGenerateKey(key);
			IvParameterSpec IVSpec = new IvParameterSpec(new byte[8]);
			Cipher c = Cipher.getInstance("DESede/CBC/PKCS5Padding");
			c.init(2, k, ((java.security.spec.AlgorithmParameterSpec) (IVSpec)));
			byte output[] = c.doFinal(input);
			return new String(output, "UTF-8");
		}catch(Exception e){
			return null;
		}
	}

    public static byte[] UdpHexDecode(String s)
    {
        byte abyte0[] = new byte[s.length() / 2];
        String s1 = s.toLowerCase();
        for(int i = 0; i < s1.length(); i += 2)
        {
            char c = s1.charAt(i);
            char c1 = s1.charAt(i + 1);
            int j = i / 2;
            if(c < 'a')
                abyte0[j] = (byte)(c - 48 << 4);
            else
                abyte0[j] = (byte)((c - 97) + 10 << 4);
            if(c1 < 'a')
                abyte0[j] += (byte)(c1 - 48);
            else
                abyte0[j] += (byte)((c1 - 97) + 10);
        }
        return abyte0;
    }

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub

	}




}
