import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 需要转义字符 Java \\后面代表需要转义的字符
 * '$', '(', ')', '*', '+', '.', '[', ']', '?', '\', '^', '{', '}', '|'
 */
public class RegExp02 {
    public static void main(String[] args) {
        String content = "abc$(a.bc(123(";

        //String regStr = "\\.";
        // String regStr = "\\d\\d\\d";
        // 俩个 \\ 字符表示 \
        Pattern compile = Pattern.compile("\\.");
        // 2.创建一个匹配器对象
        Matcher matcher = compile.matcher(content);
        // 3. 可以循环匹配
        while (matcher.find()) {
            // 匹配内容，文本，放到 m.group(0)
            System.out.println("找到：" + matcher.group(0));
        }
    }
}