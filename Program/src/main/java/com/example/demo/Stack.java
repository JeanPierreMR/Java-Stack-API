package com.example.demo;

public class Stack {
    int initial_size = 100;
    int top, size;
    String sesiones[]; // Maximum size of Stack

    Stack()
    {
        reset();
    }
    private void resize(double percentage){
        size = (int)Math.floor(size * percentage);
        String TemporalSesiones[] = new String[size];
        System.arraycopy(sesiones, 0, TemporalSesiones, 0, top+1);
        sesiones = TemporalSesiones;
    }
    boolean push(String data)
    {
        if(top >= (size - 1)) {
            resize(1.5);
        }
        top++;
        sesiones[top] = data;
        return true;
    }

    public String pop()
    {
        if (top < 0) {
            return "Theres nothing in the stack";
        }
        else {
            String data = sesiones[top];
            top--;
            if(top < size /2){
                if(top > 200){
                    resize(0.6);
                }
            }
            return data;
        }
    }

    String[] get_all()
    {
        return sesiones;
    }
    boolean reset()
    {
        size = initial_size;
        sesiones = new String[size];
        top = -1;
        return true;
    }
}
