import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 常用正则表达式--限定符
 *    * 零次或多次匹配前面的字符或子表达式。例如，zo* 匹配"z"和"zoo"。* 等效于 {0,}。
 *
 *   + 一次或多次匹配前面的字符或子表达式。例如，"zo+"与"zo"和"zoo"匹配，但与"z"不匹配。+ 等效于 {1,}。
 *
 *   ? 零次或一次匹配前面的字符或子表达式。例如，"do(es)?"匹配"do"或"does"中的"do"。? 等效于 {0,1}。
 *
 *   {n} 是非负整数。正好匹配 n 次。例如，"o{2}"与"Bob"中的"o"不匹配，但与"food"中的两个"o"匹配。
 *
 *   {n,} 是非负整数。至少匹配 n 次。例如，"o{2,}"不匹配"Bob"中的"o"，而匹配"foooood"中的所有 o。"o{1,}"等效于"o+"。"o{0,}"等效于"o*"。
 *
 *   {n,m} 是非负整数，其中 n <= m。匹配至少 n 次，至多 m 次。例如，"o{1,3}"匹配"fooooood"中的头三个 o。'o{0,1}' 等效于 'o?'。注意：您不能将空格插入逗号和数字之间。
 */
public class RegExp05 {
    public static void main(String[] args) {
        String content = "111112141aaaaa1ahello";

        String reg1 = "a{3}"; // 表示匹配 aaa
        String reg2 = "1{4}"; // 表示匹配 1111
        String reg3 = "\\d{2}"; // 表示匹配 两位的任意数字字符

        // 细节：java匹配默认贪婪匹配，尽可能的匹配多的
        String reg4 = "a{3,4}"; //表示匹配aaa 或者 aaaa，优先aaaa多的
        String reg5 = "1{4,5}"; // 表示匹配 1111 或者 11111
        String reg6 = "\\d{2,5}"; // 匹配2位数或者3，4，5，如下会找到找到：11111 和 11

        // + 号使用
        String reg7 = "1+"; // 匹配一个1或者多个1
        String reg8 = "\\d+"; // 匹配一个或多个数字
        String reg11 = "\\d*"; // 匹配0个或多个数字

        // * 号使用
        String reg9 = "1*"; // 匹配0个1或者多个1

        // ? 号使用，遵守贪婪匹配
        String reg10 = "a1?"; // 匹配 a 或者 a1


        Pattern pattern = Pattern.compile(reg11, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println("找到：" + matcher.group(0));
        }
    }
}