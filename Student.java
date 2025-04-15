class Calculator{
    int add( int x, int y){
    return x+y;
}
int sub( int x, int y){
    return x-y;
}
int mul ( int x, int y){
    return x*y;
}
int div ( int x, int y){
    return x/y;
}
int mod( int x, int y){
    return x%y;
}
}
  public class Student{
    
    public static void main(String [] args){  
        Calculator calc = new Calculator();
        System.out.println("Addition :"+ calc.add(10,2));
        System.out.println("Sub :"+ calc. sub(10,2));
        System.out.println("Mul :"+ calc.mul(10,2));
        System.out.println("Div :"+ calc.div(10,2));
        System.out.println("Mod :"+ calc.mod(10,2));

    }
    
  }
  
