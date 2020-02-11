/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guruofjava.learning.cicd.demo;

/**
 *
 * @author DigitallSchool <rupeshkumar@digitallschool.com>
 */
public class Member {

    private int memberId;
    private String name;
    private String email;
    private String mobile;

    public Member() {
        super();
    }

    public Member(int memberId, String name, String email, String mobile) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
