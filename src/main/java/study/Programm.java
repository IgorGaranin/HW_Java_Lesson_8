package study;

public class Programm {
    public static void main(String[] args) {

        FigureRectangle figure = new FigureRectangle();
        figure.color = "Зеленый";
        figure.length = 10;
        figure.width = 1;

        System.out.println(figure.calculateArea());
        System.out.println(figure.calculatePerimeter());
        System.out.println(figure.rectangleIsSquare());
        figure.draw();
        figure.drawImage();

    }
}
