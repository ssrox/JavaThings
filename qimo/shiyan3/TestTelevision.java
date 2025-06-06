package qimo.shiyan3;

public class TestTelevision {
    public static void main(String[] args) {
        Television tv = new Television();
        // 创建遥控器对象（内部类对象需通过外部类对象创建）
        Television.RemoteControl remote = tv.new RemoteControl();

        // 使用遥控器操作电视
        remote.turnOn();       // 打开电视
        remote.changeChannel(5); // 切换到5频道
        remote.adjustVolume(10); // 音量+10
        tv.showStatus();       // 显示状态

        remote.turnOff();      // 关闭电视
        remote.adjustVolume(20); // 关闭状态下调整音量，无反应
    }
}
