package chain_of_responsibility.middleware;

public class CreditConditionMiddleware extends Middleware{
    @Override
    public boolean check(String name, String middleName, String surname, double income, double debt, double credit) {
        if(credit > debt){
            System.out.println("Credit value more than debt limit.");
            return false;
        }
        return checkNext(name, middleName, surname, income, debt, credit);
    }
}
