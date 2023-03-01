class Box {
    double width;
    double height;
    double lenght;
}

class TheBox {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;

        mybox.width = 10;
        mybox.height = 20;
        mybox.lenght = 15;

        vol = mybox.width * mybox.height * mybox.lenght;
        System.out.println("Volume is " + vol);
    }
}
