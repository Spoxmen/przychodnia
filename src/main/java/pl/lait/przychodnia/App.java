package pl.lait.przychodnia;

/**
 * Hello world!
 *
 */
public class App 
{
	    public static void main( String[] args )
    {
        System.out.println( "Witaj w programie przychodnia\n" 
        		+ "Zatrudniłeś właśnie pielęgniarkę Rysię\n");
        Nurse rysia = new Nurse("Rysia", "Rysiewska", "undefined", 2000, 0);
        System.out.println("Pielęgniarka Rysia zarabia: " + rysia.salary);
        System.out.println("Nasza Rysia pracuje bardzo ciężko i już \n"
        		+ "w pierwszym miesiącu pracy wyrobiła 40 godzin extra");
        rysia.setOvertime(40);
        System.out.println("Do pracy przychodzi doktor Lublicz");
        Doc kanalia = new Doc("Janusz", "Lublicz", "male", 5000, 0);
        System.out.println("Popił z ordynatorem i premia");
        kanalia.setBonus(3000);
        
        System.out.println("Zarabia teraz w sumie: "
        		+ (kanalia.salary+kanalia.getBonus()));
        int rysiasalary;
        rysiasalary = rysia.salary + ((rysia.salary/168)*rysia.overtime);
        System.out.println("Rysia, po uwzględnieniu nadgodzin, "
        		+ "dostanie: " + rysiasalary);

    }
}
