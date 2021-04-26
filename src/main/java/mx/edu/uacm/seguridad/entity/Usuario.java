package mx.edu.uacm.seguridad.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuario {
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//private Long id;
	@Id
	private String email;
	private String password;
	
	/*Asociacion bidireccional Usuario-Rol, Uno a Muchos*/
	@OneToMany(mappedBy="cliente", fetch= FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<Rol> roles = new HashSet<>();
	
	public Set<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Set<Rol> roles) {
		this.roles = roles;
	}

	public Usuario() {
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	
}
