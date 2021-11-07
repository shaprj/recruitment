package com.shaprj.test.recruitment.recruitment.data.repo

import com.shaprj.test.recruitment.recruitment.data.model.Customer
import org.springframework.data.repository.CrudRepository
import java.util.*

interface CustomerRepo : CrudRepository<Customer, UUID> {
}