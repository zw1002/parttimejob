package com.hnqj.model;

import java.util.Date;

public class Groomapply {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_groomapply.groomuid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String groomuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_groomapply.applyid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String applyid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_groomapply.worksid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String worksid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_groomapply.checkuser
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String checkuser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_groomapply.checktime
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private Date checktime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_groomapply.topflag
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String topflag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_groomapply.groomuid
     *
     * @return the value of tb_groomapply.groomuid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getGroomuid() {
        return groomuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_groomapply.groomuid
     *
     * @param groomuid the value for tb_groomapply.groomuid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setGroomuid(String groomuid) {
        this.groomuid = groomuid == null ? null : groomuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_groomapply.applyid
     *
     * @return the value of tb_groomapply.applyid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getApplyid() {
        return applyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_groomapply.applyid
     *
     * @param applyid the value for tb_groomapply.applyid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setApplyid(String applyid) {
        this.applyid = applyid == null ? null : applyid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_groomapply.worksid
     *
     * @return the value of tb_groomapply.worksid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getWorksid() {
        return worksid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_groomapply.worksid
     *
     * @param worksid the value for tb_groomapply.worksid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setWorksid(String worksid) {
        this.worksid = worksid == null ? null : worksid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_groomapply.checkuser
     *
     * @return the value of tb_groomapply.checkuser
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getCheckuser() {
        return checkuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_groomapply.checkuser
     *
     * @param checkuser the value for tb_groomapply.checkuser
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setCheckuser(String checkuser) {
        this.checkuser = checkuser == null ? null : checkuser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_groomapply.checktime
     *
     * @return the value of tb_groomapply.checktime
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public Date getChecktime() {
        return checktime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_groomapply.checktime
     *
     * @param checktime the value for tb_groomapply.checktime
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_groomapply.topflag
     *
     * @return the value of tb_groomapply.topflag
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getTopflag() {
        return topflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_groomapply.topflag
     *
     * @param topflag the value for tb_groomapply.topflag
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setTopflag(String topflag) {
        this.topflag = topflag == null ? null : topflag.trim();
    }
}