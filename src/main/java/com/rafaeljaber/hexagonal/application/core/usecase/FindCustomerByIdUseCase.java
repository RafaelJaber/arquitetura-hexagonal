package com.rafaeljaber.hexagonal.application.core.usecase;

import com.rafaeljaber.hexagonal.application.core.domain.Customer;
import com.rafaeljaber.hexagonal.application.core.domain.exceptions.CustomerNotFoundException;
import com.rafaeljaber.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.rafaeljaber.hexagonal.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    public Customer find(String id) {
        return findCustomerByIdOutputPort.find(id).orElseThrow(
                () -> new CustomerNotFoundException(id)
        );
    }

}
