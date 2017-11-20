package com.Johnny.JohnnyCode;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping( value = "/project" )
public class ProjectController {
    private final static  String name = "jiang.li@siemens.com";
    private ProjectListRepository projectListRepository;

    public ProjectController(ProjectListRepository projectListRepository) {
        this.projectListRepository = projectListRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String projectList(Model model){
        List<Project> projectList = projectListRepository.findByProject(name);
        if(projectList != null){
            model.addAttribute("Project",projectList);
        }
        return "projectList";
    }
    @RequestMapping(method = RequestMethod.POST)
    public String AddToproject(Project project){
        project.setName(name);
        projectListRepository.save(project);
        return "redirect:/projectList";
    }
}
