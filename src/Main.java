public class Main
{
    public static void main(String[] args)
    {
     double fallCost = 200.80;
     double springCost = 185.00;
     double winterCost = 283.00;
     double summerCost = 99.50;
     double totalCost = 0;

     totalCost = fallCost + springCost + winterCost + summerCost;

        System.out.println("The maintenance cost for the Fall is $" + fallCost + ".");
        System.out.println("The maintenance cost for the Spring is $" + springCost + ".");
        System.out.println("The maintenance cost for the Winter is $" + winterCost + ".");
        System.out.println("The maintenance cost for the Summer is $" + summerCost + ".");
        System.out.println("The total maintenance cost for the year is $" + totalCost + ".");

    }
}