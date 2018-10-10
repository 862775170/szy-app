package com.szy.app.mapper;

import com.szy.app.entity.OrderInfo;
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
public interface OrderInfoMapper {	
	
	List<OrderInfo> selectAll();
	
	void insert(OrderInfo orderInfo);
	
	void inserts(List<OrderInfo> list);
	
	void update(OrderInfo orderInfo);

	void delete(String orderId);
	
	OrderInfo findByPrimaryKey(String orderId);
	
}