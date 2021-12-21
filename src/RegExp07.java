import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 常用正则表达式--分组
 *  (pattern) 匹配 pattern 并捕获该匹配的子表达式。可以使用 $0…$9 属性从结果"匹配"集合中检索捕获的匹配。若要匹配括号字符 ( )，请使用"\("或者"\)"。
 *
 *  (?:pattern) 匹配 pattern 但不捕获该匹配的子表达式，即它是一个非捕获匹配，不存储供以后使用的匹配。这对于用"or"字符 (|) 组合模式部件的情况很有用。例如，'industr(?:y|ies) 是比 'industry|industries' 更经济的表达式。
 *
 *  (?=pattern) 执行正向预测先行搜索的子表达式，该表达式匹配处于匹配 pattern 的字符串的起始点的字符串。它是一个非捕获匹配，即不能捕获供以后使用的匹配。例如，'Windows (?=95|98|NT|2000)' 匹配"Windows 2000"中的"Windows"，但不匹配"Windows 3.1"中的"Windows"。预测先行不占用字符，即发生匹配后，下一匹配的搜索紧随上一匹配之后，而不是在组成预测先行的字符后。
 *
 *  (?!pattern) 执行反向预测先行搜索的子表达式，该表达式匹配不处于匹配 pattern 的字符串的起始点的搜索字符串。它是一个非捕获匹配，即不能捕获供以后使用的匹配。例如，'Windows (?!95|98|NT|2000)' 匹配"Windows 3.1"中的 "Windows"，但不匹配"Windows 2000"中的"Windows"。预测先行不占用字符，即发生匹配后，下一匹配的搜索紧随上一匹配之后，而不是在组成预测先行的字符后。
 */
public class RegExp07 {
    public static void main(String[] args) {
        String content = "hanshunping s7789 nn1189han";
        //String regStr = "(\\d\\d)(\\d\\d)";//匹配 4 个数字的字符串
        //命名分组： 即可以给分组取名
        String regStr = "(?<g1>\\d\\d)(?<g2>\\d\\d)";//匹配 4 个数字的字符串
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到=" + matcher.group(0));
            System.out.println("第 1 个分组内容=" + matcher.group(1));
            System.out.println("第 1 个分组内容[通过组名]=" + matcher.group("g1"));
            System.out.println("第 2 个分组内容=" + matcher.group(2));
            System.out.println("第 2 个分组内容[通过组名]=" + matcher.group("g2")); }
    }
}