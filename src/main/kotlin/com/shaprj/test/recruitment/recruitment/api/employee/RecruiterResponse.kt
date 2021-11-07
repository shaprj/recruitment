package com.shaprj.test.recruitment.recruitment.api.employee

import com.fasterxml.jackson.annotation.JsonProperty
import com.shaprj.test.recruitment.recruitment.common.Position
import com.shaprj.test.recruitment.recruitment.data.model.Recruiter
import java.util.*

class RecruiterResponse() {
    @JsonProperty
    lateinit var id: UUID

    @JsonProperty
    lateinit var name: String

    @JsonProperty
    lateinit var lastName: String

    @JsonProperty
    var age: Int = 0

    @JsonProperty
    lateinit var position: Position

    constructor(recruiter: Recruiter) : this() {
        this.id = recruiter.id
        this.name = recruiter.name
        this.lastName = recruiter.lastName
        this.age = recruiter.age
        this.position = recruiter.position
    }
}
