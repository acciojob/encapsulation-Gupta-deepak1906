package com.driver;

public class RWOnly {
    private String name;

    //constructor
    public RWOnly(String name)
    {
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public String setName(String name){
        return name;
    }
    
}
