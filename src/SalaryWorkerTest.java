import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    @Test
    void calculateWeeklyPay() {
        SalaryWorker s = new SalaryWorker("1", "bob", "barker", "Mr", 2000, 13.50, 80000);

        assertEquals(1538.4615, s.calculateWeeklyPay(40), 0.001);
    }

    @Test
    void displayWeeklyPay() {
        SalaryWorker s = new SalaryWorker("1", "bob", "barker", "Mr", 2000, 13.50, 80000);

        s.displayWeeklyPay(40);
    }

    @Test
    void toCSV() {
        SalaryWorker s = new SalaryWorker("1","bob","barker","Mr",2005, 13.50, 80000);

        assertEquals("1, bob, barker, Mr, 2005, 13.5, 80000.0", s.toCSV());
    }

    @Test
    void toJSON() {
        SalaryWorker s = new SalaryWorker("1","bob","barker","Mr",2005, 13.50, 80000);

        assertEquals("{\"ID\":\"1\",\"firstName\":\"bob\",\"lastName\":\"barker\",\"title\":\"Mr\",\"YOB\":2005\",\"hourlyPayRate\":13.5\",\"annualSalary\":80000.0}", s.toJSON());


    }

    @Test
    void toXML() {
        SalaryWorker s = new SalaryWorker("1","bob","barker","Mr",2005, 13.50, 80000);

        assertEquals("<SalaryWorker><ID>1</ID><firstName>bob</firstName><lastName>barker</lastName><title>Mr</title><YOB>2005</YOB><hourlyPayRate>13.5</hourlyPayRate><annualSalary>80000.0</annualSalary></SalaryWorker>", s.toXML());
    }

    @Test
    void getAnnualSalary() {
        SalaryWorker s = new SalaryWorker("1", "bob", "barker", "Mr", 2005, 13.50, 80000);

        assertEquals(80000.0, s.getAnnualSalary(), 0.001);
    }

    @Test
    void setAnnualSalary() {
        SalaryWorker s = new SalaryWorker("1", "bob", "barker", "Mr", 2005, 13.50, 80000);

        s.setAnnualSalary(90000.0);

        assertEquals(90000.0, s.getAnnualSalary(), 0.001);
    }
}