package me.dio.controller;

import me.dio.model.Address;
import me.dio.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping
    public List<Address> listarTodos() {
        return addressService.listarTodos();
    }

    @PostMapping
    public Address salvar(@RequestBody Address address) {
        return addressService.salvar(address);
    }
}