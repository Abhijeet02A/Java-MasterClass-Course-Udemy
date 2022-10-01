package Section9;

public class Node extends ListItem{
    public Node(Object argValue) {
        super(argValue);
    }

    @Override
    ListItem next() {
        return rightLink;
    }

    @Override
    ListItem setNext(ListItem argListItem) {
        rightLink = argListItem;
        return rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem argListItem) {
        this.leftLink = argListItem;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem argListItem) {
        if (argListItem != null) {
            return ((String) super.getValue()).compareTo((String) argListItem.getValue());
        } else {
            return -1;
        }
    }


}
