package com.shaprj.test.recruitment.recruitment.data.model

import com.shaprj.test.recruitment.recruitment.common.CustomerType
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Customer(
    val customerName: String,
    val customerLastName: String,
    val type: CustomerType,
    @Id val id: UUID = UUID.randomUUID(),
)