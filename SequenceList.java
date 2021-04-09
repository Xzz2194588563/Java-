public class SequenceList implements LinearList {
    private Object [] slist;
    private int size;

    public SequenceList() {
        this(3);
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    public SequenceList(int length) {
        if(length==0){
            this.slist=new Object[3];
        }
        this.slist=new Object[length];
    }
    @Override
    public boolean isEmpty()  {//判断线性表是否为空
        if(size==0){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public int size() {
        return size;
    }
    @Override
    public Object get(int index) {
        return (Object)slist[index];
    }
    @Override
    public Object remove(int index) {
        Object old = (Object)slist[index];
        //依次向后挪动
        for(int i=index;i<size+1;i++){
            slist[i]=slist[i+1];
        }
        //释放最后1个元素
        slist[--size]=null;
        return old;
    }
    @Override
    public void clear() {
        if(size!=0){
            for(int i=0;i<size;i++){
                slist[i]=null;
            }
            size=0;
        }
    }
    @Override
    public boolean add(Object element) {
        return add(size,element);
    }
    @Override
    public boolean add(int index, Object element) {
        return false;
    }
    @Override
    public void set(int index, Object element) {
        slist [index] = element;
    }

    public static void main(String[] args) {
        SequenceList s = new SequenceList();
        System.out.println( s.isEmpty());
    }
}
