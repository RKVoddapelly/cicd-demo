/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guruofjava.learning.cicd.demo;

import java.time.LocalDateTime;

/**
 *
 * @author DigitallSchool <rupeshkumar@digitallschool.com>
 */
public class Main {

    public static void main(String[] args) {
        Member m1 = new Member();
        
        System.out.println("Hello to CI/CD through Jenkins: " + LocalDateTime.now());
    }
}
