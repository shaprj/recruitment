package com.shaprj.test.recruitment.recruitment.scheduler.projector.project

import com.shaprj.test.recruitment.recruitment.common.EventType
import com.shaprj.test.recruitment.recruitment.common.Position
import com.shaprj.test.recruitment.recruitment.data.model.Project
import com.shaprj.test.recruitment.recruitment.data.service.ProjectService
import com.shaprj.test.recruitment.recruitment.data.service.event.CreateProjectEventService
import com.shaprj.test.recruitment.recruitment.scheduler.projector.EventHandler
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.util.*

@Component
class CreateProjectEventHandler : EventHandler {

    @Autowired
    lateinit var eventService: CreateProjectEventService

    @Autowired
    lateinit var service: ProjectService

    override fun getEventType() = EventType.CreateProjectEvent

    override fun handle(id: UUID) {
        eventService.findById(id).ifPresent {
            val project = Project(it.customerId, it.projectName, it.startDate, it.endDate, it.stuff)
            service.save(project)
        }
    }
}