package com.imooc.zoo;
/*
 *继承自animal实现IAct
 * 新增属性：颜色 color, 性别 sex
 */
public class Lion extends Animal implements IAct{
    public String color;
    public String sex;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void love() {
        System.out.println("爱好：喜欢吃各种肉类~");
    }

    @Override
    public void skill() {
        System.out.println("技能：擅长钻火圈");
    }

    @Override
    public void act() {
        this.setName("Lain");
        this.setAge(2);
        this.setSex("公狮");
        this.setColor("灰色");
        System.out.println("表演者："+this.getName()+"\n"+"年龄："+this.getAge()+
                "\n"+"性别："+this.getSex()+"\n"+"毛色："+this.getColor());
        this.skill();
        this.love();
    }
}
