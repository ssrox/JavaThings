package qimo.shiyan5;

import java.util.HashMap;
import java.util.Map;

public class UserLogin {
    public static void main(String[] args) {
        Map<String, String> userMap = new HashMap<>();
        userMap.put("admin", "admin123");
        userMap.put("user1", "pass1");
        userMap.put("user2", "pass2");
        userMap.put("user3", "pass3");
        userMap.put("user4", "pass4");

        for (Map.Entry<String, String> entry : userMap.entrySet()) {
            System.out.println("用户名：" + entry.getKey() + "，密码：" + entry.getValue());
        }
    }
}
