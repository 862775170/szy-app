package com.szy.app.service.impl;

import com.szy.app.entity.SzUserInfo;
import com.szy.app.mapper.SzUserInfoMapper;
import com.szy.app.service.SzUserInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cc
 * @since 2018-05-06
 */
@Service
public class SzUserInfoServiceImpl implements SzUserInfoService { 	
	@Resource
	private SzUserInfoMapper szUserInfoMapper;
	
	@Override
	public List<SzUserInfo> getAll(){
        return szUserInfoMapper.selectAll();
	}
	
	@Override
	public void addSzUserInfo(SzUserInfo szUserInfo){
		szUserInfoMapper.insert(szUserInfo);
	}
	
	@Override
	public void addSzUserInfoList(List<SzUserInfo> list){
		szUserInfoMapper.inserts(list);
	}
	
	@Override
	public void editSzUserInfo(SzUserInfo szUserInfo){
		szUserInfoMapper.update(szUserInfo);
	}
	
	@Override
	public void delSzUserInfo(String id){
		szUserInfoMapper.delete(id);
	}
	
	@Override
	public SzUserInfo findSzUserInfoById(String id){
		return szUserInfoMapper.findByPrimaryKey(id);
	}
}
