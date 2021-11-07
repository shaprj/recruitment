package com.shaprj.test.recruitment.recruitment.data.repo.event

import com.shaprj.test.recruitment.recruitment.data.model.event.CreateCustomerEvent
import org.springframework.data.repository.CrudRepository
import java.util.*

interface CreateCustomerEventRepo : CrudRepository<CreateCustomerEvent, UUID> {
}