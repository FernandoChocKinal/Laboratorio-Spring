package com.fchoc.webapp.biblioteca.service;

import java.util.List;

import com.fchoc.webapp.biblioteca.model.Cliente;

public interface IClienteService {

    public List<Cliente> listarClientes();

    public void guardarCliente(Cliente cliente);

    public Cliente buscarClientePorId(Long id);

    public void eliminarCliente(Cliente clientes);
}
