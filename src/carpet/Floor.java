package carpet;

public class Floor {

    private double width;
    private double length;

    public Floor(double width, double length) {
/*        if(width <0){
            this.width =0;
        }else {
            this.width = width;
        }*/

        this.width = (width < 0) ? 0 : width;

/*        if(length<0){
            this.length =0;
        }else {
            this.length = length;
        }*/

        this.length = (length < 0) ? 0 : length;

    }

    public double getArea(){
        return this.width*this.length;
    }
}
