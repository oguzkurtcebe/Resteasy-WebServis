/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.restfulwebservice.postmethodinfo;

import com.mycompany.restfulwebservice.pojo.PersonClass;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author bmogu
 */
@Path("postjson")
public class PostMethodUsingJson {
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("postAvalueJson")
    public PersonClass PostAvalueJson(PersonClass person){
        
        System.out.println("ADI:"+person.getName());
        System.out.println("SOYADI:"+person.getSurName());
        System.out.println("MEMLEKETİ:"+person.getCity());
        System.out.println("TELEFONU:"+person.getPhoneNumber());
        
        return person;
    }
}
