import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class RegexMatches
{
   private static String REGEX = "a*b";
   private static String INPUT = "ccccaabfooaabfooabfoobkkk";
   private static String REPLACE = "--";
   public static void main(String[] args) {
      Pattern p = Pattern.compile(REGEX);
      // 获取 matcher 对象
      Matcher m = p.matcher(INPUT);
      System.out.println(m.replaceAll(REPLACE));
      StringBuffer sb = new StringBuffer();
      //Matcher类： lastAppendPosition：上次匹配完的结束位置，默认0  first：匹配到的表达式开始位置  last：匹配到的表达式结束位置
      while(m.find()){
         System.out.println(m.group(0));
         m.appendReplacement(sb,REPLACE);
         System.out.println(sb);
      }
      m.appendTail(sb);
      System.out.println(sb.toString());
   }
}