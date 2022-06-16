import java.util.*;
class StringDisplay{
public static void main(String[] agrs){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
  LinkedHashSet<Character> a = new LinkedHashSet<>();
  for (int i =0;i<s.length();i++){
    a.add(s.charAt(i));
}
//     method 1
  // for(Character ai: a){
  // System.out.print(ai);
  // }
    
//     method 2
  // Iterator<Character> it = a.iterator();
  // while(it.hasNext()){
  //   System.out.print(it.next());
  // }

//     method 3
  // for(var ai:a){
  //   System.out.print(ai);
  // }

//     method 4
  // this won't work for LinkedHashSet<character> cuz List,Set are child of iterator
//   for(ListIterator<Character> it = a.listIterator(); it.hasNext();){
//     System.out.print(it.next());
//   }

//      method 5   
  // a.forEach((it)->{System.out.print(it);});

//     mwthod 6
  a.forEach(System.out::print);

 }
}
