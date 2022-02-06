public class Main {
    public static void main (String[] args){

     // входные данные
        int ticketPrice = 500; //Стоимость билета
        int priceMiles = 20; // Стоимость одной мили

        int miles = ticketPrice / priceMiles;
        System.out.println("Вам доступно: " + miles);
    }
}
