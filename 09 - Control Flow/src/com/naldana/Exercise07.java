package com.naldana;

public class Exercise07 {
    //TODO
    public static void main(String[] args) {
        int season = 1;
        String message;

        switch (season){
            case 1:
                message = "You're in Spring";
                break;
            case 2:
                message = "You're in Summer";
                break;
            case 3:
                message = "You're in Fall";
                break;
            case 4:
                message = "You're in Winter";
                break;
            default:
                message = "That's not a season";
        }

        System.out.println(message);
    }
}
