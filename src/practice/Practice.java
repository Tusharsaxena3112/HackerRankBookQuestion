package practice;

public class Practice {
    public static void main(String[] args) {
        char[] a = {'a', 'b', 'c', 'd'};
        String name = "Tushar ";
        System.out.println(name.valueOf(a)); //same as copyValueOf
        System.out.println(name.subSequence(2, 5));
        System.out.println(name.repeat(3));
        System.out.println(name.join("", name, "Welcome"));
        System.out.println(name.isEmpty());
        System.out.println(name.hashCode());
        System.out.println(String.format("My name is %s", name));
        System.out.println(name.endsWith("o"));
        System.out.println(name.copyValueOf(a));
        System.out.println(name);
    }
}
