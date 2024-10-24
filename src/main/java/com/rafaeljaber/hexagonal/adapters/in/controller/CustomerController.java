package com.rafaeljaber.hexagonal.adapters.in.controller;

import com.rafaeljaber.hexagonal.adapters.in.controller.mapper.CustomerMapper;
import com.rafaeljaber.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.rafaeljaber.hexagonal.adapters.in.controller.response.CustomerResponse;
import com.rafaeljaber.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.rafaeljaber.hexagonal.application.ports.in.InsertCustomerInputPort;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/customers")
public class CustomerController {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;
    private final InsertCustomerInputPort insertCustomerInputPort;
    private final CustomerMapper customerMapper;

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable String id) {
        var customer = findCustomerByIdInputPort.find(id);
        var customerResponse = customerMapper.toCustomerResponse(customer);
        return ResponseEntity.ok(customerResponse);
    }

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerInputPort.insert(customer, customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }

}
