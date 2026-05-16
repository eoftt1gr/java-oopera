package Shows;

import People.Actor;
import People.Director;
import People.Person;

import java.util.ArrayList;

public class Ballet extends MusicalShow {
    private Person choreographer;

    public Ballet(String title, int duration, Director director, ArrayList<Actor> listOfActor, Person musicAuthor, String librettoText, Person choreographer) {
        super(title, duration, director, listOfActor, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Person getChoreographer() {
        return choreographer;
    }

    public void setChoreographer(Person choreographer) {
        this.choreographer = choreographer;
    }
}
