package com.shaprj.test.recruitment.recruitment.data.model

import com.shaprj.test.recruitment.recruitment.common.Position
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Recruiter(
    var name: String,
    var lastName: String,
    var age: Int,
    var position: Position,
    @Id var id: UUID = UUID.randomUUID(),
)
