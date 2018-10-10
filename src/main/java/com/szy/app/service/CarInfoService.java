package com.szy.app.service;
import java.util.List;
import com.szy.app.entity.CarInfo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cc
 * @since 2018-05-06
 */
public interface CarInfoService  {
	List<CarInfo> getAll();
	
	void addCarInfo(CarInfo carInfo);
	
	void addCarInfoList(List<CarInfo> list);
	
	void editCarInfo(CarInfo carInfo);
	
	void delCarInfo(String carId);
	
	CarInfo findCarInfoById(String carId);
}
