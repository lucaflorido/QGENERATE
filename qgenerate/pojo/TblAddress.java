package qgenerate.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import qgenerate.vo.Address;
import qgenerate.vo.IVo;

@Entity
@Table(name="Address")
public class TblAddress implements ITbl {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idAddress")
	private int idAddress;
	@Column(name="street")
	private String street;
	@Column(name="number")
	private String number;
	@Column(name="city")
	private String city;
	@Column(name="zone")
	private String zone;
	@Column(name="zipcode")
	private String zipcode;
	@Column(name="country")
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
	public void convertToTable(IVo obj){
		Address a = (Address) obj;
		this.city = a.getCity();
		this.country = a.getCountry();
		this.idAddress = a.getIdAddress();
		this.number = a.getNumber();
		this.street = a.getStreet();
		this.zipcode = a.getZipcode();
		this.zone = a.getZone();
	}
}
