package New;

import java.util.*;



public class BankLoan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        ArrayListEx<Double> incomes = new ArrayListEx<>();
        
        System.out.println("Enter details:");

        
        Integer age = sc.nextInt();
        Integer cibil = sc.nextInt(); 
        
        
        incomes.add(sc.nextDouble()); 
        
       
     if (age >= 21 && age <= 60 && incomes.get(0) >= 25000 && cibil >= 700) {
            System.out.println("Eligible for a loan");
        } else {
            System.out.println("Not eligible for a loan");
        }

        
    }
}

