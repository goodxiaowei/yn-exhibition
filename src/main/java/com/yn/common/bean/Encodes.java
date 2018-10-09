package com.yn.common.bean;public class Encodes {  private static final String DEFAULT_URL_ENCODING = "UTF-8";  private static final char[] BASE62 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();  private static final char[] BASE10 = "0123456789".toCharArray();  public static String encodeBase62(byte[] input)  {    char[] chars = new char[input.length];    for (int i = 0; i < input.length; i++) {      chars[i] = BASE62[((input[i] & 0xFF) % BASE62.length)];    }    return new String(chars);  }  public static String encodeBase10(byte[] input)  {    char[] chars = new char[input.length];    for (int i = 0; i < input.length; i++) {      chars[i] = BASE10[((input[i] & 0xFF) % BASE10.length)];    }    return "18" + new String(chars);  }}