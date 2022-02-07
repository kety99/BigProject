package com.informatics.BigProject.service.implementation;

import com.informatics.BigProject.data.entities.Package;
import com.informatics.BigProject.data.repository.PackageRepository;
import com.informatics.BigProject.service.PackageService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@AllArgsConstructor
public class PackageServiceImplenetation implements PackageService{
    private final PackageRepository packageRepository;

    @Override //връща списък на всички пратки
    public List<Package> getPackages(){
        return packageRepository.findAll();
    }

    @Override // връща пратка по id
    public Package getPackage(long id){
        return packageRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid package id:" + id));
    }

    @Override //въвеждане на нова пратка
    public Package create(Package package1){
        return packageRepository.save(package1);
    }

    @Override //ъпдейтване информацията за определена пратка
    public Package updatePackage(long id, Package package1){
        package1.setId(id);
        return packageRepository.save(package1);
    }

    @Override //изтриване на определена пратка
    public void deletePackage(long id){
        try{
            packageRepository.deleteById(id);
        }catch(EntityNotFoundException e){
            e.printStackTrace();
        }
    }
}
