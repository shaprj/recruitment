package com.shaprj.test.recruitment.recruitment.scheduler.projector

import com.shaprj.test.recruitment.recruitment.common.EventType
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service

@Service
class ProjectorScheduler {

    @Autowired
    lateinit var service: ProjectorService

    val eventHandlerMap: MutableMap<EventType, EventHandler> = mutableMapOf()

    fun registerEventHandler(eventType: EventType, eventHandler: EventHandler) {
        eventHandlerMap[eventType] = eventHandler
    }

    @Scheduled(fixedRate = 5000)
    fun execute() {
        service.allEvents().forEach {
            service.handleEvent(eventHandlerMap[it.eventType]!!, it)
        }
    }

}
