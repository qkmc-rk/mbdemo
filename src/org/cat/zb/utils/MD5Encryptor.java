package org.cat.zb.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

public class MD5Encryptor {

	/*
	 * easy encryption 'md5'
	 * 
	 * */
	public static String EncoderByMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		MessageDigest md5=MessageDigest.getInstance("MD5");
		BASE64Encoder base64en = new BASE64Encoder();
		String newstr=base64en.encode(md5.digest(str.getBytes("utf-8")));
		return newstr;
	 }
}
