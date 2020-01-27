package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StackAPI {
    Stack myStack;
    StackAPI(){
        myStack = new Stack();
    }
    @GetMapping("/getall")
    public String[] getAll(){
        return myStack.get_all();
    }
    @PostMapping("/push")
    public boolean push(String data){
        return myStack.push(data);
    }
    @GetMapping("/pop")
    public String pop(){
        return myStack.pop();
    }
    @PostMapping("/clear")
    public boolean clear(){
        return myStack.reset();
    }
}
