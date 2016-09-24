/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hopital;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Prabhash
 */
public class Validate {
    public static boolean validateEmail(String email) { 
        boolean status=false; 
        String EMAIL_PATTERN; 
        EMAIL_PATTERN = "^[a-zA-Z0-9]{1,30}@[a-zA-Z0-9]{1,30}.[a-zA-Z]{2,3}$";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN); 
        Matcher matcher=pattern.matcher(email); 
        if(matcher.matches()){ 
            status=true; 
        } 
        else{
            status=false; 
        } 
        return status; 
    }
}