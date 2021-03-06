import java.util.Arrays;

public class Runner
{
    public static void main(String[] args)
    {
        System.out.println("Competition1");
        int[] arr= new int[10000];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=(int)(Math.random()*10000)+0;
        }
        System.out.print("Unsorted Array: ");
       // for(int i=0;i<arr.length;i++) { System.out.print(arr[i]+" "); }

        Team0SortCompetition a1 = new Team0SortCompetition();

        long time = System.nanoTime();

        a1.challengeOne(arr);

        System.out.println("\nTime: "+(double)(System.nanoTime() - time)/(100000000)+" secs");
        
        System.out.print("Sorted Array: ");
        // for(int i=0;i<arr.length;i++) { System.out.print(arr[i]+" "); }
        System.out.println("\nMedian: "+a1.challengeOne(arr));

        System.out.println("\nCompetition2");

        String[] arr2 = new String[10000];
        int a; String h; String c="";
        String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=0;i<arr2.length;i++)
        {
            c="";
            for(int k=0;k<5;k++)
            {
                a= (int)(Math.random()*25)+0;
                h=alpha.substring(a,a+1);
                c=c+h;
            }
            arr2[i]=c;
        }

        System.out.print("Unsorted Array: ");
        //for(int i=0;i<arr.length;i++) { System.out.print(arr2[i]+" ");}


        long time2 = System.nanoTime();

        a1.challengeTwo(arr2,"AAOBX");

        System.out.println("\nTime: "+(double)(System.nanoTime() - time2)/(100000000)+" secs");

        System.out.print("Sorted Array: ");
        //for(int i=0;i<arr2.length;i++) { System.out.print(arr2[i]+" "); }
        System.out.println("\n"+"Median: "+a1.challengeTwo(arr2,"AAOBX"));


        System.out.println("\n"+"Competition3");


        int[] arr3= new int[100000];
        for(int i=0;i<arr3.length;i++)
        {
            arr3[i]=(int)(Math.random()*10000)+0;
        }
        Arrays.sort(arr3);
        for(int i=0;i<200;i++)
        {
            arr3[i]=(int)(Math.random()*10000)+0;
        }
        System.out.print("Unsorted Array: ");
        //for(int i=0;i<arr2.length;i++) { System.out.print(arr2[i]+" "); }



        long time3 = System.nanoTime();

        a1.challengeThree(arr3);

        System.out.println("\nTime: "+(double)(System.nanoTime() - time3)/(100000000)+" secs");

        System.out.print("Sorted Array: ");
        //for(int i=0;i<arr3.length;i++) { System.out.print(arr3[i]+" "); }
        System.out.println("\nMedian: "+a1.challengeThree(arr3));

        System.out.println("\nCompetition4");

        int[][] arr4= new int[1000][1000];
        for(int i=0;i<1000;i++)
        {
            for(int k=0;k<1000;k++) {
                arr4[i][k] = (int) (Math.random() * 10000) + 0;
            }
        }

        System.out.print("Unsorted Array: ");
        //for(int i=0;i<arr4.length;i++){for(int k=0;k<arr4[i].length;k++) {System.out.println(arr4[i][k] + " ");}}
        long time4 = System.nanoTime();

        a1.challengeFour(arr4);

        System.out.println("\nTime: "+(double)(System.nanoTime() - time4)/(100000000)+" secs");

        System.out.println("Sorted Array: ");
        //for(int i=0;i<arr4.length;i++) { for(int k=0;k<arr4[i].length;k++)  {    System.out.print(arr4[i][k] + " ");    }   System.out.println(); }System.out.println("\n"+"Median: "+a1.challengeFour(arr4));

        System.out.println("\nCompetition5");
        String[] arr5 = new String[10000];
        int a5; String h5; String c5="";
        String alpha5="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=0;i<arr2.length;i++)
        {
            c5="";
            for(int k=0;k<5;k++)
            {
                a5= (int)(Math.random()*25)+0;
                h5=alpha.substring(a5,a5+1);
                c5=c5+h5;
            }
            arr5[i]=c5;
        }
        long time5 = System.nanoTime();
        int ba=a1.challengeFive(arr5,"WDMEO");
        System.out.println("\nTime: "+(double)(System.nanoTime() - time5)/(100000000)+" secs");
        System.out.println(ba);
    }
}
