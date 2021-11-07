package com.shaprj.test.recruitment.recruitment.controller

import com.shaprj.test.recruitment.recruitment.api.employee.RecruiterRequest
import com.shaprj.test.recruitment.recruitment.api.employee.RecruiterResponse
import com.shaprj.test.recruitment.recruitment.data.service.RecruiterService
import io.swagger.v3.oas.annotations.Operation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/manager")
class MangerController {

    @Autowired
    private lateinit var recruiterService: RecruiterService

    @GetMapping("/recruiters")
    @Operation(tags = ["Manager operations"], summary = "Get All recruiters")
    fun getAllRecruiters(): ResponseEntity<List<RecruiterResponse>> {
        return ResponseEntity
            .ok()
            .contentType(MediaType.APPLICATION_JSON)
            .body(recruiterService.allRecruiters())
    }

    @PostMapping("/recruiters/add")
    @Operation(tags = ["Manager operations"], summary = "Add new recruiter")
    fun addRecruiter(@RequestBody request: RecruiterRequest): ResponseEntity<RecruiterResponse> {
        val recruiter = recruiterService.addRecruiter(request)
        return ResponseEntity
            .ok()
            .contentType(MediaType.APPLICATION_JSON)
            .body(recruiter)
    }
}