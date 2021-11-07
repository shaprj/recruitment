package com.shaprj.test.recruitment.recruitment.data.service

import com.shaprj.test.recruitment.recruitment.api.customer.CustomerResponse
import com.shaprj.test.recruitment.recruitment.data.model.Customer
import com.shaprj.test.recruitment.recruitment.data.repo.CustomerRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerService {

    @Autowired
    lateinit var repo: CustomerRepo

    fun save(customer: Customer) {
        repo.save(customer)
    }

    fun findAll() = repo.findAll().map { CustomerResponse(it) }.toList()
}