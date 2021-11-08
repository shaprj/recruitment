package com.shaprj.test.recruitment.recruitment.api.project

import com.fasterxml.jackson.annotation.JsonProperty
import com.shaprj.test.recruitment.recruitment.common.Position
import java.time.LocalDateTime
import java.util.*

class CreateProjectRequest() {
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
}
