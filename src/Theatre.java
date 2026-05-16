import java.util.ArrayList;
import java.util.Scanner;
import Shows.*;
import People.*;

public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Николай", "Николаевич", Gender.MALE, 190);
        Actor actor2 = new Actor("Анастасия", "Двоеглазова", Gender.FEMALE, 170);
        Actor actor3 = new Actor("Артем", "Попович", Gender.MALE, 188);

        Director director1 = new Director("Леонардо", "Петрович", Gender.MALE, 20);
        Director director2 = new Director("Донателло", "Михайловна", Gender.FEMALE, 10);

        Person musicAuthor = new Person("Патриссия", "Эдуардовна", Gender.FEMALE);
        Person choreographer = new Person("Юлия", "Высоцкая", Gender.FEMALE);

        System.out.println("Обычный спектакль:");
        MusicalShow musicalShow = new MusicalShow("Обычный", 120, director1, new ArrayList<>(), musicAuthor, "Текс либретто обычный");
        musicalShow.addActor(actor1);
        musicalShow.printListOfActor();
        System.out.println();

        System.out.println("Балетный спектакль:");
        Ballet ballet = new Ballet("Балет", 120, director1, new ArrayList<>(), musicAuthor, "Текст либретто балета", choreographer);
        ballet.addActor(actor2);
        ballet.printListOfActor();
        ballet.replaceActor(actor3, actor1);
        System.out.println("Либретто балета: " + ballet.getLibrettoText());
        System.out.println();

        System.out.println("Оперный спектакль:");
        Opera opera = new Opera("Опера", 120, director1, new ArrayList<>(), musicAuthor, "Текст либретто оперы", 200);
        opera.addActor(actor3);
        opera.printListOfActor();
        opera.replaceActor(actor3, actor2);
        opera.printListOfActor();
        System.out.println("Либретто оперы: " + opera.getLibrettoText());





    }
}
