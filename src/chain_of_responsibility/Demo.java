package chain_of_responsibility;

import chain_of_responsibility.middleware.ComplianceMiddleware;
import chain_of_responsibility.middleware.CreditConditionMiddleware;
import chain_of_responsibility.middleware.Middleware;
import chain_of_responsibility.middleware.PersonInformationMiddleware;
import chain_of_responsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        Middleware middleware = Middleware.link(
                new PersonInformationMiddleware(),
                new CreditConditionMiddleware(),
                new ComplianceMiddleware()
        );
        server.setMiddleware(middleware);
        server.tryCredit("Vasya", "Alex", "Pypkov", 100, 1000, 500);
        server.tryCredit("Vasya", "Alex", "Pypkov", 99, 1000, 500);
        server.tryCredit("Wanted", "Alex", "Pypkov", 100, 1000, 500);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Enter name: ");
            String name = reader.readLine();
            System.out.print("Enter middle name: ");
            String middleName = reader.readLine();
            System.out.print("Input surname: ");
            String surname = reader.readLine();
            System.out.print("Input income: ");
            double income = Double.parseDouble(reader.readLine());
            System.out.print("Input debt: ");
            double debt = Double.parseDouble(reader.readLine());
            System.out.print("Input credit: ");
            double credit = Double.parseDouble(reader.readLine());
            success = server.tryCredit(name, middleName, surname, income, debt, credit);
        } while (!success);
    }
}
