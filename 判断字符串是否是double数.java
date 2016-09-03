/**
 * Created by davidshuvli on 2016/9/2.
 */
public class Main {
    public class Solution {
        public boolean isNumeric(char[] str) {
            try {
                double re = Double.parseDouble(new String(str));
            } catch (NumberFormatException e) {
                return false;
            }
            return true;
        }
    }
}
