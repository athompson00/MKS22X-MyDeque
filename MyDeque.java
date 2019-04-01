import java.util.*;

public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  @SuppressWarnings("unchecked")
  public static void main(String[] args){
    MyDeque<Integer> a = new MyDeque<Integer>(10);
    a.addFirst(1);
    System.out.println(a.toString());
  }

  @SuppressWarnings("unchecked")

  public MyDeque(){
    data = (E[])new Object[10];
    size = 0;
    start = 0;
    end = 0;
  }

  @SuppressWarnings("unchecked")
public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
}

public int size(){
  return size;
}
  public String toString(){
    String result = "{";
    if (size != 0){
      int startler = start;
      while (startler <= end){
        if (!data[startler].equals(null)){
          result += data[startler] + " ";
        }
        startler++;
      }
      while (startler != end + 1){
        if (!data[startler].equals(null)){
          result += data[startler] + " ";
        }
        if (startler == data.length - 1){
          startler = 0;
        } else {
          startler++;
        }
      }
    }
    return result + "}";
  }

  @SuppressWarnings("unchecked")
  public void expand(){
    E[] temp = (E[])new Object[data.length * 2 + 1];
    int a = start;
    for (int i = 0; i < data.length; i++){
      temp[i] = data[a];
      if (a == data.length - 1){
        a = 0;
      } else {
        a++;
      }
    }
    data = temp;
  }

  public void addFirst(E element){
    if (size == 0){
      data[start] = element;
      size++;
    } else {
      if (start == 0){
        start = data.length - 1;
      } else if (size == data.length){
        expand();
        start = data.length - 1;
        end = size - 1;
      } else {
        start--;
      }
      size++;
      data[start] = element;
    }
  }
  /*
  public void addLast(E element){

  }
  public E removeFirst(){

  }
  public E removeLast(){

  }
  public E getFirst(){

  }
  public E getLast(){

  }*/
}
