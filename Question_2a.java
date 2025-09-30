/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicalassignment1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author user
 */
public class Question_2a {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,5,20,30,6);
        List<Integer> divisibleByFive = list.stream().filter(n -> n%5 ==0).collect(Collectors.toList());
        
        System.out.println("Numbers divisible by 5: "+ divisibleByFive);
    }
}

