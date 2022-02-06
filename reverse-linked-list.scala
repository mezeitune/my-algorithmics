/** Given pointer to the head node of a linked list, the task is to reverse the
  * linked list. We need to reverse the list by changing the links between
  * nodes.
  *
  * Input: Head of following linked list 1->2->3->4->NULL Output: Linked list
  * should be changed to, 4->3->2->1->NULL
  *
  * Input: Head of following linked list 1->2->3->4->5->NULL Output: Linked list
  * should be changed to, 5->4->3->2->1->NULL
  *
  * Input: NULL Output: NULL
  *
  * Input: 1->NULL Output: 1->NULL
  */
object ReverseLinkedList extends App {

  case class Node(value: Int, next: Node)

  lazy val head = Node(1, node2)
  lazy val node2 = Node(2, node3)
  lazy val node3 = Node(3, last)
  lazy val last = Node(4, null)

  def reverse(head: Node): List[Node] = {
    val l = reverse(null, head, List.empty[Node])

    l.foreach(a => println(a.value))

    l

  }

  def reverse(previous: Node, current: Node, list: List[Node]): List[Node] = {
    if (current.next != null) {
      val aux = current.copy(next = previous)
      reverse(aux, current.next, aux +: list)
    } else {
      val aux = current.copy(next = previous)
      aux +: list
    }
  }

  reverse(head)
}
