package com.iamspe.sismedicine.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private String insumo;
	
	private String reagente;
	
	private String lote;
	
	@JsonFormat(pattern = "dd/MM/yyyy H:mm", locale = "pt-BR", timezone = "Brazil/East")
	private Date validade;
	
	@JsonFormat(pattern = "dd/MM/yyyy H:mm", locale = "pt-BR", timezone = "Brazil/East")
    private Date dataInicio;
	
	private String observacao;

}
