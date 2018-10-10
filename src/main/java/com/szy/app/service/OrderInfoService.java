package com.szy.app.service;
import java.util.List;
import com.szy.app.entity.OrderInfo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cc
 * @since 2018-05-06
 */
public interface OrderInfoService  {
	List<OrderInfo> getAll();
	
	void addOrderInfo(OrderInfo orderInfo);
	
	void addOrderInfoList(List<OrderInfo> list);
	
	void editOrderInfo(OrderInfo orderInfo);
	
	void delOrderInfo(String orderId);
	
	OrderInfo findOrderInfoById(String orderId);
}
