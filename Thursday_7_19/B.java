package Thursday_7_19;

 class A {
    public int a = 0;

    public void fun() {
        System.out.println("----A----");
    }
}

 public class B extends A {
    public int a = 1;
    public void fun() {
        System.out.println("----B----");
    }


    public static void main(String[] args) {
        int a = 5;
        int b = a++;
        int c = ++a;
        A classA = new B();
        System.out.println(classA.a);
        classA.fun();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
