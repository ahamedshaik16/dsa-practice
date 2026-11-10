package dsa.strings;

public class DefangIPaddr_1108 {

    public static void main(String[] args) {
        DefangIPaddr_1108 d = new DefangIPaddr_1108();
        System.out.println(d.defangIPaddr("255.100.50.0"));
    }

    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");

    }
}
