# Kotlin Mutable Collection removeIf Unexpected Behavior

This repository demonstrates a potential issue when using the `removeIf` function with iterators on mutable collections in Kotlin.  Modifying the collection during iteration using `removeIf` can lead to unexpected results due to the iterator's internal state becoming invalid.

The `bug.kt` file showcases the problem, while `bugSolution.kt` provides a solution to avoid this unexpected behavior.

## How to Reproduce

1. Clone the repository.
2. Open `bug.kt`.
3. Run the code. You'll observe that elements are not removed as expected, illustrating the unpredictable nature of modifying collections during iteration with `removeIf`.

## Solution

The `bugSolution.kt` file offers a safe alternative by creating a copy of the collection before performing the removal operation, thereby avoiding issues caused by invalid iterator states.

## Lessons Learned

* Avoid modifying a mutable collection while iterating over it using an iterator.
* If you need to remove elements based on a condition, consider using `filter` to create a new collection containing only the elements that satisfy the condition, or use an iterator's `remove()` method directly within the iteration loop to ensure predictable behaviour.