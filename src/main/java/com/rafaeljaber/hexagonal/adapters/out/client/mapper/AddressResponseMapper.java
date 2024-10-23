package com.rafaeljaber.hexagonal.adapters.out.client.mapper;

import com.rafaeljaber.hexagonal.adapters.out.client.response.AddressResponse;
import com.rafaeljaber.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
