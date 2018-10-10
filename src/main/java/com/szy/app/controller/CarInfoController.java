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

import com.szy.app.service.CarInfoService;
import com.szy.app.entity.CarInfo;

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
@RequestMapping("/carInfo")
@Api()
public class CarInfoController {
	
	@Resource
	private CarInfoService carInfoService;
	
	
	@PostMapping()
	@ApiOperation(notes="CarInfoController.addCarInfo", value = "addCarInfo")
	public Result addCarInfo(@RequestBody CarInfo carInfo){
		carInfoService.addCarInfo(carInfo);
		return new Result();
	}
	
	@PutMapping()
	@ApiOperation(notes="CarInfoController.editCarInfo", value = "editCarInfo")
	public Result editCarInfo(@RequestBody CarInfo carInfo){
		carInfoService.editCarInfo(carInfo);
		return new Result();
	}
	
	@DeleteMapping()
	@ApiOperation(notes="CarInfoController.delCarInfo", value = "delCarInfo")
	public Result delCarInfo(@RequestParam(value = "carId", required = false) String carId){
		carInfoService.delCarInfo(carId);
		return new Result();
	}
	
	@GetMapping("getAll")
	@ApiOperation(notes="CarInfoController.getAll()", value = "getAll")
	public Result getAll(){
		List<CarInfo> data = carInfoService.getAll();
		return new Result(data);
	}
	
	@GetMapping("getBykey")
	@ApiOperation(notes="CarInfoController.findCarInfoById", value = "findCarInfoById")
	public Result findCarInfoById(@RequestParam(value = "carId", required = false) String carId){
		CarInfo data = carInfoService.findCarInfoById(carId);
		return new Result(data);
	}
}
