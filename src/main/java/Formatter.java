public class Formatter {
    double i;
    String rub;

    Formatter(double i){
        this.i = i;
    }

    void ruble(double i){
        int i2 = (int)Math.floor(i);
        switch(i2){
            case 1:{
                rub = "рубль";
                break;
            }
            case 2:{
                rub = "рубля";
                break;
            }
            case 3:{
                rub = "рубля";
                break;
            }
            case 4:{
                rub = "рубля";
                break;
            }
            default:{
                rub = "рублей";
                break;
            }
        }
    }
}
