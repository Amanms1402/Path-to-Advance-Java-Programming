public class awesomejava {
    public static void main(String[] args){
        burp("Raj");

        Cat cat1 = new Cat(); 
        cat1.name = "Tom";
        cat1.age = 1;
        cat1.meow(); // here meow is non-static functions so Cat obj will call it

        Cat cat2 = new Cat();
        cat2.name = "Jack";
        cat2.age = 2;

        Cat.DingDong(); // DingDong function is static fun so Cat can call it. but Cat obj will not
        System.out.println(cat1.name);
    }
    private static void burp(String name){
        System.err.println("My name is "+name);
    }
}
