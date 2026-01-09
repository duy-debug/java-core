# Step 02: Mảng và Các lớp tiện ích (Array & Utilities)

Chương này đi sâu vào cách quản lý vùng nhớ cho dữ liệu tập hợp và sử dụng các thư viện chuẩn để tối ưu hóa hiệu suất làm việc.

## Lý thuyết chuyên sâu

### 1. Mảng (Arrays) - Cơ chế vùng nhớ
- **Bản chất**: Trong Java, mảng là một **Đối tượng**. Nó được lưu trữ trong bộ nhớ **Heap**, còn biến tham chiếu đến mảng lưu trong bộ nhớ **Stack**.
- **Kích thước**: Được xác định ngay khi khởi tạo và **không thể thay đổi**. Nếu muốn mảng co giãn, cần dùng `ArrayList` (Step 05).
- **Mảng đa chiều (Jagged Arrays)**: Java hỗ trợ mảng của các mảng, nghĩa là các hàng có thể có độ dài khác nhau.
```java
int[][] a = new int[2][];
a[0] = new int[3];
a[1] = new int[5]; // Mảng không đều
```

### 2. Thư viện Arrays (java.util.Arrays)
- `sort()`: Sử dụng thuật toán **Dual-Pivot Quicksort** cho các kiểu nguyên thủy (độ phức tạp $O(n \log n)$).
- `binarySearch()`: Tìm kiếm nhị phân (phải sắp xếp trước nếu không kết quả sẽ sai).
- `fill(arr, val)`: Đổ dữ liệu đồng nhất vào cả mảng.
- `deepToString()`: In mảng đa chiều một cách trực quan.

### 3. Lớp Math (Số học nâng cao)
Lớp `Math` chứa các phương thức tĩnh (static), không cần tạo đối tượng.
- **Lượng giác**: `Math.sin()`, `Math.cos()`, `Math.tan()`, `Math.toDegrees()`, `Math.toRadians()`.
- **Số mũ & Logarit**: `Math.exp()`, `Math.log()`, `Math.log10()`.
- **Số ngẫu nhiên**: `Math.random()` thực chất là một lớp bọc xung quanh lớp `java.util.Random`.

### 4. Xử lý Thời gian (Java Time API - JDK 8+)
Đây là bộ thư viện thay thế hoàn toàn cho `Date` và `Calendar` cũ (vốn có nhiều lỗi thiết kế).
- **Tính bất biến**: Các đối tượng như `LocalDate`, `LocalTime` là bất biến (Thread-safe). Khi bạn "thay đổi" ngày, Java thực tế tạo ra một đối tượng mới.
- **Lớp chính**:
    - `LocalDate`: Ngày (ISO-8601).
    - `LocalTime`: Giờ chính xác đến từng nano giây.
    - `LocalDateTime`: Kết hợp cả hai.
    - `ZonedDateTime`: Thời gian có kèm thông tin múi giờ.
    - `Duration` & `Period`: Tính toán khoảng cách giữa hai mốc thời gian.

## Danh sách bài học

| STT | Tên bài | Mô tả chi tiết | Tham khảo |
|:---:|:---|:---|:---|
| 01 | [Array](./Array) | Cơ chế bộ nhớ, duyệt mảng xuôi - ngược và mảng đa chiều. | [W3Schools](https://www.w3schools.com/java/java_arrays.asp) |
| 02 | [Array-Coppy](./Array-Coppy) | Phân biệt copy tham chiếu vs copy giá trị (System.arraycopy). | [GeeksforGeeks](https://www.geeksforgeeks.org/system-arraycopy-in-java/) |
| 03 | [TimKiem-SapXep-CoppyArray](./TimKiem-SapXep-CoppyArray) | Thuật toán tối ưu với thư viện Arrays chuyên sâu. | [W3Schools](https://www.w3schools.com/java/java_arrays_multi.asp) |
| 04 | [ClassMath](./ClassMath) | Các hàm toán học, lượng giác và xử lý số thực. | [W3Schools](https://www.w3schools.com/java/java_math.asp) |
| 05 | [Time-Date-Dateformat-Calendar](./Time-Date-Dateformat-Calendar) | So sánh Java 8 Time API với hệ thống Date/Calendar cũ. | [W3Schools](https://www.w3schools.com/java/java_date.asp) |
| 06 | [MiniGame-Random-Numberformat](./MiniGame-Random-Numberformat) | Project mini: Đoán số, định dạng tiền tệ Việt Nam (Locale). | - |

---

## Tài liệu tham khảo mở rộng
- [Understanding Jagged Arrays in Java](https://www.geeksforgeeks.org/jagged-array-in-java/)
- [Modern Java Date and Time API Guide](https://www.baeldung.com/java-8-date-time-intro)
