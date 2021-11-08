package com.shaprj.test.recruitment.recruitment.api.project

import com.fasterxml.jackson.annotation.JsonProperty
import com.shaprj.test.recruitment.recruitment.common.Position
import com.shaprj.test.recruitment.recruitment.data.model.event.CreateProjectEvent
import java.time.LocalDateTime
import java.util.*

class CreateProjectResponse() {
    @JsonProperty
    lateinit var projectId: UUID

    @JsonProperty
    lateinit var customerId: UUID

    @JsonProperty
    lateinit var projectName: String

    @JsonProperty
    lateinit var startDate: LocalDateTime

    @JsonProperty
    lateinit var endDate: LocalDateTime

    @JsonProperty
    lateinit var stuff: Map<Position, Int>

    constructor(project: CreateProjectEvent) : this() {
        this.projectId = project.id
        this.customerId = project.customerId
        this.projectName = project.projectName
        this.startDate = project.startDate
        this.endDate = project.endDate
        this.stuff = project.stuff
    }
}
