package com.rafaeljaber.hexagonal.config;

import com.rafaeljaber.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.rafaeljaber.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.rafaeljaber.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ) {
        return new DeleteCustomerByIdUseCase(
                findCustomerByIdUseCase,
                deleteCustomerByIdAdapter
        );
    }

}
