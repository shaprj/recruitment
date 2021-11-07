package com.shaprj.test.recruitment.recruitment.data.model.event

import com.shaprj.test.recruitment.recruitment.common.EventStatus
import com.shaprj.test.recruitment.recruitment.common.EventType
import org.springframework.stereotype.Component
import java.time.LocalDateTime
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity
@Component
class Event(
    val createDate: LocalDateTime,
    val status: EventStatus,
    val eventType: EventType,
    @Id val id: UUID = UUID.randomUUID(),
)