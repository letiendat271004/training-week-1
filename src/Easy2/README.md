# Apple and Orange

## Problem
Sam có một ngôi nhà nằm trong đoạn từ s đến t.

Có:
- cây táo nằm tại vị trí a
- cây cam nằm tại vị trí b

Mỗi quả táo và quả cam rơi với một khoảng cách nhất định:
- số dương: rơi sang phải
- số âm: rơi sang trái

Yêu cầu:
- đếm số táo rơi vào nhà
- đếm số cam rơi vào nhà

---

## Idea

### Apple
Vị trí quả táo rơi:

```java
position = a + apple