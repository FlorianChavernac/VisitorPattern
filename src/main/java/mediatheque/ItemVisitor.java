package mediatheque;

public interface ItemVisitor {
    void visit(Book b);
    void visit(CD c);
}
