package com.informatics.BigProject.service.implementation;

import com.informatics.BigProject.data.entities.Office;
import com.informatics.BigProject.data.repository.OfficeRepository;
import com.informatics.BigProject.service.OfficeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@AllArgsConstructor
public class OfficeServiceImplementation implements OfficeService {
    private final OfficeRepository officeRepository;

    @Override //връща списък на всички офиси
    public List<Office> getOffices(){
        return officeRepository.findAll();
    }

    @Override // връща офис по id
    public Office getOffice(long id){
        return officeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid office id:" + id));
    }

    @Override //въвеждане на нов офис
    public Office create(Office office){
        return officeRepository.save(office);
    }

    @Override //ъпдейтване информацията за определен офис
    public Office updateOffice(long id, Office office){
        office.setId(id);
        return officeRepository.save(office);
    }

    @Override //изтриване на определен офис
    public void deleteOffice(long id){
        try{
            officeRepository.deleteById(id);
        }catch(EntityNotFoundException e){
            e.printStackTrace();
        }
    }
}
