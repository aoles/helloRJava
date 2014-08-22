public class HelloRJava {
    
  public static String sayHello() {
    String result = new String("Hello Java World!");
    return result;
  }
  
  public static int[][] createArray(int x, int y) {
    int[][] a = new int[x][y];
    
    int k = 1;
    for(int i = 0; i < x; i++)
      for(int j = 0; j < y; j++)
	a[i][j] = k++;
	
    return a;
  }
  
  public static void main(String[] args) {
    int x = 2, y = 2;
    
    if(args.length >= 2) {
      x = Integer.parseInt(args[0]);
      y = Integer.parseInt(args[1]);
    }
    
    int[][] a = createArray(x, y);
          
    for(int i = 0; i < a.length; i++) {
      for(int j = 0; j < a[i].length-1; j++)
	System.out.print(a[i][j]);
      System.out.println(a[i][a[i].length-1]);    
    }
  
  }

}