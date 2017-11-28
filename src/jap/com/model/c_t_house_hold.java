package jap.com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class c_t_house_hold {
    private String pay_date;
    
    private String pay_d_no;
    
    private String p_type;
    
    private int amount;
    
    private String receipt_no;
    
    private String remarks;
    
    private String del_flag;
    
    private String create_date;
    
    private String create_user_cd;
    
    private String update_date;
    
    private String update_user_cd;

    @Id
	public String getPay_date() {
		return pay_date;
	}

	public void setPay_date(String pay_date) {
		this.pay_date = pay_date;
	}

	public String getPay_d_no() {
		return pay_d_no;
	}

	public void setPay_d_no(String pay_d_no) {
		this.pay_d_no = pay_d_no;
	}

	public String getP_type() {
		return p_type;
	}

	public void setP_type(String p_type) {
		this.p_type = p_type;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getReceipt_no() {
		return receipt_no;
	}

	public void setReceipt_no(String receipt_no) {
		this.receipt_no = receipt_no;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getDel_flag() {
		return del_flag;
	}

	public void setDel_flag(String del_flag) {
		this.del_flag = del_flag;
	}

	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}

	public String getCreate_user_cd() {
		return create_user_cd;
	}

	public void setCreate_user_cd(String create_user_cd) {
		this.create_user_cd = create_user_cd;
	}

	public String getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}

	public String getUpdate_user_cd() {
		return update_user_cd;
	}

	public void setUpdate_user_cd(String update_user_cd) {
		this.update_user_cd = update_user_cd;
	}
}
