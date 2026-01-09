# Step 02: Mảng và Các lớp tiện ích (Array & Utilities)

Chương này tập trung vào cách quản lý tập hợp dữ liệu lớn và sử dụng các công cụ mạnh mẽ trong bộ thư viện chuẩn của Java để tối ưu hóa hiệu suất xử lý toán học và thời gian.

## Lý thuyết chuyên sâu và Đầy đủ

### 1. Mảng (Arrays) - Quản lý tập hợp dữ liệu cố định
Mảng là một cấu trúc dữ liệu lưu trữ các phần tử có cùng kiểu dữ liệu tại các vị trí bộ nhớ liên tục.
- **Bản chất**: Trong Java, mảng là một **Đối tượng (Object)**. Biến mảng thực chất là một biến tham chiếu lưu địa chỉ vùng nhớ trên Heap.
- **Đặc điểm**:
    - Kích thước cố định ngay khi khởi tạo (không thể co giãn).
    - Các phần tử được truy cập thông qua **Index** (bắt đầu từ 0 đến `length - 1`).
    - Nếu truy cập ngoài khoảng này, Java sẽ ném ra ngoại lệ `ArrayIndexOutOfBoundsException`.

**Các cách khởi tạo mảng**:
```java
int[] a = new int[5]; // Tạo mảng 5 phần tử, giá trị mặc định là 0
int[] b = new int[]{1, 2, 3}; // Khởi tạo kèm giá trị
int[] c = {4, 5, 6}; // Cách viết tắt
```

**Mảng đa chiều (Jagged Arrays)**:
Java không có mảng 2 chiều thực thụ, mà là "mảng của các mảng". Điều này cho phép các hàng có độ dài khác nhau.
```java
int[][] matrix = new int[3][];
matrix[0] = new int[2];
matrix[1] = new int[5];
```

### 2. Thư viện chuẩn `java.util.Arrays`
Đây là lớp tiện ích cung cấp các phương thức tĩnh cực kỳ hữu hiệu:
- `Arrays.sort(arr)`: Sắp xếp mảng (Sử dụng Dual-Pivot Quicksort, hiệu năng cực cao).
- `Arrays.binarySearch(arr, key)`: Tìm kiếm nhị phân (Yêu cầu mảng đã được sắp xếp).
- `Arrays.toString(arr)`: Chuyển mảng thành chuỗi để in ra console một cách trực quan.
- `Arrays.deepToString(arr)`: Dùng cho mảng đa chiều.
- `Arrays.equals(arr1, arr2)`: So sánh nội dung hai mảng (thay vì so sánh địa chỉ vùng nhớ).
- `Arrays.fill(arr, value)`: Gán tất cả phần tử trong mảng bằng một giá trị duy nhất.

### 3. Sao chép mảng (Array Copying)
Cần phân biệt rõ hai loại sao chép:
- **Shallow Copy (Sao chép nông)**: `array2 = array1;` -> Cả hai biến cùng trỏ vào một vùng nhớ. Thay đổi `array1` sẽ làm `array2` thay đổi theo.
- **Deep Copy (Sao chép sâu)**: Tạo một vùng nhớ mới hoàn toàn.
    - Dùng vòng lặp `for`.
    - Dùng `array1.clone()`.
    - Dùng `System.arraycopy(...)` -> Cách nhanh nhất vì thao tác trực tiếp trên bộ nhớ tầng thấp.
    - Dùng `Arrays.copyOf(...)`.

### 4. Lớp toán học `java.lang.Math`
Cung cấp các hằng số và phương thức toán học tĩnh.
- **Hằng số**: `Math.PI` (3.1415...), `Math.E`.
- **Hàm cơ bản**: `Math.abs()` (trị tuyệt đối), `Math.max()`, `Math.min()`.
- **Làm tròn**: 
    - `Math.ceil()`: Làm tròn lên.
    - `Math.floor()`: Làm tròn xuống.
    - `Math.round()`: Làm tròn đến số nguyên gần nhất.
- **Lũy thừa & Căn thức**: `Math.pow(a, b)` ($a^b$), `Math.sqrt()` (căn bậc 2), `Math.cbrt()` (căn bậc 3).
- **Ngẫu nhiên**: `Math.random()` trả về giá trị từ `0.0` đến `1.0`. Công thức tạo số trong khoảng `[min, max]`:
  `int randomNum = (int)(Math.random() * (max - min + 1) + min);`

### 5. Xử lý Thời gian (Date & Time)
Java có hai hệ thống xử lý thời gian:
#### a. Hệ thống cũ (Trước Java 8) - Nên hạn chế dùng
- `java.util.Date`: Lưu trữ thời gian tính bằng miligiây từ mốc 1/1/1970.
- `java.util.Calendar`: Hỗ trợ tính toán ngày tháng phức tạp hơn.
- `java.text.SimpleDateFormat`: Dùng để định dạng và chuyển đổi Date <-> String.

#### b. Hệ thống mới (Từ Java 8) - `java.time` (Khuyên dùng)
- `LocalDate`: Chỉ có ngày (vd: 2026-01-09).
- `LocalTime`: Chỉ có giờ.
- `LocalDateTime`: Kết hợp cả ngày và giờ.
- `DateTimeFormatter`: Lớp thay thế an toàn và mạnh mẽ hơn SimpleDateFormat.
- **Đặc trưng**: Các lớp này là **Immutable** (không thể thay đổi sau khi tạo), giúp an toàn tuyệt đối trong lập trình đa luồng (Thread-safe).

## Danh sách bài học

| STT | Tên bài | Mô tả chi tiết | Tham khảo |
|:---:|:---|:---|:---|
| 01 | [Array](./Array) | Cơ chế bộ nhớ, duyệt mảng xuôi - ngược và mảng đa chiều. | https://www.w3schools.com/java/java_arrays.asp |
| 02 | [Array-Coppy](./Array-Coppy) | Phân biệt copy tham chiếu vs copy giá trị (System.arraycopy). | https://www.geeksforgeeks.org/system-arraycopy-in-java/ |
| 03 | [TimKiem-SapXep-CoppyArray](./TimKiem-SapXep-CoppyArray) | Thuật toán tối ưu với thư viện Arrays chuyên sâu. | https://www.w3schools.com/java/java_arrays_multi.asp |
| 04 | [ClassMath](./ClassMath) | Các hàm toán học, lượng giác và xử lý số thực. | https://www.w3schools.com/java/java_math.asp |
| 05 | [Time-Date-Dateformat-Calendar](./Time-Date-Dateformat-Calendar) | So sánh Java 8 Time API với hệ thống Date/Calendar cũ. | https://www.w3schools.com/java/java_date.asp |
| 06 | [MiniGame-Random-Numberformat](./MiniGame-Random-Numberformat) | Project mini: Đoán số, định dạng tiền tệ Việt Nam (Locale). | - |

---

## Tài liệu tham khảo mở rộng
- Understanding Jagged Arrays in Java: https://www.geeksforgeeks.org/jagged-array-in-java/
- Modern Java Date and Time API Guide: https://www.baeldung.com/java-8-date-time-intro
- Deep vs Shallow Copy in Java: https://www.geeksforgeeks.org/difference-between-shallow-and-deep-copy-of-a-class/
