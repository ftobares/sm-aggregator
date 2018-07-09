package ar.com.ftobares.backendsm.model;

import org.springframework.data.annotation.Id;

public class Interests {

	@Id
	private Long id;
	
	private String type;
	
	private String desc;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
