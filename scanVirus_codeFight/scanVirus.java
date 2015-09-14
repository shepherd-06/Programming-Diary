public class scanVirus
{
  /*
   *Given a string, return true if it has a virus in it or false otherwise.
   * A string is considered to have a virus if there is "virus" substring in it. 
   * The case of its letters (upper or lower) don't matter. 
   * 
   * https://codefights.com/challenge/Ad89Tk7MifkwjaGRr
   * 
   * ibtehaz shawon
   * ibtehaz.shawon@gmail.com
   */
  public static void main(String[]args)
  {
    System.out.println(virusScan("sddszzvirusxxxx"));
    System.out.println(virusScan("sddszzvxxxx"));
    System.out.println(virusScan("sddszzvxx"));
    
    System.out.println("Method 2");
    System.out.println(virusScan2("sddszzvirusxxxx"));
    System.out.println(virusScan2("sddszzvxxxx"));
  }
  
  static boolean virusScan(String input) 
  {
    input = input.toLowerCase();
    
    for(int i = 0; i < input.length(); i++)
    {
      if(input.charAt(i) == 'v')
      {
        String result = "";
        for(int j = i; j < i+5 && j < input.length(); j++)
          result = result + input.charAt(j);
        
        if(result.equalsIgnoreCase("virus"))return true;
      }
    }
    return false;
  }
  
  static boolean virusScan2(String input)
  {
    return input.toLowerCase().contains("virus");
  }
  
  
}