/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gatech.sad.project4;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author smithda
 */
@javax.ws.rs.ApplicationPath("api")
public class ApplicationConfig extends Application {
    
    @Override
    public Set<Class<?>> getClasses() {
        //InteractionLayer.Instance();
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(edu.gatech.sad.project4.Resources.GetAllCoursesResource.class);
        resources.add(edu.gatech.sad.project4.Resources.GetAllPreferenceForStudentResource.class);
        resources.add(edu.gatech.sad.project4.Resources.GetAllProfessorsResource.class);
        resources.add(edu.gatech.sad.project4.Resources.GetAllTasResource.class);
        resources.add(edu.gatech.sad.project4.Resources.GetCourseResource.class);
        resources.add(edu.gatech.sad.project4.Resources.GetProfessorResource.class);
        resources.add(edu.gatech.sad.project4.Resources.GetStudentPreference.class);
        resources.add(edu.gatech.sad.project4.Resources.GetStudentResource.class);
    }
    
}
