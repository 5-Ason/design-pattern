import iterator.Collection;
import iterator.Iterator;
import iterator.MyCollection;

/**
 * Created by Ason on 2017/10/10.
 */
public class Client {
    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator it = collection.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
