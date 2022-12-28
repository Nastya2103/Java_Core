public class HomeWork4_2 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "89990000000");
        phoneBook.add("Петров", "89999999999");
        phoneBook.add("Сидоров", "8999222222");
        phoneBook.add("Иванова", "85555555555");
        phoneBook.add("Петрова", "89999222244");
        phoneBook.add("Борисов", "89996622555");
        phoneBook.add("Андреев", "89998889991");
        phoneBook.add("Павлов", "89995555444");
        phoneBook.add("Алехин", "8555558888");
        phoneBook.add("Сидоров", "89992225557");
        phoneBook.add("Иванов", "85955555687");
        phoneBook.add("Петров", "89999999545");

        System.out.println(phoneBook.get("Иванов"));
        System.out.println(phoneBook.get("Сидоров"));
        System.out.println(phoneBook.get("Борисов"));
        System.out.println(phoneBook.get("Петрова"));
    }
}
