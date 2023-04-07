package br.jogoteca.system.models;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
	
	
	private int id;
	private LocalDateTime momento;
	private List<GameItem> itens;
	private User usuario;
	
	public Pedido(int id, LocalDateTime momento, List<GameItem> itens, User usuario) {
		super();
		this.id = id;
		this.momento = momento;
		this.itens = itens;
		this.usuario = usuario;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDateTime getMomento() {
		return momento;
	}
	public void setMomento(LocalDateTime momento) {
		this.momento = momento;
	}
	public List<GameItem> getItens() {
		return itens;
	}
	public void setItens(List<GameItem> itens) {
		this.itens = itens;
	}
	public User getUser() {
		return usuario;
	}
	public void setUser(User usuario) {
		this.usuario = usuario;
	}
					

}