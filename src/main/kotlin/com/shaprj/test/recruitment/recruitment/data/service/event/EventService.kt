package com.shaprj.test.recruitment.recruitment.data.service.event

import com.shaprj.test.recruitment.recruitment.common.EventStatus
import com.shaprj.test.recruitment.recruitment.data.model.event.Event
import com.shaprj.test.recruitment.recruitment.data.repo.event.EventRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EventService {

    @Autowired
    private lateinit var repo: EventRepo

    fun save(event: Event) {
        repo.save(event)
    }

    fun update(event: Event, status: EventStatus) {
        val newEvent = Event(event.createDate, status, event.eventType, event.id)
        repo.save(newEvent)
    }

    fun done(event: Event) {
        update(event, EventStatus.DONE)
    }

    fun inProcess(event: Event) {
        update(event, EventStatus.IN_PROCESS)
    }

    fun findAllCreatedEvents() = repo.findAllByStatus(EventStatus.CREATED)

}