package com.parse.starter;

import com.parse.ParseClassName;
import com.parse.ParseObject;


/**
 * Created by kshtz on 1/28/2016.
 */
@ParseClassName("Employee")
public class Employee extends ParseObject{
    public Employee(){

    }

    public String getAddress(){
        return getString("Address");
    }

    public void setAddress(String address){
        put("Address", address);
    }

    public String getName(){
        return getString("name");
    }

    public void setName(String name){
        put("Name", name);
    }

    public String getEmail(){
        return getString("email");
    }

    public void setEmail(String email){
        put("Email", email);
    }

    public String getPhone(){
        return getString("phone");
    }

    public void setPhone(String phone){
        put("Phone", phone);
    }

    public String getEmployeeId(){
        return getString("EmployeeId");
    }

    public void setEmployeeId(String employeeId){
        put("EmployeeId", employeeId);
    }
}
