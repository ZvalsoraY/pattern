package chain_of_responsibility.middleware;

public class PersonInformationMiddleware  extends Middleware{
    @Override
    public boolean check(String name, String middleName, String surname, double income, double debt, double credit) {
        if(name.length() < 3 || middleName.length() < 3 || surname.length() < 3) {
            System.out.println("Incorrect name.");
            return false;
        }
        if(income < 100) {
            System.out.println("Low income.");
            return false;
        }
        if (debt < 0){
            System.out.println("Debt limit is empty.");
            return false;
        }
        return checkNext(name, middleName, surname, income, debt, credit);
    }
}
