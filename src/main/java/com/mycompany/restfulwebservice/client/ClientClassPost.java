/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.restfulwebservice.client;

import com.mycompany.restfulwebservice.pojo.PersonClass;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.core.Response;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

/**
 *
 * @author bmogu
 */
public class ClientClassPost {

    public static void main(String[] args) {
        ClientClassPost ccp = new ClientClassPost();
        ccp.postValueInJson();
        ccp.postValueInXml();
    }

    public void postValueInJson() {
        PersonClass person = new PersonClass();
        person.setName("hakan");
        person.setSurName("aslan");
        person.setCity("kocaeli");
        person.setPhoneNumber("05xxxxxxxxx");

        String link = "http://localhost:8080/RestfulWebService/webservice/postjson/postAvalueJson";
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(link);
        Response response = target.request().post(Entity.entity(person, MediaType.APPLICATION_JSON));

        if (response.getStatus() == 200) {
            System.out.println("işlem başarılı");
            System.out.println(response.readEntity(String.class));
        } else {
            System.out.println("Post işlemi başarısız");
            System.out.println(response.readEntity(String.class));
        }

    }
    public void postValueInXml(){
        
        PersonClass person=new PersonClass();
        person.setName("oguz");
        person.setSurName("kurtcebe");
        person.setPhoneNumber("05xxxxxxxxx");
        person.setCity("Van");
        Entity entity=Entity.xml(person);
        String link="http://localhost:8080/RestfulWebService/webservice/postxml/postAvalueXml";
        ResteasyClient restEasyClient=new ResteasyClientBuilder().build();
        ResteasyWebTarget target=restEasyClient.target(link);
        Response response=target.request().post(entity);
    if(response.getStatus()==200){
        System.out.println("İşlem başarılı:"+response.readEntity(String.class));
        
    }
    else{
        System.out.println("işlem Başarısız:"+response.readEntity(String.class));
        
    }
    }

}


