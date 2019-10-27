package com.test.controller;

import org.junit.Test;

import java.sql.Time;

public class NormalTest {

    @Test
    public void test() {
        Time myTime = Time.valueOf("13:23:00");
        System.out.println(myTime);
    }
}
