public class dash_CodeFight
{
  public static void main(String[]args)
  {
    System.out.println(replaceDashesAsOne("we-are- - - code----fighters.-"));
  }
  
  static String replaceDashesAsOne(String inputStr) 
  {
    for(int i = 0; i < inputStr.length(); i++)
    {
      char c = inputStr.charAt(i);
      System.out.println("i @#% ?> " + i);
      if(c == '-')
      {
        int counter = i+1;
        System.out.println("Counter >> "+counter);
        boolean flag = false; //for space
        char chk = c;
        while(chk == '-' || chk == ' ')
        {
          if(counter < inputStr.length())
          {
            chk = inputStr.charAt(counter);
          }
          
          System.out.println("Character >> "+chk);
          if(chk == ' ')
          {
            System.out.println("condition 1");
            flag = true;
          }
          else if(chk == '-')
          {
            System.out.println("condition 2");
          }
          else
          {
            System.out.println("condition 3");
            break;
          }
          counter++;
          flag = false;
        }
        counter-=2;
        inputStr = inputStr.substring(0,i+1) + inputStr.substring(counter);
        i++;
      }
    }
    return inputStr;
  }
  
}