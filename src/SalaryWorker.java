public class SalaryWorker extends Worker {
    double annualSalary;

    @Override
    public double calculateWeeklyPay(double hoursWorked){
        return annualSalary / 52.0;
    }

    @Override
    public void displayWeeklyPay(double hoursWorked) {
        double weeklyPay = calculateWeeklyPay(hoursWorked);
        System.out.printf("Weekly Pay: $%.2f (Fraction of annual salary of $%.2f)%n", weeklyPay, annualSalary);
    }

    @Override
    public String toCSV(){
        return super.toCSV() + ", " + annualSalary;
    }

    @Override
    public String toJSON() {
        return "{\"ID\":\"" + getID() + "\",\"firstName\":\"" + getFirstName() + "\",\"lastName\":\"" + getLastName() + "\",\"title\":\"" + getTitle() + "\",\"YOB\":" + getYOB() + "\",\"hourlyPayRate\":" + hourlyPayRate + "\",\"annualSalary\":" + annualSalary + "}";
    }

    @Override
    public String toXML(){
        return "<SalaryWorker><ID>" + getID() + "</ID><firstName>" + getFirstName() + "</firstName><lastName>" + getLastName() + "</lastName><title>" + getTitle() + "</title><YOB>" + getYOB() + "</YOB><hourlyPayRate>" + hourlyPayRate + "</hourlyPayRate><annualSalary>" + annualSalary + "</annualSalary></SalaryWorker>";
    }

    public SalaryWorker(String IDNum, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualPay){
        super(IDNum, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualPay;
    }

    public double getAnnualSalary(){
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary){
        this.annualSalary = annualSalary;
    }

}
