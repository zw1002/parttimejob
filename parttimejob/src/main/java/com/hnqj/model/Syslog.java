package com.hnqj.model;

import java.util.Date;

public class Syslog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_syslog.sysloguid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String sysloguid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_syslog.username
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_syslog.logtype
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String logtype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_syslog.ipaddress
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String ipaddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_syslog.logtime
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private Date logtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_syslog.loginfo
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    private String loginfo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_syslog.sysloguid
     *
     * @return the value of tb_syslog.sysloguid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getSysloguid() {
        return sysloguid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_syslog.sysloguid
     *
     * @param sysloguid the value for tb_syslog.sysloguid
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setSysloguid(String sysloguid) {
        this.sysloguid = sysloguid == null ? null : sysloguid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_syslog.username
     *
     * @return the value of tb_syslog.username
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_syslog.username
     *
     * @param username the value for tb_syslog.username
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_syslog.logtype
     *
     * @return the value of tb_syslog.logtype
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getLogtype() {
        return logtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_syslog.logtype
     *
     * @param logtype the value for tb_syslog.logtype
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setLogtype(String logtype) {
        this.logtype = logtype == null ? null : logtype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_syslog.ipaddress
     *
     * @return the value of tb_syslog.ipaddress
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getIpaddress() {
        return ipaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_syslog.ipaddress
     *
     * @param ipaddress the value for tb_syslog.ipaddress
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress == null ? null : ipaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_syslog.logtime
     *
     * @return the value of tb_syslog.logtime
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public Date getLogtime() {
        return logtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_syslog.logtime
     *
     * @param logtime the value for tb_syslog.logtime
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setLogtime(Date logtime) {
        this.logtime = logtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_syslog.loginfo
     *
     * @return the value of tb_syslog.loginfo
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public String getLoginfo() {
        return loginfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_syslog.loginfo
     *
     * @param loginfo the value for tb_syslog.loginfo
     *
     * @mbg.generated Tue Dec 12 11:10:02 CST 2017
     */
    public void setLoginfo(String loginfo) {
        this.loginfo = loginfo == null ? null : loginfo.trim();
    }
}