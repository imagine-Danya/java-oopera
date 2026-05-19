import java.util.Objects;

    public class Actor extends Person {
        int height;

        Actor(String name, String surname, Gender gender, int height) {
            super(name, surname, gender);
            this.height = height;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Actor actor = (Actor) o;
            return height == actor.height &&
                    Objects.equals(name, actor.name) &&
                    Objects.equals(surname, actor.surname) &&
                    gender == actor.gender;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, surname, gender, height);
        }

        @Override
        public String toString() {
            return super.toString() + ", Рост: " + height + " см";
        }
    }


