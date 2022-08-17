package by.calculate.heatingelementcalculationprogram.service;

import by.calculate.heatingelementcalculationprogram.dao.CustomerRepository;
import by.calculate.heatingelementcalculationprogram.dao.impl.CustomerRepositoryImpl;
import by.calculate.heatingelementcalculationprogram.domain.initialdatachild.Customer;
import by.calculate.heatingelementcalculationprogram.dto.CustomerDto;
import by.calculate.heatingelementcalculationprogram.mapper.CustomMapper;


public class CustomerService {

    CustomerRepository customerRepository = new CustomerRepositoryImpl();

    public void insertOne(Customer customer){
        CustomerDto customerDto = CustomMapper.toCustomerDto(customer);
        customerRepository.insertOne(customerDto);
    }
}
