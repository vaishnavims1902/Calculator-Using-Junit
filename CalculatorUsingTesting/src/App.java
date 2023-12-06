import static org.junit.Assert.assertEquals;

import java.beans.Transient;

import org.junit.Test;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----------------Caculator----------------");
        
    }
    public static int add(int a,int b){
        return (a+b);
    }
    public static int sub(int a,int b){
        return (a-b);
    }
    public static int mult(int a,int b){
        return (a*b);
    }
    public static int div(int a,int b){
        return (a/b);
    }
    public static long power(int a,int b){
        return (long)(Math.pow(a, b));
    }
    public static int minimum(int a,int b){
        return Math.min(a, b);
    }
    public static int maximum(int a,int b){
        return Math.max(a, b);
    }
    public static long squareRoot(int a){
        return (long)Math.sqrt(a);
    }

   
    @Test
    public void test1(){
       
        assertEquals("message",100,add(40, 30));
    }
    @Test
    public void test2(){
        assertEquals("message",100,sub(40, 30));
    }
    @Test
    public void test3(){
        assertEquals("message",100,mult(40, 30));
    }
    @Test
    public void test4(){
        assertEquals("message",100,div(40, 30));
        
    }
    @Test
    public void test5(){
        assertEquals("message",100,maximum(40, 30));
        
    }
    @Test
    public void test6(){
        assertEquals("message",100, minimum(40, 30));
        
    }
    @Test
    public void test7(){
       assertEquals("message", 100, power(4, 03));
       
        
    }
    @Test
    public void test8(){
         assertEquals("message",3,squareRoot(4));
        
    }

}
