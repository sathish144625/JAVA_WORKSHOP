package com.Myfirstm_Maven.example;

import org.apache.struts2.StrutsTestCase;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class logTest extends StrutsTestCase {

    public void testHelloWorld() throws Exception {
    	
        log ma = container.inject(log.class);
        ActionContext.getContext().getContainer().inject(ma);
        String result = ma.execute();
        assertEquals("Expected a success result!", ActionSupport.SUCCESS, result);
        assertEquals("Expected the default message!", ma.getText(log.MESSAGE), ma.getMessage());
    }

}
