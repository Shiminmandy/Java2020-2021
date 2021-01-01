package com.imooc.hw;

public class Department {
    //能够描述部门编号，部门名称，员工数组，统计部门中的员工个数
    //属性：部门编号，部门名称，员工数组和统计变量
    private String departNum;//部门编号
    private String departName;//部门名称
    private Employee[] myEmployee;//员工数组   数组是引用类型
    private int employeeNo;//统计变量

    //无参构造方法
    public Department(){

    }
    //带参构造方法,实现对部门编号、部门名称赋值
    public Department(String departNum,String departName){
        this.setDepartNum(departNum);
        this.setDepartName(departName);
    }

    //带参构造方法,实现对部门编号、部门名称、员工数组赋值
    public Department(String departNum,String departName,Employee[] myEmployee){
        this.setDepartNum(departNum);
        this.setDepartName(departName);
        this.setMyEmployee(myEmployee);
    }


    public String getDepartNum() {
        return departNum;
    }

    public void setDepartNum(String departNum) {
        this.departNum = departNum;
    }

    /**
     * 获取部门员工的信息，如果保存员工信息的数组未被初始化，则先初始化长度200
     * @return 保留员工信息的数组
     */
    public Employee[] getMyEmployee() {
        if(this.myEmployee==null)
            this.myEmployee=new Employee[200];
        return myEmployee;
    }

    public void setMyEmployee(Employee[] myEmployee) {
        this.myEmployee = myEmployee;
    }

    public String getDepartName() {
        return this.departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public int getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(int employeeNo) {
        this.employeeNo = employeeNo;
    }

    public void addEmployee(Employee emp){
        /*
         * 将员工保存到数组中
         * 将员工个数保存到employeeNo中
         */
        for(int i=0;i<this.getMyEmployee().length;i++){
            if(this.getMyEmployee()[i]==null) {
                this.getMyEmployee()[i] = emp;
                this.employeeNo = i + 1;
                return;
            }
        }

    }
}
