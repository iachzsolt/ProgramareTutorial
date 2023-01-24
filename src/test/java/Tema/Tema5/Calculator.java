package Tema.Tema5;

public class Calculator {

    private String Brand;
    private Boolean Laptop;
    private String Model;
    private String Processor;
    private Integer Ram;
    private String ModelCardVideo;
    private Integer SpatiuDeStocare;
    private Integer Pret;

    public Calculator(String brand, Boolean laptop, String model, String processor, Integer ram, String modelCardVideo, Integer spatiuDeStocare, Integer pret) {
        Brand = brand;
        Laptop = laptop;
        Model = model;
        Processor = processor;
        Ram = ram;
        ModelCardVideo = modelCardVideo;
        SpatiuDeStocare = spatiuDeStocare;
        Pret = pret;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public Boolean getLaptop() {
        return Laptop;
    }

    public void setLaptop(Boolean laptop) {
        Laptop = laptop;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getProcessor() {
        return Processor;
    }

    public void setProcessor(String processor) {
        Processor = processor;
    }

    public Integer getRam() {
        return Ram;
    }

    public void setRam(Integer ram) {
        Ram = ram;
    }

    public String getModelCardVideo() {
        return ModelCardVideo;
    }

    public void setModelCardVideo(String modelCardVideo) {
        ModelCardVideo = modelCardVideo;
    }

    public Integer getSpatiuDeStocare() {
        return SpatiuDeStocare;
    }

    public void setSpatiuDeStocare(Integer spatiuDeStocare) {
        SpatiuDeStocare = spatiuDeStocare;
    }

    public Integer getPret() {
        return Pret;
    }

    public void InfoCalculator(){
        System.out.println("Brandul este: " + Brand);
        if(Laptop = true){
            System.out.println("Dispozitivul este un laptot.");
        } else {
            System.out.println("Dispozitivul este un PC.");
        }
        System.out.println("Modelul este: " + Model);
        System.out.println("Processorul este: " + Processor);
        System.out.println("Memorie ram: " + Ram + " GB");
        System.out.println("Card video: " + ModelCardVideo);
        System.out.println("Spatiu de stocare: " + SpatiuDeStocare + " GB");


    }
}
