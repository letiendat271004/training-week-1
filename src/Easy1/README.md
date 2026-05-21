# Grading Students

## Problem
Cho danh sách điểm của học sinh.

Quy tắc làm tròn:
- Nếu điểm nhỏ hơn 38 thì giữ nguyên.
- Nếu hiệu giữa điểm hiện tại và bội số tiếp theo của 5 nhỏ hơn 3 thì làm tròn lên.

Ví dụ:
- 73 -> 75
- 67 -> 67
- 38 -> 40

---

## Idea

### Bước 1
Duyệt từng điểm trong danh sách.

### Bước 2
Nếu điểm >= 38:
- Tìm bội số tiếp theo của 5.
- Kiểm tra khoảng cách giữa điểm hiện tại và bội số đó.

### Bước 3
Nếu khoảng cách nhỏ hơn 3:
- Cập nhật điểm mới.

---

## Code Explanation

Sử dụng:
- List<Integer>
- vòng lặp for
- Math logic

Công thức tìm bội số tiếp theo của 5:

```java
int nextMultiple = ((grade / 5) + 1) * 5;