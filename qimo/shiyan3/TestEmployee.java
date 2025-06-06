package qimo.shiyan3;

public class TestEmployee{
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"张三",99,"吃面达人","餐桌清除人员");
        Employee emp2 = new Employee(2,"李四",101,"炒鸡师傅","后厨研发部门");
        emp1.sign_in();
        emp2.sign_in();
        emp1.displayInfo();
        emp2.displayInfo();
        System.out.println("出勤人数:"+Employee.getAttendanceCount());








    }
}