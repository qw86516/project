package com.zb.pojo;
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
    private Date createtime;
    //
    private String fullName;
    //
    private String idNumber;
    //
    private String idPositive;
    //
    private String idBack;
    //
    private Integer examineState;
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
    public void setFullName (String  fullName){
        this.fullName=fullName;
    }
    public  String getFullName(){
        return this.fullName;
    }
    public void setIdNumber (String  idNumber){
        this.idNumber=idNumber;
    }
    public  String getIdNumber(){
        return this.idNumber;
    }
    public void setIdPositive (String  idPositive){
        this.idPositive=idPositive;
    }
    public  String getIdPositive(){
        return this.idPositive;
    }
    public void setIdBack (String  idBack){
        this.idBack=idBack;
    }
    public  String getIdBack(){
        return this.idBack;
    }
    public void setExamineState (Integer  examineState){
        this.examineState=examineState;
    }
    public  Integer getExamineState(){
        return this.examineState;
    }
}
