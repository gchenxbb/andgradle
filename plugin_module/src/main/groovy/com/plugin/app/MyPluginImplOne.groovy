package com.plugin.app;

import org.gradle.api.Plugin
import org.gradle.api.Project

class MyPluginImplOne implements Plugin<Project> {
    void apply(Project project) {
        println "插件模块：增加两个任务。MyPluginImplOne apply begin。"

        //自动触发
        project.tasks.create(name: "plugin_task_001_MyPluginImplOne") {
            println "Hello gradle plugin, i am task 001,auto !"
        }

        //任务触发
        project.tasks.create('plugin_task_002_MyPluginImplOne') << {
            println "Hello gradle plugin,i am task 002!"
        }
        println "插件模块：增加两个任务。MyPluginImplOne apply end。"
    }
}