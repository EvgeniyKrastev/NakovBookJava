package Algorithms.SpeedTest;

public class CodeSpeedTest {
   public static long startTime = 0,endTime = 0;

    public void startTest(){
         startTime = System.currentTimeMillis();
    }

    public void stopTest(){
         endTime = System.currentTimeMillis();
        System.out.printf(
                "The time elapsed is %f sec or milisec %d",
                (endTime - startTime)/1000.0,
                endTime - startTime
        );
    }
}



//    public static void exampleOfTimePassing(){
//        int sum = 0;
//        long startTime = System.currentTimeMillis();
//        // The code fragment to be tested
//        for(int i = 0; i < 10000000; i++) {
//            sum++;
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.printf("The time elapsed is %f sec",
//                (endTime - startTime)/1000.0);
//    }
