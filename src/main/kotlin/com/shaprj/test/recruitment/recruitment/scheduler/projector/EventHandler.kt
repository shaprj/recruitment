package com.shaprj.test.recruitment.recruitment.scheduler.projector

import com.shaprj.test.recruitment.recruitment.common.EventType
import com.shaprj.test.recruitment.recruitment.data.model.event.Event
import org.springframework.beans.factory.annotation.Autowired
import java.util.*

interface EventHandler {

    fun getEventType(): EventType
    fun handle(id: UUID)

    @Autowired
    fun registerMyself(projectorScheduler: ProjectorScheduler, me: Event) {
        projectorScheduler.registerEventHandler(this.getEventType(), this)
    }

}