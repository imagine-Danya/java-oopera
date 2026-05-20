import java.util.ArrayList;

public class Show {
    protected ArrayList<Actor> listOfActors;
    protected String title;
    protected int duration;
    protected Director director;

        public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printDirector() {
        if (director != null) {
            System.out.println("Режиссёр спектакля" + title + ": " + director.getName() + " " + director.getSurname());
        } else {
            System.out.println("Режиссёр не назначен.");
        }
    }

    public void addActor(Actor actor) {
        for (Actor existing : listOfActors) {
            if (existing.equals(actor)) {
                System.out.println("[Предупреждение] Актёр " + actor.getSurname() + " " + actor.getName() + " уже участвует в этом спектакле.");
                return;
            }
        }
        listOfActors.add(actor);
    }

    public void replaceActor(String surnameToReplace, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surnameToReplace)) {
                listOfActors.set(i, newActor);
                System.out.println("Актёр с фамилией " + surnameToReplace + " успешно заменён.");
                return;
            }
        }
        System.out.println("Актёр с фамилией " + surnameToReplace + " не найден в спектакле \"" + title + "\".");
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
