/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java 
 */
package com.raven.component;

/**
 *
 * @author Thierry
 */
public class MasterClass {
    public static boolean checkEmail(String email) {
        return email.matches("^[\\w.-]+@(gmail|yahoo|hotmail)\\.com$");
    }
    
    public static int getStringLength(String txt) {
        return txt.length();
    }
    
    public static String changeToUpper(String txt) {
        return txt.toUpperCase();
    }
    
    public static boolean validatePassword(String password) {
        if (password.length() < 8 || password.length() > 12) {
            return false;
        }
        return password.matches("^[A-Z]+$");
    }
}