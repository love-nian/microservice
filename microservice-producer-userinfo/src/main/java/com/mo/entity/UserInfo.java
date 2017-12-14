package com.mo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Zhuzhuhong
 * @create 2017年12月12日 14:57
 * @desc
 **/
@Entity
@Table(name = "userinfo")
public class UserInfo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userid;// ID
    private String username;// 用户名
    private String useraccount;// 用户账号
    private String usercontact;// 用户联系方式
    private Integer roleid;// 用户所述角色(平台0,运维公司1,服务公司2,社会单位3)
    private Integer status;// 状态(默认:1)
    private Date createtime;// 创建时间
    private Date updatetime;// 更新时间
    private String password;// md5 hash过base64编码后的密码
    private String mobile;//手机号
    private Integer relobjid;//对应角色,相关的对象id
    private String relobjname;//对应角色,相关的对象名称
    private Date validdate;//有效期

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(String useraccount) {
        this.useraccount = useraccount;
    }

    public String getUsercontact() {
        return usercontact;
    }

    public void setUsercontact(String usercontact) {
        this.usercontact = usercontact;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getRelobjid() {
        return relobjid;
    }

    public void setRelobjid(Integer relobjid) {
        this.relobjid = relobjid;
    }

    public String getRelobjname() {
        return relobjname;
    }

    public void setRelobjname(String relobjname) {
        this.relobjname = relobjname;
    }

    public Date getValiddate() {
        return validdate;
    }

    public void setValiddate(Date validdate) {
        this.validdate = validdate;
    }
}
