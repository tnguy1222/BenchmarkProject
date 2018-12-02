package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ManagedBean
@ViewScoped
public class Key {
	
	@NotNull(message="This field is required")
	@Size(min=1,max=15,message="Entry must be between 1-15 characters")
	private String keyWord;
	public Key() {
		keyWord="God";
	}
	public Key(String key) {
		super();
		this.keyWord = key;
	}
	public String getKey() {
		return keyWord;
	}
	public void setKey(String key) {
		this.keyWord = key;
	}
	
	
}
