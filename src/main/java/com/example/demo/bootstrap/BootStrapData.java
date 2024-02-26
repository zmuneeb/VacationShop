package com.example.demo.bootstrap;

import com.example.demo.dao.CountryRepository;
import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Country;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Division;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;
    private final CountryRepository countryRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository, CountryRepository countryRepository) {
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
        this.countryRepository = countryRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Country country1 = new Country();
        country1.setCountry_name("Country 1");
        countryRepository.save(country1);

        Division division1 = new Division();
        division1.setDivision_name("Division 1");
        division1.setCountry(country1);
        division1.setId(1L);
        divisionRepository.save(division1);

        Customer customer1 = customerRepository.findByAddress("123 Clove Road");
        if (customer1 == null) {
            customer1 = new Customer("Jimmy", "Dolan", "123 Clove Road", "31231", "(555)555-5556", division1);
            division1.getCustomers().add(customer1);
            divisionRepository.save(division1);
            customerRepository.save(customer1);
        }

        Customer customer2 = customerRepository.findByAddress("456 John Street");
        if (customer2 == null) {
            customer2 = new Customer("Adam", "Philips", "456 John Street", "12345", "(555)555-5557", division1);
            division1.getCustomers().add(customer2);
            customerRepository.save(customer2);
            divisionRepository.save(division1);
        }

        Customer customer3 = customerRepository.findByAddress("789 Willowbrook Road");
        if (customer3 == null) {
            customer3 = new Customer("Bobby", "Ericson", "789 Willowbrook Road", "12312", "(555)555-5558", division1);
            division1.getCustomers().add(customer3);
            divisionRepository.save(division1);
            customerRepository.save(customer3);
        }

        Customer customer4 = customerRepository.findByAddress("112 Broadway Street");
        if (customer4 == null) {
            customer4 = new Customer("Christopher", "Moltisanti", "112 Broadway Street", "12311", "(555)555-5559", division1);
            division1.getCustomers().add(customer4);
            divisionRepository.save(division1);
            customerRepository.save(customer4);
        }

        Customer customer5 = customerRepository.findByAddress("431 Hickson Avenue");
        if (customer5 == null) {
            customer5 = new Customer("Anthony", "Blundetto", "431 Hickson Avenue", "12121", "(555)555-5560", division1);
            division1.getCustomers().add(customer5);
            divisionRepository.save(division1);
            customerRepository.save(customer5);
        }


        Iterable<Customer> customers = customerRepository.findAll();
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
