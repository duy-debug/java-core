# Step 06: Xử lý ngoại lệ và Hệ thống tập tin (IO & Exception)

Chương cuối cùng này trang bị cho bạn hai kỹ năng sống còn của một lập trình viên chuyên nghiệp: Khả năng xây dựng ứng dụng bền bỉ không bị crash (Exception) và khả năng tương tác dữ liệu với thế giới thực (IO).

## Lý thuyết chuyên sâu và Đầy đủ

### 1. Phân cấp và Bản chất Ngoại lệ (Exception)
Trong Java, mọi "sự cố" xảy ra khi chương trình đang chạy được gọi là một đối tượng thuộc lớp `Throwable`.
- **Error**: Các lỗi hệ thống nghiêm trọng (vd: `OutOfMemoryError`, `StackOverflowError`). Lập trình viên thường không bắt các lỗi này vì ứng dụng không thể phục hồi.
- **Exception**: Các tình huống lỗi mà chương trình có thể xử lý và tiếp tục chạy.
    - **Checked Exception**: Xảy ra lúc Compile (vd: `FileNotFoundException`, `IOException`). Java bắt buộc bạn phải viết code xử lý (try-catch) hoặc khai báo (throws) mới cho phép biên dịch.
    - **Unchecked Exception (Runtime)**: Xảy ra lúc chạy do lỗi logic (vd: `NullPointerException`, `ArrayIndexOutOfBoundsException`). Không bắt buộc phải bắt, nhưng nên phòng tránh bằng logic code.

### 2. Cơ chế xử lý Ngoại lệ chuyên sâu
- **Khối lệnh `try-catch-finally`**:
    - `try`: Chứa mã nguồn có nguy cơ gây lỗi.
    - `catch`: Chứa mã xử lý khi lỗi xảy ra. Có thể có nhiều khối `catch` cho các loại lỗi khác nhau (phải đặt lỗi con trước lỗi cha).
    - `finally`: Chứa mã luôn luôn thực thi dù có lỗi hay không (thường dùng để đóng file, ngắt kết nối database).
- **Từ khóa `throw` và `throws`**:
    - `throw`: Dùng để chủ động "ném" ra một đối tượng ngoại lệ (thường dùng trong Custom Exception).
    - `throws`: Khai báo ở chữ ký phương thức để cảnh báo rằng hàm này có thể gây ra lỗi, đẩy trách nhiệm xử lý lên cho hàm gọi nó.
- **Try-with-resources (Java 7+)**: Tự động đóng các tài nguyên (file, stream) mà không cần khối `finally`. Đây là cách viết hiện đại và an toàn nhất.
```java
try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
    // Đọc file...
} catch (IOException e) {
    e.printStackTrace();
} // br sẽ tự động được đóng tại đây
```

### 3. Quản lý File và Thư mục (`java.io.File`)
Lớp `File` đại diện cho một đường dẫn trên ổ cứng (có thể là file hoặc thư mục).
- **Các lệnh quan trọng**:
    - `exists()`: Kiểm tra tồn tại.
    - `createNewFile()`: Tạo file mới.
    - `mkdir() / mkdirs()`: Tạo thư mục đơn/đa tầng.
    - `delete()`: Xóa file hoặc thư mục rỗng.
    - `getAbsolutePath()`: Lấy đường dẫn toàn phần.
    - `list() / listFiles()`: Liệt kê danh sách file bên trong thư mục.

### 4. Hệ thống luồng dữ liệu (Streams)
Java IO dựa trên khái niệm Streams - dữ liệu chảy theo một chiều (Input là vào, Output là ra).
- **Byte Streams (0 và 1)**: Dùng cho dữ liệu thô như hình ảnh, âm thanh, file thực thi. Lớp gốc: `InputStream`, `OutputStream`.
- **Character Streams (Văn bản)**: Dùng cho file text, tự động xử lý bảng mã Unicode. Lớp gốc: `Reader`, `Writer`.
- **Cơ chế Buffering (Vùng đệm)**: Thay vì truy cập ổ cứng 1000 lần để đọc 1000 ký tự (rất chậm), `BufferedReader` sẽ đọc 1 lần 1000 ký tự vào RAM, sau đó chương trình lấy từ RAM ra (nhanh hơn hàng trăm lần).

### 5. Java NIO (New IO) - Cách tiếp cận hiện đại
Từ Java 7, lớp `java.nio.file.Files` và `Path` cung cấp các tính năng mạnh mẽ hơn IO cũ:
- Ghi/Đọc toàn bộ file chỉ bằng 1 dòng lệnh.
- Sao chép, di chuyển file cực nhanh.
- Kiểm tra chi tiết thuộc tính file (size, owner, permissions).

## Danh sách bài học

| STT | Tên bài | Mô tả chi tiết | Tham khảo |
|:---:|:---|:---|:---|
| 01 | [XuLyNgoaiLe](./XuLyNgoaiLe) | Làm chủ chu trình try-catch, cách tạo Custom Exception và chiến lược xử lý lỗi chuyên nghiệp. | https://www.w3schools.com/java/java_try_catch.asp |
| 02 | [Tao-Tap-Tin-Thu-Muc](./Tao-Tap-Tin-Thu-Muc) | Thực hành thao tác với hệ thống tập tin, luồng Byte/Character và tối ưu hiệu suất với BufferedReader. | https://www.w3schools.com/java/java_files.asp |

---

## Tài liệu tham khảo mở rộng
- Java Exceptions Hierarchy: https://www.geeksforgeeks.org/exceptions-in-java/
- Comprehensive Guide to Java IO: https://www.baeldung.com/java-io-streams
- Try-with-resources explanation: https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
- Java NIO vs IO Performance: https://www.javatpoint.com/java-nio-vs-io
