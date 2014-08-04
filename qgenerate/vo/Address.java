package qgenerate.vo;

import javax.persistence.Column;

import qgenerate.pojo.ITbl;
import qgenerate.pojo.TblAddress;

public class Address implements IVo {
	private int idAddress;
	
	private String street;
	
	private String number;
	
	private String city;
	
	private String zone;
	
	private String zipcode;
	
	private String country;
	public int getIdAddress() {
		return idAddress;
	}
	public void setIdAddress(int idAddress) {
		this.idAddress = idAddress;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void convertFromTable(ITbl obj){
		TblAddress a = (TblAddress) obj;
		this.city = a.getCity();
		this.country = a.getCountry();
		this.idAddress = a.getIdAddress();
		this.number = a.getNumber();
		this.street = a.getStreet();
		this.zipcode = a.getZipcode();
		this.zone = a.getZone();
	}
}
