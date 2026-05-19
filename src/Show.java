import java.util.ArrayList;

public class Show {
    ArrayList<Actor> listOfActors;
    String title;
    int duration;
    Director director;

        public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void addActor(Actor actor) {
        listOfActors.add(actor);
    }

    public void replaceActor(Actor oldActor, Actor newActor) {
        int number = listOfActors.indexOf(oldActor);
        if (number != -1) {
            listOfActors.set(number, newActor);
        } else {
            System.out.println("Актёр " + oldActor.surname + " " + oldActor.name +
                    " не найден в спектакле " + title + ".");
        }
    }

    public void printActors() {
        System.out.println("Актеры в спектакле " + title + duration + " мин.:");
        if (listOfActors.isEmpty()) {
            System.out.println("Список актёров пуст.");
        } else {
            for (Actor actor : listOfActors) {
                System.out.println(" - " + actor.toString());
            }
        }
    }
}
