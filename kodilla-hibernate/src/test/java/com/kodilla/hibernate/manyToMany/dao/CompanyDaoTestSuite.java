package com.kodilla.hibernate.manyToMany.dao;

import com.kodilla.hibernate.manyToMany.Company;
import com.kodilla.hibernate.manyToMany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanie = new Employee("Stephanie", "Clark");
        Employee linda = new Employee("Linda", "Kovalsky");

        Company software = new Company("Software Machine");
        Company delta = new Company("Delta Sth");
        Company grey = new Company("Grey Matter");

        software.getEmployees().add(johnSmith);
        delta.getEmployees().add(stephanie);
        delta.getEmployees().add(linda);
        grey.getEmployees().add(johnSmith);
        grey.getEmployees().add(linda);

        johnSmith.getCompanies().add(software);
        johnSmith.getCompanies().add(grey);
        stephanie.getCompanies().add(delta);
        linda.getCompanies().add(delta);
        linda.getCompanies().add(grey);

        //When
        companyDao.save(software);
        int softwareId = software.getId();
        companyDao.save(delta);
        int deltaId = delta.getId();
        companyDao.save(grey);
        int greyId = grey.getId();

        //Then
        Assert.assertNotEquals(0, softwareId);

        //CleanUp
        try {
            companyDao.delete(softwareId);
            companyDao.delete(deltaId);
            companyDao.delete(greyId);
        } catch (Exception e) {

        }
    }
}
