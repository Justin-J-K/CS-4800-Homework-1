package inheritance;

public class EmployeeDriver {
    public static void main(String[] args) {
        SalariedEmployee joeJones = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        HourlyEmployee stephanieSmith = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee maryQuinn = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        CommissionEmployee nicoleDior = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000);
        SalariedEmployee renwaChanel = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        BaseEmployee mikeDavenport = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        CommissionEmployee mahnazVaziri = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000);

        System.out.println(joeJones);
        System.out.println(stephanieSmith);
        System.out.println(maryQuinn);
        System.out.println(nicoleDior);
        System.out.println(renwaChanel);
        System.out.println(mikeDavenport);
        System.out.println(mahnazVaziri);
    }
}
