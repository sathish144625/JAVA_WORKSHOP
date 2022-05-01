
package com.Myfirstm_Maven.example;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class log extends ExampleSupport {

    public String execute() throws Exception {
        setMessage(getText(MESSAGE));
        return SUCCESS;
    }

    
    public static final String MESSAGE = "HelloWorld.message";

  
    private String message;

  
    public String getMessage() {
        return message;
    }

   
    public void setMessage(String message) {
        this.message = message;
    }
}

