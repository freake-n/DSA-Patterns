# Check Sorted Array

## Problem Statement

Given an integer array `arr[]`, determine whether it is sorted in **non-decreasing order**.

Return:

* `true` if the array is sorted.
* `false` otherwise.

An array is considered **sorted in non-decreasing order** if every element is greater than or equal to the previous element.

---

## Examples

### Example 1

**Input**

```text
arr = [10, 20, 30, 40, 50]
```

**Output**

```text
true
```

**Explanation**

Every element is greater than or equal to the previous element, so the array is sorted.

---

### Example 2

**Input**

```text
arr = [90, 80, 100, 70, 40, 30]
```

**Output**

```text
false
```

**Explanation**

Since `80 < 90`, the array is not sorted in non-decreasing order.

---

## Constraints

* `1 ≤ arr.length ≤ 10^6`
* `-10^9 ≤ arr[i] ≤ 10^9`

---

## Approach

Use recursion (or iteration) to compare adjacent elements:

1. Start from the second element (`index = 1`).
2. Compare the current element with the previous one.
3. If the current element is smaller, return `false`.
4. Otherwise, recursively check the next index.
5. If all adjacent pairs satisfy the condition, return `true`.

---

## Complexity Analysis

* **Time Complexity:** `O(n)`
* **Space Complexity:**

  * `O(1)` for the iterative approach.
  * `O(n)` for the recursive approach (due to the recursion stack).

---

## Tags

`Array` • `Recursion` • `Traversal`
