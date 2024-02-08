public class day3 {
    public String str1 = "Public variable";
    private String str2 = "Private variable";
    protected String str3 = "protected variable";

    public void publicMethod(){
        System.out.println("Public method");
    }
    private void privateMethod(){
        System.out.println("Private method");
    }
    protected void protectedMethod(){
        System.out.println("Protected method");
    }
    public static void main(String[] args){
        day3 obj1 = new day3();

        System.out.println("Public:- \n"+obj1.str1);
        obj1.publicMethod();
        System.out.println("\n");
        
        System.out.println("Private:- \n"+obj1.str2);
        obj1.privateMethod();
        System.out.println("\n");
        
        System.out.println("Protected:- \n"+obj1.str3);
        obj1.protectedMethod();
        System.out.println("\n");
        
    }
}
