package com.grayMatter.beans;

import java.util.List;

public class Order {
	
	private int orderId;
	private List<String> itemlist;
	public Order() {
		super();
	}
	public Order(int orderId, List<String> itemlist) {
		super();
		this.orderId = orderId;
		this.itemlist = itemlist;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", itemlist=" + itemlist + "]";
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public List<String> getItemlist() {
		return itemlist;
	}
	public void setItemlist(List<String> itemlist) {
		this.itemlist = itemlist;
	}

}
