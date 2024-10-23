package com.rafaeljaber.hexagonal.adapters.out;

import com.rafaeljaber.hexagonal.adapters.out.client.FindAddressByZipCodeClient;
import com.rafaeljaber.hexagonal.adapters.out.client.mapper.AddressResponseMapper;
import com.rafaeljaber.hexagonal.application.core.domain.Address;
import com.rafaeljaber.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor

public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    private final FindAddressByZipCodeClient findAddressByZipCodeClient;
    private final AddressResponseMapper addressResponseMapper;


    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }

}
