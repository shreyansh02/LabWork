public class stringLexicographic{
  
  public static String getSmallestAndLargest(String s, int k){
    String smallest = "";
    String largest = "";
    smallest = largest = s.substring(0, k);
    
    for(int i=1; i<s.length()-k+1; i++){
      String str = s.substring(i, k+i);
      
      if(smallest.compareTo(str) > 0)
        smallest = str;
      
      if(largest.compareTo(str) < 0)
        largest = str;
       
    }
    return smallest +"\n"+ largest
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int k = sc.nextInt();
    sc.close();
    
    System.out.println(getSmallestAndLargest(s, k));
    
  }
  
}
