package org.classapp.backend.data.model;

public class UserRole {
	private Long idUser;
	private Long idRole;

	public UserRole() {

	}

	public UserRole(Long iduser, Long idrole) {
		this.idUser = iduser;
		this.idRole = idrole;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long iduser) {
		this.idUser = iduser;
	}

	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idrole) {
		this.idRole = idrole;
	}

	@Override
	public String toString() {
		return "UserRole [idUser=" + idUser + ", idRole=" + idRole + "]";
	}
}
