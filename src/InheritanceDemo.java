import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();

        workers.add(new Worker("1", "bob", "barker", "Mr", 2000, 13.50));
        workers.add(new Worker("2", "sally", "smith", "Mrs", 2001, 12.00));
        workers.add(new Worker("3", "Timmy", "Turtle", "Mr", 2002, 14.75));

        workers.add(new SalaryWorker("4", "Melissa", "Schlub", "Ms", 2006, 15.00, 90000));
        workers.add(new SalaryWorker("5", "Sydney", "Rodenroth", "Ms", 2006, 13.50, 80000));
        workers.add(new SalaryWorker("6", "Claire", "Battelle", "Ms", 2007, 14.00, 100000));

        double[] weeklyHours = {40, 50, 40};

        for(int week = 0; week < weeklyHours.length; week++){
            double hours = weeklyHours[week];

            System.out.printf("Payroll for week %d (%.0f Hours)%n", (week + 1), hours);
            System.out.printf("%-10s %-15s %-15s %-10s %-15s%n", "ID", "First Name", "Last Name", "Type", "Weekly Pay");

            for(Worker w : workers){
                String workerType = (w instanceof SalaryWorker)? "Salaried" : "Hourly";
                double pay = w.calculateWeeklyPay(hours);

                System.out.printf("%-10s %-15s %-15s %-10s $%-14.2f%n",
                        w.getID(),
                        w.getFirstName(),
                        w.getLastName(),
                        workerType,
                        pay);
            }
            System.out.println();
        }
    }
}
