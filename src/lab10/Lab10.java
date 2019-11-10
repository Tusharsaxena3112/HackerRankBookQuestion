package lab10;

import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String instruction = input.next();
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        if (instruction.equals("add")) {
            System.out.println(n1 + n2);
        }
//        boolean[] array=new boolean[10];
//        for (int i=0;i<array.length;i++){
//            if (10%(i+1)==0){
//                array[i]= true;
//            }
//            else{
//                array[i]=false;
//            }
//        }
//        System.out.println(Arrays.toString(array));
        //String [] string = new String[10];
        //Arrays.fill(string,"abc");
//        for (int i=0;i<string.length;i++){
//            string[i]=new String("a"+i);
//        }
        //System.out.println(Arrays.toString(string));
//        Student [] students=new Student[10];
//        Arrays.fill(students,new Student("Tushar","123"));
//        System.out.println(Arrays.toString(students));
    }
}