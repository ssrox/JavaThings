package qimo.shiyan4;

import java.util.Random;

interface Member {
    double DUES = 1500.0;
    void payDues();
}

interface Staff {
    default double generateSalary() {
        Random random = new Random();
        return 1000 + random.nextDouble() * 2000;
    }
    void receiveSalary();
}

class NormalMember implements Member {
    private String name;

    public NormalMember(String name) {
        this.name = name;
    }

    @Override
    public void payDues() {
        System.out.println(name + "支付了" + DUES + "元会费");
    }
}

class PartTimeEmployee implements Member, Staff {
    private String name;
    private double salary;

    public PartTimeEmployee(String name) {
        this.name = name;
    }

    @Override
    public void payDues() {
        System.out.println(name + "支付了" + DUES + "元会费");
    }

    @Override
    public void receiveSalary() {
        salary = generateSalary();
        System.out.println(name + "收到工资：" + salary + "元");

        double netIncome = salary - DUES;
        System.out.printf("净收入：%.2f元\n", netIncome);

        if (netIncome < 0) {
            System.out.println("加油干吧！");
        }
    }

    public double getNetIncome() {
        return salary - DUES;
    }
}

public class ClubMemberSystem {
    public static void main(String[] args) {
        NormalMember normalMember = new NormalMember("张三");
        normalMember.payDues();

        System.out.println();

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("李四");
        partTimeEmployee.receiveSalary();
        partTimeEmployee.payDues();
    }
}