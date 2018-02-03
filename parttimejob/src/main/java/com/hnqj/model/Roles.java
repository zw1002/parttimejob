package com.hnqj.model;

import java.util.Date;

public class Roles {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_roles.uid
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    private String uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_roles.role_name
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    private String roleName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_roles.role_description
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    private String roleDescription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_roles.role_creator
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    private String roleCreator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_roles.role_ctime
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    private Date roleCtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_roles.role_enabled
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    private Short roleEnabled;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_roles.uid
     *
     * @return the value of tb_roles.uid
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_roles.uid
     *
     * @param uid the value for tb_roles.uid
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_roles.role_name
     *
     * @return the value of tb_roles.role_name
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_roles.role_name
     *
     * @param roleName the value for tb_roles.role_name
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_roles.role_description
     *
     * @return the value of tb_roles.role_description
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    public String getRoleDescription() {
        return roleDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_roles.role_description
     *
     * @param roleDescription the value for tb_roles.role_description
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription == null ? null : roleDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_roles.role_creator
     *
     * @return the value of tb_roles.role_creator
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    public String getRoleCreator() {
        return roleCreator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_roles.role_creator
     *
     * @param roleCreator the value for tb_roles.role_creator
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    public void setRoleCreator(String roleCreator) {
        this.roleCreator = roleCreator == null ? null : roleCreator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_roles.role_ctime
     *
     * @return the value of tb_roles.role_ctime
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    public Date getRoleCtime() {
        return roleCtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_roles.role_ctime
     *
     * @param roleCtime the value for tb_roles.role_ctime
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    public void setRoleCtime(Date roleCtime) {
        this.roleCtime = roleCtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_roles.role_enabled
     *
     * @return the value of tb_roles.role_enabled
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    public Short getRoleEnabled() {
        return roleEnabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_roles.role_enabled
     *
     * @param roleEnabled the value for tb_roles.role_enabled
     *
     * @mbg.generated Sun Nov 12 10:54:35 CST 2017
     */
    public void setRoleEnabled(Short roleEnabled) {
        this.roleEnabled = roleEnabled;
    }
}