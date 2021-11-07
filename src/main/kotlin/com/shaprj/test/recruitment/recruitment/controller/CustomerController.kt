package com.shaprj.test.recruitment.recruitment.controller

import com.shaprj.test.recruitment.recruitment.api.customer.CreateCustomerRequest
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

    @PostMapping("/add")
    @Operation(tags = ["Customer operations"], summary = "Create customer request")
    fun createCustomerRequest(@RequestBody request: CreateCustomerRequest) =
        ResponseEntity.ok().body(createCustomerService.addCustomer(request))

}