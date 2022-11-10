package mediatheque;

public class BookPrinter implements ItemVisitor {

    @Override
    public void visit(Book b) {
        System.out.println("Livre: " + b.getTitle() + " écrit par " + b.getAuthor());
    }

    @Override
    public void visit(CD c) {
    }

}
