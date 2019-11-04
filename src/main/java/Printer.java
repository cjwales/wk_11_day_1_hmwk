public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper, int toner) {
        this.paper = paper;
        this.toner = toner;
    }

    public void print(int pages, int copies) {
        if (paper >= pages * copies) {
            this.toner -= pages * copies;
            this.paper -= pages * copies;
        }
    }

    public int getPaper() {
        return this.paper;
    }

    public int getToner() {
        return this.toner;
    }
}
