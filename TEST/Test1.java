package TEST;

public class Test1 {
    public static void main(String[] args) {
        String a=null;
        String b= "";
        String c=new String();
        System.out.println(a==null);
        a= "";
        System.out.println(a==null);
        System.out.println(b==null);
        System.out.println(c==null);
    }
}
