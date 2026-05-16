package Shows;

import People.Actor;
import People.Director;
import People.Person;

import java.util.ArrayList;

public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, int duration, Director director, ArrayList<Actor> listOfActor, Person musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, listOfActor, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
