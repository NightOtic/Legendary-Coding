public class Fruit {
    Double gramature;
    String type;
    public Fruit(Double gramature, String type) {
        this.gramature = gramature;
        this.type = type;
    }

    public Double getGramature() {
        return gramature;
    }

    public String getType() {
        return type;
    }
    public Double setGramature(){
        return gramature;
    }
    public String setType(){
        return type;

    }

    String getInfo() {
        return "Weight : " + gramature + "\n Fruit type : " + type;
}
}
