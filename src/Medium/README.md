# Forming a Magic Square

## Overview

Bài toán yêu cầu chuyển đổi một ma trận 3x3 thành magic square với chi phí nhỏ nhất.

---

## Idea

Có đúng 8 magic square hợp lệ kích thước 3x3.

Ta:
1. Hard-code 8 magic square.
2. Tính tổng cost giữa matrix hiện tại và từng magic square.
3. Lấy giá trị nhỏ nhất.

---

## Cost Formula

```text
|oldValue - newValue|
```

---

## Complexity

- Time Complexity: O(1)
- Space Complexity: O(1)