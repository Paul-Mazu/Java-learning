package com.kodilla.hibernate.manyToMany.facade;

import com.kodilla.hibernate.manyToMany.Company;
import com.kodilla.hibernate.manyToMany.Employee;
import com.kodilla.hibernate.manyToMany.dao.CompanyDao;
import com.kodilla.hibernate.manyToMany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FacadeCompanies {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    public List<Employee> showEmployees (String theFraze) {
        List<Employee> employees = employeeDao.retrieveEmployees(theFraze);
        return employees;
    }

    public List<Company> showCompanies (String theFraze) {
        List<Company> companies = companyDao.retrieveCompanies(theFraze);
        return companies;
    }
}
