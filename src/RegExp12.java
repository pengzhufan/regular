import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegExp12 {
    public static void main(String[] args) {
        String content = "hello jeck 11111 121 222 52255,155122tom11 jack22 yyy xxx";
        //1.匹配两个连续相同的数字
        //String regStr = "([a-z])\\1\\1";
        //2.匹配五个连续相同的数字
        //String regStr = "(\\d)\\1{4}";
        //3.各位与千位相同，十位与百位相同 1221
        String regStr = "(\\d)(\\d)(\\d)\\2\\1\\3";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到: " + matcher.group(0));
        }
    }
}