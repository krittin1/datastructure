package csku.datastructure;

/**
 * Created by 708 on 8/10/2018.
 */
public interface Collection {
    public void add(Object element);
    public void remove(Object element);
    public boolean isEmpty();
    public boolean contains(Object element);
    public int size();
}
