# Step 04: Hướng đối tượng nâng cao và Chuỗi (OOP Advanced & String)

Chương này trang bị cho bạn những vũ khí tối thượng của lập trình Java chuyên nghiệp. Chúng ta sẽ giải quyết sự phức tạp của hệ thống thông qua các tính chất nâng cao của OOP và làm chủ cách xử lý Chuỗi - thành phần chiếm 70% dữ liệu thực tế.

## Lý thuyết chuyên sâu và Đầy đủ

### 1. Quản lý mã nguồn với Package và Access Modifiers
- **Package**: Giúp nhóm các lớp có liên quan lại với nhau để tránh xung đột tên và dễ quản lý dự án lớn.
- **Access Modifiers (Phạm vi truy cập)**: Cần nắm vững quy tắc "mở rộng dần":
    - `private`: Chỉ truy cập được trong chính lớp đó.
    - `default (không ghi gì)`: Truy cập được trong cùng một package.
    - `protected`: Truy cập được trong cùng package **VÀ** lớp con (kể cả lớp con khác package).
    - `public`: Truy cập được từ bất kỳ đâu.

### 2. Tính kế thừa (Inheritance) - Từ khóa `extends`
Mô hình hóa mối quan hệ **"IS-A"** (Là một).
- **Lớp Cha (Superclass)** và **Lớp Con (Subclass)**: Con thừa hưởng các thuộc tính/phương thức không phải `private` của cha.
- **Từ khóa `super`**:
    - `super()`: Gọi constructor của lớp cha (phải là lệnh đầu tiên trong constructor con).
    - `super.method()`: Gọi phương thức của lớp cha khi lớp con đã ghi đè (override) phương thức đó.
- **Lưu ý**: Java chỉ hỗ trợ **Đơn kế thừa** lớp để tránh lỗi "Diamond Problem" (đa kế thừa gây xung đột).

### 3. Tính đa hình (Polymorphism)
Cho phép một đối tượng biểu hiện dưới nhiều hình thái khác nhau.
- **Overloading (Nạp chồng)**: Cùng tên hàm nhưng khác tham số (xảy ra trong cùng lớp - Compile-time).
- **Overriding (Ghi đè)**: Lớp con viết lại hàm của lớp cha (Runtime).
- **Upcasting & Downcasting**:
    - Upcasting (Tự động): Chuyển đối tượng con về kiểu cha (`Animal a = new Dog();`).
    - Downcasting (Thủ công): Chuyển kiểu cha về kiểu con (`Dog d = (Dog) a;`). Cần dùng toán tử `instanceof` để kiểm tra trước khi ép kiểu để tránh lỗi `ClassCastException`.

### 4. Tính trừu tượng (Abstraction)
Chỉ tập trung vào "lớp này làm gì" thay vì "làm như thế nào".
- **Abstract Class**:
    - Có thể chứa cả phương thức có thân và phương thức trừu tượng (không có thân).
    - Dùng để định nghĩa các đặc tính chung cho những lớp con có liên quan mật thiết.
- **Interface**:
    - Là một "bản hợp đồng" về năng lực. Một lớp có thể triển khai (`implements`) **nhiều** Interface.
    - Mặc định các phương thức là `public abstract`.
    - Từ Java 8+: Hỗ trợ `default method` và `static method` có thân.

### 5. Xử lý Chuỗi (String) chuyên sâu
- **Cơ chế String Pool**: Java lưu trữ các chuỗi hằng trong một vùng nhớ riêng (Pool). Khi khai báo `String s = "abc"`, Java sẽ tìm trong Pool trước để tiết kiệm bộ nhớ.
- **Tính bất biến (Immutability)**: Đối tượng String một khi tạo ra sẽ không thể thay đổi. Mọi thao tác thay đổi thực tế là tạo ra một đối tượng String mới.
- **StringBuilder và StringBuffer**:
    - Dùng khi cần cộng chuỗi liên tục (vòng lặp).
    - `StringBuilder`: Nhanh nhưng không an toàn đa luồng.
    - `StringBuffer`: Chậm hơn chút nhưng an toàn đa luồng (Thread-safe).

### 6. Kiểu liệt kê (Enum)
Enum trong Java rất mạnh mẽ, nó là một Class đặc biệt.
- Dùng để định nghĩa tập hợp các hằng số cố định (Thứ, Tháng, Trạng thái đơn hàng).
- Có thể có thuộc tính, constructor (luôn là `private`) và phương thức riêng.

## Danh sách bài học

| STT | Tên bài | Mô tả chi tiết | Tham khảo |
|:---:|:---|:---|:---|
| 01 | [OOP-Package](./OOP-Package) | Cách tổ chức thư mục mã nguồn và quy tắc đặt tên package. | https://www.w3schools.com/java/java_packages.asp |
| 02 | [OOP-Public-Protected-Private](./OOP-Public-Protected-Private) | Phân tích sâu các cấp độ bảo mật và truy cập dữ liệu. | https://www.w3schools.com/java/java_modifiers.asp |
| 03 | [OOP-Overloading](./OOP-Overloading) | Kỹ thuật đa dạng hóa hành vi cùng tên trong một lớp. | https://www.geeksforgeeks.org/method-overloading-in-java/ |
| 04 | [OOP-Inheritance](./OOP-Inheritance) | Mối quan hệ kế thừa và sức mạnh của việc tái sử dụng code. | https://www.w3schools.com/java/java_inheritance.asp |
| 05 | [OOP-Interihance-TT](./OOP-Interihance-TT) | Các bài tập thực hành kế thừa lồng nhau phức tạp. | - |
| 06 | [OOP-Overriding](./OOP-Overriding) | Ghi đè hành vi và tính đa hình tại thời điểm thực thi. | https://www.geeksforgeeks.org/overriding-in-java/ |
| 07 | [OOP-Abstract](./OOP-Abstract) | Xây dựng khung sườn ứng dụng với các lớp trừu tượng. | https://www.w3schools.com/java/java_abstract.asp |
| 08 | [OOP-Interface](./OOP-Interface) | Triển khai đa giao diện và các tính năng mới từ Java 8+. | https://www.w3schools.com/java/java_interface.asp |
| 09 | [OOP-Abstract-Interihance](./OOP-Abstract-Interihance) | Kết hợp mô hình trừu tượng hóa đa tầng trong ứng dụng. | - |
| 10 | [OOP-String](./OOP-String) | Nhập môn Chuỗi, so sánh Pool và Heap memory. | https://www.w3schools.com/java/java_strings.asp |
| 11 | [OOP-String1](./OOP-String1) | Các hàm so sánh chuỗi nâng cao (compareTo, equalsIgnoreCase). | - |
| 12 | [OOP-String2](./OOP-String2) | Kỹ thuật tìm kiếm và thay thế trong nội dung văn bản. | - |
| 13 | [OOP-String3](./OOP-String3) | Cắt chuỗi và các mẹo tối ưu hóa hiệu năng với StringBuilder. | - |
| 14 | [Phan-Tach-Chuoi-Thanh-Mang](./Phan-Tach-Chuoi-Thanh-Mang) | Xử lý chuỗi thô thành mảng bằng split và Regex cơ bản. | - |
| 15 | [Enum](./Enum) | Xây dựng các hằng số thông minh và linh hoạt trong ứng dụng. | https://www.w3schools.com/java/java_enums.asp |

---

## Tài liệu tham khảo mở rộng
- Java Polymorphism Guide: https://www.baeldung.com/java-polymorphism
- Java String Pool Internal: https://www.digitalocean.com/community/tutorials/java-string-pool-concepts
- Abstract Class vs Interface: https://www.geeksforgeeks.org/difference-between-abstract-class-and-interface-in-java/
- Java Enums Advanced Usage: https://www.baeldung.com/a-guide-to-java-enums
