package br.com.caelum.tarefas.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.caelum.tarefas.dao.JdbcTarefaDao;
import br.com.caelum.tarefas.modelo.Tarefa;

@Controller
public class TarefasController {

	@ResponseBody
	@RequestMapping(value = "/adicionaTarefa", produces = MediaType.APPLICATION_JSON_VALUE)
	public Tarefa adiciona(Tarefa tarefa) {
		JdbcTarefaDao dao = new JdbcTarefaDao();
		dao.adiciona(tarefa);
		
		return tarefa;
	}

}
