package chain_of_responsibility.middleware;

public class ComplianceMiddleware extends Middleware{
    @Override
    public boolean check(String name, String middleName, String surname, double income, double debt, double credit) {
        if (name.equals("Wanted")) {
            System.out.println("Compliance failed.");
            return false;
        }
        return checkNext(name, middleName, surname, income, debt, credit);
    }
}
