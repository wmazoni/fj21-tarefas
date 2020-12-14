package br.com.caelum.tarefas.modelo;

import java.util.Calendar;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Tarefa {
	private Long id;

	@Size(min = 5)
	private String descricao;
	private boolean finalizado;

	@JsonFormat(pattern = "dd/MM/yyyy", timezone = "America/Sao_Paulo")
	private Calendar dataFinalizacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	public Calendar getDataFinalizacao() {
		return dataFinalizacao;
	}

	public void setDataFinalizacao(Calendar dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}

}
