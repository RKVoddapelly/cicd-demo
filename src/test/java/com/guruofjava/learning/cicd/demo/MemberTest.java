/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guruofjava.learning.cicd.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DigitallSchool <rupeshkumar@digitallschool.com>
 */
public class MemberTest {
    
    public MemberTest() {
    }

    @Test
    public void testGetMemberId() {
        System.out.println("getMemberId");
        Member instance = new Member();
        int expResult = 0;
        int result = instance.getMemberId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /*@Test
    public void testSetMemberId() {
        System.out.println("setMemberId");
        int memberId = 0;
        Member instance = new Member();
        instance.setMemberId(memberId);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        Member instance = new Member();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Member instance = new Member();
        instance.setName(name);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Member instance = new Member();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Member instance = new Member();
        instance.setEmail(email);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMobile() {
        System.out.println("getMobile");
        Member instance = new Member();
        String expResult = "";
        String result = instance.getMobile();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMobile() {
        System.out.println("setMobile");
        String mobile = "";
        Member instance = new Member();
        instance.setMobile(mobile);
        fail("The test case is a prototype.");
    }*/
    
}
