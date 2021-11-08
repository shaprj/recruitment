package com.shaprj.test.recruitment.recruitment.scheduler.projector.customer

import com.shaprj.test.recruitment.recruitment.common.EventType
import com.shaprj.test.recruitment.recruitment.data.model.Customer
import com.shaprj.test.recruitment.recruitment.data.service.CustomerService
import com.shaprj.test.recruitment.recruitment.data.service.event.CreateCustomerEventService
import com.shaprj.test.recruitment.recruitment.scheduler.projector.EventHandler
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.util.*

@Component
class CreateCustomerEventHandler : EventHandler {

    @Autowired
    lateinit var eventService: CreateCustomerEventService

    @Autowired
    lateinit var service: CustomerService

    override fun getEventType() = EventType.CreateCustomerEvent

    override fun handle(id: UUID) {
        eventService.findById(id).ifPresent {
            val customer = Customer(it.customerName, it.customerLastName, it.type)
            service.save(customer)
        }
    }
}