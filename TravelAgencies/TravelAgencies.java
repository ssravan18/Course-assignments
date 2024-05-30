package assign2;

public class TravelAgencies {
	int regNo, price;
	String agencyName, pakageType;
	boolean flightFacility;
	public TravelAgencies(int regNo, String agencyName, String pakageType, int price, boolean flightFacility) {
		this.regNo = regNo;
		this.agencyName = agencyName;
		this.pakageType = pakageType;
		this.price = price;
		this.flightFacility = flightFacility;
	}
	
	public void setregNo(int regNo) {
		this.regNo = regNo;
	}
	public int getregNo() {
		return regNo;
	}
	
	public void setagencyName(String name) {
		this.agencyName = name;
	}
	public String getagencyName() {
		return agencyName;
	}
	
	public void setpakageType(String pakageType) {
		this.pakageType = pakageType;
	}
	public String getpakageType() {
		return pakageType;
	}
	
	public void setprice(int price) {
		this.price = price;
	}
	public int getprice() {
		return price;
	}
	
	public void setflightFacility(boolean flightFacility) {
		this.flightFacility = flightFacility;
	}
	public boolean getflightFacility() {
		return flightFacility;
	}
}
