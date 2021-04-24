package com.imooc.zoo;
/*
 *继承自animal实现IAct
 * 新增属性：品种type
 */
public class Parrot extends Animal implements IAct{
    public String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void love() {
        System.out.println("爱好：喜欢吃坚果和松子");
    }

    @Override
    public void skill() {
        System.out.println("技能：擅长模仿");
    }

    @Override
    public void act() {
        this.setName("Rose");
        this.setAge(1);
        this.setType("牡丹鹦鹉");
        System.out.println("表演者："+this.getName()+"\n"+"年龄："+this.getAge()+"\n"+"品种："+this.getType());
        this.skill();
        this.love();
    }
}
