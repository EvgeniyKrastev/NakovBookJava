package Chapter20PrinciplesOfOOP.Task4;

class Shape {
   private double width;
   private double height;

     Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

     double getHeight() {
        return height;
    }

     void setHeight(double height) {
        this.height = height;
    }

     double getWidth() {
        return width;
    }

     void setWidth(double width) {
        this.width = width;
    }

     double calculateSurface(){
        return 0;
    }

}
