# Step 01: Nền tảng lập trình Java (Basic)

Chương này cung cấp kiến thức nền tảng toàn diện và chi tiết nhất về ngôn ngữ lập trình Java, từ kiến trúc hệ thống đến các cấu trúc dữ liệu và điều khiển cơ bản.

## Lý thuyết chuyên sâu

### 1. Kiến trúc Java và Cơ chế hoạt động
- **JVM (Java Virtual Machine)**: Máy ảo Java, nơi thực thi mã Bytecode. Giúp Java có tính độc lập nền tảng.
- **JRE (Java Runtime Environment)**: Bao gồm JVM và các thư viện cần thiết để chạy ứng dụng Java.
- **JDK (Java Development Kit)**: Công cụ đầy đủ cho lập trình viên (bao gồm JRE và các công cụ như `javac`).
- **Cơ chế**: Source Code (`.java`) --[Compiler]--> Bytecode (`.class`) --[JVM]--> Machine Code.

### 2. Biến và Kiểu dữ liệu (Tối đa chi tiết)
#### a. Kiểu dữ liệu nguyên thủy (Primitive Types)
| Kiểu | Kích thước | Giá trị mặc định | Khoảng giá trị |
|:---|:---:|:---:|:---|
| **byte** | 1 byte | 0 | -128 đến 127 |
| **short** | 2 bytes | 0 | -32,768 đến 32,767 |
| **int** | 4 bytes | 0 | -2^31 đến 2^31-1 |
| **long** | 8 bytes | 0L | -2^63 đến 2^63-1 (Hậu tố 'L') |
| **float** | 4 bytes | 0.0f | Độ chính xác 6-7 chữ số thập phân (Hậu tố 'f') |
| **double**| 8 bytes | 0.0d | Độ chính xác 15 chữ số thập phân |
| **boolean**| 1 bit | false | true hoặc false |
| **char** | 2 bytes | '\u0000' | Ký tự Unicode (0 đến 65,535) |

#### b. Kiểu dữ liệu tham chiếu (Reference Types)
Lưu trữ địa chỉ của đối tượng trong bộ nhớ Heap. Bao gồm: `String`, `Array`, `Class`, `Interface`.

#### c. Ép kiểu (Type Casting)
- **Nới rộng (Widening)**: Tự động chuyển kiểu nhỏ sang lớn (`int` -> `double`).
- **Thu hẹp (Narrowing)**: Chuyển kiểu lớn sang nhỏ, phải ép thủ công và có thể mất dữ liệu:
```java
double d = 9.78;
int i = (int) d; // i = 9
```

### 3. Toán tử và Độ ưu tiên
- **Toán tử số học**: `+`, `-`, `*`, `/`, `%` (chia lấy dư), `++` (tăng 1), `--` (giảm 1).
- **Toán tử so sánh**: `==`, `!=`, `>`, `<`, `>=`, `<=`.
- **Toán tử logic**: 
    - `&&`: AND (Ngắn mạch - nếu vế đầu sai thì không xét vế sau).
    - `||`: OR (Ngắn mạch - nếu vế đầu đúng thì không xét vế sau).
    - `!`: NOT.
- **Toán tử điều kiện (Ternary)**: `variable = (condition) ? valueTrue : valueFalse;`.

### 4. Nhập xuất dữ liệu với Scanner
Lớp `Scanner` hỗ trợ đọc từ luồng nhập chuẩn (`System.in`).
```java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int n = sc.nextInt(); // Đọc số nguyên
String s = sc.nextLine(); // Đọc cả dòng chuỗi
```
*Lưu ý*: Sau khi dùng `nextInt()` mà dùng `nextLine()` cần có một lệnh `nextLine()` trống để "nuốt" ký tự xuống dòng thừa.

### 5. Cấu trúc điều khiển nâng cao
- **Switch-case**: Từ Java 7 hỗ trợ `String`. Từ Java 12-14 hỗ trợ `Switch Expression`.
- **Vòng lặp For-each**: Dùng để duyệt mảng hoặc Collection cực kỳ ngắn gọn.
```java
for (int x : array) {
    System.out.println(x);
}
```
- **Break và Continue có nhãn (Labeled)**: Cho phép thoát ra khỏi một vòng lặp cụ thể khi có nhiều vòng lặp lồng nhau.
```java
outer: for (...) {
    inner: for (...) {
        if (...) break outer; // Thoát hẳn vòng lặp ngoài
    }
}
```

## Danh sách bài học

| STT | Tên bài | Mô tả chi tiết | Tham khảo |
|:---:|:---|:---|:---|
| 01 | [Hello](./Hello) | Cấu trúc class, hàm main và in dữ liệu ra console. | [W3Schools](https://www.w3schools.com/java/java_getstarted.asp) |
| 02 | [variable](./variable) | Khai báo biến, hằng số và quy tắc đặt tên camelCase. | [W3Schools](https://www.w3schools.com/java/java_variables.asp) |
| 03 | [DataType](./DataType) | Phân biệt kiểu Primitive vs Reference, cơ chế ép kiểu. | [GeeksforGeeks](https://www.geeksforgeeks.org/data-types-in-java/) |
| 04 | [Const](./Const) | Cách dùng final và static final cho biến toàn cục. | [W3Schools](https://www.w3schools.com/java/java_variables_final.asp) |
| 05 | [Operator](./Operator) | Toán tử số học, logic và độ ưu tiên thực hiện. | [W3Schools](https://www.w3schools.com/java/java_operators.asp) |
| 06 | [If-else](./If-else) | Cấu trúc rẽ nhánh đơn, kép và lồng nhau. | [W3Schools](https://www.w3schools.com/java/java_conditions.asp) |
| 07 | [Switch-Case](./Switch-Case) | Sử dụng switch-case tối ưu và từ khóa break. | [W3Schools](https://www.w3schools.com/java/java_switch.asp) |
| 08 | [for](./for) | Vòng lặp đếm số lần và kỹ thuật lặp lồng (Nested Loops). | [W3Schools](https://www.w3schools.com/java/java_for_loop.asp) |
| 09 | [While](./While) | Vòng lặp dựa trên điều kiện và vòng lặp do-while. | [W3Schools](https://www.w3schools.com/java/java_while_loop.asp) |

---

## Tài liệu tham khảo mở rộng
- [Java Virtual Machine (JVM) internals](https://www.geeksforgeeks.org/jvm-works-jvm-architecture/)
- [Java Type Casting guide](https://www.w3schools.com/java/java_type_casting.asp)
