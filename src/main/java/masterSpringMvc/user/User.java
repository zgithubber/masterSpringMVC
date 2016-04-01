package masterSpringMvc.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	private String twitterHandle;
	private String email;
	private LocalDate birthDate;
	@JsonProperty("tastes")
	private List<String> tastes = new ArrayList<>();
	
	public User() {
	}
	
	public User(String email) {
		super();
		this.email = email;
	}


	// Getters and setters for all fields
	public String getTwitterHandle() {
		return twitterHandle;
	}

	public void setTwitterHandle(String twitterHandle) {
		this.twitterHandle = twitterHandle;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public List<String> getTastes() {
		return tastes;
	}

	public void setTastes(List<String> tastes) {
		this.tastes = tastes;
	}

}