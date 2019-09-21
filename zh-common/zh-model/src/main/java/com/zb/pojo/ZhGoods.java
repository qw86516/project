package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class ZhGoods implements Serializable {
    //商品编号
    private Integer id;
    //商品名称
    private String goodsName;
    //商品价格
    private Double price;
    //商品品牌
    private String brand;
    //商品型号

    private String model;
    //商品成色

    private String condition;
    //商品产地

    private String origin;
    //商品年份
    private String year;
    //商品规格
    private String standards;
    //商品数量
    private Integer num;
    //商品详细地址
    private String address;
    //商品所在地域
    private String location;
    //商品图片
    private String pic;
    //商品视频地址
    private String video;
    //商品发布日期
    private Date createtime;
    //商品收藏数量
    private Integer collection;
    //商品浏览数
    private Integer browse;
    //商品总浏览数
    private Integer totalBrowse;
    //商品总收藏数
    private Integer totalCollection;
    //商品标签
    private String lable;
    //商品状态(1:在售，2:上架中,3:下架)
    private Integer status;
    //发布类型(0:买机 1:卖机)

    private Integer issuedType;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setGoodsName (String  goodsName){
        this.goodsName=goodsName;
    }
    public  String getGoodsName(){
        return this.goodsName;
    }
    public void setPrice (Double  price){
        this.price=price;
    }
    public  Double getPrice(){
        return this.price;
    }
    public void setBrand (String  brand){
        this.brand=brand;
    }
    public  String getBrand(){
        return this.brand;
    }
    public void setModel (String  model){
        this.model=model;
    }
    public  String getModel(){
        return this.model;
    }
    public void setCondition (String  condition){
        this.condition=condition;
    }
    public  String getCondition(){
        return this.condition;
    }
    public void setOrigin (String  origin){
        this.origin=origin;
    }
    public  String getOrigin(){
        return this.origin;
    }
    public void setYear (String  year){
        this.year=year;
    }
    public  String getYear(){
        return this.year;
    }
    public void setStandards (String  standards){
        this.standards=standards;
    }
    public  String getStandards(){
        return this.standards;
    }
    public void setNum (Integer  num){
        this.num=num;
    }
    public  Integer getNum(){
        return this.num;
    }
    public void setAddress (String  address){
        this.address=address;
    }
    public  String getAddress(){
        return this.address;
    }
    public void setLocation (String  location){
        this.location=location;
    }
    public  String getLocation(){
        return this.location;
    }
    public void setPic (String  pic){
        this.pic=pic;
    }
    public  String getPic(){
        return this.pic;
    }
    public void setVideo (String  video){
        this.video=video;
    }
    public  String getVideo(){
        return this.video;
    }
    public void setCreatetime (Date  createtime){
        this.createtime=createtime;
    }
    public  Date getCreatetime(){
        return this.createtime;
    }
    public void setCollection (Integer  collection){
        this.collection=collection;
    }
    public  Integer getCollection(){
        return this.collection;
    }
    public void setBrowse (Integer  browse){
        this.browse=browse;
    }
    public  Integer getBrowse(){
        return this.browse;
    }
    public void setTotalBrowse (Integer  totalBrowse){
        this.totalBrowse=totalBrowse;
    }
    public  Integer getTotalBrowse(){
        return this.totalBrowse;
    }
    public void setTotalCollection (Integer  totalCollection){
        this.totalCollection=totalCollection;
    }
    public  Integer getTotalCollection(){
        return this.totalCollection;
    }
    public void setLable (String  lable){
        this.lable=lable;
    }
    public  String getLable(){
        return this.lable;
    }
    public void setStatus (Integer  status){
        this.status=status;
    }
    public  Integer getStatus(){
        return this.status;
    }
    public void setIssuedType (Integer  issuedType){
        this.issuedType=issuedType;
    }
    public  Integer getIssuedType(){
        return this.issuedType;
    }
}
