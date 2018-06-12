package domain;

public class Phone {
	String name,phoneNum,brand,kind,call;
	public void setName(String name) {
		this.name = name;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public void setBrand() {
		this.brand = "삼성";
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public void setCall(String call) {
		this.call = call;
	}
	public String getName() {
		return name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public String getBrand() {
		return brand;
	}
	public String getKind() {
		return kind;
	}
	public String getCall() {
		return call;
	}
	public String toString() {
		return String.format("%s 에게 %s 번호로 %s 제품 %s를 사용해서 %s 라고 통화했다",name,phoneNum,brand,kind,call);
	}
}
