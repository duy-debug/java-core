# Step 03: Hướng đối tượng cơ bản (OOP Basic)

Lập trình hướng đối tượng (Object-Oriented Programming - OOP) là linh hồn của ngôn ngữ Java. Chương này sẽ giúp bạn thay đổi tư duy từ lập trình thủ tục (tập trung vào hàm) sang lập trình hướng đối tượng (tập trung vào thực thể và hành vi).

## Lý thuyết chuyên sâu và Đầy đủ

### 1. Đối tượng (Object) và Lớp (Class)
- **Lớp (Class)**: Là một "bản thiết kế" hoặc "khuôn mẫu" định nghĩa các thuộc tính và hành động chung của một nhóm đối tượng. Class không tồn tại vật lý, nó chỉ là định nghĩa mã nguồn.
- **Đối tượng (Object)**: Là một thực thể cụ thể được tạo ra từ Class. Mỗi đối tượng có trạng thái (thuộc tính) và hành vi (phương thức) riêng.
- **Cơ chế bộ nhớ**:
    - **Stack**: Lưu trữ tên biến tham chiếu.
    - **Heap**: Lưu trữ nội dung thực sự của đối tượng (dữ liệu các thuộc tính). Khi dùng từ khóa `new`, Java sẽ cấp phát một vùng nhớ trong Heap.

### 2. Thuộc tính (Fields) và Phương thức (Methods)
- **Thuộc tính**: Các biến khai báo bên trong lớp, đại diện cho đặc điểm của thực thể (vd: `ten`, `tuoi`).
- **Phương thức**: Các hàm khai báo bên trong lớp, đại diện cho hành vi (vd: `an()`, `chay()`, `tinhLuong()`).
- **Từ khóa `this`**:
    - Dùng để phân biệt giữa thuộc tính của lớp và tham số của phương thức khi chúng trùng tên (Field Shadowing).
    - Dùng để gọi các phương thức khác của cùng một đối tượng.
    - Dùng trong Constructor Chaining (gọi constructor khác trong cùng class).

### 3. Constructor (Hàm khởi tạo)
Constructor là phương thức đặc biệt dùng để khởi tạo trạng thái ban đầu cho đối tượng.
- **Đặc điểm**: Tên trùng hoàn toàn với tên Class, không có kiểu trả về (kể cả `void`).
- **Phân loại**:
    - **Default Constructor**: Do Java tự tạo nếu bạn không khai báo bất kỳ constructor nào. Nó khởi tạo các giá trị mặc định (`0`, `null`, `false`).
    - **Parameterized Constructor**: Constructor có tham số, giúp gán giá trị ngay khi tạo đối tượng.
- **Overloading Constructor**: Một lớp có thể có nhiều constructor khác nhau về số lượng hoặc kiểu tham số.

### 4. Tính đóng gói (Encapsulation)
Đây là tính chất quan trọng nhất giúp bảo vệ dữ liệu khỏi sự truy cập không kiểm soát từ bên ngoài.
- **Quy tắc vàng**: 
    1. Khai báo các thuộc tính là `private`.
    2. Cung cấp các phương thức `public` để truy cập (`Getter`) và chỉnh sửa (`Setter`).
- **Lợi ích**:
    - Kiểm soát được tính hợp lệ của dữ liệu (vd: không cho phép ghi tuổi âm trong Setter).
    - Có thể làm cho thuộc tính trở thành "Chỉ đọc" (chỉ có Getter) hoặc "Chỉ ghi" (chỉ có Setter).
    - Giấu đi sự phức tạp bên trong lớp.

### 5. Các phương thức đặc biệt từ lớp `Object`
Trong Java, mọi lớp đều mặc định kế thừa từ lớp cha cao nhất là `Object`. Có 3 phương thức bạn cực kỳ nên ghi đè (`Override`):
- **`toString()`**: Chuyển đổi trạng thái của đối tượng thành một chuỗi ký tự. Nếu không ghi đè, nó sẽ in ra mã băm (hashcode) của địa chỉ vùng nhớ.
- **`equals(Object obj)`**: Dùng để so sánh "nội dung" của hai đối tượng. Mặc định nó so sánh địa chỉ vùng nhớ (giống toán tử `==`). Bạn cần ghi đè để so sánh các thuộc tính thực tế (vd: so sánh hai sinh viên qua Mã SV).
- **`hashCode()`**: Trả về một số nguyên đại diện cho đối tượng. Quy tắc: Hai đối tượng `equals` với nhau thì bắt buộc phải có `hashCode` giống nhau. Thường dùng trong `HashMap`, `HashSet`.

### 6. Mối quan hệ giữa các Đối tượng (Association)
Các đối tượng thường không tồn tại độc lập mà kết nối với nhau:
- **Has-a relationship**: Một đối tượng chứa một đối tượng khác làm thuộc tính.
    - Ví dụ: Một lớp `HoaDon` chứa đối tượng `Ngay`, một lớp `Sach` chứa đối tượng `TacGia`.
- Điều này giúp mã nguồn cực kỳ linh hoạt và tái sử dụng được các lớp nhỏ cho nhiều lớp lớn khác nhau.

## Danh sách bài học

| STT | Tên bài | Mô tả chi tiết | Tham khảo |
|:---:|:---|:---|:---|
| 01 | [OOP-1-Class](./OOP-1-Class) | Cách định nghĩa một Class hoàn chỉnh và khởi tạo Object với `new`. | https://www.w3schools.com/java/java_classes.asp |
| 02 | [OOP-2-HoaDonCafe](./OOP-2-HoaDonCafe) | Áp dụng tư duy hướng đối tượng vào bài toán thực tế quản lý hóa đơn. | - |
| 03 | [OOP-3-GET-SET](./OOP-3-GET-SET) | Thực hành tính đóng gói và cách xử lý logic trong các hàm Setter. | https://www.w3schools.com/java/java_encapsulation.asp |
| 04 | [OOP-4-ToString](./OOP-4-ToString) | Tùy biến cách hiển thị thông tin đối tượng thông qua ghi đè toString(). | https://www.geeksforgeeks.org/object-tostring-method-in-java/ |
| 05 | [OOP-5-equals-hascode](./OOP-5-equals-hascode) | Hợp đồng giữa equals/hashCode và cách so sánh sâu hai đối tượng. | https://www.geeksforgeeks.org/equals-hashcode-methods-java/ |
| 06 | [OOP-QuanLySach](./OOP-QuanLySach) | Project: Quản lý sách (Kết hợp nhiều Class: Ngay, Tác giả, Sách). | - |
| 07 | [OOP-QuanLyMayTinh](./OOP-QuanLyMayTinh) | Project: Quản lý máy tính (Phân tách Hãng sản xuất, Quốc gia, Máy tính). | - |
| 08 | [OOP-QuanLyBoPhim](./OOP-QuanLyBoPhim) | Project: Quản lý vé xem phim (Mối quan hệ Phim, Đạo diễn, Ngày chiếu). | - |
| 09 | [OOP-QuanLySinhVien](./OOP-QuanLySinhVien) | Project: Quản lý kết quả học tập và xếp loại dựa trên điểm trung bình. | - |

---

## Tài liệu tham khảo mở rộng
- Java Memory Management (Stack vs Heap): https://www.baeldung.com/java-stack-heap
- OOP Encapsulation Principles: https://www.geeksforgeeks.org/encapsulation-in-java/
- Methods of Object Class in Java: https://www.javatpoint.com/object-class-in-java
