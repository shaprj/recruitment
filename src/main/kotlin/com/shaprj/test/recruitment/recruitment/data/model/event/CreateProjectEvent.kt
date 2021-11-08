package com.shaprj.test.recruitment.recruitment.data.model.event

import com.shaprj.test.recruitment.recruitment.common.Position
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity
class CreateProjectEvent(
    val customerId: UUID,
    val projectName: String,
    val startDate: LocalDateTime,
    val endDate: LocalDateTime,
    @ElementCollection
    @CollectionTable(
        name = "create_project_stuff_event",
        joinColumns = [JoinColumn(name = "project_id", referencedColumnName = "id")]
    )
    @MapKeyColumn(name = "position")
    @Column(name = "count")
    val stuff: Map<Position, Int>,
    @Id
    @Column(name = "id")
    val id: UUID = UUID.randomUUID()
) {}