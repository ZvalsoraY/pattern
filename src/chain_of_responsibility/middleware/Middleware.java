package chain_of_responsibility.middleware;

public abstract class Middleware {
    private Middleware next;

    /**
     * EN: Builds chains of middleware objects.
     *
     * RU: Помогает строить цепь из объектов-проверок.
     */
    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for (Middleware nextInChain: chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    /**
     * EN: Subclasses will implement this method with concrete checks.
     *
     * RU: Подклассы реализуют в этом методе конкретные проверки.
     */
    public abstract boolean check(String name, String middleName, String surname
            ,double income, double debt, double credit);

    /**
     * EN: Runs check on the next object in chain or ends traversing if we're in
     * last object in chain.
     *
     * RU: Запускает проверку в следующем объекте или завершает проверку, если
     * мы в последнем элементе цепи.
     */
    protected boolean checkNext(String name, String middleName, String surname
            , double income, double debt, double credit) {
        if (next == null) {
            return true;
        }
        return next.check(name, middleName, surname
                , income, debt, credit);
    }
}
