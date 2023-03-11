import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionFigures{

    static ArrayList<Figures> allFigure = new ArrayList<>(); 
    {
        allFigure.add(new Circle("Малый круг", 5.0));
        allFigure.add(new Triangle("Треугольник", 2.0, 4.9, 6.2));
    }

    public static void getAllParameters() {
        Double result = (double) 0;
        int index = 0;
        for (int i = 0; i < allFigure.size(); i++) {
            index++;
            result += ((Figures) allFigure.get(i)).getArea();
        }
        System.out.printf("\nПлощадь всех возможных " + index + " фигур = " + result + ";\n");
        index = 0;
        for (Figures figure : allFigure) {
            if (figure instanceof Perimeter) {
                index++;
                result += (((GeometricShapes) figure).getPerimeter());
            }
        }
        System.out.printf("Периметр всех возможных " + index + " фигур = " + result + ";\n");
        index = 0;
        for (Figures figure : allFigure) {
            if (figure instanceof Circle) {
                index++;
                result += (((Circle) figure).getCircleofCircle());
            }
        }
        System.out.printf("Длина окружности всех возможных " + index + " фигур = " + result + ";\n");
        index = 0;
    }

    public void getAllPerimeter() {
        Double result = (double) 0;
        for (Figures figure : allFigure) {
            if (figure instanceof Perimeter) {
                result += (((GeometricShapes) figure).getPerimeter());
            }
        }

    }

    public static void showAll() {
        Collections.sort(allFigure);
        int index = 0;
        for (Figures figur : allFigure) {
            System.out.printf("%d) ", index);
            System.out.println(figur);
            System.out.println("----");
            index++;
        }
    }

    public static void delleteFigure(Scanner input, ArrayList<Figures> allFigure) {
        showAll();
        System.out.print("\nКакую фигуру удалить?: ");
        int choice = input.nextInt();
        if (choice < allFigure.size()) {
            allFigure.remove(choice);
            System.out.println("Вы успешно удалили животное!");
            Program.programMenu(input, allFigure);
        } else
            Program.programMenu(input, allFigure);

    }

    public static void editFigure(Scanner input, ArrayList<Figures> allFigure){
        System.out.println("\n Фигура успешно изменена.");
    }

}