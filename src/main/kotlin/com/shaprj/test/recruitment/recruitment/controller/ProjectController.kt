package com.shaprj.test.recruitment.recruitment.controller

import com.shaprj.test.recruitment.recruitment.api.customer.CreateCustomerRequest
import com.shaprj.test.recruitment.recruitment.api.project.CreateProjectRequest
import com.shaprj.test.recruitment.recruitment.api.project.CreateProjectResponse
import com.shaprj.test.recruitment.recruitment.api.project.ProjectResponse
import com.shaprj.test.recruitment.recruitment.data.service.ProjectService
import com.shaprj.test.recruitment.recruitment.data.service.event.CreateProjectEventService
import io.swagger.v3.oas.annotations.Operation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/project")
class ProjectController {

    @Autowired
    private lateinit var service: ProjectService

    @Autowired
    private lateinit var createProjectService: CreateProjectEventService

    @PostMapping("/add")
    @Operation(tags = ["Project operations"], summary = "Create project")
    fun createCustomerRequest(@RequestBody request: CreateProjectRequest): ResponseEntity<CreateProjectResponse> {
        return ResponseEntity.ok().body(createProjectService.addCustomer(request))
    }

    @GetMapping("/all")
    @Operation(tags = ["Project operations"], summary = "Get all projects")
    fun getAllProjects(): ResponseEntity<List<ProjectResponse>> {
        return ResponseEntity.ok(service.findAll())
    }

}