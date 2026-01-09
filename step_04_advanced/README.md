# Step 04: Hướng đối tượng nâng cao và Chuỗi (OOP Advanced & String)

Chương này hoàn thiện bức tranh về lập trình hướng đối tượng chuyên nghiệp và làm chủ kiểu dữ liệu văn bản - chiếm 70% dữ liệu trong lập trình thực tế.

## Lý thuyết chuyên sâu

### 1. Kế thừa (Inheritance) - Cơ chế sâu
- **Từ khóa `extends`**: Chỉ hỗ trợ đơn kế thừa lớp để tránh lỗi "Diamond Problem" (Kim cương).
- **Cơ chế khởi tạo**: Khi tạo lớp con, constructor của lớp cha (`super()`) luôn được gọi đầu tiên.
- **IS-A relationship**: Lớp con **là một** phiên bản đặc biệt của lớp cha.

### 2. Đa hình (Polymorphism) và Liên kết (Binding)
- **Static Binding (Compile-time)**: Xảy ra với **Overloading**. Trình biên dịch quyết định hàm nào được gọi tại lúc biên dịch.
- **Dynamic Binding (Runtime)**: Xảy ra với **Overriding**. JVM quyết định hàm nào được gọi tại lúc chạy dựa trên kiểu của **Đối tượng thực tế** trên Heap, không phải kiểu tham chiếu.
- **Upcasting & Downcasting**: Chuyển đổi kiểu dữ liệu giữa cha và con.

### 3. Trừu tượng (Abstraction) chuyên sâu
- **Abstract Class**: Có thể có thuộc tính, có constructor, dùng để định nghĩa các đặc điểm chung.
- **Interface**:
    - Trước Java 8: Chỉ có hằng số và abstract method.
    - Từ Java 8: Thêm `default method` (phương thức có thân mặc định) và `static method`.
    - Từ Java 9: Thêm `private method` trong Interface.
- **Khác biệt**: Lớp con có thể triển khai **nhiều** interface nhưng chỉ kế thừa **một** lớp cha.

### 4. Chuỗi (String) - Cơ chế String Pool
- **String Pool**: Là một vùng nhớ nhỏ trong Heap. Khi tạo chuỗi bằng literal (`String s = "abc"`), Java kiểm tra trong Pool trước. Nếu dùng `new String("abc")`, Java luôn tạo một đối tượng mới trên Heap.
- **Tính bất biến**: Khi bạn cộng chuỗi, Java tạo ra chuỗi mới. Để tiết kiệm bộ nhớ khi thao tác nhiều, hãy dùng:
    - **StringBuilder**: Không an toàn đa luồng (nhưng nhanh).
    - **StringBuffer**: An toàn đa luồng (chậm hơn).

### 5. Kiểu liệt kê (Enum)
Enum trong Java không chỉ là danh sách hằng số, nó là một class đặc biệt có thể có thuộc tính, constructor (private) và phương thức. Thường dùng cho các giá trị cố định như: Thứ trong tuần, Hướng (Đông, Tây...), Trạng thái đơn hàng.

## Danh sách bài học

| STT | Tên bài | Mô tả chi tiết | Tham khảo |
|:---:|:---|:---|:---|
| 01 | [OOP-Package](./OOP-Package) | Tổ chức mã nguồn, đặt tên package và kỹ thuật import. | [W3Schools](https://www.w3schools.com/java/java_packages.asp) |
| 02 | [OOP-Public-Protected-Private](./OOP-Public-Protected-Private) | Bảng chi tiết Access Modifiers và phạm vi ảnh hưởng. | [W3Schools](https://www.w3schools.com/java/java_modifiers.asp) |
| 03 | [OOP-Overloading](./OOP-Overloading) | Đa dạng hành vi cùng tên hàm dựa trên tham số. | [GeeksforGeeks](https://www.geeksforgeeks.org/method-overloading-in-java/) |
| 04 | [OOP-Inheritance](./OOP-Inheritance) | Kế thừa thuộc tính, phương thức và từ khóa super. | [W3Schools](https://www.w3schools.com/java/java_inheritance.asp) |
| 05 | [OOP-Interihance-TT](./OOP-Interihance-TT) | Các bài tập thực hành kế thừa lồng nhau. | - |
| 06 | [OOP-Overriding](./OOP-Overriding) | Ghi đè phương thức và tính đa hình khi chạy chương trình. | [GeeksforGeeks](https://www.geeksforgeeks.org/overriding-in-java/) |
| 07 | [OOP-Abstract](./OOP-Abstract) | Thiết kế khung sườn ứng dụng với Abstract Class. | [W3Schools](https://www.w3schools.com/java/java_abstract.asp) |
| 08 | [OOP-Interface](./OOP-Interface) | Giải quyết đa kế thừa hành vi qua Interface. | [W3Schools](https://www.w3schools.com/java/java_interface.asp) |
| 09 | [OOP-Abstract-Interihance](./OOP-Abstract-Interihance) | Kết hợp mô hình trừu tượng hóa đa tầng. | - |
| 10 | [OOP-String](./OOP-String) | Tại sao String là bất biến? Cơ chế String Pool. | [W3Schools](https://www.w3schools.com/java/java_strings.asp) |
| 11 | [OOP-String1](./OOP-String1) | So sánh nội dung chuỗi (equals, compareTo, matches). | - |
| 12 | [OOP-String2](./OOP-String2) | Kỹ thuật tìm kiếm, thay thế và Regex cơ bản. | - |
| 13 | [OOP-String3](./OOP-String3) | Cắt chuỗi, ép kiểu và tối ưu hóa bộ nhớ String. | - |
| 14 | [Phan-Tach-Chuoi-Thanh-Mang](./Phan-Tach-Chuoi-Thanh-Mang) | Xử lý dữ liệu thô thành mảng để tính toán. | - |
| 15 | [Enum](./Enum) | Xây dựng các hằng số thông minh và linh hoạt. | [W3Schools](https://www.w3schools.com/java/java_enums.asp) |

---

## Tài liệu tham khảo mở rộng
- [Guide to Java String Pool](https://www.baeldung.com/java-string-pool)
- [Abstraction vs Interface in Java 8+](https://www.geeksforgeeks.org/difference-between-abstract-class-and-interface-in-java/)
