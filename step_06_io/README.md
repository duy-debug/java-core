# Step 06: Xử lý ngoại lệ và Hệ thống tập tin (IO & Exception)

Chương này hướng dẫn cách xây dựng các ứng dụng Java ở cấp độ công nghiệp - nơi sự ổn định (Exception) và khả năng lưu trữ (IO) là yếu tố sống còn.

## Lý thuyết chuyên sâu

### 1. Phân tích hệ thống Exception trong Java
Tất cả ngoại lệ đều kế thừa từ lớp `Throwable`.
- **Error**: Lỗi nghiêm trọng của hệ thống (Out of Memory, Stack Overflow). Không nên dùng try-catch để bắt các lỗi này.
- **Exception**:
    - **Checked Exception**: Xảy ra lúc Compile (ví dụ: `IOException`, `SQLException`). Bắt buộc phải dùng `try-catch` hoặc `throws`.
    - **Unchecked Exception (Runtime)**: Xảy ra lúc chạy do lỗi logic của lập trình viên (ví dụ: `NullPointerException`, `ArrayIndexOutOfBoundsException`).
- **Try-with-resources (Java 7+)**: Tự động đóng tài nguyên (File, Database) sau khi thực hiện xong mà không cần hàm `finally`.
```java
try (FileWriter fw = new FileWriter("test.txt")) {
    fw.write("Java IO");
} catch (IOException e) { e.printStackTrace(); }
```

### 2. Luồng dữ liệu (Streams) trong Java IO
- **Byte Streams (java.io.InputStream / OutputStream)**: Xử lý dữ liệu nhị phân (hình ảnh, âm thanh, file thực thi). Đọc theo đơn vị 8-bit.
- **Character Streams (java.io.Reader / Writer)**: Xử lý văn bản Unicode. Đọc theo đơn vị 16-bit. Tự động xử lý bảng mã (encoding).
- **Buffering**: `BufferedReader` và `BufferedWriter` giúp tăng hiệu năng bằng cách đọc/ghi dữ liệu vào một vùng đệm (buffer) trên RAM thay vì truy cập ổ cứng liên tục.

### 3. Quản lý File hiện đại với `java.nio` (New IO)
Từ Java 7, lớp `Files` và `Path` cung cấp các tính năng mạnh mẽ hơn:
- Sao chép file (`Files.copy`).
- Di chuyển file (`Files.move`).
- Duyệt cây thư mục (`Files.walk`).
- Đọc toàn bộ nội dung file vào một List chỉ với 1 dòng lệnh.

### 4. Kỹ thuật Debug với Exception
- **printStackTrace()**: In ra toàn bộ dấu vết các hàm đã gọi dẫn đến lỗi.
- **Custom Exception**: Tự tạo lớp lỗi riêng (kế thừa từ `Exception`) để xử lý các nghiệp vụ đặc thù (Ví dụ: `InsufficientBalanceException` cho ứng dụng ngân hàng).

## Danh sách bài học

| STT | Tên bài | Mô tả chi tiết | Tham khảo |
|:---:|:---|:---|:---|
| 01 | [XuLyNgoaiLe](./XuLyNgoaiLe) | Phân cấp Throwable, Catch đa tầng và Custom Exception. | [W3Schools](https://www.w3schools.com/java/java_try_catch.asp) |
| 02 | [Tao-Tap-Tin-Thu-Muc](./Tao-Tap-Tin-Thu-Muc) | Thao tác toàn diện với File system và Luồng dữ liệu (Streams). | [W3Schools](https://www.w3schools.com/java/java_files.asp) |

---

## Tài liệu tham khảo mở rộng
- [Detailed Guide on Java IO vs NIO](https://www.baeldung.com/java-io-vs-nio)
- [Best Practices for Exception Handling](https://www.geeksforgeeks.org/best-practices-for-exception-handling-in-java/)
