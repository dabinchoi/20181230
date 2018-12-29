package temp;

public abstract class Action {
    void init() {
        System.out.println("init!!");
    }

    protected abstract void service();

    void destroy() {
        System.out.println("destroy");
    }

    public final void run() {
        init();
        service();
        destroy();

    }
}
