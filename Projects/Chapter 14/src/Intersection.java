import java.util.*;

public class Intersection
{
private final static int PROCESS = 3;
private final static int SIM_LENGTH = 1000;

@SuppressWarnings("resource")
public static void main(String[] args) 
   {
          Car car = new Car();

          Deque<Car> carQueue = new LinkedList<Car>();

          int delayTotal = 0, carArrival, lightChange = 0, switchCount = 0, changeCount = 0;
          double carCount;
          boolean even = false;
          String lightColor, green = null, red = null;


              Scanner scan = new Scanner(System.in);

              System.out.println("Enter in a car arrival interval between 1 and 5 seconds." + "\n");
              carArrival = scan.nextInt();

              if (!(carArrival < 6 && carArrival > 0))
                  System.out.println("Enter a valid time." + "\n");

              Scanner sc = new Scanner(System.in);

              System.out.println("Enter in a traffic light duration between 5 and 10 seconds." + "\n");
              lightChange = sc.nextInt();


              if (!(lightChange < 11 && lightChange > 4))
                  System.out.println("Enter a valid time." + "\n");

              //add a car to the queue every [carArrival] seconds
              for (int i = 0; i < SIM_LENGTH; i+= carArrival)
                  {
                    carQueue.add(car);
                  }


              //Develop a way for the program to know that SIM_LENGTH has
              //counted 'lightChange' seconds.
              //Count each time lightChange occurs

              for (int i = 0; i < SIM_LENGTH; i++)
              {
                  if (i % lightChange == 0)
                  {
                     changeCount++;
                  }
              }


            //Assuming light starts as red, every time the preceding count increases by 1,
            //switch lightColor.
            //if count % 2 == 0, return green light; else red light

              if (changeCount % 2 == 0)
              {
                  even = true;
              }


              if (even)
                  {
                  lightColor = green;
                  }
              else
                  {
                  lightColor = red;
                  }

              while (lightColor == green)
              {
                    //remove a car from the queue every [PROCESS] seconds
                    //(PROCESS is time to pass intersection)

                      for (int i = 0; i < SIM_LENGTH; i+= PROCESS)
                      {
                          carQueue.remove(car);
                      }

                      //I increment 'switchCount so I can use it as a divisor
                      //for delayTotal to find the delayAverage

                      switchCount++;
              }
              //Trying to increment delay time (cars are immobilized by red light)
              delayTotal += lightChange;


          //carCount Example:
          //lightChange = 6; PROCESS = 3; switchCount =166.7 times
          //carCount = 333.4 cars; obviously I need it to a whole number

          carCount = (lightChange / PROCESS) * switchCount; 

          int delayAverage = delayTotal/switchCount;
          int stranded = carQueue.size();

          System.out.println("Cars across: " + carCount);
          System.out.println("Delay (tot): " + delayTotal);
          System.out.println("Delay (avg): " + delayAverage);
          System.out.println("Number stranded: " + stranded);

   }
}