package net.javaguides.banking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data                       //create getter setter for this class
@AllArgsConstructor
public class AccountDto {
    private Long id;
    private String accountHolderName;
    private double balance;


}
