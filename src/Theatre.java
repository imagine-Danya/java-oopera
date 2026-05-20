public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Анна", "Петрова", Gender.FEMALE, 175);
        Actor actor2 = new Actor("Иван", "Иванов", Gender.MALE,180);
        Actor actor3 = new Actor("Яна", "Сидорова", Gender.FEMALE, 170);

        Director director1 = new Director("Елена", "Захарова", Gender.FEMALE, 12);
        Director director2 = new Director("Андрей", "Волков", Gender.MALE, 5);

        Person musicAutor = new Person("Петр", "Чайковский", Gender.MALE);
        Person choreographer = new Person("Юрий", "Иванов", Gender.MALE);

        Show show = new Show("Гамлет", 150, director1);
        Opera operaShow = new Opera("Евгений Онегин", 180, director2, musicAutor, "Либретто",24);
        Ballet balletShow = new Ballet("Лебединое озеро", 120, director1, musicAutor, "Либретто",choreographer);

        show.addActor(actor1);
        show.addActor(actor2);

        operaShow.addActor(actor2);
        operaShow.addActor(actor3);

        balletShow.addActor(actor1);
        balletShow.addActor(actor3);

        System.out.println("Список актеров");
        show.printActors();
        operaShow.printActors();
        balletShow.printActors();

        System.out.println("Замена актёра в спектакле");
        show.replaceActor("Петрова", actor3);
        show.printActors();

        System.out.println("Попытка замены несуществующего актёра");
        Actor unknownActor = new Actor("Неизвестный", "Актёр", Gender.MALE, 170);
        operaShow.replaceActor("Смирнов", unknownActor);
        operaShow.printActors();

        System.out.println("Информация о режиссёрах");
        show.printDirector();
        operaShow.printDirector();
        balletShow.printDirector();
    }
}
