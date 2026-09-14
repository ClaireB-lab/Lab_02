public class Worker extends Person {
    double hourlyPayRate;


    @Override
    public String toCSV(){
        return super.toCSV() + ", " + hourlyPayRate;
    }

    @Override
    public String toJSON(){
        return "{\"ID\":\"" + getID() + "\",\"firstName\":\"" + getFirstName() + "\",\"lastName\":\"" + getLastName() + "\",\"title\":\"" + getTitle() + "\",\"YOB\":" + getYOB() + "\",\"hourlyPayRate\":" + hourlyPayRate + "}";

    }

    @Override
    public String toXML(){
        return "<Worker><ID>" + getID() + "</ID><firstName>" + getFirstName() + "</firstName><lastName>" + getLastName() + "</lastName><title>" + getTitle() + "</title><YOB>" + getYOB() + "</YOB><hourlyPayRate>" + hourlyPayRate + "</hourlyPayRate></Person>";

    }

    public Worker(String IDNum, String firstName, String lastName, String title, int YOB, double hourlyPayRate){
        super(IDNum, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public Worker(Person person, double hourlyPayRate){
        super(
                person.getID(),
                person.getFirstName(),
                person.getLastName(),
                person.getTitle(),
                person.getYOB());
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked){
        if(hoursWorked >= 40){
            return hoursWorked * hourlyPayRate;
        }else{
            double regularPay = 40 * hourlyPayRate;
            double overtime = hoursWorked - 40;
            double overtimePay = overtime * (hourlyPayRate * 1.5);
            return regularPay + overtimePay;
        }
    }

    public void displayWeeklyPay(double hoursWorked){
        double regularHours = Math.min(hoursWorked, 40);
        double regularPay = regularHours * hourlyPayRate;
        double overtimeHours = Math.max(0, hoursWorked - 40);
        double overtimePay = overtimeHours * (hourlyPayRate * 1.5);
        double totalPay = regularPay + overtimePay;

        System.out.println("Weekly Pay");
        System.out.printf("Regular Hours: %.2f   | Pay: $%.2f%n", regularHours, regularPay);
        System.out.printf("Overtime Hours %.2f   | Pay: $%.2f%n", overtimeHours, overtimePay);
        System.out.printf("Total Pay: $%.2f%n", totalPay);
        }
    }

