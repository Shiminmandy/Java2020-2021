package com.imooc.hw;

public class Employee {
    //能够描述员工姓名，工号，年龄，性别，所属部门，职务信息
    private String employeeName;
    private String employeeNum;
    private int employeeAge;
    private String employeeSex;
    private Department myDepartment;
    private Position myPosition;

    public Employee(){

    }

    public Employee(String employeeName,String employeeNum,int employeeAge,String employeeSex,
                    Department myDepartment,Position myPosition){
        this.setEmployeeName(employeeName);
        this.setEmployeeNum(employeeNum);
        this.setEmployeeAge(employeeAge);
        this.setEmployeeSex(employeeSex);
        this.setMyDepartment(myDepartment);
        this.setMyPosition(myPosition);

    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        if(employeeAge>=18&&employeeAge<=65)
            this.employeeAge = employeeAge;
        else
            this.employeeAge=18;
    }

    public String getEmployeeSex() {
        return employeeSex;
    }

    public void setEmployeeSex(String employeeSex) {
        if(employeeSex.equals("男")||employeeSex.equals("女"))
            this.employeeSex = employeeSex;
        else
            this.employeeSex="男";
    }

    /**
     * 获取部门对象，如果没有实例化，先实例化后再返回
     * @return 部门对象信息
     */
    public Department getMyDepartment() {
        if(this.myDepartment==null)
            this.myDepartment=new Department();
        return this.myDepartment;
    }

    public void setMyDepartment(Department myDepartment) {
        this.myDepartment = myDepartment;
    }

    /**
     * 获取职位对象，如果没有实例化，先实例化后再返回
     * @return 职位对象信息
     */
    public Position getMyPosition() {
        if(this.myPosition==null)
            this.myPosition=new Position();
        return myPosition;
    }

    public void setMyPosition(Position myPosition) {
        this.myPosition = myPosition;
    }

    public String info(){
        String str ="姓名："+this.getEmployeeName()+"\n工号："+this.getEmployeeNum()+"\n性别："+this.getEmployeeSex()+
                "\n年龄："+this.getEmployeeAge()+
                "\n职务："+this.getMyDepartment().getDepartName()+this.getMyPosition().getPositionName();
        return str;
    }
}
