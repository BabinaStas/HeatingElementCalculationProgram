package by.calculate.heatingelementcalculationprogram.mapper;

import by.calculate.heatingelementcalculationprogram.domain.initialdatachild.Customer;
import by.calculate.heatingelementcalculationprogram.dto.CustomerDto;

import java.util.ArrayList;
import java.util.List;

public class CustomMapper {

    public static Customer toCustomer(CustomerDto customerDto){
        Customer result = new Customer();
        result.setId(customerDto.getId());
        result.setNumberOrder(customerDto.getNumberOrder());
        result.setCustomer(customerDto.getCustomColumn());
        result.setNumberOfProducts(customerDto.getNumberOfProducts());
        result.setPilotBatch(customerDto.getPilotBatch());
        return result;
    }

    public static List<Customer> toCustomerList(List<CustomerDto> customerDtos){
        List<Customer> result = new ArrayList<>();
        for (CustomerDto elem: customerDtos){
            result.add(toCustomer(elem));
        }
        return result;
    }

    public static CustomerDto toCustomerDto(Customer customer){
        CustomerDto result = new CustomerDto();
        result.setId(customer.getId());
        result.setNumberOrder(customer.getNumberOrder());
        result.setCustomColumn(customer.getCustomer());
        result.setNumberOfProducts(customer.getNumberOfProducts());
        result.setPilotBatch(customer.getPilotBatch());
        return result;
    }
}
