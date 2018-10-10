package com.szy.app.mapper;

import com.szy.app.entity.SzUserInfo;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author cc
 * @since 2018-05-06
 */
@Mapper
public interface SzUserInfoMapper {	
	
	List<SzUserInfo> selectAll();
	
	void insert(SzUserInfo szUserInfo);
	
	void inserts(List<SzUserInfo> list);
	
	void update(SzUserInfo szUserInfo);

	void delete(String id);
	
	SzUserInfo findByPrimaryKey(String id);
	
}