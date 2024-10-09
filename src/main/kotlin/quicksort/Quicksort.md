# Quick sort algorithm
Quick Sort is a popular divide-and-conquer sorting algorithm that efficiently sorts elements by selecting
a "pivot" and partitioning the array into two subarrays based on the pivot's value.
The process is recursively applied to the subarrays.

## Divide-and-conquer algorithm
A divide-and-conquer algorithm is an algorithmic paradigm that solves complex problems by breaking them 
down into smaller, easier-to-solve subproblems. The basic principle consists of three steps:

#### Divide:
The original problem is divided into several subproblems, which typically have similar properties to 
the original problem but are smaller.

#### Conquer:
These subproblems are then solved recursively. In many cases, the subproblems are small enough to
be solved directly without further decomposition.

#### Combine:
Finally, the solutions to the subproblems are combined to form a complete solution to the original problem.

## Recursion
Recursion is a concept in computer science and mathematics where a function calls itself to solve a task.
The idea behind recursion is to break down a complex problem into smaller, similar problems until a trivial
solution is reached.

Every recursive function essentially has two main components:

#### Base case:
The condition where the recursion stops. Without this, the function would run indefinitely.

#### Recursive case: 
The part of the function where it calls itself with modified parameters to break the problem into smaller parts.

## Workflow
### 1. Choose a pivot element
   The pivot can be any element from the array: the first, last, middle, or a random element.
   The choice of pivot affects the performance but not the correctness of the algorithm.
### 2. Partition the array
   Rearrange the array so that:
   Elements less than the pivot are on the left side.
   Elements greater than the pivot are on the right side.
   The pivot is now in its correct position in the sorted array.
### 3. Recursively apply quick sort
   Apply the quick sort algorithm recursively to the left and right subarrays 
   (elements before and after the pivot).
### 4. Base case
   The recursion stops when the subarray has zero or one element, which is already sorted.

## Time complexity
### Best and average case (O(n log n)):
The array is efficiently divided into two roughly equal halves each time, so the overall time 
complexity is O(n log n).

### Worst case (O(n²)):
If the pivot chosen is always the smallest or largest element (e.g., in already sorted arrays),
the partitioning will be highly unbalanced, leading to O(n²) complexity.

## Optimizations
The standard algorithm can be optimized with `randomized pivot selection` or `in-place partitioning`

`randomized pivot selection` means instead of selecting always a fixed element (like the last element) 
as the pivot, randomly select an index from the current sub-array.
`In-place partitioning` means rearranging the elements of the array without using extra space for another array.