
public class Main {
    public static void main(String[] args) {
        int balance = 100;  //Начальный баланс клиента
        int payment = 1100; //Сумма пополнения
        int totalAmount;    //Итоговый баланс
        int gift;           //Количество бонусов для начисления

        if (payment > 1000){
            gift = payment / 100;
            totalAmount = balance + payment + gift;
            System.out.println("Ваш бонус составил: " + gift);
            System.out.println("Ваш баланс: " + totalAmount);
        } else {
            totalAmount = balance + payment;
            System.out.println("Ваш баланс: " + totalAmount);
        }
    }
}