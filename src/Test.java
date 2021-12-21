import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author pengzhufan
 * @date 2021/12/21
 * @desc
 **/
public class Test {
    public static void main(String[] args) {
        String content="25jg+...44dff";
        String regStr = "[.]";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}
