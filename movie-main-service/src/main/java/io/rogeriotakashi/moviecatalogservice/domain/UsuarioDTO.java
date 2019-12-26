package io.rogeriotakashi.moviecatalogservice.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;


public class UsuarioDTO {

	private String usuario;

	private String senha;

	private String nome;

	private String sobrenome;

	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date inscricao;

	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date manut;

	public UsuarioDTO() {
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Date getInscricao() {
		return inscricao;
	}

	public void setInscricao(Date inscricao) {
		this.inscricao = inscricao;
	}

	public Date getManut() {
		return manut;
	}

	public void setManut(Date manut) {
		this.manut = manut;
	}

	@Override
	public String toString() {
		return "AlunosDTO [nome=" + nome + ", sobrenome=" + sobrenome + ", inscricao=" + inscricao + ", manut=" + manut
				+ "]";
	}

}
