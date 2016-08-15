import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by David on 2016/8/15.
 */
public class 字符流中第一个不重复的字符 {

    HashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        if (map.containsKey(ch)) {
            int tmp = map.get(ch);
            map.put(ch, tmp + 1);
        } else map.put(ch, 1);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        for(Map.Entry<Character, Integer> c : map.entrySet()) {
            if (c.getValue() == 1) {
                return c.getKey();
            }
        }
        return '#';
    }
}
