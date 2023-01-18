public class Main {
    public static void main(String[] args) {

     Book b= new Book("me be for you",40.6,"dany");
      Movie m= new Movie("me be for you",400.9,"jamealh");
        System.out.println(b.getDiscount());
        System.out.println(m.getDiscount());
        MovablePoint mov= new MovablePoint(8,6,4,9);
        mov.moveUp();
        mov.moveDown();
        mov.moveLeft();
        mov.moveRight();

    }
}