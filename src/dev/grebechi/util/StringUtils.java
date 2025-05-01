package dev.grebechi.util;


public class StringUtils {
    
    public static String capitalizarNome(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
