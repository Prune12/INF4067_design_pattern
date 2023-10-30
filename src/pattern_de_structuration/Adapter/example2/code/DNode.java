package pattern_de_structuration.Adapter.example2.code;

public class DNode {

	Object data;
    DNode prev;
    DNode next;

    public DNode(Object data) {
        this.data = data;
        this.prev = null;
        this.next = null;
}
}
