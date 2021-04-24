package com.imooc.zoo;
/*
 *继承自animal实现IAct
 * 新增属性：品种 type
 */
public class Monkey extends Animal implements IAct{
    public String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void love() {
        System.out.println("爱好：喜欢模仿人的动作表情");
    }

    @Override
    public void skill() {
        System.out.println("技能：骑车过独木桥");
    }

    @Override
    public void act() {
        this.setName("Tom");
        this.setAge(1);
        this.setType("金丝猴");
        System.out.println("表演者："+this.getName()+"\n"+"年龄："+this.getAge()+"\n"+"品种："+this.getType());
        this.skill();
        this.love();

    }
}
