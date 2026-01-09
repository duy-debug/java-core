# Step 03: Hướng đối tượng cơ bản (OOP Basic)

Hướng đối tượng (Object-Oriented Programming) là tinh túy của Java. Chương này phân tích chi tiết cách tư duy và triển khai ứng dụng theo mô hình đối tượng.

## Lý thuyết chuyên sâu

### 1. 4 Tính chất cốt lõi của OOP
1.  **Tính đóng gói (Encapsulation)**: Che giấu thông tin, bảo vệ tính toàn vẹn của dữ liệu qua Getter/Setter.
2.  **Tính kế thừa (Inheritance)**: Tái sử dụng mã nguồn. (Xem chi tiết Step 04).
3.  **Tính đa hình (Polymorphism)**: Một hành động có nhiều biểu hiện khác nhau. (Xem chi tiết Step 04).
4.  **Tính trừu tượng (Abstraction)**: Tập trung vào "cái gì" thay vì "như thế nào". (Xem chi tiết Step 04).

### 2. Chi tiết về Lớp (Class) và Đối tượng (Object)
- **Cơ chế lưu trữ**:
    - **Stack**: Lưu biến tham chiếu và các biến nguyên thủy trong phương thức.
    - **Heap**: Lưu trữ toàn bộ dữ liệu của Đối tượng được tạo bằng `new`. Khi không còn biến tham chiếu nào trỏ đến, **Garbage Collector (GC)** sẽ tự động dọn dẹp đối tượng này.
- **Biến Static (Class Variable)**: Thuộc về lớp, dùng chung cho tất cả đối tượng.
- **Biến Instance**: Thuộc về từng đối tượng cụ thể.

### 3. Constructor chuyên sâu
- **Constructor Chaining**: Kỹ thuật gọi constructor này từ constructor kia bằng `this()`.
- **Constructor mặc định**: Java chỉ tạo nếu bạn không khai báo bất kỳ constructor nào. Nếu đã khai báo constructor có tham số, bạn **phải** tự khai báo lại constructor không tham số nếu muốn dùng.
```java
public class SinhVien {
    String ten;
    public SinhVien() { this("Chưa có tên"); } // Chaining
    public SinhVien(String ten) { this.ten = ten; }
}
```

### 4. Phương thức của lớp Object (Tất cả lớp đều kế thừa)
- `toString()`: Nên ghi đè để hiển thị trạng thái đối tượng khi Debug.
- `equals(Object obj)`: Cần ghi đè để so sánh logic (ví dụ: hai sinh viên trùng mã số là bằng nhau).
- `hashCode()`: Nếu ghi đè `equals`, bắt buộc phải ghi đè `hashCode` để đảm bảo hoạt động đúng trong `HashMap`, `HashSet`.
- `clone()`: Tạo bản sao đối tượng (Shallow vs Deep Copy).

## Danh sách bài học

| STT | Tên bài | Mô tả chi tiết | Tham khảo |
|:---:|:---|:---|:---|
| 01 | [OOP-1-Class](./OOP-1-Class) | Khai báo lớp, thuộc tính, hành vi và từ khóa this. | [W3Schools](https://www.w3schools.com/java/java_classes.asp) |
| 02 | [OOP-2-HoaDonCafe](./OOP-2-HoaDonCafe) | Thực hành phân tích nghiệp vụ thực tế thành đối tượng. | - |
| 03 | [OOP-3-GET-SET](./OOP-3-GET-SET) | Quy tắc đóng gói dữ liệu và xử lý logic trong Setter. | [W3Schools](https://www.w3schools.com/java/java_encapsulation.asp) |
| 04 | [OOP-4-ToString](./OOP-4-ToString) | Tùy biến hiển thị đối tượng cho việc log/in ấn. | [GeeksforGeeks](https://www.geeksforgeeks.org/object-tostring-method-in-java/) |
| 05 | [OOP-5-equals-hascode](./OOP-5-equals-hascode) | Hợp đồng giữa equals và hashCode - Logic so sánh sâu. | [GeeksforGeeks](https://www.geeksforgeeks.org/equals-hashcode-methods-java/) |
| 06 | [OOP-QuanLySach](./OOP-QuanLySach) | Quản lý sách phức hợp (Class Sach chứa Class Ngay). | - |
| 07 | [OOP-QuanLyMayTinh](./OOP-QuanLyMayTinh) | Mối quan hệ giữa Máy tính, Hãng sản xuất và Quốc gia. | - |
| 08 | [OOP-QuanLyBoPhim](./OOP-QuanLyBoPhim) | Thiết kế hệ thống quản lý vé xem phim. | - |
| 09 | [OOP-QuanLySinhVien](./OOP-QuanLySinhVien) | Quản lý thông tin học tập và xếp loại sinh viên. | - |

---

## Tài liệu tham khảo mở rộng
- [Java Memory Model: Stack vs Heap](https://www.baeldung.com/java-stack-heap)
- [Why hashing is important for equals & hashCode](https://www.digitalocean.com/community/tutorials/java-equals-hashcode)
