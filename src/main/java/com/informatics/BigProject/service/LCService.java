package com.informatics.BigProject.service;

import com.informatics.BigProject.data.entities.LogisticCompany;

import java.util.List;

public interface LCService {
    List<LogisticCompany> getLogisticCompanies();

    LogisticCompany getLogisticCompany(long id);

    LogisticCompany create(LogisticCompany logisticCompany);

    LogisticCompany updateLogisticCompany(long id, LogisticCompany logisticCompany);

    void deleteLogisticCompany(long id);
}
