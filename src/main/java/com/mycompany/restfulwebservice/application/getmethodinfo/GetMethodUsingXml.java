/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.restfulwebservice.application.getmethodinfo;

import com.mycompany.restfulwebservice.pojo.PersonClass;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author bmogu
 */
@Path("/getxml")
public class GetMethodUsingXml {
    
    @GET
    @Path("getAvalueXml")
    @Produces(MediaType.APPLICATION_XML)
    public PersonClass GetAvalueXml(){
        PersonClass person=new PersonClass();
        
        person.setName("veli");
        person.setSurName("çelik");
        person.setCity("Ankara");
        person.setPhoneNumber("05xxxxxxxxx");
        
        return person;
        
    }
}
