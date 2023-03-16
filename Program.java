public class Program {
    
    public static void main(String[] args) {

        LinkedList<Employee> linkedList = new LinkedList<>();
        linkedList.addFirst(new Employee("Ivan", 20));
        linkedList.addFirst(new Employee("Igor", 39));
        linkedList.addFirst(new Employee("Anna", 28));
        linkedList.addFirst(new Employee("Alisa", 30));
        linkedList.revert();
    }
}

