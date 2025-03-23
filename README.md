
Question 1 (i). Worst-case scenario - This is to ensure performance is guaranteed. Example: In the linear search, the worst case is 0(n) when the target is at the end of the list.

(ii). Iterative Loops - A single loop iterating n times is O(n). Example: Nested loops multiply complexities depending on the number of iterations : O(n×n)→O(n2

(iii). Ignore Constants - This is because coefficients and lower end terms are irrelevant for large input sizes due to The growth rate of the function remains the same regardless of the coefficient. Example: O(2n)→O(n) because the constant 2 does not significantly affect growth rate.

(iv). Consecutive Operations Add - If operations run sequentially, add their complexities, then simplify. Example: O(n)+O(n^2)→ simplified to :O(n^2), (since n^2 dominates)

(v). Focus on the Dominant Term - Only the term with the highest growth rate matters since the larger values of n, lower-order terms become minimal. Example : O(n^2+n)→O(n^2).


Question 2: Memory allocation: Arrays - Memory is allocated at compile time(static) and it has a contiguous block of memory Linked lists - Memory is allocated dynaamically as nodes are added and it has anon-contiguous memory allocation

Performance: Arrays - Fast access to elements by index is required directly 0(1) Linked lists - Slow access to elements by index is 0(n) since transversal is needed

Insertion and deletion operations: Arrays - Insertions and deletions are infrequent and at the end Linked lists - Insertions and deletions are needed at the beginning or middle
