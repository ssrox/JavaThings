package qimo.shiyan3;

public class Television {
    private static int nextId = 1001;
    private int id;
    private boolean isOn;
    private int volume;
    private int channel;

    public Television(){
        this.id = nextId++;
        this.isOn  =false;
        this.volume = 50;
        this.channel = 1;

    }
    public class RemoteControl{
        public void turnOn(){
            if(!isOn){
                isOn =true;
                System.out.println("电视已打开，当前频道：" + channel + "，音量：" + volume);
            }
        }
        public void turnOff(){
            if (isOn){
                isOn = false;
                System.out.println("电视已关闭");
            }
        }
        public void adjustVolume(int delta){
            if (isOn){
                volume = Math.max(0,Math.min(100,volume+delta));
                System.out.println("音量已调整至：" + volume);
            }
        }
        public void changeChannel(int newChannel){
            if (isOn && newChannel>=1){
                channel = newChannel;
                System.out.println("频道已切换至：" + channel);
            }
        }
    }
    public void showStatus(){
        System.out.println("\n=== 电视状态 ===");
        System.out.println("编号：" + id);
        System.out.println("开关：" + (isOn ? "开" : "关"));
        System.out.println("频道：" + channel);
        System.out.println("音量：" + volume);
    }

}
