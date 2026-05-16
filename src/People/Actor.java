package People;

import java.util.Objects;

public class Actor extends Person {
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Актер: " + getName() + " " + getSurname()
                + " [" + height + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return height == actor.height && getName().equals(actor.getName()) && getSurname().equals(actor.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, getName(), getSurname());
    }
}
