package com.szy.app.service.impl;

import com.szy.app.entity.CarInfo;
import com.szy.app.mapper.CarInfoMapper;
import com.szy.app.service.CarInfoService;
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
public class CarInfoServiceImpl implements CarInfoService { 	
	@Resource
	private CarInfoMapper carInfoMapper;
	
	@Override
	public List<CarInfo> getAll(){
        return carInfoMapper.selectAll();
	}
	
	@Override
	public void addCarInfo(CarInfo carInfo){
		carInfoMapper.insert(carInfo);
	}
	
	@Override
	public void addCarInfoList(List<CarInfo> list){
		carInfoMapper.inserts(list);
	}
	
	@Override
	public void editCarInfo(CarInfo carInfo){
		carInfoMapper.update(carInfo);
	}
	
	@Override
	public void delCarInfo(String carId){
		carInfoMapper.delete(carId);
	}
	
	@Override
	public CarInfo findCarInfoById(String carId){
		return carInfoMapper.findByPrimaryKey(carId);
	}
}
