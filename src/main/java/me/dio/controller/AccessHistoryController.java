package me.dio.controller;

import me.dio.model.AccessHistory;
import me.dio.service.AccessHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/access-history")
public class AccessHistoryController {

    @Autowired
    private AccessHistoryService accessHistoryService;

    @GetMapping
    public List<AccessHistory> listarTodos() {
        return accessHistoryService.listarTodos();
    }

    @PostMapping
    public AccessHistory salvar(@RequestBody AccessHistory accessHistory) {
        return accessHistoryService.salvar(accessHistory);
    }
}