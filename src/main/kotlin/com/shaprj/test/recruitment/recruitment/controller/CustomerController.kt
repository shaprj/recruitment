package com.shaprj.test.recruitment.recruitment.controller

import com.shaprj.test.recruitment.recruitment.api.customer.CreateCustomerRequest
import com.shaprj.test.recruitment.recruitment.api.customer.CreateCustomerRequestResponse
import com.shaprj.test.recruitment.recruitment.api.customer.CustomerResponse
import com.shaprj.test.recruitment.recruitment.data.service.CustomerService
import com.shaprj.test.recruitment.recruitment.data.service.event.CreateCustomerEventService
import io.swagger.v3.oas.annotations.Operation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/customer")
class CustomerController {

    @Autowired
    lateinit var createCustomerService: CreateCustomerEventService

    @Autowired
    lateinit var customerService: CustomerService

    @PostMapping("/add")
    @Operation(tags = ["Customer operations"], summary = "Create customer request")
    fun createCustomerRequest(@RequestBody request: CreateCustomerRequest): ResponseEntity<CreateCustomerRequestResponse> {
        return ResponseEntity.ok().body(createCustomerService.addCustomer(request))
    }

    @PostMapping("/all")
    @Operation(tags = ["Customer operations"], summary = "Get all customers")
    fun getAllCustomers(): ResponseEntity<List<CustomerResponse>> {
        return ResponseEntity.ok().body(customerService.findAll())
    }

}
