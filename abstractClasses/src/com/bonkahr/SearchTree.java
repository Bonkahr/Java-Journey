package com.bonkahr;

public class SearchTree implements NodeList {
    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return null;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            //the tree was empty, so our item becomes the head of the tree
            this.root = newItem;
            return true;
        }
        //otherwise, start comparing from the head of the tree
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                //newItem is greater, move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    //there's no node to the right, so add at this point
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                //newItem is less, move left if possible
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    // there's no node to the left, so add at this point
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                //equal, so don't add
                System.out.println(newItem.getValue() + " is already there");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while (currentItem != null) {
            int comparison = (currentItem.compareTo(item));
            if (comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if (comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                //equal: we've found the item so remove it
                performRemoval(currentItem, parentItem);
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        //recursive method
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }

    private void performRemoval(ListItem item, ListItem parent) {
        //remove item from the tree
        if (item.next() == null){
            //no right tree, so make parent point to left tree (which may be null)
            if (parent.next() == item){
                //item is right child of the parent
                parent.setNext(item.previous());
            }
            else if (parent.previous() == item){
                //item is left child of its parent
                parent.setPrevious(item.previous());
            }else {
                //parent must be item, which means we are looking at the root of the tree
                this.root = item.previous();
            }
        }
        else if (item.previous() == null){
            //no left tree, so make parent point to right tree(which may be null)
            if (parent.next() == item){
                //item is right child of ots parent
                parent.setNext(item.next());
            }
            else if (parent.previous() == item){
                //item is right child of ts parent
                parent.setNext(item.next());
            }else {
                //neither left nor right are null, deletion is now a lot trickier
                //from the right sub-tree, find the smallest value
                ListItem current = item.next();
                ListItem leftMostParent = item;
                while (current.previous() != null){
                    leftMostParent = current;
                    current = current.previous();
                }
                //now put the smallest value into the node to be deleted
                item.setValue(current.getValue());
                //and delete the smallest
                if (leftMostParent == item){
                    //there was no leftmost node, so current point to be smallest node
                    item.setNext(current.next());
                }else {
                    //set the smallest node's parent to point the smallest node's right child
                    leftMostParent.setPrevious(current.next());
                }
            }
        }
    }
}
