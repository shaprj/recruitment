package com.shaprj.test.recruitment.recruitment.data.repo

import com.shaprj.test.recruitment.recruitment.data.model.Project
import org.springframework.data.repository.CrudRepository
import java.util.*

interface ProjectRepo : CrudRepository<Project, UUID> {
}