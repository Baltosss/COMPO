package compo;


public class Cameraman {
    private IChatty chater;
    private ChattyPointer<IChatty> target;

    public Cameraman() {
        this.chater = null;
        this.target = null;
    }

    public void setChater(IChatty chater) {
        this.chater = chater;
    }

    public void setTarget(ChattyPointer<IChatty> target) {
        this.target = target;
    }

    public void listen() {
        System.out.print("The cameraman is listening... ");
        System.out.println(this.chater.chat());
    }

    public void smartListen() {
        System.out.print("The cameraman is listening... ");
        System.out.println(this.target.data().chat());
    }
}
