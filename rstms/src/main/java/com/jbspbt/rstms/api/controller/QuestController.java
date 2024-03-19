package com.jbspbt.rstms.api.controller;

import com.jbspbt.rstms.api.model.Quest;
import com.jbspbt.rstms.api.model.Task;
import com.jbspbt.rstms.service.QuestService;
import com.jbspbt.rstms.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestController {

    private QuestService questService;

    @Autowired
    public QuestController(QuestService questService) {
        this.questService = questService;
    }

    @GetMapping("/testquest")
    public List<Quest> test() {
        return questService.test();
    }

}