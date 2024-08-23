package com.PetShopAPI.persistence;

import com.PetShopAPI.persistence.crud.ClienteCrudRepository;
import com.PetShopAPI.persistence.entity.Cliente;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class ClienteRepository {

    private ClienteCrudRepository clienteCrudRepository;

    public Cliente createCliente(Cliente cliente) {
        try {
            Cliente saved = clienteCrudRepository.save(cliente);
            return saved;
        }catch (Exception e) {
            throw new RuntimeException("Error creando el cliente"+e.getMessage());
        }

    }

    public List<Cliente> findAll() {

        try {
            return (List<Cliente>) clienteCrudRepository.findAll();
        }catch (Exception e) {
            throw new RuntimeException("Error consultando clientes"+e.getMessage());
        }

    }

    public Cliente updateCliente(Cliente cliente) {

        try {
            Optional<Cliente> exist = clienteCrudRepository.findById(cliente.getClienteId());
            if (exist.isPresent()) {
                Cliente saved = exist.get();
                saved.setNombre(cliente.getNombre());
                saved.setApellido(cliente.getApellido());
                saved.setEmail(cliente.getEmail());
                saved.setTelefono(cliente.getTelefono());
                saved.setDireccion(cliente.getDireccion());
                clienteCrudRepository.save(saved);
                return saved;
            }
        }catch (Exception e) {
            throw new RuntimeException("Error actualizando el cliente"+e.getMessage());
        }
        return null;
    }

    public void deleteCliente(Cliente cliente) {

        try {
            Optional<Cliente> exist = clienteCrudRepository.findById(cliente.getClienteId());
            if (exist.isPresent()) {
                clienteCrudRepository.delete(exist.get());
            }
        }catch (Exception e) {
            throw new RuntimeException("Error eliminando el cliente"+e.getMessage());
        }
    }
}
