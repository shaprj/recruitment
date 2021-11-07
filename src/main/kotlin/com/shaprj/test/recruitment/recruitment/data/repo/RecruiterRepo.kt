package com.shaprj.test.recruitment.recruitment.data.repo

import com.shaprj.test.recruitment.recruitment.data.model.Recruiter
import org.springframework.data.repository.CrudRepository
import java.util.*

interface RecruiterRepo : CrudRepository<Recruiter, UUID>