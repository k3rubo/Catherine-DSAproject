
// Method to insert a node at the beginning of the linked list
private void insertion_at_beginning(int item) throws Exception {   
// Creates a new node with the given item
Node node = create_new_node(item);
// Check if the list is empty
if (start == null) {
start = node;
start.next = null;
} else {
temp = start;
start = node;
start.next = temp;
}
size++;
}
// Method to insert a node at the end of the linked list
private void insertion_at_end(int item) throws Exception {
Node node = create_new_node(item);
temp = start;
while (temp.next != null) {
temp = temp.next;
}
temp.next = node; 
size++;
}

// Method to delete a node from a given position
public void deletion(int pos) throws Exception {
// Check if the position is restricted
if (pos < 0 || pos >= size) {
throw new Exception("Invalid Index");
}
// Check if the linked list is empty
if (size == 0) {
throw new Exception("Linked List is Empty");
}
// If deleting the first node
if (pos == 0) {
deletion_at_beginning();   
size--;
}
private void deletion_at_beginning() {
start = start.next;
}
