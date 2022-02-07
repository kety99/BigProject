package com.informatics.BigProject.service.implementation;

import com.informatics.BigProject.data.entities.LogisticCompany;
import com.informatics.BigProject.data.repository.LCRepository;
import com.informatics.BigProject.service.LCService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@AllArgsConstructor
public class LCServiceImplementation implements LCService {

    private final LCRepository lcRepository;

    @Override //връща списък на всички логистични компании
    public List<LogisticCompany> getLogisticCompanies(){
        return lcRepository.findAll();
    }

    @Override // връща логистична компания по id
    public LogisticCompany getLogisticCompany(long id){
        return lcRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid logistic company id:" + id));
    }

    @Override //въвеждане на нова логистична компания
    public LogisticCompany create(LogisticCompany logisticCompany){
        return lcRepository.save(logisticCompany);
    }

    @Override //ъпдейтване информацията за определена логистична компания
    public LogisticCompany updateLogisticCompany(long id, LogisticCompany logisticCompany){
        logisticCompany.setId(id);
        return lcRepository.save(logisticCompany);
    }

    @Override //изтриване на определена логистична компания
    public void deleteLogisticCompany(long id){
        try{
            lcRepository.deleteById(id);
        }catch(EntityNotFoundException e){
            e.printStackTrace();
        }
    }
}
