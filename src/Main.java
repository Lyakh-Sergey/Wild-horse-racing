public class Main {
    private static TeamMember[] teamMembers = new TeamMember[38];

    public static void main(String[] args) {
        teamMembers[0] = new TeamMember("Григорьев Станислав", "1", "неизвестно", "неизвестно", 0);
        teamMembers[1] = new TeamMember("Ликунов Артем", "1", "неизвестно", "неизвестно", 0);
        teamMembers[2] = new TeamMember("Севостьянов Павел", "1", "неизвестно", "неизвестно", 0);
        teamMembers[3] = new TeamMember("Тетерин Александр", "1", "неизвестно", "неизвестно", 0);
        teamMembers[4] = new TeamMember("Хакимов Тимур", "1", "неизвестно", "неизвестно", 0);
        teamMembers[5] = new TeamMember("Басанов Сергей", "1", "неизвестно", "неизвестно", 0);
        teamMembers[6] = new TeamMember("Безверхний Андрей", "1", "неизвестно", "неизвестно", 0);
        teamMembers[7] = new TeamMember("Батманов Марк", "1", "неизвестно", "неизвестно", 0);
        teamMembers[8] = new TeamMember("Золотарева Оксана", "1", "неизвестно", "неизвестно", 0);
        teamMembers[9] = new TeamMember("Берестов Валерий", "2", "неизвестно", "неизвестно", 0);
        teamMembers[10] = new TeamMember("Болгарин Борис", "2", "неизвестно", "неизвестно", 0);
        teamMembers[11] = new TeamMember("Волошин Андрей", "2", "неизвестно", "неизвестно", 0);
        teamMembers[12] = new TeamMember("Долгополова Анастасия", "2", "неизвестно", "неизвестно", 0);
        teamMembers[13] = new TeamMember("Дубов Дмитрий", "2", "неизвестно", "неизвестно", 0);
        teamMembers[14] = new TeamMember("Едыгов Руслан", "2", "неизвестно", "неизвестно", 0);
        teamMembers[15] = new TeamMember("Драгунова Наталья", "2", "неизвестно", "неизвестно", 0);
        teamMembers[16] = new TeamMember("Задорожный Максим", "2", "неизвестно", "неизвестно", 0);
        teamMembers[17] = new TeamMember("Катушенко Артем", "2", "неизвестно", "неизвестно", 0);
        teamMembers[18] = new TeamMember("Киреев Алексей", "Кодеры будущего", "неизвестно", "неизвестно", 4);
        teamMembers[19] = new TeamMember("Лях Сергей", "Кодеры будущего", "Радикально изменить жизнь, познать новое", "Кто хочет делать-ищет способ, кто не хочет-ищет причину", 3);
        teamMembers[20] = new TeamMember("Маратовна Забейда", "Кодеры будущего", "Цель- получить новую профессию, задача - закончить курс", " Самая большая инвестиция - это инвестиция в собственное образование", 5);
        teamMembers[21] = new TeamMember("Медведев Денис", "Кодеры будущего", "неизвестно", "неизвестно", 0);
        teamMembers[22] = new TeamMember("Шитов Юрий", "Кодеры будущего", "неизвестно", "неизвестно", 0);
        teamMembers[23] = new TeamMember("Михеев Иван", "Кодеры будущего", "неизвестно", "неизвестно", 0);
        teamMembers[24] = new TeamMember("Мищенко Андрей", "Кодеры будущего", "неизвестно", "неизвестно", 0);
        teamMembers[25] = new TeamMember("Нагорный Максим", "Кодеры будущего", "неизвестно", "неизвестно", 5);
        teamMembers[26] = new TeamMember("Попов Борис", "Кодеры будущего", "неизвестно", "неизвестно", 0);
        teamMembers[27] = new TeamMember("Потапов Евгений", "Кодеры будущего", "неизвестно", "неизвестно", 0);
        teamMembers[28] = new TeamMember("Саляхов Фарит", "4", "неизвестно", "неизвестно", 0);
        teamMembers[29] = new TeamMember("Смирнова Виктория", "4", "неизвестно", "неизвестно", 0);
        teamMembers[30] = new TeamMember("Хузин Ранис", "4", "неизвестно", "неизвестно", 0);
        teamMembers[31] = new TeamMember("Цупко Максим", "4", "неизвестно", "неизвестно", 0);
        teamMembers[32] = new TeamMember("Черкасов Денис", "4", "неизвестно", "неизвестно", 0);
        teamMembers[33] = new TeamMember("Шахова Яна", "4", "неизвестно", "неизвестно", 0);
        teamMembers[34] = new TeamMember("Грико Сергей", "4", "неизвестно", "неизвестно", 0);
        teamMembers[35] = new TeamMember("Кулага Сергей", "4", "неизвестно", "неизвестно", 0);
        teamMembers[36] = new TeamMember("Муругов Кирилл", "4", "неивзестно", "неизвестно", 0);
        teamMembers[37] = new TeamMember("Оников Данзан", "4", "неизвестно", "неизвестно", 0);
        System.out.println("Участники конкурса: ");
        printAllTeamMember();
        System.out.println();
        TeamMember teamMemberWithMinLearningOutcomes = findTeamMemberWithMinLearningOutcomes();
        System.out.println("Участник с минимальным результатом обучения: " + teamMemberWithMinLearningOutcomes.getLearningOutcomes() + " - " + teamMemberWithMinLearningOutcomes.getFullName());
        System.out.println();
        TeamMember teamMemberWithMaxLearningOutcomes = findTeamMemberWithMaxLearningOutcomes();
        System.out.println("Участник с минимальным результатом обучения: " + teamMemberWithMaxLearningOutcomes.getLearningOutcomes() + " - " + teamMemberWithMaxLearningOutcomes.getFullName());
        System.out.println();
        System.out.println("Средние результаты обучения участников: " + calculateAverageLearningOutcomes());
        System.out.println();
        String teamName = "Кодеры будущего";
        System.out.println("Участники команды " + teamName + ":");
        printAllTeamMembersInTeam(teamName);
        System.out.println();
        TeamMember teamMemberWithMinLearningOutcomesInTeam = findTeamMemberWithMinLearningOutcomesInTeam(teamName);
        System.out.println("Участник команды: " + teamName + " с минимальным результатом обучения: " + teamMemberWithMinLearningOutcomesInTeam.getLearningOutcomes() + " - " + teamMemberWithMinLearningOutcomesInTeam.getFullName());
        System.out.println();
        TeamMember teamMemberWithMaxLearningOutcomesInTeam = findTeamMemberWithMaxLearningOutcomesInTeam(teamName);
        System.out.println("Участник команды: " + teamName + " с максимальным результатом обучения: " + teamMemberWithMaxLearningOutcomesInTeam.getLearningOutcomes() + " - " + teamMemberWithMaxLearningOutcomesInTeam.getFullName());
        System.out.println();
        System.out.println("Средние результаты обучения участников команды " + teamName + ": " + calculateAverageLearningOutcomesInTeam(teamName));
        System.out.println();
        int number = 4;
        System.out.println("Участники с результатом обучения менее: " + number);
        findAndPrintAllTeamMembersWithLearningOutcomesBelowTheNumber(number);
        System.out.println("Участники с результатом обучения больше или равно: " + number);
        findAndPrintAllTeamMembersWithLearningOutcomesAboveTheNumber(number);


    }


    private static void printAllTeamMember() {
        for (TeamMember teamMember : teamMembers) {
            System.out.println(teamMember);
        }
    }

    public static TeamMember findTeamMemberWithMinLearningOutcomes() {
        TeamMember teamMemberWithMinLearningOutcomes = null;
        for (TeamMember teamMember : teamMembers) {
            if (teamMember != null && (teamMemberWithMinLearningOutcomes == null || teamMember.getLearningOutcomes() < teamMemberWithMinLearningOutcomes.getLearningOutcomes())) {
                teamMemberWithMinLearningOutcomes = teamMember;
            }
        }
        return teamMemberWithMinLearningOutcomes;
    }

    public static TeamMember findTeamMemberWithMaxLearningOutcomes() {
        TeamMember teamMemberWithMaxLearningOutcomes = null;
        for (TeamMember teamMember : teamMembers) {
            if (teamMember != null && (teamMemberWithMaxLearningOutcomes == null || teamMember.getLearningOutcomes() > teamMemberWithMaxLearningOutcomes.getLearningOutcomes())) {
                teamMemberWithMaxLearningOutcomes = teamMember;
            }
        }
        return teamMemberWithMaxLearningOutcomes;
    }

    public static double calculateSumLearningOutcomes() {
        double sum = 0;
        for (TeamMember teamMember : teamMembers) {
            if (teamMember != null) {
                sum += teamMember.getLearningOutcomes();
            }
        }
        return sum;
    }

    public static double calculateAverageLearningOutcomes() {
        return Math.round((calculateSumLearningOutcomes() / teamMembers.length) * 100.0) / 100.0;
    }

    public static TeamMember findTeamMemberWithMinLearningOutcomesInTeam(String teamName) {
        TeamMember teamMemberWithMinLearningOutcomesInTeam = null;
        for (TeamMember teamMember : teamMembers) {
            if (teamMember != null && (teamName.equals(teamMember.getTeam()) && (teamMemberWithMinLearningOutcomesInTeam == null || teamMember.getLearningOutcomes() < teamMemberWithMinLearningOutcomesInTeam.getLearningOutcomes()))) {
                teamMemberWithMinLearningOutcomesInTeam = teamMember;
            }
        }
        return teamMemberWithMinLearningOutcomesInTeam;
    }

    public static TeamMember findTeamMemberWithMaxLearningOutcomesInTeam(String teamName) {
        TeamMember teamMemberWithMaxLearningOutcomesInTeam = null;
        for (TeamMember teamMember : teamMembers) {
            if (teamMember != null && (teamName.equals(teamMember.getTeam()) && (teamMemberWithMaxLearningOutcomesInTeam == null || teamMember.getLearningOutcomes() > teamMemberWithMaxLearningOutcomesInTeam.getLearningOutcomes()))) {
                teamMemberWithMaxLearningOutcomesInTeam = teamMember;
            }
        }
        return teamMemberWithMaxLearningOutcomesInTeam;
    }

    public static void printAllTeamMembersInTeam(String teamName) {
        for (TeamMember teamMember : teamMembers) {
            if (teamMember != null && teamName.equals(teamMember.getTeam())) {
                System.out.println("ФИО: " + teamMember.getFullName() + ", Цели и задачи: " + teamMember.getGoalsAndObjectives() + ", Любимая цитата: " + teamMember.getFavoriteQuote() + ", Результаты обучения: " + teamMember.getLearningOutcomes());
            }
        }
    }

    public static double calculateSumLearningOutcomesInTeam(String teamName) {
        double sumInTeam = 0.0;
        for (TeamMember teamMember : teamMembers) {
            if (teamMember != null && teamName.equals(teamMember.getTeam())) {
                sumInTeam += teamMember.getLearningOutcomes();
            }
        }
        return sumInTeam;
    }

    public static double calculateAverageLearningOutcomesInTeam(String teamName) {
        int teamMembersInTeam = 0;
        for (TeamMember teamMember : teamMembers) {
            if (teamMember != null && teamName.equals(teamMember.getTeam())) {
                teamMembersInTeam++;
            }
        }
        return Math.round((calculateSumLearningOutcomesInTeam(teamName) / teamMembersInTeam) * 100.0) / 100.0;
    }

    public static void findAndPrintAllTeamMembersWithLearningOutcomesBelowTheNumber(int number) {
        for (TeamMember teamMember : teamMembers) {
            if (teamMember != null && teamMember.getLearningOutcomes() < number) {
                System.out.println(teamMember.getId() + ". ФИО: " + teamMember.getFullName() + ", команда: " + teamMember.getTeam() + " , результаты обучения: " + teamMember.getLearningOutcomes());
            }
        }
    }

    public static void findAndPrintAllTeamMembersWithLearningOutcomesAboveTheNumber(int number) {
        for (TeamMember teamMember : teamMembers) {
            if (teamMember != null && teamMember.getLearningOutcomes() >= number) {
                System.out.println(teamMember.getId() + ". ФИО: " + teamMember.getFullName() + ", команда: " + teamMember.getTeam() + " , результаты обучения: " + teamMember.getLearningOutcomes());
            }
        }
    }
}