package com.ynov.oop;

public class App 
{
    public static void main( String[] args )
    {
        String newid;
        Badge b = new Badge("rebadge");
        System.out.println(b.getId());

        Student paul = new Student("Paul");

        paul.setBadge(b);
        System.out.println(paul.getBadge());
    }

    
}
