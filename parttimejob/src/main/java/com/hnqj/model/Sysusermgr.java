package com.hnqj.model;

public class Sysusermgr {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sysusermgr.fid
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    private String uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sysusermgr.fname
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    private String fristname;


    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sysusermgr.state
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    private Short statu;


    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sysusermgr.idcard
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    private String idcard;



    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sysusermgr.mobilephone
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    private String telephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sysusermgr.email
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sysusermgr.sex
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sysusermgr.extrainfo
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    private String extrainfo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sysusermgr.fid
     *
     * @return the value of tb_sysusermgr.fid
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    public String getUid() {
        return uid;
    }


    public String getFristname() {
        return fristname;
    }

    public void setFristname(String fristname) {
        this.fristname = fristname;
    }

    public Short getStatu() {
        return statu;
    }

    public void setStatu(Short statu) {
        this.statu = statu;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sysusermgr.fid
     *
     * @param uid the value for tb_sysusermgr.fid
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }



    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sysusermgr.idcard
     *
     * @return the value of tb_sysusermgr.idcard
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sysusermgr.idcard
     *
     * @param idcard the value for tb_sysusermgr.idcard
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sysusermgr.email
     *
     * @return the value of tb_sysusermgr.email
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sysusermgr.email
     *
     * @param email the value for tb_sysusermgr.email
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sysusermgr.sex
     *
     * @return the value of tb_sysusermgr.sex
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sysusermgr.sex
     *
     * @param sex the value for tb_sysusermgr.sex
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sysusermgr.extrainfo
     *
     * @return the value of tb_sysusermgr.extrainfo
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    public String getExtrainfo() {
        return extrainfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sysusermgr.extrainfo
     *
     * @param extrainfo the value for tb_sysusermgr.extrainfo
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    public void setExtrainfo(String extrainfo) {
        this.extrainfo = extrainfo == null ? null : extrainfo.trim();
    }
}