package com.imooc.hw;

public class Department {
    //能够描述部门编号，部门名称，员工数组，统计部门中的员工个数
    //属性：部门编号，部门名称，员工数组和统计变量
    private String DepartNum;//部门编号
    private String DepartName;//部门名称

    public Department(){

    }
    public Department(String DepartNum,String DepartName){
        this.setDepartNum(DepartNum);
        this.setDepartName(DepartName);
    }

    public String getDepartNum() {
        return DepartNum;
    }

    public void setDepartNum(String departNum) {
        DepartNum = departNum;
    }

    public String getDepartName() {
        return this.DepartName;
    }

    public void setDepartName(String departName) {
        DepartName = departName;
    }
}
