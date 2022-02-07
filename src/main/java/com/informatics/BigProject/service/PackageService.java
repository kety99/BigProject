package com.informatics.BigProject.service;

import com.informatics.BigProject.data.entities.Package;

import java.util.List;

public interface PackageService {
    List<Package> getPackages();

    Package getPackage(long id);

    Package create(Package package1);

    Package updatePackage(long id, Package package1);

    void deletePackage(long id);
}
