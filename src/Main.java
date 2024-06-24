import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.insert(101);
        linkedList.insert(24);
        linkedList.insert(3089);
        linkedList.fileReadIntegers("C:\\Users\\Paul\\IdeaProjects\\DSA Critical Thinking 6.2\\my integer list.txt");
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}

