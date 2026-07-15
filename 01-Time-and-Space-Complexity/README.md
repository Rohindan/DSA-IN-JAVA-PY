# ⏱️ Time and Space Complexity

## 1. What is Algorithm Complexity?

Algorithm complexity tells us how efficient an algorithm is as the input size increases.

We mainly measure:

1. **Time Complexity** — How the number of operations grows as input size increases.
2. **Space Complexity** — How much extra memory an algorithm uses as input size increases.

The input size is usually represented by **`n`**.

---

# ⏳ Time Complexity

## 2. What is Time Complexity?

Time Complexity tells us how the number of operations performed by an algorithm grows as the input size `n` increases.

We do not usually measure actual execution time in seconds because it depends on hardware, programming language, compiler, and system performance.

Instead, we analyze how the **number of operations grows**.

---

## 3. Big O Notation

**Big O notation** represents how the time or space required by an algorithm grows as the input size becomes very large.

### Common Time Complexities

| Complexity   | Name         | Example                 |
| ------------ | ------------ | ----------------------- |
| `O(1)`       | Constant     | Array access            |
| `O(log n)`   | Logarithmic  | Binary Search           |
| `O(n)`       | Linear       | Array traversal         |
| `O(n log n)` | Linearithmic | Merge Sort              |
| `O(n²)`      | Quadratic    | Two nested loops        |
| `O(n³)`      | Cubic        | Three nested loops      |
| `O(2ⁿ)`      | Exponential  | Recursive problems      |
| `O(n!)`      | Factorial    | Generating permutations |

### Order of Complexity

```text
O(1) < O(log n) < O(n) < O(n log n) < O(n²) < O(n³) < O(2ⁿ) < O(n!)
```

**Left side → More efficient**

**Right side → Less efficient for large inputs**

---

## 4. O(1) — Constant Time

The number of operations remains constant regardless of input size.

```java
int first = arr[0];
```

Whether the array contains 10 or 1 million elements, only one element is accessed.

**Time Complexity: `O(1)`**

### Examples

* Accessing an array element by index
* Assigning a variable
* Basic arithmetic operation
* Comparing two values

---

## 5. O(n) — Linear Time

The number of operations grows directly with input size.

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

If `n = 10` → 10 iterations.

If `n = 100` → 100 iterations.

Therefore:

**Time Complexity: `O(n)`**

### Examples

* Array traversal
* Linear Search
* Finding maximum or minimum in an unsorted array

---

## 6. O(n²) — Quadratic Time

Usually occurs when one loop of size `n` is nested inside another loop of size `n`.

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + " " + j);
    }
}
```

Total operations:

```text
n × n = n²
```

Therefore:

**Time Complexity: `O(n²)`**

---

## 7. O(log n) — Logarithmic Time

Occurs when the input is repeatedly divided or multiplied by a constant factor.

```java
for (int i = 1; i < n; i *= 2) {
    System.out.println(i);
}
```

Values of `i`:

```text
1 → 2 → 4 → 8 → 16 → 32 → ...
```

Therefore:

**Time Complexity: `O(log n)`**

### Common Example

**Binary Search**

---

## 8. O(n log n) — Linearithmic Time

Occurs when an `O(log n)` operation is performed `n` times.

```java
for (int i = 0; i < n; i++) {
    for (int j = 1; j < n; j *= 2) {
        // operation
    }
}
```

Outer loop = **`O(n)`**

Inner loop = **`O(log n)`**

Therefore:

```text
O(n × log n) = O(n log n)
```

### Examples

* Merge Sort
* Heap Sort
* Average-case Quick Sort

---

# 🧮 Rules for Calculating Time Complexity

## Rule 1: Constant Operations → O(1)

```java
int a = 10;
int b = 20;
int sum = a + b;
```

The number of operations does not depend on `n`.

**TC: `O(1)`**

---

## Rule 2: Ignore Constants

```text
O(2n)   → O(n)
O(5n)   → O(n)
O(100n) → O(n)
O(2n²)  → O(n²)
```

---

## Rule 3: Consecutive Loops are Added

```java
for (int i = 0; i < n; i++) {
    // O(n)
}

for (int j = 0; j < n; j++) {
    // O(n)
}
```

Total:

```text
O(n + n) = O(2n) = O(n)
```

---

## Rule 4: Nested Loops are Multiplied

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        // operation
    }
}
```

Total:

```text
O(n × n) = O(n²)
```

---

## Rule 5: Keep Only the Dominant Term

Example:

```text
O(n² + n + 10)
```

For large `n`, `n²` grows the fastest.

Therefore:

```text
O(n² + n + 10) → O(n²)
```

More examples:

```text
O(n³ + n² + n) → O(n³)
O(n log n + n)  → O(n log n)
```

---

## Rule 6: Different Inputs Use Different Variables

```java
for (int i = 0; i < n; i++) {
    // operation
}

for (int j = 0; j < m; j++) {
    // operation
}
```

**TC: `O(n + m)`**

For nested loops:

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
        // operation
    }
}
```

**TC: `O(n × m)`**

---

# 📊 Best, Average and Worst Case

Consider Linear Search:

```java
int[] arr = {10, 20, 30, 40, 50};
```

### Best Case — O(1)

Searching for `10`. It is found immediately at the first position.

### Average Case — O(n)

The element may be somewhere in the middle.

### Worst Case — O(n)

The element is at the last position or is not present.

In DSA, we commonly discuss **worst-case complexity** because it tells us the maximum amount of work an algorithm may need.

---

# 💾 Space Complexity

## 9. What is Space Complexity?

Space Complexity tells us how the memory used by an algorithm grows as input size `n` increases.

Memory can be used for:

* Variables
* Arrays
* Objects
* Data structures
* Function calls
* Recursion stack

---

## 10. O(1) Space — Constant Space

```java
int max = arr[0];

for (int i = 1; i < arr.length; i++) {
    if (arr[i] > max) {
        max = arr[i];
    }
}
```

Only a fixed number of extra variables are used.

**Auxiliary Space: `O(1)`**

---

## 11. O(n) Space — Linear Space

```java
int[] newArray = new int[n];
```

The size of the new array depends on `n`.

**Space Complexity: `O(n)`**

---

## 12. O(n²) Space — Quadratic Space

```java
int[][] matrix = new int[n][n];
```

The matrix contains:

```text
n × n = n² elements
```

Therefore:

**Space Complexity: `O(n²)`**

---

# 📥 Input Space vs Auxiliary Space

## Input Space

The memory occupied by the input given to the algorithm.

Example:

```java
int[] arr = new int[n];
```

**Input Space: `O(n)`**

## Auxiliary Space

The extra memory created by the algorithm apart from the input.

Example:

```java
static int findMax(int[] arr) {
    int max = arr[0];

    for (int num : arr) {
        if (num > max) {
            max = num;
        }
    }

    return max;
}
```

Here:

* **Input Space: `O(n)`**
* **Auxiliary Space: `O(1)`**

In DSA problems, when discussing space optimization, we usually focus on **auxiliary space**.

---

# 🔁 Recursion and Space Complexity

Recursive function calls use the **call stack**.

```java
static void print(int n) {
    if (n == 0) {
        return;
    }

    print(n - 1);
}
```

For `n = 5`:

```text
print(5) → print(4) → print(3) → print(2) → print(1) → print(0)
```

Maximum recursion depth = `n`.

Therefore:

**Space Complexity: `O(n)`**

Even if a recursive function does not create an array, its recursive calls still consume stack memory.

---

# 🔄 Common Loop Patterns

### Pattern 1 — O(n)

```java
for (int i = 0; i < n; i++)
```

**TC: `O(n)`**

### Pattern 2 — O(n)

```java
for (int i = 0; i < n; i += 2)
```

Runs approximately `n/2` times.

Ignore the constant:

**TC: `O(n)`**

### Pattern 3 — O(log n)

```java
for (int i = 1; i < n; i *= 2)
```

**TC: `O(log n)`**

### Pattern 4 — O(log n)

```java
for (int i = n; i > 0; i /= 2)
```

**TC: `O(log n)`**

### Pattern 5 — O(n²)

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
    }
}
```

**TC: `O(n²)`**

### Pattern 6 — O(n log n)

```java
for (int i = 0; i < n; i++) {
    for (int j = 1; j < n; j *= 2) {
    }
}
```

**TC: `O(n log n)`**

---

# 🧠 Final Rules to Remember

1. Fixed operation → **`O(1)`**
2. Loop running `n` times → **`O(n)`**
3. Two full nested loops → **`O(n²)`**
4. Three full nested loops → **`O(n³)`**
5. Multiplying or dividing repeatedly by a constant → **`O(log n)`**
6. Ignore constants: **`O(2n) → O(n)`**
7. Keep dominant term: **`O(n² + n) → O(n²)`**
8. Consecutive loops → **Add**
9. Nested loops → **Multiply according to actual iterations**
10. Recursive calls use **stack memory**
11. Different independent inputs use different variables: **`O(n + m)`** or **`O(n × m)`**

---

# ⚡ Quick Summary

**Time Complexity:** How the number of operations grows as input size increases.

**Space Complexity:** How memory usage grows as input size increases.

Whenever analyzing a solution, ask:

> **1. How many operations does this algorithm perform as `n` grows?**

> **2. How much extra memory does this algorithm use as `n` grows?**

---

⭐ This is part of my journey of learning **Data Structures and Algorithms using Java**.
