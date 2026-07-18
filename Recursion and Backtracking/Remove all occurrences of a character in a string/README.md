# Remove All Occurrences of a Character in a String

## Problem Statement

Given a string `s` and a character `c`, remove **all occurrences** of `c` from the string.

Modify the string so that it no longer contains the specified character.

---

## Examples

### Example 1

**Input**

```text
s = "geeksforgeeks"
c = 'e'
```

**Output**

```text
"gksforgks"
```

**Explanation**

All occurrences of `'e'` are removed from the string.

---

### Example 2

**Input**

```text
s = "geeksforgeeks"
c = 'g'
```

**Output**

```text
"eeksforeeks"
```

**Explanation**

All occurrences of `'g'` are removed from the string.

---

## Constraints

* `1 ≤ |s| ≤ 10^5`

---

## Approach

Use recursion to traverse the string one character at a time.

1. Start from the beginning (or end) of the string.
2. If the current character matches `c`, remove it.
3. Continue recursively until all characters have been processed.
4. The resulting string contains no occurrences of `c`.

---

## Complexity Analysis

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(n)` (due to the recursion stack)

> **Note:** When using `StringBuilder`, character deletion is performed in place.

---

## Tags

`String` • `Recursion` • `StringBuilder`
