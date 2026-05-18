package theatre;

import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActor;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActor) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActor = listOfActor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getListOfActor() {
        return listOfActor;
    }

    public void setListOfActor(ArrayList<Actor> listOfActor) {
        this.listOfActor = listOfActor;
    }

    public void printListOfActor() {
        for (Actor actor : listOfActor) {
            System.out.println(actor);
        }
    }

    public void printDirector() {
        System.out.println(director);
    }

    public void addActor(Actor actor) {
        if (!listOfActor.contains(actor)) {
            listOfActor.add(actor);
        } else {
            System.out.println("Такой актер уже существует!");
        }
    }

    public void replaceActor(Actor replacedActor, Actor newActor) {
        // У меня есть вопрос по поводу пакетов, правильно ли я их использовал и если нет, то можете дать рекомендации, пожалуйста.
        for (Actor actor : listOfActor) {
            if (actor.getSurname().equals(newActor.getSurname())) {
                System.out.println("Есть актер с такой же фамилией, замена не будет осуществлена.");
                return;
            }
        }
        if (listOfActor.contains(replacedActor)) {
            listOfActor.remove(replacedActor);
            listOfActor.add(newActor);
        } else {
            System.out.println("Замена на несуществующего актера невозможна!");
        }

    }
}
