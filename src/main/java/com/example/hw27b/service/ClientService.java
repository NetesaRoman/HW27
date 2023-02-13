package com.example.hw27b.service;

import com.example.hw27b.dto.*;
import com.example.hw27b.model.Address;
import com.example.hw27b.model.Client;
import com.example.hw27b.repository.AddressRepository;
import com.example.hw27b.repository.ClientRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/*
 *
 * @author Roman Netesa
 *
 */
@Service
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository clientRepository;
    private final AddressRepository addressRepository;

    public ClientDto createNewClient(ClientDto clientDto, AddressDto addressDto){
        Client client = new Client();
        client.setName(clientDto.getName());
        client.setEmail(clientDto.getEmail());
        client.setPhone(clientDto.getPhone());
        Address address = new Address();
        address.setCity(addressDto.getCity());
        address.setStreet(addressDto.getStreet());
        address.setHouse(addressDto.getHouse());
        address.setCountry(addressDto.getCountry());

        clientRepository.save(client);
        clientDto.setId(client.getId());

        address.setClient(client);
        addressRepository.save(address);

        return clientDto;
    }

    public void updateAddress(Integer id, AddressDto addressDto) {

        Address address = new Address();
        address.setId(id);
        address.setStreet(addressDto.getStreet());
        address.setCity(addressDto.getCity());
        address.setCountry(addressDto.getCountry());
        address.setHouse(addressDto.getHouse());
        address.setClient(addressDto.getClient());

        addressRepository.save(address);

    }

    public ClientInfoDto getClient(Integer id){
        Client client = clientRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("No client!"));
        return new ClientInfoDto(client.getId(),
                client.getName(),
                client.getEmail(),
                client.getPhone(),
                client.getAddress().getCountry(),
                client.getAddress().getCity(),
                client.getAddress().getStreet(),
                client.getAddress().getHouse());
    }

    public ClientOrderIdDto getClientOrderId(Integer id){
        Client client = clientRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("No client!"));
        List<Integer> ids = new ArrayList<>();
        client.getOrders().forEach(order -> ids.add(order.getId()));
        return new ClientOrderIdDto(client.getId(), client.getName(), client.getEmail(), client.getPhone(), ids);
    }

    public ClientOrderDto getClientOrder(Integer id){
        Client client = clientRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("No client!"));
        return new ClientOrderDto(client.getId(),
                client.getName(),
                client.getEmail(),
                client.getPhone(),
                client.getOrders());
    }
}
