package assignment;

public class App {

  public static int get(LinkedList list, int index) {
    var head = list.head; // 0(1)
    for (int i = 0; i < index; i++) { // 0(n)
      head = head.next; // 0(1)
    }
    return head.data; // 0(1)
  } // 0(n)

  public static void set(LinkedList list, int index, int value) {
    var head = list.head; // 0(1)
    for (int i = 0; i < index; i++) { // 0(n)
      head = head.next; // 0(1)
    }
    head.data = value; // 0(1)
  } // 0(n)

  public static void remove(LinkedList list, int index) {
    var head = list.head; // 0(1)
    for (int i = 0; i < index; i++) { // 0(n)
      head = head.next; // 0(1)
    }
    head.next = head.next.next; // 0(1)
  } // 0(n)

  public static LinkedList reverse(LinkedList list) {
    LinkedList.Node prev = null; // 0(1)
    var head = list.head; // 0(1)
    var next = list.head.next; // 0(1)

    while (head != null) { // 0(n)
      next = head.next; // O(1)
      head.next = prev; // O(1)
      prev = head; // O(1)
      head = next; // 0(1)
    }
    list.head = prev; // 0(1)
    return list; // 0(1)
  } // 0(n)

  public static boolean isSortedAscending(LinkedList list) {
    for (int i = 0; i < list.length(); i++) { // 0(n)
      if (list.head.data > list.head.next.data) { // 0(n)
        return false; // 0(1)
      }
      list.head = list.head.next; // 0(1)
    }
    return true; // 0(1)
  }

  // 0(n^2)
  private App() {}
}
