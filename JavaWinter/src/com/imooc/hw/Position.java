package com.imooc.hw;

public class Position {
    //能够描述职务编号，职务名称
    private String positionNum;
    private String positionName;

    public Position(){

    }

    public Position(String positionNum,String positionName){
        this.setPositionNum(positionNum);
        this.setPositionName(positionName);
    }


    public String getPositionNum() {
        return positionNum;
    }

    public void setPositionNum(String positionNum) {
        this.positionNum = positionNum;
    }

    public String getPositionName() {
        return this.positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }
}
