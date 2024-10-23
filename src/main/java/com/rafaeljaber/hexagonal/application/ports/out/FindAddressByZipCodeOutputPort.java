package com.rafaeljaber.hexagonal.application.ports.out;

import com.rafaeljaber.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
