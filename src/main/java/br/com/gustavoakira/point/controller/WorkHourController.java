package br.com.gustavoakira.point.controller;

import br.com.gustavoakira.point.model.WorkHours;
import br.com.gustavoakira.point.service.WorkHourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/v1")
public class WorkHourController {
    @Autowired
    private WorkHourService service;

    @PostMapping("workhour")
    public WorkHours saveWorkHour(@RequestBody WorkHours workHours){
        return service.saveWorkHours(workHours);
    }

    @GetMapping("workhours")
    public List<WorkHours> getWorkHours(){
        return service.findAll();
    }

    @GetMapping("workhour/{id}")
    public ResponseEntity<WorkHours> getWorkHourById(@PathVariable Long id) throws Exception{
        return ResponseEntity.ok(service.getById(id).orElseThrow(()-> new NoSuchElementException("Not Found")));
    }

    @PutMapping("workhour")
    public ResponseEntity<Void> updateWorkHour(@RequestBody WorkHours workHours){
        service.updateWorkHours(workHours);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("workhour/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) throws Exception{
        try{
            service.deleteWorkHour(id);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return ResponseEntity.noContent().build();
    }
}
