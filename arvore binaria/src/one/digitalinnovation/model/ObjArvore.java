package one.digitalinnovation.model;

public abstract class ObjArvore<T> implements Comparable<T> {

    public abstract boolean equals(Object o);
    public abstract int hashCode();

    public abstract int compareTo(T outro);

    public abstract int compareTo(Obj outro);

    public abstract String toString();

}
