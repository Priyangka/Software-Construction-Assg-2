package org.o7planning.sbcrudfulrestful.model;

public class Employee {
	 
    private String empNo;
    private String empName;
    private String position;
    private String dept;
 
    public Employee() {
 
    }
 
    public Employee(String empNo, String empName, String position,String dept) {
        this.empNo = empNo;
        this.empName = empName;
        this.position = position;
        this.dept=dept;
    }
 
    public String getEmpNo() {
        return empNo;
    }
 
    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }
 
    public String getEmpName() {
        return empName;
    }
 
    public void setEmpName(String empName) {
        this.empName = empName;
    }
 
    public String getPosition() {
        return position;
    }
 
    public void setPosition(String position) {
        this.position = position;
    }
 
    public String getDept() {
        return dept;
    }
 
    public void setDept(String dept) {
        this.dept=dept;
    }
}