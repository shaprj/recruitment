package com.shaprj.test.recruitment.recruitment.api.customer

import com.fasterxml.jackson.annotation.JsonProperty
import com.shaprj.test.recruitment.recruitment.common.CustomerType
import com.shaprj.test.recruitment.recruitment.data.model.Customer
import com.shaprj.test.recruitment.recruitment.data.model.event.CreateCustomerEvent
import java.util.*

class CustomerResponse() {

    @JsonProperty
    lateinit var id: UUID

    @JsonProperty
    lateinit var name: String

    @JsonProperty
    lateinit var lastName: String

    @JsonProperty
    lateinit var type: CustomerType

    constructor(customer: Customer) : this() {
        this.id = customer.id
        this.name = customer.customerName
        this.lastName = customer.customerLastName
        this.type = customer.type
    }

}