package com.informatics.BigProject.service;

import com.informatics.BigProject.data.entities.Office;

import java.util.List;

public interface OfficeService {
    List<Office> getOffices();

    Office getOffice(long id);

    Office create(Office office);

    Office updateOffice(long id, Office office);

    void deleteOffice(long id);
}
