package com.zb.pojo;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class ZhUser implements Serializable {
    //
    private Integer id;
    //
    private String userName;
    //
    private String phone;
    //
    private String password;
    //
    private String wxUserId;
    //
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern ="yyyy-MM-dd",timezone="GMT+8")
    private Date createtime;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setUserName (String  userName){
        this.userName=userName;
    }
    public  String getUserName(){
        return this.userName;
    }
    public void setPhone (String  phone){
        this.phone=phone;
    }
    public  String getPhone(){
        return this.phone;
    }
    public void setPassword (String  password){
        this.password=password;
    }
    public  String getPassword(){
        return this.password;
    }
    public void setWxUserId (String  wxUserId){
        this.wxUserId=wxUserId;
    }
    public  String getWxUserId(){
        return this.wxUserId;
    }
    public void setCreatetime (Date  createtime){
        this.createtime=createtime;
    }
    public  Date getCreatetime(){
        return this.createtime;
    }
}
