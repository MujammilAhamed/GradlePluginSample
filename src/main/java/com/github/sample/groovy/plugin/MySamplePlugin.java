package com.github.sample.groovy.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class MySamplePlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        System.out.println("Project Path : "+project.getName());
    }
}
