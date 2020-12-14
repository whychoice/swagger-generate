package com.github.whychoice.swaggergenerate.services

import com.intellij.openapi.project.Project
import com.github.whychoice.swaggergenerate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
