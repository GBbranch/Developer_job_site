package com.dto;

<<<<<<< HEAD
public class CompanyDTO extends UserDTO{
	public CompanyDTO() { this.kind = false; }
	
	private int id;
	private String company_no;
	private String password;
	private String name;
	private String birth;
	private String type;
	private String employee_no;
	private String sale;
	private String ceo;
	private String url;
	private String addr;
	private String detail_addr;
<<<<<<< HEAD
	
=======
>>>>>>> 98a4b4741d0bca09ce780519c1ec4db79cbe0def
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany_no() {
		return company_no;
	}
	public void setCompany_no(String company_no) {
		this.company_no = company_no;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEmployee_no() {
		return employee_no;
	}
	public void setEmployee_no(String employee_no) {
		this.employee_no = employee_no;
	}
	public String getSale() {
		return sale;
	}
	public void setSale(String sale) {
		this.sale = sale;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
<<<<<<< HEAD
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getDetail_addr() {
		return detail_addr;
	}
	public void setDetail_addr(String detail_addr) {
		this.detail_addr = detail_addr;
	}
	
	@Override
	public String toString() {
		return "CompanyDTO [id=" + id + ", company_no=" + company_no + ", password=" + password + ", name=" + name
				+ ", birth=" + birth + ", type=" + type + ", employee_no=" + employee_no + ", sale=" + sale + ", ceo="
				+ ceo + ", url=" + url + ", addr=" + addr + ", detail_addr=" + detail_addr + "]";
=======
>>>>>>> 98a4b4741d0bca09ce780519c1ec4db79cbe0def
	}
<<<<<<< HEAD
=======
public class CompanyDTO {
    private String businessNumber;
    private String password;
    private String companyName;
    private String establishedDate;
    private String companyType;
    private int employeeCount;
    private String representativeName;
    private String website;
    private String zipcode;
    private String address;
    private String detailAddr;
    private String addretc;
    private String companyDescription;

    // 생성자
    public CompanyDTO() {
    }

    // Getter 및 Setter 메서드
    public String getBusinessNumber() {
        return businessNumber;
    }

    public void setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEstablishedDate() {
        return establishedDate;
    }

    public void setEstablishedDate(String establishedDate) {
        this.establishedDate = establishedDate;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public String getRepresentativeName() {
        return representativeName;
    }

    public void setRepresentativeName(String representativeName) {
        this.representativeName = representativeName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDetailAddr() {
        return detailAddr;
    }

    public void setDetailAddr(String detailAddr) {
        this.detailAddr = detailAddr;
    }

    public String getAddretc() {
        return addretc;
    }

    public void setAddretc(String addretc) {
        this.addretc = addretc;
    }

    public String getCompanyDescription() {
        return companyDescription;
    }

    public void setCompanyDescription(String companyDescription) {
        this.companyDescription = companyDescription;
    }
>>>>>>> 2783b1409f8eaf5cb742045817db924765280052
=======
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getDetail_addr() {
		return detail_addr;
	}
	public void setDetail_addr(String detail_addr) {
		this.detail_addr = detail_addr;
	}
	
	
>>>>>>> eff2f495242afb0a893c74d861baa10198201de2
}
