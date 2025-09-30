/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicalassignment1;

import java.util.Scanner;

/**
 *
 * @author user
 */

// custom exception
class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}
public class Question_2b {
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a value: ");
            int value = sc.nextInt();
            checkValue(value);
        }
        catch(CustomException e){
            System.out.println("Caught an exception: "+ e.getMessage());
        }
    }
    static void checkValue(int num) throws CustomException{
        if(num<0){
            throw new CustomException("Value cannot be negative");
        }
        else{
            System.out.println("Value is valid");
        }
    }
}
