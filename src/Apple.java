public class Apple extends Fruit {
    public static final String Type = "Fruit Flavor  ";
    private static String variety;
    public Apple(Double gramature,String variety){
        super(gramature,Type);
        Apple.variety = variety;
    }
    @Override
    String getInfo(){
        return super.getInfo()+ "\n variety : "+ variety;
    }
}
