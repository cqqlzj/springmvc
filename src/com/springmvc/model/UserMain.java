package com.springmvc.model;

import java.math.BigDecimal;
import java.util.Date;

public class UserMain {
    /**
     *用户id
     */
    private Integer userId;

    /**
     *邮件，要求唯一
     */
    private String email;

    /**
     *用户昵称，要求唯一
     */
    private String nickName;

    /**
     *用户真实名/企业名称
     */
    private String realName;

    /**
     *身份证号
     */
    private String idCardNo;

    /**
     *密码
     */
    private String passwd;

    /**
     *支付密码
     */
    private String payPassword;

    /**
     *已绑定的手机号码，不要求唯一
     */
    private String mobile;

    /**
     *所在城市
     */
    private String city;

    /**
     *注册时间
     */
    private Date registerTime;

    /**
     *角色，参见com.zkbc.core.consts.user.UserRolesType
     */
    private Short roles;

    /**
     *可用现金余额  这条记录中的值才是用户真正可用的钱
     */
    private BigDecimal cash;

    /**
     *已冻结的提现中现金
     */
    private BigDecimal frozenWithDrawCash;

    /**
     *已冻结的投标中现金
     */
    private BigDecimal frozenBiddingCash;

    /**
     *国政通验证次数，每次验证减1，默认每人最多验证3次
     */
    private Short idVerifyLimit;

    /**
     *头像id
     */
    private Integer portrait;

    /**
     *用户状态。用数值型的好处是今后可以扩充定义，参见com.zkbc.core.consts.user.UserStatusType
     */
    private Short status;

    /**
     *禁止状态。参见com.zkbc.core.consts.user.UserForbidStatusType
     */
    private Short forbidStatus;

    /**
     *个人相册容量，单位：MB。用户所有的userpic加起来不能大于此数值
     */
    private Short albumCapacity;

    /**
     *安全等级
     */
    private Short securityLevel;

    /**
     *新浪微博uid
     */
    private String weiboUId;

    /**
     *新浪微博AccessToken
     */
    private String weiboAccessToken;

    /**
     *腾讯uid
     */
    private String qqUId;

    /**
     *腾讯AccessToken
     */
    private String qqAccessToken;

    /**
     *借款用户的渠道
     */
    private Short origin;

    /**
     *所属客户经理
     */
    private Integer staffId;

    /**
     *
     */
    private String userCode;

    /**
     *推荐人，存储推荐人用户名
     */
    private String referee;

    /**
     *汇付天下的账号
     */
    private String usrId;

    /**
     *01 网站注册,02 希财网,03 新浪微博,04 腾讯微博,05 QQ空间,06 微信注册-关注公众号,07 微信注册-扫描二维码,08-360,09 有道,10 CPS,11 微信注册-摇一摇
     */
    private String sourceFlag;

    /**
     *邀请码
     */
    private String inviterUserCode;

    /**
     *异业商户ID
     */
    private Integer differentIndustryId;

    /**
     *账号修改状态：0不可修改，1可以修改
     */
    private Short updateFlag;

    /**
     *流量红包openid
     */
    private String openid;

    /**
     *用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     *用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     *邮件，要求唯一
     */
    public String getEmail() {
        return email;
    }

    /**
     *邮件，要求唯一
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     *用户昵称，要求唯一
     */
    public String getNickName() {
        return nickName;
    }

    /**
     *用户昵称，要求唯一
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     *用户真实名/企业名称
     */
    public String getRealName() {
        return realName;
    }

    /**
     *用户真实名/企业名称
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     *身份证号
     */
    public String getIdCardNo() {
        return idCardNo;
    }

    /**
     *身份证号
     */
    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo == null ? null : idCardNo.trim();
    }

    /**
     *密码
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     *密码
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    /**
     *支付密码
     */
    public String getPayPassword() {
        return payPassword;
    }

    /**
     *支付密码
     */
    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword == null ? null : payPassword.trim();
    }

    /**
     *已绑定的手机号码，不要求唯一
     */
    public String getMobile() {
        return mobile;
    }

    /**
     *已绑定的手机号码，不要求唯一
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     *所在城市
     */
    public String getCity() {
        return city;
    }

    /**
     *所在城市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     *注册时间
     */
    public Date getRegisterTime() {
        return registerTime;
    }

    /**
     *注册时间
     */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    /**
     *角色，参见com.zkbc.core.consts.user.UserRolesType
     */
    public Short getRoles() {
        return roles;
    }

    /**
     *角色，参见com.zkbc.core.consts.user.UserRolesType
     */
    public void setRoles(Short roles) {
        this.roles = roles;
    }

    /**
     *可用现金余额  这条记录中的值才是用户真正可用的钱
     */
    public BigDecimal getCash() {
        return cash;
    }

    /**
     *可用现金余额  这条记录中的值才是用户真正可用的钱
     */
    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    /**
     *已冻结的提现中现金
     */
    public BigDecimal getFrozenWithDrawCash() {
        return frozenWithDrawCash;
    }

    /**
     *已冻结的提现中现金
     */
    public void setFrozenWithDrawCash(BigDecimal frozenWithDrawCash) {
        this.frozenWithDrawCash = frozenWithDrawCash;
    }

    /**
     *已冻结的投标中现金
     */
    public BigDecimal getFrozenBiddingCash() {
        return frozenBiddingCash;
    }

    /**
     *已冻结的投标中现金
     */
    public void setFrozenBiddingCash(BigDecimal frozenBiddingCash) {
        this.frozenBiddingCash = frozenBiddingCash;
    }

    /**
     *国政通验证次数，每次验证减1，默认每人最多验证3次
     */
    public Short getIdVerifyLimit() {
        return idVerifyLimit;
    }

    /**
     *国政通验证次数，每次验证减1，默认每人最多验证3次
     */
    public void setIdVerifyLimit(Short idVerifyLimit) {
        this.idVerifyLimit = idVerifyLimit;
    }

    /**
     *头像id
     */
    public Integer getPortrait() {
        return portrait;
    }

    /**
     *头像id
     */
    public void setPortrait(Integer portrait) {
        this.portrait = portrait;
    }

    /**
     *用户状态。用数值型的好处是今后可以扩充定义，参见com.zkbc.core.consts.user.UserStatusType
     */
    public Short getStatus() {
        return status;
    }

    /**
     *用户状态。用数值型的好处是今后可以扩充定义，参见com.zkbc.core.consts.user.UserStatusType
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     *禁止状态。参见com.zkbc.core.consts.user.UserForbidStatusType
     */
    public Short getForbidStatus() {
        return forbidStatus;
    }

    /**
     *禁止状态。参见com.zkbc.core.consts.user.UserForbidStatusType
     */
    public void setForbidStatus(Short forbidStatus) {
        this.forbidStatus = forbidStatus;
    }

    /**
     *个人相册容量，单位：MB。用户所有的userpic加起来不能大于此数值
     */
    public Short getAlbumCapacity() {
        return albumCapacity;
    }

    /**
     *个人相册容量，单位：MB。用户所有的userpic加起来不能大于此数值
     */
    public void setAlbumCapacity(Short albumCapacity) {
        this.albumCapacity = albumCapacity;
    }

    /**
     *安全等级
     */
    public Short getSecurityLevel() {
        return securityLevel;
    }

    /**
     *安全等级
     */
    public void setSecurityLevel(Short securityLevel) {
        this.securityLevel = securityLevel;
    }

    /**
     *新浪微博uid
     */
    public String getWeiboUId() {
        return weiboUId;
    }

    /**
     *新浪微博uid
     */
    public void setWeiboUId(String weiboUId) {
        this.weiboUId = weiboUId == null ? null : weiboUId.trim();
    }

    /**
     *新浪微博AccessToken
     */
    public String getWeiboAccessToken() {
        return weiboAccessToken;
    }

    /**
     *新浪微博AccessToken
     */
    public void setWeiboAccessToken(String weiboAccessToken) {
        this.weiboAccessToken = weiboAccessToken == null ? null : weiboAccessToken.trim();
    }

    /**
     *腾讯uid
     */
    public String getQqUId() {
        return qqUId;
    }

    /**
     *腾讯uid
     */
    public void setQqUId(String qqUId) {
        this.qqUId = qqUId == null ? null : qqUId.trim();
    }

    /**
     *腾讯AccessToken
     */
    public String getQqAccessToken() {
        return qqAccessToken;
    }

    /**
     *腾讯AccessToken
     */
    public void setQqAccessToken(String qqAccessToken) {
        this.qqAccessToken = qqAccessToken == null ? null : qqAccessToken.trim();
    }

    /**
     *借款用户的渠道
     */
    public Short getOrigin() {
        return origin;
    }

    /**
     *借款用户的渠道
     */
    public void setOrigin(Short origin) {
        this.origin = origin;
    }

    /**
     *所属客户经理
     */
    public Integer getStaffId() {
        return staffId;
    }

    /**
     *所属客户经理
     */
    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    /**
     *
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     *
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    /**
     *推荐人，存储推荐人用户名
     */
    public String getReferee() {
        return referee;
    }

    /**
     *推荐人，存储推荐人用户名
     */
    public void setReferee(String referee) {
        this.referee = referee == null ? null : referee.trim();
    }

    /**
     *汇付天下的账号
     */
    public String getUsrId() {
        return usrId;
    }

    /**
     *汇付天下的账号
     */
    public void setUsrId(String usrId) {
        this.usrId = usrId == null ? null : usrId.trim();
    }

    /**
     *01 网站注册,02 希财网,03 新浪微博,04 腾讯微博,05 QQ空间,06 微信注册-关注公众号,07 微信注册-扫描二维码,08-360,09 有道,10 CPS,11 微信注册-摇一摇
     */
    public String getSourceFlag() {
        return sourceFlag;
    }

    /**
     *01 网站注册,02 希财网,03 新浪微博,04 腾讯微博,05 QQ空间,06 微信注册-关注公众号,07 微信注册-扫描二维码,08-360,09 有道,10 CPS,11 微信注册-摇一摇
     */
    public void setSourceFlag(String sourceFlag) {
        this.sourceFlag = sourceFlag == null ? null : sourceFlag.trim();
    }

    /**
     *邀请码
     */
    public String getInviterUserCode() {
        return inviterUserCode;
    }

    /**
     *邀请码
     */
    public void setInviterUserCode(String inviterUserCode) {
        this.inviterUserCode = inviterUserCode == null ? null : inviterUserCode.trim();
    }

    /**
     *异业商户ID
     */
    public Integer getDifferentIndustryId() {
        return differentIndustryId;
    }

    /**
     *异业商户ID
     */
    public void setDifferentIndustryId(Integer differentIndustryId) {
        this.differentIndustryId = differentIndustryId;
    }

    /**
     *账号修改状态：0不可修改，1可以修改
     */
    public Short getUpdateFlag() {
        return updateFlag;
    }

    /**
     *账号修改状态：0不可修改，1可以修改
     */
    public void setUpdateFlag(Short updateFlag) {
        this.updateFlag = updateFlag;
    }

    /**
     *流量红包openid
     */
    public String getOpenid() {
        return openid;
    }

    /**
     *流量红包openid
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

	@Override
	public String toString() {
		return "UserMain [userId=" + userId + ", email=" + email
				+ ", nickName=" + nickName + ", realName=" + realName
				+ ", idCardNo=" + idCardNo + ", passwd=" + passwd
				+ ", payPassword=" + payPassword + ", mobile=" + mobile
				+ ", city=" + city + ", registerTime=" + registerTime
				+ ", roles=" + roles + ", cash=" + cash
				+ ", frozenWithDrawCash=" + frozenWithDrawCash
				+ ", frozenBiddingCash=" + frozenBiddingCash
				+ ", idVerifyLimit=" + idVerifyLimit + ", portrait=" + portrait
				+ ", status=" + status + ", forbidStatus=" + forbidStatus
				+ ", albumCapacity=" + albumCapacity + ", securityLevel="
				+ securityLevel + ", weiboUId=" + weiboUId
				+ ", weiboAccessToken=" + weiboAccessToken + ", qqUId=" + qqUId
				+ ", qqAccessToken=" + qqAccessToken + ", origin=" + origin
				+ ", staffId=" + staffId + ", userCode=" + userCode
				+ ", referee=" + referee + ", usrId=" + usrId + ", sourceFlag="
				+ sourceFlag + ", inviterUserCode=" + inviterUserCode
				+ ", differentIndustryId=" + differentIndustryId
				+ ", updateFlag=" + updateFlag + ", openid=" + openid + "]";
	}
    
}