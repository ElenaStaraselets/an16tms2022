package cosmo;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.*;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Cosmodrome {


    public static void main(String[] args) {


        IStart shuttle = new Shuttle("Shuttle");
        IStart rocket = new Rocket("Rocket");
        IStart[] arrayIStart = {shuttle, rocket};

        start(arrayIStart);


    }


    public static void start(IStart[] arrayIStart) {

        for (IStart device : arrayIStart) {
            device.checkStart();


            if (device.checkStart()) {
                device.engineStart();


                for (int countdownStarter = 10; countdownStarter >= 0; countdownStarter--) {
                    System.out.println(countdownStarter);

                    if (countdownStarter == 0) {
                        device.start();

                    }
                }

/*
                    ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

                    Runnable runnable = new Runnable() {
                        int countdownStarter = 10;

                        public void run() {

                            System.out.println(countdownStarter);
                            countdownStarter--;

                            if (countdownStarter < 0) {
                                device.start();
                                scheduler.shutdown();
                            }
                        }
                    };
                    scheduler.scheduleAtFixedRate(runnable, 0, 1, SECONDS);
*/

            } else {
                System.out.println("Предстартовая проверка " + device.getName() + " провалена");
            }

        }


    }


}







//    public void checkStart(IStart shuttle) {
//
//        if(shuttle.checkStart() ){
//            shuttle.engineStart();
//        }
//        else{
//            System.out.println("Предстартовая проверка провалена");
//        }
//    }


