package com.app.gradle;

import org.gradle.api.Plugin
import org.gradle.api.Project

public class PluginImplTaskOne implements Plugin<Project> {
    void apply(Project project) {
        println "PluginImplTaskOne apply begin!，该插件增加两个任务"
        project.tasks.create(name: "plugin_task_001") {
            println "Hello gradle plugin task 001,auto !"
        }

        project.tasks.create('plugin_task_002') << {
            println "Hello gradle plugin task 002!"
        }
        println "PluginImplTaskOne apply end!，该插件增加两个任务"
    }
}