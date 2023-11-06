package Class_8;

public class stringFunctions {
    public static void main(String[] args) {
        String name = "Siddhant";
        String name2 = "Regmi";

        System.out.println(name.equals("regmi"));
        System.out.println(name.equalsIgnoreCase(name2));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        System.out.println(!name.equals(name2));
        System.out.println(name.indexOf('S'));
        System.out.println(name.charAt(5));
        System.out.println(name.concat("helloworld"));
        System.out.println(name.replace('s',  'p'));
        System.out.println(name.substring(3,5 ));
    }
}
