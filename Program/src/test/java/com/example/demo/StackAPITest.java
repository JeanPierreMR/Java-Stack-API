package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

class StackAPITest {
    StackAPI API = new StackAPI();
    @org.junit.jupiter.api.Test
    void getAll() {
        String sesiones[] = new String[100];
        assertArrayEquals(sesiones, API.getAll());
//        API.getAll();
    }



    @org.junit.jupiter.api.Test
    void push() {
        assertEquals(true, API.push("sesion 17 feb 2019"));
    }



    @org.junit.jupiter.api.Test
    void pop() {

        API.push("sesion 19 feb 2019");
        assertEquals("sesion 19 feb 2019", API.pop());
    }
    @org.junit.jupiter.api.Test
    void clear() {

        API.clear();
        assertEquals("Theres nothing in the stack", API.pop());
    }

}