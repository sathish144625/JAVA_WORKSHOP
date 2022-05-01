package com.Myfirstm_Maven.example;

import org.apache.struts2.StrutsTestCase;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class MyactionTest extends StrutsTestCase {

    public void testHelloWorld() throws Exception {
        Myaction ma = container.inject(Myaction.class);
        ActionContext.getContext().getContainer().inject(ma);
        String result = ma.execute();
        assertEquals("Expected a success result!", ActionSupport.SUCCESS, result);
        assertEquals("Expected the default message!", ma.getText(Myaction.MESSAGE), ma.getMessage());
    }

}
