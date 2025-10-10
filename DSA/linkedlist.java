
class NumberBox {
    int number;           
    NumberBox nextBox;    // where next box is

    // Build box consisting number
    NumberBox(int number) {
        this.number = number;
        this.nextBox = null;  // no next box yet
    }
}

public class MyLinkedList {
    public static void main(String[] args) {
        
        NumberBox firstNode = new NumberBox(8);
        NumberBox secondNode = new NumberBox(15);
        NumberBox thirdNode = new NumberBox(100);

        firstNode.nextBox = second;
        secondNode.nextBox = third;

       
        NumberBox current = firstNode;
        while (current != null) {
            System.out.println("Box holds: " + current.number);
            current = current.nextBox;
        }
    }
}
