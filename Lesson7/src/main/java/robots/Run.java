package robots;

import robots.hands.IHand;
import robots.hands.SamsungHand;
import robots.hands.SonyHand;
import robots.hands.ToshibaHand;
import robots.heads.IHead;
import robots.heads.SamsungHead;
import robots.heads.SonyHead;
import robots.heads.ToshibaHead;
import robots.legs.ILeg;
import robots.legs.SamsungLeg;
import robots.legs.SonyLeg;
import robots.legs.ToshibaLeg;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
         /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        IHead sonyHead = new SonyHead(400);
        IHead toshibaHead = new ToshibaHead(500);
        IHead samsungHead = new SamsungHead(300);

        IHand sonyHand = new SonyHand(100);
        IHand toshibaHand = new ToshibaHand(150);
        IHand samsungHand = new SamsungHand(80);

        ILeg sonyLeg = new SonyLeg(200);
        ILeg toshibaLeg = new ToshibaLeg(250);
        ILeg samsungLeg = new SamsungLeg (150);

        ArrayList<IRobot> robotArray = new ArrayList<>();
        robotArray.add(new Robot(sonyHead, samsungHand,toshibaLeg));
        robotArray.add(new Robot(toshibaHead, toshibaHand,sonyLeg));
        robotArray.add(new Robot(samsungHead, sonyHand,samsungLeg));

        robotArray.get(0).action();
        robotArray.get(1).action();
        robotArray.get(2).action();

        int priceMax = 0;
        IRobot expensiveRobot = null;

        for (IRobot r:robotArray) {
              if(priceMax < r.getPrice()){
                priceMax = r.getPrice();
                expensiveRobot = r;
            }
        }

        System.out.println("Самый дорогой " + expensiveRobot.toString() + " с ценой " +expensiveRobot.getPrice());

    }
}
