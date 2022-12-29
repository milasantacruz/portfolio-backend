public class car {
    String make ;
    String model ;
    int year ;
    String color ;
    double price ;

    car(String make_, String model_, int year_, String color_){
        this.make = make_;
        this.model = model_;
        this.year = year_;
        this.color = color_;
    }


    void drive(){
        System.out.println(this.make + this.model + " Is driving");
    }

    void brake(){
        System.out.println(this.year + "is the year");
    }
}
