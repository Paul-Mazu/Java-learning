package com.kodilla.hibernate.manyToMany.facade;

import com.kodilla.hibernate.manyToMany.Company;
import com.kodilla.hibernate.manyToMany.Employee;
import com.kodilla.hibernate.manyToMany.dao.CompanyDao;
import com.kodilla.hibernate.manyToMany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeCompaniesTest {

    @Autowired
    private FacadeCompanies facadeCompanies;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testShowEmployees() {
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanie = new Employee("Stephanie", "Clark");
        Employee linda = new Employee("Linda", "Kovalsky");

        Company company = new Company("Lush");

        company.getEmployees().add(johnSmith);
        company.getEmployees().add(stephanie);
        company.getEmployees().add(linda);

        johnSmith.getCompanies().add(company);
        stephanie.getCompanies().add(company);
        linda.getCompanies().add(company);

        //When
        companyDao.save(company);
        int id = company.getId();
        List<Employee> theList = facadeCompanies.showEmployees("ith");

        //Then
        Assert.assertEquals(1, theList.size());

        //CleanUp
        companyDao.delete(id);
    }

    @Test
    public void testShowCompanies() {
        //Given
        Company software = new Company("Software Machine");
        Company delta = new Company("Delta Sth");
        Company grey = new Company("Grey Matter");

        Employee johny = new Employee("John", "Oke");

        johny.getCompanies().add(delta);
        johny.getCompanies().add(software);
        johny.getCompanies().add(grey);

        delta.getEmployees().add(johny);
        software.getEmployees().add(johny);
        grey.getEmployees().add(johny);

        //When
        employeeDao.save(johny);
        List<Company> theList = facadeCompanies.showCompanies("sth");

        //Then
        Assert.assertEquals(1, theList.size());

        //CleanUp
        employeeDao.deleteAll();
        companyDao.deleteAll();
    }
}