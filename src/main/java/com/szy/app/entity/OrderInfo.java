package com.szy.app.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author cc
 * @since 2018-05-06
 */
public class OrderInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单Id
     */
	private String orderId;
    /**
     * 车Id
     */
	private String carId;
    /**
     * 入场时间
     */
	private Date inTime;
    /**
     * 出场时间
     */
	private Date outTime;
    /**
     * 支付状态
     */
	private String payStatus;
    /**
     * 支付金额
     */
	private BigDecimal payPrice;
    /**
     * 停车场Id
     */
	private String parkingId;


	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public Date getInTime() {
		return inTime;
	}

	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}

	public Date getOutTime() {
		return outTime;
	}

	public void setOutTime(Date outTime) {
		this.outTime = outTime;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public BigDecimal getPayPrice() {
		return payPrice;
	}

	public void setPayPrice(BigDecimal payPrice) {
		this.payPrice = payPrice;
	}

	public String getParkingId() {
		return parkingId;
	}

	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}

	@Override
	public String toString() {
		return "OrderInfo{" +
			"orderId=" + orderId +
			", carId=" + carId +
			", inTime=" + inTime +
			", outTime=" + outTime +
			", payStatus=" + payStatus +
			", payPrice=" + payPrice +
			", parkingId=" + parkingId +
			"}";
	}
}
