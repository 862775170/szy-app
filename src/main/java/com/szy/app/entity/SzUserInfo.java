package com.szy.app.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author cc
 * @since 2018-05-06
 */
public class SzUserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
	private String id;
    /**
     * 微信openId
     */
	private String wxOpenid;
    /**
     * 用户名
     */
	private String username;
    /**
     * 密码
     */
	private String password;
    /**
     * 创建时间
     */
	private Date createTime;
    /**
     * 更新时间
     */
	private Date updateTime;
    /**
     * 微信名称
     */
	private String wxName;
    /**
     * 微信头像url
     */
	private String wxImgurl;
    /**
     * 邮箱
     */
	private String email;
    /**
     * 手机
     */
	private String mobile;
    /**
     * 注册时间
     */
	private Date regTime;
    /**
     * 昵称
     */
	private String nickName;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWxOpenid() {
		return wxOpenid;
	}

	public void setWxOpenid(String wxOpenid) {
		this.wxOpenid = wxOpenid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getWxName() {
		return wxName;
	}

	public void setWxName(String wxName) {
		this.wxName = wxName;
	}

	public String getWxImgurl() {
		return wxImgurl;
	}

	public void setWxImgurl(String wxImgurl) {
		this.wxImgurl = wxImgurl;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getRegTime() {
		return regTime;
	}

	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return "SzUserInfo{" +
			"id=" + id +
			", wxOpenid=" + wxOpenid +
			", username=" + username +
			", password=" + password +
			", createTime=" + createTime +
			", updateTime=" + updateTime +
			", wxName=" + wxName +
			", wxImgurl=" + wxImgurl +
			", email=" + email +
			", mobile=" + mobile +
			", regTime=" + regTime +
			", nickName=" + nickName +
			"}";
	}
}
