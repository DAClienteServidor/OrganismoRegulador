/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webService;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Stateless
@Path("/validar")
public class ws {
    
    @GET
    public String getVal(@QueryParam("dni") String dni) {
        String resp = "Si";
        return resp; 
    }
}
