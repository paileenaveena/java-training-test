import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class Result {

    public static void main(String[] args) {

        String str = "1245hge";

        String str1 = str.replaceAll("\\D", "");
        List<Integer> result = new ArrayList<Integer>();

        char ch[] = str1.toCharArray();

        for(int i=0;i<ch.length;i++){
            result.add(Integer.parseInt(String.valueOf(ch[i])));
        }
        System.out.println("Result"+result);

       Integer[] intArray = new Integer[result.size()];

       intArray = result.toArray(intArray);

        //int minA = Arrays.stream(intArray).max().getAsInt();
        //IntSummaryStatistics statistics = Arrays.stream(intArray).summaryStatistics();
        //statistics.getMax();


       int min = 0;
       int max = 0;

       for(int i=0;i<intArray.length;i++) {
           if (intArray[i] > max) {
               max = intArray[i];
           } else if (intArray[i] < min) {
               min = intArray[i];

           }
       }
        System.out.println("MAX"+max);
        System.out.println("MIN" + min);

    }
}
