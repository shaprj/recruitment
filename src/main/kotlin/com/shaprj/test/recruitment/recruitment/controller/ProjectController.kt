package com.shaprj.test.recruitment.recruitment.controller

import com.shaprj.test.recruitment.recruitment.api.project.ProjectResponse
import io.swagger.v3.oas.annotations.Operation
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/project")
class ProjectController {

    @GetMapping("all")
    @Operation(tags = ["Project operations"], summary = "Get all projects")
    fun getAllProjects(): ResponseEntity<ProjectResponse> {
        return ResponseEntity.ok(null)
    }

}