import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 常用正则表达式--定位符
 *  ^ 匹配输入字符串开始的位置。如果设置了 RegExp 对象的 Multiline 属性，^ 还会与"\n"或"\r"之后的位置匹配。
 *
 *  $ 匹配输入字符串结尾的位置。如果设置了 RegExp 对象的 Multiline 属性，$ 还会与"\n"或"\r"之前的位置匹配。
 *
 *  \\b 匹配一个字边界，即字与空格间的位置。例如，"er  \b"匹配"never"中的"er"，但不匹配"verb"中的"er"。
 *
 *  \\B 非字边界匹配。"er\B"匹配"verb"中的"er"，但不匹配"never"中的"er"。
 */
public class RegExp06 {
    public static void main(String[] args) {
        //String content = "hanshunping sphan nnhan";
        String content = "123-abc"; //以至少 1 个数字开头，后接任意个小写字母的字符串
        String regStr = "^[0-9]+[a-z]*";
        // 以至少 1 个数字开头, 必须以至少一个小写字母结束
        // String regStr = "^[0-9]+\\-[a-z]+$";
        // 表示匹配边界的 han[这里的边界是指：被匹配的字符串最后,
        // 也可以是空格的子字符串的后面]
        // String regStr = "han\\b";
        // 和\\b 的含义刚刚相反
        // String regStr = "han\\B";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到=" + matcher.group(0));
        }
    }
}