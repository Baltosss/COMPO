package compo;


public class Interviewer {
    private IChatty chater;
    private ChattyPointer<IChatty> target;

    public Interviewer() {
        this.chater = null;
        this.target = new ChattyPointer<IChatty>();
    }

    public void setChater(IChatty chater) {
        this.chater = chater;
    }

    public void setTarget(IChatty chater) {
        this.target.define(chater);
    }

    public IChatty getChater() {
        return this.chater;
    }

    public ChattyPointer<IChatty> getTarget() {
        return this.target;
    }

    public void interview() {
        System.out.print("Hello, what do you think? ");
        System.out.println(this.chater.chat());
    }

    public void smartInterview() {
        System.out.print("Hello, what do you think? ");
        System.out.println(this.target.data().chat());
    }
}
