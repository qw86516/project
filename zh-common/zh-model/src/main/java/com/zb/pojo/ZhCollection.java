package com.zb.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/***
*   
*/
public class ZhCollection implements Serializable {
    //
    private Integer userId;
    //
    private Integer goodsId;
    //
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern ="yyyy-MM-dd",timezone="GMT+8")
    private Date createtime;
    //get set 方法
    public void setUserId (Integer  userId){
        this.userId=userId;
    }
    public  Integer getUserId(){
        return this.userId;
    }
    public void setGoodsId (Integer  goodsId){
        this.goodsId=goodsId;
    }
    public  Integer getGoodsId(){
        return this.goodsId;
    }
    public void setCreatetime (Date  createtime){
        this.createtime=createtime;
    }
    public  Date getCreatetime(){
        return this.createtime;
    }
}
