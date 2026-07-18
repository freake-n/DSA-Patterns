# Palindrome String

## Problem Statement

Given a string `s`, determine whether it is a palindrome.

A string is considered a **palindrome** if it reads the same forwards and backwards.

Return:

* `true` if the string is a palindrome.
* `false` otherwise.

---

## Examples

### Example 1

**Input**

```text
s = "abba"
```

**Output**

```text
true
```

**Explanation**

`"abba"` reads the same forwards and backwards.

---

### Example 2

**Input**

```text
s = "abc"
```

**Output**

```text
false
```

**Explanation**

`"abc"` does not read the same forwards and backwards.

---

## Constraints

* `1 ≤ s.length ≤ 10^6`
* The string `s` contains only lowercase English letters (`a-z`).

---

## Approach

Use two pointers (or recursion):

1. Compare the first and last characters.
2. If they are different, return `false`.
3. Move the pointers inward.
4. Continue until the pointers meet or cross.
5. If all corresponding characters match, return `true`.

---

## Complexity Analysis

* **Time Complexity:** `O(n)`
* **Space Complexity:**

  * `O(1)` for the iterative approach.
  * `O(n)` for the recursive approach (due to the recursion stack).

---

## Tags

`String` • `Recursion` • `Two Pointers` • `Palindrome`
