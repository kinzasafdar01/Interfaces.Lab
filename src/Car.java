public class Car implements Vehicle, MP{

    @Override
    public void speedup(){
        System.out.println("Speeding up");
    }

    @Override
    public void speeddown(){
        System.out.println("Speeding down");
    }
    @Override
    public void braking(){
        System.out.println("Applying break");
    }

    @Override
    public void play(){
        System.out.println("Playing audio");
    }

    @Override
    public void stop(){
        System.out.println("Stopping the media player");
    }

    @Override
    public void forward() {
        System.out.println("Forwarding music");
    }
}
