package com.szy.app.service;
import java.util.List;
import com.szy.app.entity.SzUserInfo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cc
 * @since 2018-05-06
 */
public interface SzUserInfoService  {
	List<SzUserInfo> getAll();
	
	void addSzUserInfo(SzUserInfo szUserInfo);
	
	void addSzUserInfoList(List<SzUserInfo> list);
	
	void editSzUserInfo(SzUserInfo szUserInfo);
	
	void delSzUserInfo(String id);
	
	SzUserInfo findSzUserInfoById(String id);
}
