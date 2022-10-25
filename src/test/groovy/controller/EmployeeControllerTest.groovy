package controller

import com.tcs.demo.controller.EmployeeController
import com.tcs.demo.domain.Employee
import com.tcs.demo.repository.EmployeeRepositoryJDBCTemplate
import org.mockito.Mock
import spock.lang.Specification

class EmployeeControllerTest extends Specification{
    def repo = Mock(EmployeeRepositoryJDBCTemplate)
    EmployeeController empController = new EmployeeController(repo)

    def "validateGetAllEmployees"(){
        given: "Set data"
            Double height = 1.82, weight=82, height2 = 1.80, weight2=78;
            List<Employee> list = List.of(new Employee(1L,"Sergio",height,weight,"Guadalajara"),
                    new Employee(2L,"José",height2,weight2,"CDMX"))
            repo.findAllJDBC()>>list
        when: "Test method"
            empController.getAll()
        then: "Result"
            noExceptionThrown()
    }
}