public class Competition {
    public static void main(String[] args) {
        Teammait[] teammaits = new Teammait[4];
        teammaits[0] = new Teammait("Владимир", 800);
        teammaits[1] = new Teammait("Дмитрий", 700);
        teammaits[2] = new Teammait("Александр", 900);
        teammaits[3] = new Teammait("Кирилл", 600);

        Team team = new Team("Олимпийцы", teammaits);

        Course course = new Course(100, 400, 300);

        String result = course.doIt(team);
        System.out.println(result);
    }
}
