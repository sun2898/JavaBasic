package day08.encap.good;

public class Member {
	
	//자동완성기능 alt + shift + s or Source

	private String name;
	private int age;
	private String id;
	private String pw;
	private String addr;
	private String zipcode;
	private String ssn;
	
	public Member(String name, int age, String id, String pw, String addr, String zipcode, String ssn) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.pw = pw;
		this.addr = addr;
		this.zipcode = zipcode;
		this.ssn = ssn;
	}	
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	
}
