package com.rafaeljaber.hexagonal.adapters.out.repository.mapper;

import com.rafaeljaber.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.rafaeljaber.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

}
