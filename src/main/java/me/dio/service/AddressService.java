package me.dio.service;

import me.dio.model.Address;
import me.dio.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> listarTodos() {
        return addressRepository.findAll();
    }

    public Address salvar(Address address) {
        return addressRepository.save(address);
    }
}