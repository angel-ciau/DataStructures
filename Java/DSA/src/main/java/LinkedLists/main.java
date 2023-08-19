package LinkedLists;

public class main {
    public static void main(String[] args) {
        LinkedList newLinkedList = new LinkedList(1);

//    newLinkedList.getLength();
//    newLinkedList.getHead();
//    newLinkedList.getTail();
        //newLinkedList.appendNode(2);
        newLinkedList.appendNode(2);
        System.out.println("Original");
        newLinkedList.printList();
        System.out.println("One less");
        newLinkedList.removeLast();
        newLinkedList.printList();
        System.out.println("Two less");
        newLinkedList.removeLast();
        newLinkedList.printList();

    }
}

