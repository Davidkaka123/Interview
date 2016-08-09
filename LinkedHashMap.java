//import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        Map<String,Integer> m=new LinkedHashMap<String,Integer>();
//        while(sc.hasNext()){
//            String string=sc.nextLine();
//            String[] A=string.split("\\\\");
//            String  str=A[A.length-1];
//            String[] B=str.split(" ");
//            if(B[0].length()>16)
//                B[0]=B[0].substring(B[0].length()-16);
//            str=B[0]+" "+B[1];
//
//            if(!m.containsKey(str)){
//                m.put(str,1);
//            }else{
//                int count=m.get(str);
//                m.put(str,++count);
//            }
//        }
//        int count=0;
//        int size=m.size();
//        for(Map.Entry<String,Integer> me:m.entrySet()){
//            if(count+8>=size){
//                System.out.print(me.getKey()+" "+me.getValue()+" ");
//            }
//            count++;
//        }
//    }
//}