package com.company.assignmentday12;

import com.sun.deploy.net.proxy.RemoveCommentReader;

import java.util.Locale;

public class StringDemo2 {
    public static void main(String[] args){

        String st = "Hi, How are you";
        String str = "Im fine thank you";
        //String r = st.trim();
        System.out.println(st.toLowerCase(Locale.ROOT));
        System.out.println(st.toUpperCase(Locale.ROOT));
        System.out.println(st.compareTo(str));
        //System.out.println(st.toCharArray());
        System.out.println(st.split("o",2));

    }
}
