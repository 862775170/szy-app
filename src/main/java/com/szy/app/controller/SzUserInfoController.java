package com.szy.app.controller;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.szy.app.common.Result;
import com.szy.app.entity.SzUserInfo;
import com.szy.app.service.SzUserInfoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cc
 * @since 2018-05-06
 */
@RestController
@RequestMapping("/szUserInfo")
@Api()
public class SzUserInfoController {
	
	@Resource
	private SzUserInfoService szUserInfoService;
	
	
	@PostMapping()
	@ApiOperation(notes="SzUserInfoController.addSzUserInfo", value = "addSzUserInfo")
	public Result addSzUserInfo(@RequestBody SzUserInfo szUserInfo){
		szUserInfoService.addSzUserInfo(szUserInfo);
		return new Result();
	}
	
	@PutMapping()
	@ApiOperation(notes="SzUserInfoController.editSzUserInfo", value = "editSzUserInfo")
	public Result editSzUserInfo(@RequestBody SzUserInfo szUserInfo){
		szUserInfoService.editSzUserInfo(szUserInfo);
		return new Result();
	}
	
	@DeleteMapping()
	@ApiOperation(notes="SzUserInfoController.delSzUserInfo", value = "delSzUserInfo")
	public Result delSzUserInfo(@RequestParam(value = "id", required = false) String id){
		szUserInfoService.delSzUserInfo(id);
		return new Result();
	}
	
	@GetMapping("getAll")
	@ApiOperation(notes="SzUserInfoController.getAll()", value = "getAll")
	public Result getAll(){
		List<SzUserInfo> data = szUserInfoService.getAll();
		return new Result(data);
	}
	
	@GetMapping("getBykey")
	@ApiOperation(notes="SzUserInfoController.findSzUserInfoById", value = "findSzUserInfoById")
	public Result findSzUserInfoById(@RequestParam(value = "id", required = false) String id){
		SzUserInfo data = szUserInfoService.findSzUserInfoById(id);
		return new Result(data);
	}
}
