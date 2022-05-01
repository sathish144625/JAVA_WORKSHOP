package com.Form.example;



import com.opensymphony.xwork2.ActionSupport;

import com.Form.*;

public class Rigister extends ActionSupport {
    
    private static final long serialVersionUID = 1L;
    
    private com.Form.example.Person personBean;


    public String execute() throws Exception {
        //call Service class to store personBean's state in database
        System.out.println("inside EXECUTE method..");
        return SUCCESS;
    }
    
    public Person getPersonBean() {
        return personBean;
    }
    
    public void setPersonBean(Person person) {
        personBean = person;
    }

}
