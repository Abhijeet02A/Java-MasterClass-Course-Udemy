package Section9;

public interface NodeList {
    abstract ListItem getRoot();
    abstract boolean removeItem(ListItem item);
    abstract boolean addItem(ListItem item);
    abstract void traverse(ListItem root);

}
