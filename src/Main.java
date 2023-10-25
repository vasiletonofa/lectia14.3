import functional.Printable;

public class Main {
    public static void main(String[] args) {


        Printable printable = new Printable() { // clasa anonima
            @Override
            public void print(String data) {
                System.out.println(data);
                // clasa anonim
                    System.out.println(data);
                    System.out.println(data + 1);
                    System.out.println(data + 2);
            }
        };

        // clasa anonima
        Printable printable2 = data -> {
            System.out.println(data);
            System.out.println(data + 1);
            System.out.println(data + 2);
        };

        printable.print("Hello World");


        Printable printable1 = data -> System.out.println(data); // lambda -> Creez o clasa si fac override la metoda, Returnez obiect nou

        printable1.print("Hello from Functional Interface");







    }
}