import java.util.*;
import java.text.*;
public class Main{
  /*
   * This code is originally written by NoorJaha Azim (Synjaz@gmail.com), 
   * I have this code for debug purpose, sent by her. 
   */

  public static void main(String [] args){
    Scanner scan = new Scanner (System.in);
    int c = scan.nextInt();
    System.out.println("INTERSECTING LINES OUTPUT");

    for(int i=1; i<=c; i++){
      double x1 = scan.nextDouble();
      double y1 = scan.nextDouble();
      double x2 = scan.nextDouble();
      double y2 = scan.nextDouble();
      double x3 = scan.nextDouble();
      double y3 = scan.nextDouble();
      double x4 = scan.nextDouble();
      double y4 = scan.nextDouble();

      if((x1 != x2) && (x3 != x4)){
        double m1 = (y1-y2)/(x1-x2);
        double m2 = (y3-y4)/(x3-x4);
        double c1 = -(m1*x1)+y1;
        double c2 = -(m2*x3)+y3;
        if(m1 != m2){
          DecimalFormat df = new DecimalFormat("#.00");
          double X = (c2-c1)/(m1-m2);
          double Y = (m1*X)+c1;
          System.out.println("POINT" + " " + df.format(X) + " " + df.format(Y) );
        }
        else{
          if(c1 != c2){
            System.out.println("NONE");
          }
          else{
            System.out.println("LINE");
          }
        }
      }
      else if((x1 == x2)&&(x3 != x4)){
        DecimalFormat df = new DecimalFormat("#.00");
        double m2 = (y3-y4)/(x3-x4);
        double c2 = -(m2*x3)+y3;
        double Y = (m2*x1)+c2;
        System.out.println("POINT" + " " + df.format(x1) + " " + df.format(Y) );
      }
      else if((x1 != x2)&&(x3 == x4)){
        DecimalFormat df = new DecimalFormat("#.00");
        double m1 = (y1-y2)/(x1-x2);
        double c1 = -(m1*x1)+y1;
        double Y = (m1*x2)+c1;
        System.out.println("POINT" + " " + df.format(x3) + " " + df.format(Y) );
      }
      else{
        System.out.println("NONE");
      }
    }

    System.out.println("END OF OUTPUT");

  }
}
