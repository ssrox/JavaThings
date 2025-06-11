    package qimo.shiyan5;

    import java.util.regex.Matcher;
    import java.util.regex.Pattern;

    public class RegexExtractNumbers {
        public static void main(String[] args) {
            String text = "中华人民共和国成立于1949年10月1日";
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }