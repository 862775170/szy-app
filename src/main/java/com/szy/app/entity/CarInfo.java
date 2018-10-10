package com.szy.app.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author cc
 * @since 2018-05-06
 */
public class CarInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 车Id
     */
	private String carId;
    /**
     * 车牌
     */
	private String carNumber;
    /**
     * 创建时间
     */
	private Date createTime;
    /**
     * 更新时间
     */
	private Date updateTime;


	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "CarInfo{" +
			"carId=" + carId +
			", carNumber=" + carNumber +
			", createTime=" + createTime +
			", updateTime=" + updateTime +
			"}";
	}
}
