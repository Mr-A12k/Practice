public class Hello {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("Hello World");
        Addition addition = new Addition();
        int result = addition.add(a,b);
        System.out.println(result);

    }
}

class Addition {

    public int add(int n, int m) {
        System.out.println("Addition operation");
        int sum = n +m;
        return sum;
    }
}