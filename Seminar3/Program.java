package Seminar3;

public class Program {
    public static void main(String[] args) {
        LinkedList<Employe> linkedList = new LinkedList<>();
        linkedList.addFirst(new Employe("FFFF", 34));
        linkedList.addFirst(new Employe("AAAAA", 45));
        linkedList.addFirst(new Employe("CCCCC", 44));
        linkedList.addFirst(new Employe("AAAAA", 22));
        linkedList.addFirst(new Employe("MMMMMM", 18));
        linkedList.addFirst(new Employe("AAAAA", 55));
        
        
        System.out.println();
        System.out.println(linkedList.print(SortDirect.Descending));
    }
}
