import java.util.*; 
import java.io.*;

class Main {

  public static String FindIntersection(String[] strArr) {
    String[] list1 = strArr[0].split(", ");
    String[] list2 = strArr[1].split(", ");
    HashSet<Integer>  set = new HashSet<>();
    StringBuilder build = new StringBuilder();
    for (int i =0; i< list1.length; i++) {
      set.add(Integer.valueOf(list1[i]));
    }
    for (int i =0 ; i< list2.length; i++) {
      if (set.contains(Integer.valueOf(list2[i])))
        build.append(list2[i]).append(',');
    }
    if (build.length() > 0) {
      build.setLength(build.length() - 1);
    }
    return build.toString();
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FindIntersection(s.nextLine())); 
  }

}
