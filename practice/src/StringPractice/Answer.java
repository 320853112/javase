package StringPractice;

/**
 * @author ：xuhang
 * @date ：Created in 2019/9/5 14:00
 * @description：
 * @version: V1.0
 */
public class Answer {

//    1.设计一个方法，将字符串反转
    public static String reverse(String old){
        //思路将String的char数组反转
        char[] chars = old.toCharArray();
        for(int i=0;i<chars.length/2;i++){
            char temp = chars[i];
            chars[i] = chars[chars.length-1-i];
            chars[chars.length-1-i] = temp;
        }
        return new String(chars);
    }


//2.将给定字符串的正序和反序进行连接 ok   okko
    public static String reverseAndConnect(String old ){
        return old.concat(reverse(old));
    }


//3.判断给定字符串是否是回文字符串
    public static Boolean isReverse(String s){
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length/2;i++){
            if(chars[i]!=chars[chars.length-1-i]){
                return false;
            }
        }
        return true;
    }

//4.将给定的字符串右位移x位置 helloworld--》2  ldhellowor
    public static String moveRight(String s, int distance){
        char[] chars = s.toCharArray();
        char[] newChars = new char[chars.length];
        int i=0;
        int j = chars.length - distance;
        while(i<distance){
            newChars[i++] = chars[j++];
        }
        j=0;
        while(i<=chars.length-1){
            newChars[i++] = chars[j++];
        }
        return new String(newChars);
    }

//5.寻找若干字符串中最长的那个
    public static String findLongest(String ... s){
        String res = s[0];
        for (String temp : s) {
            if(temp.length()>res.length())
                res = temp;
        }
        return res;
    }
//6.统计给定字母在字符串中出现的次数
    public static int appearSum(String s,String obj){
        String[] split = s.split(obj);
        int res = split.length-1;
        if(res!=0){
            if(split[0].equals(obj)) res --;
            if(split[split.length-1].equals(obj)) res --;
        }
        return res;
    }
//7.将给定的字符串每一个首字母大写  this is a test of java --> This Is A Test Java
    public static String toUpperCase(String s){
        //97 120
        String[] ss = s.split(" ");
        for (int i=0;i<ss.length;i++) {
            int first = ss[i].codePointAt(0);
            if(first>=97&&first<=120){
                char[] chars = ss[i].toCharArray();
                chars[0]-=32;
                ss[i] = new String(chars);
            }
        }
        String res = ss[0];
        for (int i=1;i<ss.length;i++) {
            res+=" "+ss[i];
        }
        return res;
    }
//8.获取给定字符串中的全部数字     “zzz123ge2e2”   12322
    public static String getAllNum(String s){
        char[] chars = new char[s.length()];
        int sum = 0;
        for (char c : s.toCharArray()) {
            if((int)c>=48&&(int)c<=57){
                chars[sum++] = c;
            }
        }
        return new String(chars);
    }
}
