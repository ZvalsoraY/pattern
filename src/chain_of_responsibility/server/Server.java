package chain_of_responsibility.server;

import chain_of_responsibility.middleware.Middleware;

public class Server {
    private Middleware middleware;
    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean tryCredit(String name, String middleName, String surname, double income, double debt, double credit){
        if (middleware.check(name, middleName, surname, income, debt, credit)){
            System.out.println("Get you credit money.");
            return true;
        }
        return false;
    }
}
