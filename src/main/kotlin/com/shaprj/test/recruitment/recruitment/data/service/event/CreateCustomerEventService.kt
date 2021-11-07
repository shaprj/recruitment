package com.shaprj.test.recruitment.recruitment.data.service.event

import com.shaprj.test.recruitment.recruitment.api.customer.CreateCustomerRequest
import com.shaprj.test.recruitment.recruitment.api.customer.CreateCustomerRequestResponse
import com.shaprj.test.recruitment.recruitment.common.EventStatus
import com.shaprj.test.recruitment.recruitment.common.EventType
import com.shaprj.test.recruitment.recruitment.data.model.event.CreateCustomerEvent
import com.shaprj.test.recruitment.recruitment.data.model.event.Event
import com.shaprj.test.recruitment.recruitment.data.repo.event.CreateCustomerEventRepo
import com.shaprj.test.recruitment.recruitment.data.repo.event.EventRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDateTime
import java.util.*

@Service
class CreateCustomerEventService {

    @Autowired
    private lateinit var repo: CreateCustomerEventRepo

    @Autowired
    private lateinit var eventRepo: EventRepo

    fun save(event: CreateCustomerEvent) {
        repo.save(event)
    }

    fun update(event: CreateCustomerEvent) {
        repo.save(event)
    }

    fun findById(id: UUID) = repo.findById(id)

    @Transactional
    fun addCustomer(request: CreateCustomerRequest): CreateCustomerRequestResponse {
        val event = Event(LocalDateTime.now(), EventStatus.CREATED, EventType.CreateCustomerEvent)
        eventRepo.save(event)
        val customer = CreateCustomerEvent(request.name, request.lastName, request.type, event.id)
        return CreateCustomerRequestResponse(repo.save(customer))
    }


}