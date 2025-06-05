package qimo.shiyan3;

// 测试类应该放在单独的文件中，或者作为内部类（这里选择单独文件）
// 注意：实际项目中应该将测试类放在单独的.java文件中
class TestBook {
    public static void main(String[] args) {
        Book b = new Book("ISBN123", "JAVA编程", "帅轩轩", 2023);
        b.showInfo();

        b.setYearPublished(2024);
        System.out.println("修改后的年份：" + b.getYearPublished());
    }
}