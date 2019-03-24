
package com.mycompany.restfulwebservice.application.getmethodinfo;

import com.mycompany.restfulwebservice.pojo.PersonClass;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("/getjson")
public class GetMethodUsingJson {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("getAvalueJson")
    public PersonClass GetAvalueJson(){
        PersonClass person=new PersonClass();
        person.setName("Oğuz");
        person.setSurName("Kurtcebe");
        person.setCity("Van");
        person.setPhoneNumber("05xxxxxxxxx");
        
        return person;
    }
}
