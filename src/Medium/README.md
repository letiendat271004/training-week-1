# Forming a Magic Square

## Overview

Bài toán yêu cầu chuyển đổi một ma trận 3x3 thành magic square với chi phí nhỏ nhất.

Đây là bài mức Medium trên HackerRank, yêu cầu:
- phân tích toán học
- brute force hợp lý
- xử lý ma trận 2 chiều

---

## Problem Description

Cho ma trận 3x3 chứa các số từ 1 đến 9.

Ta có thể thay đổi giá trị từng ô.

Chi phí thay đổi được tính bằng:

```text
|oldValue - newValue|