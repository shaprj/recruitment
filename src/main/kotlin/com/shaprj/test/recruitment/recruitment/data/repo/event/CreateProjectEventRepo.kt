package com.shaprj.test.recruitment.recruitment.data.repo.event

import com.shaprj.test.recruitment.recruitment.data.model.event.CreateProjectEvent
import org.springframework.data.repository.CrudRepository
import java.util.*

interface CreateProjectEventRepo : CrudRepository<CreateProjectEvent, UUID> {
}