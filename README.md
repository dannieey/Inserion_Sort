## Contents

### 1. analysis-report.pdf
- Individual analysis report of the partner's algorithm.
- Algorithm analyzed: **Insertion Sort (optimized for nearly-sorted data)**
- Sections included:
  - **Algorithm Overview**: Description of Insertion Sort and optimizations for nearly-sorted arrays.
  - **Complexity Analysis**:
    - **Time Complexity**:  
      - Best Case (nearly sorted): Θ(n)  
      - Average Case (random array): Θ(n²)  
      - Worst Case (reverse-sorted array): Θ(n²)  
    - **Space Complexity**: O(1) (in-place implementation, minimal auxiliary variables)
  - **Code Review & Optimization**: Inefficiency detection, early-exit optimization, and potential improvements.
  - **Empirical Results**: Benchmarks for different input sizes (n = 100, 1,000, 10,000) with nearly-sorted, random, and reverse-sorted arrays.
  - **Conclusion and Recommendations**: Summary of performance, optimization effects, and practical considerations.

## Usage Instructions

1. Open `analysis-report.pdf` to read the full algorithm analysis of **Insertion Sort**.
2. Open files in `performance-plots/` to inspect benchmark results for different input distributions.
3. Use this documentation to understand the structure, contents, and performance characteristics of the assignment’s algorithms.



## Complexity Overview

- **Algorithm:** Insertion Sort (optimized for nearly-sorted data)

- **Time Complexity:**
  - Best Case (nearly sorted array): Θ(n)  
    - Only comparisons are needed; almost no swaps.
  - Average Case (random array): Θ(n²)  
    - Each element may need to be compared and shifted multiple times.
  - Worst Case (reverse-sorted array): Θ(n²)  
    - Maximum number of comparisons and swaps.

- **Space Complexity:**
  - Auxiliary space: O(1)  
    - In-place algorithm; only a few variables used.
  - Memory-efficient implementation: no additional arrays allocated.

- **Empirical Validation:**
  - Benchmarks (n = 100, 1,000, 10,000):
    - Nearly-sorted input: performance close to linear (time ~ n)  
    - Random input: quadratic growth observed (time ~ n²)  
    - Reverse-sorted input: worst-case quadratic behavior confirmed
  

<img width="387" height="177" alt="image" src="https://github.com/user-attachments/assets/6c0769f9-c6d4-4e96-9135-57ebc259067a" />

