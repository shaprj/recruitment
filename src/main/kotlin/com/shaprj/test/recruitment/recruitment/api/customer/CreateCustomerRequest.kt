package com.shaprj.test.recruitment.recruitment.api.customer

import com.shaprj.test.recruitment.recruitment.common.CustomerType

class CreateCustomerRequest() {
    lateinit var name: String
    lateinit var lastName: String
    lateinit var type: CustomerType
}