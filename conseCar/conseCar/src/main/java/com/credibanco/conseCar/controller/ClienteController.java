package com.credibanco.conseCar.controller;

import com.credibanco.conseCar.dto.ClienteDTO;
import com.credibanco.conseCar.negocio.ClienteNegocio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/consecionarios")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE,RequestMethod.HEAD})
public class ClienteController {

private ClienteNegocio clienteNegocio;

private ClienteDTO clienteDTO;


@GetMapping("/all")
    @ResponseBody
    public ResponseEntity<Map<String,Object>>all(Long consecionarioId){
    Map<String,Object> res = new HashMap<>();
    List<ClienteDTO> clienteDTOList = this.clienteNegocio.encontrarTodosClienteList(consecionarioId);
    System.out.println("@@@!" + clienteDTOList.toString());

    res.put("status","ok");
    res.put("data" , clienteDTOList);

    return  new ResponseEntity<>(res, HttpStatus.OK);
}

}
