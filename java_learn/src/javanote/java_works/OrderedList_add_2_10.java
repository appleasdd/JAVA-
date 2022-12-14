package javanote.java_works;
import java.util.*;//導入函式
interface Comparable<E>{//建立interface comparable 並設定為泛型<E>
    int compareTo(E obj);//設定變數
}
class OrderedList<E extends Comparable<E>> implements Iterable<E>{//建立class為OrderedList並限制只能用Comparable<E>且實作介面
private LinkedList<E> theList = new LinkedList<E>();//建立物件theList
    void add( E obj){//建立方式add
        ListIterator<E> iter = theList.listIterator();//建立物件iter
            while(iter.hasPrevious() ){//由後往前去做判斷
                if(obj.compareTo(iter.previous()) >= 0){//如果此物件大於等於前面的物件就插入
                iter.next();//下一個節點
                iter.add(obj);//增加節點
                return;//回傳
        }
    }
    iter.add(obj);//增加節點
}
public E get (int index){//建立方式get
    return theList.get(index);//回傳獲得節點的位置
}
public Iterator<E> iterator(){//建立方式iterator
    return theList.iterator();//回傳theList
}
}
public class OrderedList_add_2_10 {//建立類別為OrderedList
    public static void main(String[] args){//建立方式main
    }
}
