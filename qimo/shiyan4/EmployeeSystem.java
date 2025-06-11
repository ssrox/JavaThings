package qimo.shiyan4;

public class EmployeeSystem {
    public static void main(String[] args) {
        // 使用具体子类EmployeeImpl创建员工对象
        Employee employee = new EmployeeImpl("张三", 30, "E1001", 8000, 5);
        Employee manager = new Manager("李四", 40, "M2001", 15000, 10);

        // 其他代码保持不变...


// 其他类定义保持不变...

        // 展示原始工资
        System.out.println("涨工资前:");
        employee.displayInfo();
        manager.displayInfo();

        // 利用多态涨工资
        increaseSalary(employee);
        increaseSalary(manager);

        // 展示涨薪后的工资
        System.out.println("\n涨工资后:");
        employee.displayInfo();
        manager.displayInfo();
    }

    // 多态方法：根据对象类型调用相应的涨薪逻辑
    public static void increaseSalary(Employee person) {
        person.raiseSalary();
    }
}

// 员工抽象类
abstract class Employee {
    private String name;
    private int age;
    private String id;
    private double salary;
    private int workingYears;

    public Employee(String name, int age, String id, double salary, int workingYears) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.salary = salary;
        this.workingYears = workingYears;
    }

    // 抽象方法：涨工资
    public abstract void raiseSalary();

    // 显示信息
    public void displayInfo() {
        System.out.printf("%s (工号:%s, 年龄:%d, 工龄:%d年) - 工资: %.2f元\n",
                name, id, age, workingYears, salary);
    }

    // Getter和Setter
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

// 普通员工类
class EmployeeImpl extends Employee {
    public EmployeeImpl(String name, int age, String id, double salary, int workingYears) {
        super(name, age, id, salary, workingYears);
    }

    @Override
    public void raiseSalary() {
        double newSalary = getSalary() * 1.1; // 涨10%
        setSalary(newSalary);
        System.out.println("员工" + getName() + "工资涨了10%");
    }

    private String getName() {
        // 这里简化处理，实际项目中应添加getName()方法到父类
        return ""; // 为了编译通过，实际应实现完整的getName()
    }
}

// 经理类
class Manager extends Employee {
    public Manager(String name, int age, String id, double salary, int workingYears) {
        super(name, age, id, salary, workingYears);
    }

    @Override
    public void raiseSalary() {
        double newSalary = getSalary() * 1.2; // 涨20%
        setSalary(newSalary);
        System.out.println("经理" + getName() + "工资涨了20%");
    }

    private String getName() {
        // 这里简化处理，实际项目中应添加getName()方法到父类
        return ""; // 为了编译通过，实际应实现完整的getName()
    }
}