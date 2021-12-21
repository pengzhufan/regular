import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * 正则分组
 */
public class RegExp01 {
    public static void main(String[] args) {
        String content = "20001234。123";

        Pattern compile = Pattern.compile("\\d{4}");
        // 命名分组：即可以给分组取名
        //String reg2 = "(?<g1>\\d)(?<g2>\\d\\d\\d)";

        Matcher matcher = compile.matcher(content);
        // 查找过程：
        // 什么是分组，比如 (\d\d)(\d\d) ,则会功能则表达式中有 () 表示分组，第一个 ()表示第1组，第二个()表示第2组...
        // 1. 根据指定的规则，定位欸满足规则的子字符串(比如(20)(00))
        // 2. 找到后将 子字符串的开始索引 group[0]=0 记录到 matcher 对象的熟悉 int[] groups数组中；
        // *  2.1 groups[0] = 0, 把该子字符串的结束的索引+1的值记录到 groups[1] = 4
        // *  2.2 记录1组()匹配到的子字符串 groups[2] = 0 groups[3] = 2
        // *  2.3 记录2组()匹配到的子字符串 groups[4] = 2 groups[5] = 4
        // *  2.4 如果有更多的分组，同理
        // 3. 同时记录 oldLast 的值为 子字符串的结束的 索引+1的值即69，即下次执行find时，就从69开始匹配。
        while (matcher.find()) {
            // 开始匹配group - 源码：
            // public String group(int group) {
            //         if (first < 0)
            //             throw new IllegalStateException("No match found");
            //         if (group < 0 || group > groupCount())
            //             throw new IndexOutOfBoundsException("No group " + group);
            //         if ((groups[group*2] == -1) || (groups[group*2+1] == -1))
            //             return null;
            //         return getSubSequence(groups[group * 2], groups[group * 2 + 1]).toString();
            //     }
            System.out.println("找到：" + matcher.group(0)); // 2000
           System.out.println("找到：" + matcher.group(1)); // 2
            //System.out.println("找到：" + matcher.group(2)); // 000
             //System.out.println("找到：" + matcher.group(3)); //索引越界


            //System.out.println("找到：" + matcher.group(0)); // 2000
            //System.out.println("找到：" + matcher.group("g1")); // 2
            //System.out.println("找到：" + matcher.group("g2")); // 000
        }

    }
}