package com.shaprj.test.recruitment.recruitment.data.service

import com.shaprj.test.recruitment.recruitment.api.project.ProjectResponse
import com.shaprj.test.recruitment.recruitment.data.model.Project
import com.shaprj.test.recruitment.recruitment.data.repo.ProjectRepo
import com.shaprj.test.recruitment.recruitment.data.repo.event.CreateProjectEventRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProjectService {

    @Autowired
    lateinit var repo: ProjectRepo

    fun save(project: Project) {
        repo.save(project)
    }

    fun findById(id: UUID) = repo.findById(id)

    fun findAll(): List<ProjectResponse> {
        return repo.findAll().map { ProjectResponse(it) }.toList()
    }

}