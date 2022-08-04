public class MainPolymorphism {

    public static void makeTheFlierFly(Fliers flier) {
        flier.fly();
    }

    public static void makeTheSpeakerSpeak(Speakers speaker) {
        speaker.speak();
    }
    
    public static void main(String[] args) {
        
        Pigeon pigeon = new Pigeon();
        Duck duck = new Duck();

        // pigeon.fly();
        // duck.fly();
        makeTheFlierFly(pigeon);
        makeTheFlierFly(duck);
        makeTheSpeakerSpeak(pigeon);
        makeTheSpeakerSpeak(duck);
    }
}
