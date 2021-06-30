package br.com.gustavoakira.point.service;

import br.com.gustavoakira.point.model.WorkHours;
import br.com.gustavoakira.point.repository.WorkHourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkHourService {
    private WorkHourRepository repository;

    @Autowired
    public WorkHourService(WorkHourRepository repository){
        this.repository = repository;
    }

    public WorkHours saveWorkHours(WorkHours workHours){
        return repository.save(workHours);

    }

    public List<WorkHours> findAll() {
        return repository.findAll();
    }

    public Optional<WorkHours> getById(Long id) {
        return repository.findById(id);
    }

    public WorkHours updateWorkHours(WorkHours workHours){
        return repository.save(workHours);
    }

    public void deleteWorkHour(Long id) {
        repository.deleteById(id);
    }

}
