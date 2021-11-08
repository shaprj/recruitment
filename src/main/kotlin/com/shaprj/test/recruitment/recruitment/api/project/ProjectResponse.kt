package com.shaprj.test.recruitment.recruitment.api.project

import com.fasterxml.jackson.annotation.JsonProperty
import com.shaprj.test.recruitment.recruitment.common.Position
import com.shaprj.test.recruitment.recruitment.data.model.Project
import java.time.LocalDateTime
import java.util.*

class ProjectResponse() {
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

    constructor(project: Project) : this() {
        this.projectId = project.id
        this.projectName = project.projectName
        this.customerId = project.customerId
        this.endDate = project.endDate
        this.startDate = project.startDate
        this.stuff = project.stuff
    }
}