package com.learning.optionalClass;

import java.util.Locale;
import java.util.Optional;
import java.util.logging.LoggingPermission;

public class OptionalExample {

    public String getUserByName(int userId){
        if (userId == 0){
            return null;
        }
        return "Manju";
    }

    public Optional<String> getUserByNameWithOptional(int userId){
        if (userId == 0){
            return Optional.empty();
        }
        return Optional.of("Manju");
    }

    public static void main(String[] args) {

        OptionalExample user = new OptionalExample();

        //Without Optional
        String notOptional = String.valueOf(user.getUserByName(0));
        System.out.println(notOptional);

        //Optional
//        Optional<String> optionalString = user.getUserByName(123).describeConstable();
//        optionalString.ifPresentOrElse(
//              System.out::println,
//              ()-> System.out.println("Not Found")
//        );

//        System.out.println(optionalString);

    }

}
