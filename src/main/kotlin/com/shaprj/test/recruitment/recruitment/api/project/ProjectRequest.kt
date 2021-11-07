package com.shaprj.test.recruitment.recruitment.api.project

import com.shaprj.test.recruitment.recruitment.common.Position
import java.time.LocalDateTime

class ProjectRequest() {
    lateinit var projectName: String
    lateinit var startDate: LocalDateTime
    lateinit var endDate: LocalDateTime
    lateinit var stuff: Map<Position, Int>
}
