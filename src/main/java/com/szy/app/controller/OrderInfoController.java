package com.szy.app.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import javax.annotation.Resource;

import com.szy.app.common.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;

import com.szy.app.service.OrderInfoService;
import com.szy.app.entity.OrderInfo;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cc
 * @since 2018-05-06
 */
@RestController
@RequestMapping("/orderInfo")
@Api()
public class OrderInfoController {
	
	@Resource
	private OrderInfoService orderInfoService;
	
	
	@PostMapping()
	@ApiOperation(notes="OrderInfoController.addOrderInfo", value = "addOrderInfo")
	public Result addOrderInfo(@RequestBody OrderInfo orderInfo){
		orderInfoService.addOrderInfo(orderInfo);
		return new Result();
	}
	
	@PutMapping()
	@ApiOperation(notes="OrderInfoController.editOrderInfo", value = "editOrderInfo")
	public Result editOrderInfo(@RequestBody OrderInfo orderInfo){
		orderInfoService.editOrderInfo(orderInfo);
		return new Result();
	}
	
	@DeleteMapping()
	@ApiOperation(notes="OrderInfoController.delOrderInfo", value = "delOrderInfo")
	public Result delOrderInfo(@RequestParam(value = "orderId", required = false) String orderId){
		orderInfoService.delOrderInfo(orderId);
		return new Result();
	}
	
	@GetMapping("getAll")
	@ApiOperation(notes="OrderInfoController.getAll()", value = "getAll")
	public Result getAll(){
		List<OrderInfo> data = orderInfoService.getAll();
		return new Result(data);
	}
	
	@GetMapping("getBykey")
	@ApiOperation(notes="OrderInfoController.findOrderInfoById", value = "findOrderInfoById")
	public Result findOrderInfoById(@RequestParam(value = "orderId", required = false) String orderId){
		OrderInfo data = orderInfoService.findOrderInfoById(orderId);
		return new Result(data);
	}
}
