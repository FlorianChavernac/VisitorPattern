package mediatheque;

public class CDPrinter implements ItemVisitor {

    @Override
    public void visit(Book b) {
    }

    @Override
    public void visit(CD c) {
        System.out.println("CD: " + c.getTitle() + " avec " + c.getNumberOfTracks() + " titres");
    }

}
