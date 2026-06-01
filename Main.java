public class Main {
    public static void main(String[] args) {

        int[] id = {1, 2, 3, 4, 5, 6};
        String[] name = {"Mariam", "Sara", "Ali", "Laila", "Omar", "Hassan"};
        int[] age = {20, 19, 21, 18, 22, 21};
        String[] department = {
            "Computer Science", "Computer Science",
            "IT", "IT",
            "Engineering", "Engineering"
        };

        System.out.println("=== Student List ===");

        for (int i = 0; i < id.length; i++) {
            System.out.println(
                "ID: " + id[i] +
                " | Name: " + name[i] +
                " | Age: " + age[i] +
                " | Department: " + department[i]
            );
        }
    }
}
