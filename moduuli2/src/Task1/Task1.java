package Task1;

public class Task1 {
    public static void main(String[] args) {
        Television myTv = new Television();
        myTv.setChannel(1);

        for (int day = 1; day <= 10; day++) {
            System.out.println("Woke up, day " + day);
            boolean väsynyt = false;

            if (!myTv.isOn())
                myTv.pressOnOff();

            while (!väsynyt) {
                System.out.println("watching channel " + myTv.getChannel());
                myTv.setChannel(myTv.getChannel() + 1);
                if (myTv.getChannel() % 4 == 0)
                    väsynyt = true;

                if (myTv.getChannel()> 10)
                    myTv.setChannel(1);
            }
            myTv.pressOnOff();
            System.out.println("Falling asleep ");
        }


    }
}

class Television {
    boolean isOn;
    int channel;

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

    void pressOnOff() {
        isOn = !isOn; //
    }

    public boolean isOn() {
        return isOn; //
    }
}