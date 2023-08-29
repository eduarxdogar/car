package com.credibanco.conseCar.implemetacion;


import com.credibanco.conseCar.dto.ClienteDTO;
import com.credibanco.conseCar.entities.Cliente;
import com.credibanco.conseCar.entities.Consecionario;
import com.credibanco.conseCar.repositories.IClienteRepository;
import com.credibanco.conseCar.repositories.IConsecionarioRepository;
import com.credibanco.conseCar.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;


import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;



public class ClienteImpl implements IClienteService {
    @Autowired
    private  IClienteRepository iClienteRepository;
    private final IConsecionarioRepository iConsecionarioRepository;

    public ClienteImpl(IClienteRepository iClienteRepository, IConsecionarioRepository iConsecionarioRepository) {
        this.iClienteRepository = iClienteRepository;
        this.iConsecionarioRepository = iConsecionarioRepository;
    }

    @Override
    public List<ClienteDTO> encontrarTodos(Long consecionarioId) {
     Consecionario consecionario = iConsecionarioRepository.findById(consecionarioId).orElseThrow(()-> new EntityNotFoundException("Concesionario No Encontrado"));

     Optional<Cliente> clientes = iClienteRepository.findById(consecionarioId);

     return clientes.stream().map(cliente -> mapToDto(cliente)).collect(Collectors.toList());

        }

    @Override
    public Cliente encontrarporId(Long id) {
        return null;
    }

    @Override
    public void actualizarConcesionario(Cliente concesionario) {

    }

    @Override
    public void crearConcesionario(Cliente concesionario) {

    }

    @Override
    public void eliminarConcesionario(Long id) {

    }

    private ClienteDTO mapToDto(Cliente cliente){
        ClienteDTO clienteDTO = new ClienteDTO();

        clienteDTO.setId(cliente.getId());
        clienteDTO.setNombre(cliente.getNombre());
        clienteDTO.setApellido(cliente.getApellido());
        clienteDTO.setTelefonoPersonal(cliente.getTelefonoPersonal());
        clienteDTO.setDireccion(cliente.getDireccion());
        return clienteDTO;
        }

    }

