public interface LinearList {
    public boolean isEmpty();
    public int size();
    public Object get(int index);
    public void set(int index,Object element);
    public boolean add(Object element);
    public boolean add(int index,Object element);
    public Object remove(int index);
    //清除线性表中元素的方法
    public void clear();

}
