package compo;


public class Program {
    public static void main(String[] args) {
        IChatty sadPerson = new SadPerson();
        IChatty expressivePerson = new ExpressivePerson();

        Interviewer interviewer = new Interviewer();
        Cameraman cameraman = new Cameraman();

        // Provide
        interviewer.setChater(sadPerson);
        cameraman.setChater(interviewer.getChater());

        interviewer.interview();
        cameraman.listen();

        interviewer.setChater(expressivePerson);

        interviewer.interview();
        cameraman.listen();

        System.out.println("Simulation of required");
        interviewer.setTarget(sadPerson);
        cameraman.setTarget(interviewer.getTarget());

        interviewer.smartInterview();
        cameraman.smartListen();

        interviewer.setTarget(expressivePerson);

        interviewer.smartInterview();
        cameraman.smartListen();
    }
}
