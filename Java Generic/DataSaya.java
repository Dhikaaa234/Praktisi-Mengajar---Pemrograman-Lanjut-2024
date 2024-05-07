public class DataSaya <T> {
    private T dataFirst;

    public DataSaya(T dataFirst) {
        this.dataFirst = dataFirst;
    }

    public T getFirst() {
        return dataFirst;
    }
    
    public void setFirst(T dataFirst) {
    this.dataFirst = dataFirst;
    }
}
