package com.szy.app.mapper;

import com.szy.app.entity.CarInfo;
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
public interface CarInfoMapper {	
	
	List<CarInfo> selectAll();
	
	void insert(CarInfo carInfo);
	
	void inserts(List<CarInfo> list);
	
	void update(CarInfo carInfo);

	void delete(String carId);
	
	CarInfo findByPrimaryKey(String carId);
	
}