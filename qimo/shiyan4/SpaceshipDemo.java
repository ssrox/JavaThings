package qimo.shiyan4;

// 抽象类 Spaceship
abstract class Spaceship {
    private int engineNum;
    private int crewCapacity;

    public Spaceship(int engineNum, int crewCapacity) {
        this.engineNum = engineNum;
        this.crewCapacity = crewCapacity;
    }

    public abstract void display();

    // Getter 方法
    public int getEngineNum() {
        return engineNum;
    }

    public int getCrewCapacity() {
        return crewCapacity;
    }
}

// CargoShip 类
class CargoShip extends Spaceship {
    public CargoShip(int engineNum, int crewCapacity) {
        super(engineNum, crewCapacity);
    }

    @Override
    public void display() {
        System.out.println("货船 - 引擎数量: " + getEngineNum() +
                ", 乘员容量: " + getCrewCapacity());
    }
}

// FighterShip 类
class FighterShip extends Spaceship {
    public FighterShip(int engineNum, int crewCapacity) {
        super(engineNum, crewCapacity);
    }

    @Override
    public void display() {
        System.out.println("战斗机 - 引擎数量: " + getEngineNum() +
                ", 乘员容量: " + getCrewCapacity());
    }
}

// 主类
public class SpaceshipDemo {
    public static void main(String[] args) {
        // 创建对象并向上转型
        Spaceship cargo = new CargoShip(4, 10);
        Spaceship fighter = new FighterShip(2, 2);

        // 调用 display() 方法
        cargo.display();
        fighter.display();
    }
}
