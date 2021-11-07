package com.shaprj.test.recruitment.recruitment.data.service

import com.shaprj.test.recruitment.recruitment.api.employee.RecruiterRequest
import com.shaprj.test.recruitment.recruitment.api.employee.RecruiterResponse
import com.shaprj.test.recruitment.recruitment.data.model.Recruiter
import com.shaprj.test.recruitment.recruitment.data.repo.RecruiterRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class RecruiterService {

    @Autowired
    private lateinit var recruiterRepo: RecruiterRepo

    fun allRecruiters(): List<RecruiterResponse> {
        return recruiterRepo
            .findAll()
            .map { RecruiterResponse(it) }
            .toList()
    }

    fun addRecruiter(request: RecruiterRequest): RecruiterResponse {
        val recruiter = Recruiter(request.name, request.lastName, request.age, request.position)
        return RecruiterResponse(recruiterRepo.save(recruiter))
    }

}