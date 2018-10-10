package com.szy.app.service.impl;

import com.szy.app.entity.OrderInfo;
import com.szy.app.mapper.OrderInfoMapper;
import com.szy.app.service.OrderInfoService;
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
public class OrderInfoServiceImpl implements OrderInfoService { 	
	@Resource
	private OrderInfoMapper orderInfoMapper;
	
	@Override
	public List<OrderInfo> getAll(){
        return orderInfoMapper.selectAll();
	}
	
	@Override
	public void addOrderInfo(OrderInfo orderInfo){
		orderInfoMapper.insert(orderInfo);
	}
	
	@Override
	public void addOrderInfoList(List<OrderInfo> list){
		orderInfoMapper.inserts(list);
	}
	
	@Override
	public void editOrderInfo(OrderInfo orderInfo){
		orderInfoMapper.update(orderInfo);
	}
	
	@Override
	public void delOrderInfo(String orderId){
		orderInfoMapper.delete(orderId);
	}
	
	@Override
	public OrderInfo findOrderInfoById(String orderId){
		return orderInfoMapper.findByPrimaryKey(orderId);
	}
}
