package com.imooc.zoo;
/*
 *实现IAct
 * 属性：名字name,艺龄year
 * 新增方法：着装 dress
 */
public class Clown implements IAct{
    public String name;

    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year<0){
            this.year=0;
        }else {
            this.year = year;
        }
    }

    @Override
    public void skill() {
        System.out.println("技能：脚踩高跷，进行杂技魔术表演");
    }

    @Override
    public void act() {
        String name="kahle";
        this.setYear(5);
        System.out.println("表演者："+name+"\n"+"艺龄："+this.getYear());
        this.dress();
        this.skill();

    }
    public void dress(){
        System.out.println("着装：身穿五彩服装，头上戴着五彩的帽子，脸上画着夸张的彩妆");
    }
}
