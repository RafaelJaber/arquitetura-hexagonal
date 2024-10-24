package com.rafaeljaber.hexagonal.config;

import com.rafaeljaber.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.rafaeljaber.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.rafaeljaber.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.rafaeljaber.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(
                findCustomerByIdUseCase,
                findAddressByZipCodeAdapter,
                updateCustomerAdapter
        );
    }
}
