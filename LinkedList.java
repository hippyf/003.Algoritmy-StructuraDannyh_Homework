public class LinkedList<T> {

    public class Node {

        public T value;
        public Node next;

    }

    public Node head;

    public Node getHead() {
        return head;
    }

    public void addFirst(T value) {
        Node node = new Node();
        node.value = value;
        if (head != null) {
            node.next = head;
        }
        head = node;
    }


    /**
     *  Перегруженный метод разворота односвязноо списка
     */

    public void revert() {
        if (head != null && head.next != null) {
            revert(head.next, head);
        }
    }

    /**
     *  Метод разворота односвязного списка 
     * @param currentNode текущий Node
     * @param previousNode предыдущий Node
     */
    private void revert(Node currentNode, Node previousNode) {
        if(currentNode.next == null) head = currentNode;
        else {
            revert(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
        previousNode.next = null;
    }

}


