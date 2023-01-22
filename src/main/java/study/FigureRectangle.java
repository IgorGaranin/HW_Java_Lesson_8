package study;

public class FigureRectangle extends Figura implements Drawable {
    int length = 0, width = 0;

    public boolean rectangleIsSquare() {
        if (this.length == this.width) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int calculateArea() {
        return this.length * this.width;
    }

    @Override
    public int calculatePerimeter() {
        return (this.length + this.width) * 2;
    }

    @Override
    public void draw() {
        String typeFigure = "";

        if (rectangleIsSquare()) {
            typeFigure = "Квадрат";
        } else {
            typeFigure = "Прямоугольник";
        }

        System.out.printf("Тип фигуры %s, длина %d, ширина %d, площадь %d, периметр %d, цвет %s",
                typeFigure, this.length, this.width, this.calculateArea(), this.calculatePerimeter(), this.color);
    }

    public void drawImage() {

        System.out.println("");
        drawHorizontalLine();

        System.out.println("");
        drawVerticalLines();

        drawHorizontalLine();

    }

    private void drawHorizontalLine() {

        for (int i = 0; i < this.length; i++) {
            System.out.print("-");
        }
    }

    private void drawVerticalLines(){

        String typeFigure = "";

        if (rectangleIsSquare()) {
            typeFigure = "квадрат";
        } else {
            typeFigure = "прямоугольник";
        }

        for (int i = 0; i < this.width; i++) {

            for (int j = 0; j < this.length; j++) {

                if ((j == 0) || (j == this.length - 1)) {
                    System.out.print("|");
                }
                else {
                    System.out.print(" ");
                }

                if ((i == 0) && (j == this.length - 1)){
                    System.out.printf(" %s - %s %s размером %d на %d", this.color, this.color, typeFigure, this.width, this.length);
                }
            }
            System.out.println("");
        }

    }
}
