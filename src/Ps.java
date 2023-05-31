public class Ps {
    public String processor;
    public String hdd;
    public String videoCard;
    public String ssd;
    public String motherBord;
    public String ram;
    public String powerSupply;
    public int prise;

    public int getPrise() {
        return prise;
    }

    public Ps(String processor, String hdd, String videoCard, String ssd, String motherBord, String ram, String powerSupply, int prise) {
        this.processor = processor;
        this.hdd = hdd;
        this.videoCard = videoCard;
        this.ssd = ssd;
        this.motherBord = motherBord;
        this.ram = ram;
        this.powerSupply = powerSupply;
        this.prise = prise;
    }
    void discount(){
        this.prise = (prise/100)*90;
        System.out.println("Ціна з знижкою:" + prise);
    }
}
