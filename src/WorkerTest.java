import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    @org.junit.jupiter.api.Test
    void toCSV() {
        Worker w = new Worker("1","bob","barker","Mr",2005, 13.50);

        assertEquals("1, bob, barker, Mr, 2005, 13.5", w.toCSV());
    }

    @org.junit.jupiter.api.Test
    void toJSON() {
        Worker w = new Worker("1","bob","barker","Mr",2005, 13.50);

        assertEquals("{\"ID\":\"1\",\"firstName\":\"bob\",\"lastName\":\"barker\",\"title\":\"Mr\",\"YOB\":2005\",\"hourlyPayRate\":13.5}", w.toJSON());
    }

    @org.junit.jupiter.api.Test
    void toXML() {
        Worker w = new Worker("1","bob","barker","Mr",2005, 13.50);

        assertEquals("<Worker><ID>1</ID><firstName>bob</firstName><lastName>barker</lastName><title>Mr</title><YOB>2005</YOB><hourlyPayRate>13.5</hourlyPayRate></Person>", w.toXML());
    }

    @org.junit.jupiter.api.Test
    void calculateWeeklyPay() {
        Worker w = new Worker("1","bob","barker","Mr",2005, 13.50);

        w.calculateWeeklyPay(40);
    }

    @org.junit.jupiter.api.Test
    void displayWeeklyPay() {
        Worker w = new Worker("1","bob","barker","Mr",2005, 13.50);

        w.displayWeeklyPay(40);
    }
}