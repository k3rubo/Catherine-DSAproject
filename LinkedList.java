//Insert a node at the beginning//

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

//Insert a node at the end//

// Method to insert a node at the end of the linked list
private void insertion_at_end(int item) throws Exception {

// Creates a new node with the given item
Node node = create_new_node(item);

// Start traversal from the first node
temp = start;

 // Traverse to the last node
while (temp.next != null) {
temp = temp.next;
}

// Attach the new node to the last node
temp.next = node; 

// Increment of  the size of the list
size++;
}

//Delete a node from the beginning.//

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
// Helper method to delete the first node
private void deletion_at_beginning() {
start = start.next;
}
