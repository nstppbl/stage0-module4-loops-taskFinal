package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        for (int i = 0; i <= numberTableToPrint; i++) {
            System.out.println(numberTableToPrint + "*" + i + "=" + numberTableToPrint*i);
        }
    }
}
