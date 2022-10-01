package Section9;

public abstract class ListItem {
    protected ListItem leftLink;
    protected ListItem rightLink;
    protected Object value;

    public ListItem(Object argValue) {
        this.value = argValue;
    }
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem argListItem);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem argListItem);
    abstract int compareTo(ListItem argListItem);


}
