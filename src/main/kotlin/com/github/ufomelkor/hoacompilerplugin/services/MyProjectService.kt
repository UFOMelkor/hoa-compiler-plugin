package com.github.ufomelkor.hoacompilerplugin.services

import com.intellij.openapi.project.Project
import com.github.ufomelkor.hoacompilerplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
