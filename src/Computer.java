/**
 * 🧪 Վարժություն 3 – Composition
 * Ստեղծիր Computer և CPU class-եր, որտեղ Computer-ը ներսում ստեղծում է CPU-ն։
 * <p>
 * 🔧 Պահանջներ՝
 * <p>
 * Computer class-ը իր constructor-ում պետք է ստեղծի CPU։
 * <p>
 * CPU class-ը պետք է ունենա method process()։
 * <p>
 * Computer-ում պետք է լինի method՝ որը կանչում է process()։
 */
public class Computer {
    private Cpu cpu;

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    Computer() {
        this.cpu = new Cpu();
    }

    void callProccess() {
        cpu.process();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.callProccess();

    }
}

class Cpu {
    void process() {
        System.out.println("CPU is a part of a Computer");
    }
}
