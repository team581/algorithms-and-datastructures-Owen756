package assignment;

public class App {

  public static int get(LinkedList list, int index) {
    var head = list.head; // 0(1)
    for(int i = 0; i < index; i++){ // 0(n)
      head = head.next;//0(1)
    }
    return head.data; // 0(1)
  }//0(n)final algorithimic complexity

  public static void set(LinkedList list, int index, int value) {
    var head = list.head; // 0(1)
    for(int i = 0; i < index; i++){//0(n)
      head = head.next;//0(1)
    } head.data = value;// 0(1)
  }//0(n)final algorithimic complexity

  public static void remove(LinkedList list, int index) {
    var head = list.head; //0(1)
    for(int i = 0; i < index; i++){//0(n)
      head = head.next;//0(1)
    } head.next = head.next.next;//0(1)
  }//0(n) final algorithimic complexity

  public static LinkedList reverse(LinkedList list) {
    LinkedList reversedList = new LinkedList();//0(1)
    LinkedList.Node head = list.head;//0(1)
    for (int i = 0; i < list.length(); i++){//0(n)
    reversedList.prepend(head.data);//0(1)
    head = head.next;//0(1)
    }
    return reversedList;
    }
    //0(n)final algorithimic complexity
  

  public static boolean isSortedAscending(LinkedList list) {
    for(int i = 0; i < list.length(); i++){//0(n)
      if(list.head.data > list.head.next.data){//0(n)
        return false;//0(1)
      }
      list.head = list.head.next;//0(1)
    }
    return true;//0(1)
  }
//0(n^2)final algorithimic complexity
  private App() {}
}
