public class ChangingVariables {
    public static void main(String[] args)
    {
        double currentSalary = 62000.0;
        double percentIncrease = 1.1;

        System.out.println("Current salary: " + currentSalary);
        currentSalary = currentSalary * percentIncrease;
        currentSalary = currentSalary * percentIncrease;
        currentSalary = currentSalary * percentIncrease;
        currentSalary = currentSalary * percentIncrease;
        currentSalary = currentSalary * percentIncrease;
        System.out.println("Estimated salary in 5 years: " + currentSalary);

    }
}
