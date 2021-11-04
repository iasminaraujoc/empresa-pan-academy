package br.ica.empresa.boot.service;

import br.ica.empresa.boot.domain.Cargo;
import br.ica.empresa.boot.domain.Departamento;

import java.util.List;

public interface DepartamentoService {
    void salvar(Departamento departamento);

    void editar(Departamento departamento);

    void excluir(Long id);

    Departamento buscarPorId(Long id);

    List<Departamento> buscartodos();

    boolean departamentoTemCargos(Long id);
}
