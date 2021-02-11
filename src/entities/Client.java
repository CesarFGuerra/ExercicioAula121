/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;

/**
 *
 * @author Cesar falta o toString
 */
public class Client {
    private String name;
    private String email;
    private Date brithDate;
    
    public Client(){
    }
    public Client(String name, String email, Date brithDate) {
        this.name = name;
        this.email = email;
        this.brithDate = brithDate;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Date getBrithDate() {
        return brithDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBrithDate(Date brithDate) {
        this.brithDate = brithDate;
    }
    
    
}
