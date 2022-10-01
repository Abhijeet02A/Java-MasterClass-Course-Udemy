package Section9;

public class MyLinkedList implements NodeList{
    private ListItem root = null;
    public MyLinkedList(ListItem argListItem) {
        this.root = argListItem;
    }

    public ListItem getRoot() {
        return root;
    }

    public boolean addItem(ListItem argListItem) {
        if (this.root == null) {
            this.root = argListItem;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = currentItem.compareTo(argListItem);
            if (comparison < 0) {
                 if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                 } else {
                    currentItem.setNext(argListItem).setPrevious(currentItem);
                    return true;
                 }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(argListItem).setPrevious(currentItem.previous());
                    argListItem.setNext(currentItem).setPrevious(argListItem);
                } else {
                    argListItem.setNext(this.root).setPrevious(argListItem);
                    this.root = argListItem;
                }
                return true;
            } else {
                System.out.println(argListItem.getValue() + " is already present, not added.");
                return false;
            }
        }
        return false;
    }

    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = this.root;
        while(currentItem != null) {
        int comparison = currentItem.compareTo(item);   
        if(comparison == 0) {
            if(currentItem == this.root) {
                this.root = currentItem.next();
            } else {
                currentItem.previous().setNext(currentItem.next());
                if (currentItem.next() != null) {
                    currentItem.next().setPrevious(currentItem.previous());
                }
            }
            return true;
        } else if (comparison < 0) {
            currentItem = currentItem .next();
        } else {
            return false;
        }
        
    }
    return false;
}

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while(root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
        
    }
}
