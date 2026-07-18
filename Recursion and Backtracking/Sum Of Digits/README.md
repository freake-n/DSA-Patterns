# Sum of Digits

## Problem Statement

Given a positive integer `n`, find the sum of all its digits.

Return the sum of the digits of `n`.

---

## Examples

### Example 1

**Input**

```text
n = 687
```

**Output**

```text
21
```

**Explanation**

The digits of `687` are `6`, `8`, and `7`.

```text
6 + 8 + 7 = 21
```

---

### Example 2

**Input**

```text
n = 12
```

**Output**

```text
3
```

**Explanation**

The digits of `12` are `1` and `2`.

```text
1 + 2 = 3
```

---

## Constraints

* `1 ≤ n ≤ 10^5`

---

## Approach

Use recursion (or iteration) to process one digit at a time:

1. Extract the last digit using `n % 10`.
2. Add it to the sum.
3. Remove the last digit using `n / 10`.
4. Repeat until `n` becomes `0`.
5. Return the accumulated sum.

---

## Complexity Analysis

* **Time Complexity:** `O(d)`, where `d` is the number of digits in `n`.
* **Space Complexity:**

  * `O(1)` for the iterative approach.
  * `O(d)` for the recursive approach due to the recursion stack.

---

## Tags

`Math` • `Recursion` • `Digits`
