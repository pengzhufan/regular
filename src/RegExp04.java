import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 常用正则表达式--选择匹配符
 *  | 匹配之前或之后的表达式
 */
public class RegExp04 {
    public static void main(String[] args) {
        String content = "(Hanshunping 韩 寒冷";

        String reg = "((han)韩)";
        Pattern compile = Pattern.compile(reg,Pattern.CASE_INSENSITIVE);
        // 启用不区分大小写的匹配。
        // Pattern compile = Pattern.compile(reg2, Pattern.CASE_INSENSITIVE);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()) {
            System.out.println("找到：" + matcher.group(0));
        }

    }
}