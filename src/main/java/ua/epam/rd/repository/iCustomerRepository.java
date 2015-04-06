package ua.epam.rd.repository;

import ua.epam.rd.domain.Customer;

import java.util.List;

/**
 * Created by Пользователь on 04.04.2015.
 */
public interface iCustomerRepository {
    long setCustomer(Customer customer);

    void setCustomer(List<Customer> customers);

    Customer getCustomer(long id);

    List<Customer> getAll();

    void mergeCustomer(Customer customer);

    void deleteCustomer(Customer customer);

    void deleteCustomer(long id);
}