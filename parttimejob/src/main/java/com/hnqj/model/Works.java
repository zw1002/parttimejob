package com.hnqj.model;

import java.math.BigDecimal;
import java.util.Date;

public class Works {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_works.uid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_works.workstype
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String workstype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_works.worksname
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String worksname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_works.uptime
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String uptime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_works.samllurl
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String samllurl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_works.worksurl
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String worksurl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_works.watermakeurl
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String watermakeurl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_works.dpinum
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String dpinum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_works.imgsize
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private Double imgsize;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_works.imgformart
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String imgformart;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_works.colrmodel
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String colrmodel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_works.downcount
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private Integer downcount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_works.favcount
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private Integer favcount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_works.displayflag
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String displayflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_works.delflag
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String delflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_works.checkuser
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String checkuser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_works.chacktime
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String chacktime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_works.userid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String merchid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_works.ticknums
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private Integer ticknums;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_works.oknums
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private Integer oknums;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_works.workremark
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String workremark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_works.worklabel
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String worklabel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_works.price
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private BigDecimal price;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_works.uid
     *
     * @return the value of tb_works.uid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_works.uid
     *
     * @param uid the value for tb_works.uid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_works.workstype
     *
     * @return the value of tb_works.workstype
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getWorkstype() {
        return workstype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_works.workstype
     *
     * @param workstype the value for tb_works.workstype
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setWorkstype(String workstype) {
        this.workstype = workstype == null ? null : workstype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_works.worksname
     *
     * @return the value of tb_works.worksname
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getWorksname() {
        return worksname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_works.worksname
     *
     * @param worksname the value for tb_works.worksname
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setWorksname(String worksname) {
        this.worksname = worksname == null ? null : worksname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_works.uptime
     *
     * @return the value of tb_works.uptime
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getUptime() {
        return uptime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_works.uptime
     *
     * @param uptime the value for tb_works.uptime
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_works.samllurl
     *
     * @return the value of tb_works.samllurl
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getSamllurl() {
        return samllurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_works.samllurl
     *
     * @param samllurl the value for tb_works.samllurl
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setSamllurl(String samllurl) {
        this.samllurl = samllurl == null ? null : samllurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_works.worksurl
     *
     * @return the value of tb_works.worksurl
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getWorksurl() {
        return worksurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_works.worksurl
     *
     * @param worksurl the value for tb_works.worksurl
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setWorksurl(String worksurl) {
        this.worksurl = worksurl == null ? null : worksurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_works.watermakeurl
     *
     * @return the value of tb_works.watermakeurl
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getWatermakeurl() {
        return watermakeurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_works.watermakeurl
     *
     * @param watermakeurl the value for tb_works.watermakeurl
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setWatermakeurl(String watermakeurl) {
        this.watermakeurl = watermakeurl == null ? null : watermakeurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_works.dpinum
     *
     * @return the value of tb_works.dpinum
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getDpinum() {
        return dpinum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_works.dpinum
     *
     * @param dpinum the value for tb_works.dpinum
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setDpinum(String dpinum) {
        this.dpinum = dpinum == null ? null : dpinum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_works.imgsize
     *
     * @return the value of tb_works.imgsize
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public Double getImgsize() {
        return imgsize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_works.imgsize
     *
     * @param imgsize the value for tb_works.imgsize
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setImgsize(Double imgsize) {
        this.imgsize = imgsize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_works.imgformart
     *
     * @return the value of tb_works.imgformart
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getImgformart() {
        return imgformart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_works.imgformart
     *
     * @param imgformart the value for tb_works.imgformart
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setImgformart(String imgformart) {
        this.imgformart = imgformart == null ? null : imgformart.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_works.colrmodel
     *
     * @return the value of tb_works.colrmodel
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getColrmodel() {
        return colrmodel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_works.colrmodel
     *
     * @param colrmodel the value for tb_works.colrmodel
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setColrmodel(String colrmodel) {
        this.colrmodel = colrmodel == null ? null : colrmodel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_works.downcount
     *
     * @return the value of tb_works.downcount
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public Integer getDowncount() {
        return downcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_works.downcount
     *
     * @param downcount the value for tb_works.downcount
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setDowncount(Integer downcount) {
        this.downcount = downcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_works.favcount
     *
     * @return the value of tb_works.favcount
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public Integer getFavcount() {
        return favcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_works.favcount
     *
     * @param favcount the value for tb_works.favcount
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setFavcount(Integer favcount) {
        this.favcount = favcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_works.displayflag
     *
     * @return the value of tb_works.displayflag
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getDisplayflag() {
        return displayflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_works.displayflag
     *
     * @param displayflag the value for tb_works.displayflag
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setDisplayflag(String displayflag) {
        this.displayflag = displayflag == null ? null : displayflag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_works.delflag
     *
     * @return the value of tb_works.delflag
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getDelflag() {
        return delflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_works.delflag
     *
     * @param delflag the value for tb_works.delflag
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setDelflag(String delflag) {
        this.delflag = delflag == null ? null : delflag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_works.checkuser
     *
     * @return the value of tb_works.checkuser
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getCheckuser() {
        return checkuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_works.checkuser
     *
     * @param checkuser the value for tb_works.checkuser
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setCheckuser(String checkuser) {
        this.checkuser = checkuser == null ? null : checkuser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_works.chacktime
     *
     * @return the value of tb_works.chacktime
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getChacktime() {
        return chacktime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_works.chacktime
     *
     * @param chacktime the value for tb_works.chacktime
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setChacktime(String chacktime) {
        this.chacktime = chacktime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_works.userid
     *
     * @return the value of tb_works.userid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getMerchid() {
        return merchid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_works.userid
     *
     * @param userid the value for tb_works.userid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setMerchid(String merchid) {
        this.merchid = merchid == null ? null : merchid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_works.ticknums
     *
     * @return the value of tb_works.ticknums
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public Integer getTicknums() {
        return ticknums;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_works.ticknums
     *
     * @param ticknums the value for tb_works.ticknums
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setTicknums(Integer ticknums) {
        this.ticknums = ticknums;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_works.oknums
     *
     * @return the value of tb_works.oknums
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public Integer getOknums() {
        return oknums;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_works.oknums
     *
     * @param oknums the value for tb_works.oknums
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setOknums(Integer oknums) {
        this.oknums = oknums;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_works.workremark
     *
     * @return the value of tb_works.workremark
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getWorkremark() {
        return workremark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_works.workremark
     *
     * @param workremark the value for tb_works.workremark
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setWorkremark(String workremark) {
        this.workremark = workremark == null ? null : workremark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_works.worklabel
     *
     * @return the value of tb_works.worklabel
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getWorklabel() {
        return worklabel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_works.worklabel
     *
     * @param worklabel the value for tb_works.worklabel
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setWorklabel(String worklabel) {
        this.worklabel = worklabel == null ? null : worklabel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_works.price
     *
     * @return the value of tb_works.price
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_works.price
     *
     * @param price the value for tb_works.price
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}