package hashmap;

public class MyLinkedList<K> {
	public INode<K> head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public INode<K> search(K key) {
		INode<K> node = head;
		while (node != null && node.getNext() != null) {
			if (node.getKey().equals(key)) {
				return node;
			}
			node = node.getNext();
		}
		return null;
	}

	public void append(INode<K> myNode) {
		if (this.tail == null)
			this.tail = myNode;
		if (this.head == null) {
			this.head = myNode;
		} else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}

	@Override
	public String toString() {
		return "MyLinkedList [head=" + head + ", tail=" + tail + "]";
	}
}