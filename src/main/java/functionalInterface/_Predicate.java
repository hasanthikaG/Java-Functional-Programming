package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("Without predicate");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09000000000"));

        System.out.println("With  predicate");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09000000000"));
        System.out.println("is phone number valid and contains number 3 " + isPhoneNumberValidPredicate.and(containNumber3).test("88000000000"));
        System.out.println("is phone number valid and contains number 3 " + isPhoneNumberValidPredicate.and(containNumber3).test("07300000000"));

    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> containNumber3 =
            phoneNumber -> phoneNumber.contains("3");

    static Predicate<String> isPhoneNumberValidPredicate =
            phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;
}
