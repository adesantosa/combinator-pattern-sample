package combinatorpattern;

import java.time.LocalDate;
import static combinatorpattern.CustomerRegistrationValidator.*;
import static combinatorpattern.CustomerRegistrationValidator.isAnAdult;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Sarah",
                "adesantosa@gmail.com",
                "+0952208542",
                LocalDate.of(2018, 4, 12)
        );

//        System.out.println(new CustomerValidatorService().isValid(customer));

        ValidationResult result = isEmailValid()
                .and(isAnAdult())
                .and(isPhoneNumberValid())
                .apply(customer);

        System.out.println(result);


    }
}
