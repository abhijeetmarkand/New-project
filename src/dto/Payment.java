package dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="paydetails")
public class Payment {
	
	@Id
	@Column(name="transId")
	private String transId;
	@Column(name="user_id")
	private String userId;
	@Column(name="order_id")
	private String orderId;
	private String transAmount;
	private String transStatus;
	private String transDate;
	private String modeOfTrans;
	
	@ManyToOne
	private OrderDetails orderDetails;
	
	
	public OrderDetails getOrderDetails() {
		return orderDetails;
	}


	public void setOrderDetails(OrderDetails orderDetails) {
		this.orderDetails = orderDetails;
	}

	@ManyToOne
	private User user;
	
	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Payment() {
		super();
	}

	
	@ManyToOne
	@JoinColumn(name="userId")
	public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}



	public String getTransId() {
		return transId;
	}

	public void setTransId(String transId) {
		this.transId = transId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}

	public String getTransStatus() {
		return transStatus;
	}

	public void setTransStatus(String transStatus) {
		this.transStatus = transStatus;
	}

	public String getTransDate() {
		return transDate;
	}

	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}

	public String getModeOfTrans() {
		return modeOfTrans;
	}

	public void setModeOfTrans(String modeOfTrans) {
		this.modeOfTrans = modeOfTrans;
	}

	@Override
	public String toString() {
		return "Payment [transId=" + transId + ", orderId=" + orderId + ", userId=" + userId + ", transAmount=" + transAmount
				+ ", transStatus=" + transStatus + ", transDate=" + transDate + ", modeOfTrans=" + modeOfTrans + "]";
	}
	
	
	
	
	

}
