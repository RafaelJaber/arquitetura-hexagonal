package com.rafaeljaber.hexagonal.adapters.in.consumer;

import com.rafaeljaber.hexagonal.adapters.in.consumer.mapper.CustomerMessageMapper;
import com.rafaeljaber.hexagonal.adapters.in.consumer.message.CustomerMessage;
import com.rafaeljaber.hexagonal.application.ports.in.UpdateCustomerInputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ReceiveValidatedCpfConsumer {

    private final UpdateCustomerInputPort updateCustomerInputPort;
    private final CustomerMessageMapper customerMessageMapper;

    @KafkaListener(
            topics = "tp-cpf-validated",
            groupId = "jaber"
    )
    public void receive(CustomerMessage customerMessage) {
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerInputPort.update(customer, customerMessage.getZipCode());
    }

}
