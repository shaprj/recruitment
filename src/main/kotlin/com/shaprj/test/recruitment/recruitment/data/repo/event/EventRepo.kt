package com.shaprj.test.recruitment.recruitment.data.repo.event

import com.shaprj.test.recruitment.recruitment.common.EventStatus
import com.shaprj.test.recruitment.recruitment.data.model.event.Event
import org.springframework.data.repository.CrudRepository
import java.util.*

interface EventRepo : CrudRepository<Event, UUID> {

    fun findAllByStatus(status: EventStatus): List<Event>;

}