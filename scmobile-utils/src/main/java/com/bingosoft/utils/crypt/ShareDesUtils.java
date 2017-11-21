package com.bingosoft.utils.crypt;



public class ShareDesUtils {
	private static String key = "bingosoftwdasdasdwdasdsdshare!@#$%";

    public static boolean isStringInArray(String str, String[] array){
        for (String val:array){
            if(str.equals(val)){
                return true;
            }
        }
        return false;
    }

    public static String encode(String str){
        String enStr = "";
        try {
            enStr = DesUtils.encrypt(str, key);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return enStr;
    }

    public static String decode(String str) {
        String deStr = "";
        try {
            deStr = DesUtils.decrypt(str, key);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return deStr;
    }
}
