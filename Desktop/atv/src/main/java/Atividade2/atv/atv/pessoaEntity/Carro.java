package Atividade2.atv.atv.pessoaEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Carro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String fabricante;
	private Integer numeroRodas;
	
	public Carro(int id, String fabricante, Integer numeroRodas) {
		super();
		this.id = id;
		this.fabricante = fabricante;
		this.numeroRodas = numeroRodas;
	}
	
	public Carro() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Integer getNumeroRodas() {
		return numeroRodas;
	}

	public void setNumeroRodas(Integer numeroRodas) {
		this.numeroRodas = numeroRodas;
	}

	@Override
	public String toString() {
		return "Carro [id=" + id + ", fabricante=" + fabricante + ", numeroRodas=" + numeroRodas + "]";
	}
	
	
	

}
