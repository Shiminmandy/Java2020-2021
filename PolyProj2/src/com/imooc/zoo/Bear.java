package com.imooc.zoo;
//Bear 继承自Animal并实现IAct
public class Bear  extends Animal implements IAct{
     public Bear(){
        super.setAge(1);
        super.setName("Bill");

    }
    @Override
    public void love() {
        System.out.println("爱好：喜欢卖萌~");
    }

    @Override
    public void skill() {
        System.out.println("技能：挽着花篮，打着雨伞，自立走秀");
    }

    @Override
    public void act() {
//        this.setName("Bill");
//        this.setAge(1);
        System.out.println("表演者："+super.getName()+"\n"+"年龄："+super.getAge());
        this.skill();
        this.love();

    }
}
