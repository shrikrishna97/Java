import java.util.*;
class StringDisplay{
public static void main(String[] agrs){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
  LinkedHashSet<Character> a = new LinkedHashSet<>();
  for (int i =0;i<s.length();i++){
    a.add(s.charAt(i));
}
  for(Character ai: a){
  System.out.print(ai);
  }
}
} 
