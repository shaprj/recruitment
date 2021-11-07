package com.shaprj.test.recruitment.recruitment.scheduler.projector

import com.shaprj.test.recruitment.recruitment.data.model.event.Event
import com.shaprj.test.recruitment.recruitment.data.service.event.EventService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ProjectorService {

    @Autowired
    lateinit var service: EventService

    fun allEvents() = service.findAllCreatedEvents()

    @Transactional
    fun handleEvent(eventHandler: EventHandler, event: Event) {
        service.inProcess(event)
        eventHandler.handle(event.id)
        service.done(event)
    }

}