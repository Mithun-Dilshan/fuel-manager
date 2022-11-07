package fuelmanager;

public class fuel {
	private int id;
	private String ftype ;
	private String  n_capacity;
	private String f_remain ;
	private String price ;
	private String a_date; 
	private String nc_date ;
	private String m_name ;
	private String eid ;
	
	
	
	public fuel(int id, String ftype, String n_capacity, String f_remain, String price, String a_date, String nc_date,
			String m_name, String eid) {
		super();
		this.id = id;
		this.ftype = ftype;
		this.n_capacity = n_capacity;
		this.f_remain = f_remain;
		this.price = price;
		this.a_date = a_date;
		this.nc_date = nc_date;
		this.m_name = m_name;
		this.eid = eid;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFtype() {
		return ftype;
	}



	public void setFtype(String ftype) {
		this.ftype = ftype;
	}



	public String getN_capacity() {
		return n_capacity;
	}



	public void setN_capacity(String n_capacity) {
		this.n_capacity = n_capacity;
	}



	public String getF_remain() {
		return f_remain;
	}



	public void setF_remain(String f_remain) {
		this.f_remain = f_remain;
	}



	public String getPrice() {
		return price;
	}



	public void setPrice(String price) {
		this.price = price;
	}



	public String getA_date() {
		return a_date;
	}



	public void setA_date(String a_date) {
		this.a_date = a_date;
	}



	public String getNc_date() {
		return nc_date;
	}



	public void setNc_date(String nc_date) {
		this.nc_date = nc_date;
	}



	public String getM_name() {
		return m_name;
	}



	public void setM_name(String m_name) {
		this.m_name = m_name;
	}



	public String getEid() {
		return eid;
	}



	public void setEid(String eid) {
		this.eid = eid;
	}
	
	
	
	
	
	
	
	

}
