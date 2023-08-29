package com.credibanco.conseCar.negocio;

import com.credibanco.conseCar.dto.ClienteDTO;
import com.credibanco.conseCar.implemetacion.ClienteImpl;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class ClienteNegocio {



    ClienteImpl clienteImpl;

    private List<ClienteDTO> clienteDTOList = new  ArrayList<>();

    public  List<ClienteDTO> encontrarTodosClienteList(Long consecionarioId){
        this.clienteImpl.encontrarTodos(consecionarioId).forEach(cliente -> {
            ClienteDTO clienteDTO = new ClienteDTO();
            clienteDTO.setId(clienteDTO.getId());
            clienteDTO.setNombre(clienteDTO.getNombre());
            clienteDTO.setApellido(clienteDTO.getApellido());
            clienteDTO.setDireccion(clienteDTO.getDireccion());
            clienteDTO.setTelefonoPersonal(clienteDTO.getTelefonoPersonal());
            //if (!clienteDTO.equals(clienteDTO =! clienteDTO.equals(ClienteDTO)))
            this.clienteDTOList.add(clienteDTO);


        });
        return  this.clienteDTOList;

    }


}
