package com.yosefmoq.moamenprojecttest.utils;

import android.text.TextUtils;
import android.util.Patterns;

public class Validator {
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        public boolean isEmailValid(String email){
                if(email.length()>10&&email.contains("@")&&email.contains(".")){
                        return true;
                }
                return false;
        }


        public  boolean isValidUsername(String name){
                return name.length()>6;
        }
        public  boolean isValidPassword(String password){
                return password.length()>6;
        }
}
