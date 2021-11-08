package com.shaprj.test.recruitment.recruitment.data.service.event

import com.shaprj.test.recruitment.recruitment.api.customer.CreateCustomerRequest
import com.shaprj.test.recruitment.recruitment.api.customer.CreateCustomerRequestResponse
import com.shaprj.test.recruitment.recruitment.api.project.CreateProjectRequest
import com.shaprj.test.recruitment.recruitment.api.project.CreateProjectResponse
import com.shaprj.test.recruitment.recruitment.common.EventStatus
import com.shaprj.test.recruitment.recruitment.common.EventType
import com.shaprj.test.recruitment.recruitment.data.model.event.CreateCustomerEvent
import com.shaprj.test.recruitment.recruitment.data.model.event.CreateProjectEvent
import com.shaprj.test.recruitment.recruitment.data.model.event.Event
import com.shaprj.test.recruitment.recruitment.data.repo.event.CreateProjectEventRepo
import com.shaprj.test.recruitment.recruitment.data.repo.event.EventRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDateTime
import java.util.*

@Service
class CreateProjectEventService {

    @Autowired
    private lateinit var repo: CreateProjectEventRepo

    @Autowired
    private lateinit var eventRepo: EventRepo

    fun save(event: CreateProjectEvent) {
        repo.save(event)
    }

    fun findAllEvents() = repo.findAll()

    fun findById(id: UUID) = repo.findById(id)

    @Transactional
    fun addProject(request: CreateProjectRequest): CreateProjectResponse {
        val event = Event(LocalDateTime.now(), EventStatus.CREATED, EventType.CreateProjectEvent)
        eventRepo.save(event)
        val project = CreateProjectEvent(request.customerId, request.projectName, request.startDate, request.endDate, request.stuff, event.id)
        return CreateProjectResponse(repo.save(project))
    }

}