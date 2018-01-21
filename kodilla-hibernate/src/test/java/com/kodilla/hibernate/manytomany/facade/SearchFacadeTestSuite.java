package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuite {

    @Autowired
    SearchFacade searchFacade;

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void searchCompanyTest() {

        //Given
        Company testCompanyA = new Company("Holding");
        Company testCompanyB = new Company("Group");
        companyDao.save(testCompanyA);
        companyDao.save(testCompanyB);
        int testCompanyAId = testCompanyA.getId();
        int testCompanyBId = testCompanyB.getId();

        //When
        List<Company> retrievedCompanies = searchFacade.searchCompanyByPartOfName("ldin");

        //Then
        Assert.assertEquals(1, retrievedCompanies.size());
        Assert.assertEquals("Holding", retrievedCompanies.get(0).getName());

        //CleanUp
        companyDao.delete(testCompanyAId);
        companyDao.delete(testCompanyBId);
    }

    @Test
    public void searchEmployeeTest() {

        //Given
        Employee testEmployeeA = new Employee("Steve", "Higher");
        Employee testEmployeeB = new Employee("John", "Lower");
        employeeDao.save(testEmployeeA);
        employeeDao.save(testEmployeeB);
        int testEmployeeAId = testEmployeeA.getId();
        int testEmployeeBId = testEmployeeB.getId();

        //When
        List<Employee> retrievedEmployees = searchFacade.searchEmployeeByPartOfLastName("ghe");

        //Then
        Assert.assertEquals(1, retrievedEmployees.size());
        Assert.assertEquals("Higher", retrievedEmployees.get(0).getLastname());

        //CleanUp
        employeeDao.delete(testEmployeeAId);
        employeeDao.delete(testEmployeeBId);
    }
}
