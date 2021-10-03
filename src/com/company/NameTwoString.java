//Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
//
//The output should be two capital letters with a dot separating them.
//
//It should look like this:
//
//Sam Harris => S.H
//
//patrick feeney => P.F

package com.company;

public class NameTwoString {
        public String abbrevName(String name) {
            char check = 0;
            String name2 = name.charAt(0) + ".";
            for (int i =0; i<name.length(); i++) {
                check = name.charAt(i);
                if (Character.isWhitespace(check)){
                    name2 += name.charAt(i+1);
                }
            }
            return name2.toUpperCase();
        }
    }
