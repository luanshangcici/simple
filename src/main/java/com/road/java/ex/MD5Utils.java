package com.road.java.ex;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * MD5加密是JAVA应用中常见的算法，
 * 请写出两个MD5算法生成32位大写的CapitalMD5方法  和 生成32位小写的 AngelinaMD5方法
 * @author Administrator
 *
 */
public class MD5Utils {
	
	public static void main(String[] args) {
		System.out.println(MD5Utils.CapitalMD5("1"));
		System.out.println(MD5Utils.AngelinaMD5("mytoken"));
	}
	
	public static String CapitalMD5(String str){
		return DigestUtils.md5Hex(str).toUpperCase();
	}

	public static String AngelinaMD5(String str){
		return DigestUtils.md5Hex(str);
	}

}
