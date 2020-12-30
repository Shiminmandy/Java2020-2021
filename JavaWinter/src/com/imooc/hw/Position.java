package com.imooc.hw;

public class Position {
    //能够描述职务编号，职务名称
    private String PositionNum;
    private String PositionName;

    public Position(){

    }

    public Position(String PositionNum,String PositionName){
        this.setPositionNum(PositionNum);
        this.setPositionName(PositionName);
    }


    public String getPositionNum() {
        return PositionNum;
    }

    public void setPositionNum(String positionNum) {
        PositionNum = positionNum;
    }

    public String getPositionName() {
        return this.PositionName;
    }

    public void setPositionName(String positionName) {
        PositionName = positionName;
    }
}
