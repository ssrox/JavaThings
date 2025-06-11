package qimo.shiyan4;

interface Inner{
    void introduce();
}

class Outer{
    public static Inner method(){
        return new Inner(){
            @Override
            public void introduce(){
                System.out.println("实现了Inner接口的匿名内部类！");
            }
        };
    }
}

class InnerClassTest{
    public static void main(String[] args){
        Outer.method().introduce();
    }
}