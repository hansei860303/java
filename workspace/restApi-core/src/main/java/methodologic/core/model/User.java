package methodologic.core.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
	
	private Long id;
	
	@NotBlank
	@Size(max=254)
	private String email;
	
	@NotBlank
	@Size(max=254)
	private String password;
	
	@NotBlank
	@Size(max=60)
	private String firstName;
	
	@NotBlank
	@Size(max=60)
	private String lastName;
	
	@Size(max=120)
	private String affiliation;
	
	private String loginDate;
	
	private boolean isFirstLogin ;
	
	private boolean deleteFlag ;
	
}
