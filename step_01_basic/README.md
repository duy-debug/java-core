# Step 01: Nền tảng lập trình Java (Basic)

Chương này là bước khởi đầu quan trọng, cung cấp cái nhìn toàn diện và sâu sắc nhất về ngôn ngữ Java. Chúng ta sẽ đi từ cấu trúc hệ thống tầng thấp đến các cú pháp lập trình cơ bản mà mọi kỹ sư Java đều phải nằm lòng.

## Lý thuyết chuyên sâu và Đầy đủ

### 1. Hệ sinh thái và Kiến trúc Java
Để hiểu tại sao Java chạy được ở mọi nơi, ta cần phân tích 3 thành phần cốt lõi:
- **JVM (Java Virtual Machine)**: Là trái tim của Java. Nó không chỉ chạy Bytecode mà còn quản lý bộ nhớ, thực hiện Garbage Collection và tối ưu hóa hiệu năng (JIT Compiler). Mỗi hệ điều hành có một bản JVM riêng, đó là lý do Bytecode (`.class`) có thể chạy xuyên nền tảng.
- **JRE (Java Runtime Environment)**: Là môi trường thực thi. Nó bao gồm JVM và các thư viện lớp chuẩn (Standard Class Libraries) như `java.lang`, `java.util` để ứng dụng có thể chạy được.
- **JDK (Java Development Kit)**: Là bộ công cụ dành cho nhà phát triển. Nó bao gồm JRE và các công cụ phát triển như `javac` (trình biên dịch), `jdb` (trình gỡ lỗi), `jar` (đóng gói).

**Quy trình thực thi**:
1. Lập trình viên viết mã nguồn trong file `.java`.
2. `javac` biên dịch file `.java` thành mã Bytecode trong file `.class`.
3. JVM nạp file `.class` và thông dịch/biên dịch (JIT) thành mã máy của hệ điều hành tương ứng để thực thi.

### 2. Thành phần cơ bản của chương trình Java
- **Class**: Mọi mã nguồn đều phải nằm trong một Lớp. Tên class chứa hàm `main` phải trùng hoàn toàn với tên file.
- **Hàm `main`**: `public static void main(String[] args)` là điểm bắt đầu (entry point) của chương trình.
    - `public`: Cho phép JVM gọi hàm từ bên ngoài lớp.
    - `static`: Cho phép gọi hàm mà không cần tạo đối tượng của lớp.
    - `void`: Hàm không trả về giá trị.
    - `String[] args`: Tham số dòng lệnh được truyền vào dưới dạng mảng chuỗi.
- **Comments (Ghi chú)**:
    - `//`: Ghi chú một dòng.
    - `/* ... */`: Ghi chú nhiều dòng.
    - `/** ... */`: Javadoc comment, dùng để tạo tài liệu tự động.

### 3. Biến và Kiểu dữ liệu (Toàn diện)
#### a. Quy tắc đặt tên (Naming Conventions)
- **Biến/Hành động**: Dùng `camelCase` (vd: `hoVaTen`, `tinhTong`).
- **Lớp (Class)**: Dùng `PascalCase` (vd: `SinhVien`, `MainController`).
- **Hằng số**: Dùng `UPPER_CASE` với dấu gạch nối (vd: `MAX_VALUE`, `PI`).
- **Quy tắc bắt buộc**: Không bắt đầu bằng số, không chứa ký tự đặc biệt (trừ `$` và `_`), không trùng từ khóa của Java.

#### b. Kiểu dữ liệu nguyên thủy (Primitive Types)
| Kiểu | Byte | Giá trị mặc định | Đặc điểm |
|:---|:---:|:---:|:---|
| **byte** | 1 | 0 | Phù hợp cho luồng dữ liệu thô (IO). |
| **short** | 2 | 0 | Ít dùng trong thực tế hiện đại. |
| **int** | 4 | 0 | Kiểu mặc định cho các số nguyên. |
| **long** | 8 | 0L | Dùng cho số rất lớn (vd: ID, timestamp). Cần hậu tố `L`. |
| **float** | 4 | 0.0f | Độ chính xác đơn. Cần hậu tố `f`. |
| **double**| 8 | 0.0d | Kiểu mặc định cho số thực. Độ chính xác gấp đôi float. |
| **boolean**| - | false | Chỉ nhận `true` hoặc `false`. |
| **char** | 2 | '\u0000' | Lưu 1 ký tự Unicode (dùng dấu nháy đơn `'A'`). |

#### c. Kiểu dữ liệu tham chiếu (Reference Types)
- Lưu địa chỉ bộ nhớ trỏ đến đối tượng trên Heap.
- **String**: Chuỗi ký tự (dùng dấu nháy kép `"Hello"`).
- **Array**: Tập hợp các phần tử cùng kiểu.

#### d. Hằng số (Constants)
Sử dụng từ khóa `final`. Biến được khai báo `final` sẽ không thể thay đổi giá trị sau khi gán lần đầu.

### 4. Ép kiểu (Type Casting)
- **Nới rộng (Widening)**: `byte -> short -> char -> int -> long -> float -> double`. Java tự động thực hiện vì không mất dữ liệu.
- **Thu hẹp (Narrowing)**: `double -> float -> long -> int -> char -> short -> byte`. Phải ép kiểu thủ công: `int a = (int) 5.9;` (kết quả `a = 5`). Cẩn thận vì có thể gây tràn số hoặc mất độ chính xác.

### 5. Toán tử (Operators)
- **Số học**: `+`, `-`, `*`, `/` (chia nguyên), `%` (chia dư), `++`, `--`.
    - Phân biệt `i++` (dùng rồi mới tăng) và `++i` (tăng rồi mới dùng).
- **Gán**: `=`, `+=`, `-=`, `*=`, `/=`, `%=`.
- **So sánh**: `==`, `!=`, `>`, `<`, `>=`, `<=`.
- **Logic**:
    - `&&` (AND): Trả về true nếu cả hai vế đúng. Có tính ngắn mạch (nếu vế 1 sai, vế 2 không chạy).
    - `||` (OR): Trả về true nếu ít nhất một vế đúng. Có tính ngắn mạch (nếu vế 1 đúng, vế 2 không chạy).
    - `!` (NOT): Đảo ngược giá trị logic.
- **Toán tử 3 ngôi**: `biến = (điều kiện) ? giá trị1 : giá trị2;`.

### 6. Nhập xuất dữ liệu
- **Xuất (Output)**:
    - `System.out.print()`: In không xuống dòng.
    - `System.out.println()`: In và tự động xuống dòng.
    - `System.out.printf()`: In có định dạng (vd: `%d` cho số nguyên, `%.2f` cho số thực).
- **Nhập (Input)**: Dùng lớp `Scanner`.
    - `sc.next()`: Đọc 1 từ (dừng khi gặp khoảng trắng).
    - `sc.nextLine()`: Đọc cả dòng (xử lý được khoảng trắng).
    - `sc.nextInt()`, `sc.nextDouble()`: Đọc số tương ứng.
    - **Mẹo**: Sau khi gọi `nextXXX()` mà gọi `nextLine()`, hãy thêm một lệnh `sc.nextLine()` để xóa bộ nhớ đệm (buffer).

### 7. Cấu trúc điều khiển (Control Flow)
- **Rẽ nhánh**:
    - `if-else`: Dùng cho các điều kiện logic.
    - `switch-case`: Tối ưu khi so sánh giá trị cụ thể. Hỗ trợ `byte, short, char, int, String, Enum`. Cần `break` để thoát khỏi case, nếu không sẽ xảy ra tình trạng "fall-through".
- **Vòng lặp**:
    - `for`: Lặp với số lần biết trước.
    - `while`: Kiểm tra điều kiện trước, lặp sau (có thể không chạy lần nào).
    - `do-while`: Chạy 1 lần trước, sau đó mới kiểm tra điều kiện (luôn chạy ít nhất 1 lần).
- **Lệnh điều hướng**:
    - `break`: Thoát hẳn khỏi vòng lặp/switch.
    - `continue`: Bỏ qua các lệnh còn lại trong lần lặp này và bắt đầu lần lặp kế tiếp.

## Danh sách bài học

| STT | Tên bài | Mô tả chi tiết | Tham khảo |
|:---:|:---|:---|:---|
| 01 | [Hello](./Hello) | Cấu trúc class, hàm main và in dữ liệu ra console. | https://www.w3schools.com/java/java_getstarted.asp |
| 02 | [variable](./variable) | Khai báo biến, hằng số và quy tắc đặt tên camelCase. | https://www.w3schools.com/java/java_variables.asp |
| 03 | [DataType](./DataType) | Phân biệt kiểu Primitive vs Reference, cơ chế ép kiểu. | https://www.geeksforgeeks.org/data-types-in-java/ |
| 04 | [Const](./Const) | Cách dùng final và static final cho biến toàn cục. | https://www.w3schools.com/java/java_variables_final.asp |
| 05 | [Operator](./Operator) | Toán tử số học, logic và độ ưu tiên thực hiện. | https://www.w3schools.com/java/java_operators.asp |
| 06 | [If-else](./If-else) | Cấu trúc rẽ nhánh đơn, kép và lồng nhau. | https://www.w3schools.com/java/java_conditions.asp |
| 07 | [Switch-Case](./Switch-Case) | Sử dụng switch-case tối ưu và từ khóa break. | https://www.w3schools.com/java/java_switch.asp |
| 08 | [for](./for) | Vòng lặp đếm số lần và kỹ thuật lặp lồng (Nested Loops). | https://www.w3schools.com/java/java_for_loop.asp |
| 09 | [While](./While) | Vòng lặp dựa trên điều kiện và vòng lặp do-while. | https://www.w3schools.com/java/java_while_loop.asp |

---

## Tài liệu tham khảo mở rộng
- Java Virtual Machine (JVM) internals: https://www.geeksforgeeks.org/jvm-works-jvm-architecture/
- Java Type Casting guide: https://www.w3schools.com/java/java_type_casting.asp
- Java Output formatting: https://www.baeldung.com/java-printf
