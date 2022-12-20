public class Course {
    String result;
    private int swim;
    private int run;
    private int shooting;

    public Course(int swim, int run, int shooting) {
        this.swim = swim;
        this.run = run;
        this.shooting = shooting;
    }

    public String doIt(Team team) {
        result = "Команда: " + team.getName() + "." + '\n';
        for (Teammait teammait: team.getTeammaits()) {
            result += "Участник команды: " + teammait.getName() + "." + '\n';
            int value = teammait.getDistance();
            actionSwim(value);
            actionRun(value);
            actionShooting(value);
        }
        return result;
    }

    private void actionShooting(int value) {
        if (value>=(swim + run + shooting)) result += "Препятствие 'Стрельба' - участник преодолел." + '\n';
        else result += "Препятствие 'Стрельба' - участник устал после плавания и бега, и не смог преодолеть." + '\n';
    }

    private void actionRun(int value) {
        if (value>=(swim + run)) result += "Препятствие 'Бег' - участник преодолел." + '\n';
        else result += "Препятствие 'Бег' - участник устал после плавания и не смог преодолеть." + '\n';

    }

    private void actionSwim(int value) {
        if (value>=swim) result += "Препятствие 'Плавание' - участник преодолел." + '\n';
        else result += "Препятствие 'Плавание' - участник не смог преодолеть." + '\n';

    }
}
