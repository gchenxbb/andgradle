package com.chen.gradle;

import org.gradle.api.Plugin
import org.gradle.api.Project

public class PluginImplTask implements Plugin<Project> {
    void apply(Project project) {
        project.task('plugin_task_001') << {
            println "Hello gradle plugin task 001!"
        }
		
		project.task('plugin_task_002') << {
            println "Hello gradle plugin task 002!"
        }
    }
}