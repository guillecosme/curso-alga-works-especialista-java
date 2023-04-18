import java.util.Scanner;

public class FolhaDePagamento {

    public static void main(String[] args) {


    System.out.println("### Folha de Pagamento ###");

    GetEmployeePaymentData();

    System.out.println("### Folha de Pagamento ###");
      
        
    }

    public static void GetEmployeePaymentData() {

        Scanner userInput =  new Scanner(System.in);

        System.out.print("Digite o nome do prestador de serviços: ");
        String employeeName  =  userInput.nextLine();

        System.out.printf("Digite o valor da hora do prestador %s: ", employeeName);
        double workHourValue = userInput.nextDouble();

        System.out.printf("Digite a quantidade de horas trabalhadas pelo prestador %s: ", employeeName);
        int workedHours = userInput.nextInt();

        
        System.out.printf("Digite a quantidade de descontos do prestador %s R$: ", employeeName);
        double discounts =  userInput.nextDouble();

        double grossTotal = (double) workedHours * workHourValue;
        double netTotal = grossTotal - discounts;

        System.out.printf("Folha de Pagamento: %s%n ", employeeName);
        System.out.printf("%d X R$ %.2f = R$%.2f%n", workedHours, workHourValue, grossTotal);
        System.out.printf("Descontos: R$%.2f%n", discounts);
        System.out.printf("Total Devido R$%.2f%n", netTotal);

    }
}