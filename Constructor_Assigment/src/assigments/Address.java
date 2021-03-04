package assigments;

public class Address {
	private int aid;
	private String streetname;
	private String state;
	private int zip;
	public Address(int aid, String streetname, String state, int zip) {
		super();
		this.aid = aid;
		this.streetname = streetname;
		this.state = state;
		this.zip = zip;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	

}
