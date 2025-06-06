package qimo.shiyan3;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String position;
    private String department;
    private static int attendanceCount;

    public Employee(){
        this.id = 0;
        this.name = "未知";
        this.age = 35;
        this.position = "null";
        this.department = "null";
    }
    public Employee(int id,String name,int age,String position,String department){
        this.id = id;
        this.name = name;
        this.age = age;
        this.position = position;
        this.department = department;
    }

    public void sign_in(){
        attendanceCount++;
        System.out.println(name+"已经签到，当前共有"+attendanceCount+"人已签到。");
    }
    public void displayInfo(){
        System.out.printf("编号：%d\n姓名：%s\n年龄：%d\n植物：%s\n部门：%s\n\n",
                this.id,this.name,this.age,this.position,this.department);
    }
    public static int getAttendanceCount(){
        return attendanceCount;
    }
}
