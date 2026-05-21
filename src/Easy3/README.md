# Number Line Jumps (Kangaroo)

## Problem

Có hai con kangaroo đứng trên trục số:

- Kangaroo 1:
  - vị trí ban đầu: x1
  - bước nhảy: v1

- Kangaroo 2:
  - vị trí ban đầu: x2
  - bước nhảy: v2

Yêu cầu:
Xác định xem sau cùng số lần nhảy, hai con có đứng cùng vị trí hay không.

Nếu có:

```text
YES
```

Ngược lại:

```text
NO
```

---

## Idea

Sau `n` lần nhảy:

Kangaroo 1:

:contentReference[oaicite:0]{index=0}

Kangaroo 2:

:contentReference[oaicite:1]{index=1}

Hai con gặp nhau khi:

:contentReference[oaicite:2]{index=2}

Suy ra:

:contentReference[oaicite:3]{index=3}

Nếu `(x2 - x1)` chia hết cho `(v1 - v2)` thì hai con sẽ gặp nhau.

---

## Complexity

- Time Complexity: O(1)
- Space Complexity: O(1)