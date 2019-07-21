public class Computer {

    private Ram ram;


    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void getRamValue(){
        System.out.println(ram.getValue());
    }
}
