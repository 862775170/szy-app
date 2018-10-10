package com.szy.app.common;

public class Result {
	private String code;

	private String msg;

	private Object data;

	public Result(Object data) {
		this.code = "0";
		this.msg = "SUCCESS";
		this.data = data;
	}

	public Result() {
		super();
		this.code = "0";
		this.msg = "SUCCESS";
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
