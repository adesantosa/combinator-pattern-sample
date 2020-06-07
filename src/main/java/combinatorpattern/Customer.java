package combinatorpattern;

import java.time.LocalDate;
import lombok.Getter;

@Getter
public class Customer {

    private final String name;
    private final String email;
    private final String phoneNumber;
    private final LocalDate dob;


    public Customer(String name, String email, String phoneNumber, LocalDate localDate) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dob = localDate;
    }




}
