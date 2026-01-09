# Step 05: Collections Framework và Generics

Chương này tập trung vào các cấu trúc dữ liệu động mạnh mẽ của Java, giúp bạn quản lý hàng triệu dữ liệu một cách tối ưu, linh hoạt và an toàn về kiểu dữ liệu.

## Lý thuyết chuyên sâu và Đầy đủ

### 1. Generics - Lập trình tổng quát
Generics cho phép bạn truyền "kiểu dữ liệu" như một tham số cho Class, Interface hoặc Method.
- **Mục tiêu**: 
    - **An toàn về kiểu (Type-safety)**: Phát hiện lỗi sai kiểu ngay lúc biên dịch (Compile-time) thay vì lúc chạy (Runtime).
    - **Loại bỏ ép kiểu (Eliminate casting)**: Không cần dùng `(Kiểu) object` phiền phức và rủi ro.
    - **Tái sử dụng mã nguồn**: Một thuật toán có thể dùng cho nhiều kiểu dữ liệu khác nhau.
- **Ký hiệu thông dụng**: `<T>` (Type), `<E>` (Element), `<K>` (Key), `<V>` (Value).
- **Wildcards (`?`)**:
    - `<?>`: Unbounded wildcard (kiểu gì cũng được).
    - `<? extends T>`: Upper Bounded (T hoặc các lớp con của T) - Dùng khi chỉ muốn đọc dữ liệu.
    - `<? super T>`: Lower Bounded (T hoặc các lớp cha của T) - Dùng khi muốn ghi dữ liệu.

### 2. Tổng quan về Java Collections Framework (JCF)
Tất cả các cấu trúc trong JCF đều nằm trong gói `java.util` và kế thừa từ Interface gốc là `Collection` (ngoại trừ `Map`).

#### a. List Interface (Danh sách có thứ tự, cho phép trùng lặp)
- **ArrayList**: 
    - Dùng mảng động bên trong. Khi đầy, nó tự tạo mảng mới lớn hơn ~1.5 lần.
    - **Ưu điểm**: Truy cập phần tử qua Index cực nhanh ($O(1)$).
    - **Nhược điểm**: Thêm/Xóa ở giữa danh sách chậm vì phải dịch chuyển các phần tử khác.
- **LinkedList**:
    - Dùng cấu trúc danh sách liên kết đôi (Nodes).
    - **Ưu điểm**: Thêm/Xóa ở đầu hoặc cuối cực nhanh ($O(1)$).
    - **Nhược điểm**: Truy cập phần tử chậm vì phải duyệt từ đầu danh sách ($O(n)$).

#### b. Set Interface (Tập hợp không thứ tự, KHÔNG cho phép trùng lặp)
Dùng để lưu trữ các phần tử duy nhất.
- **HashSet**: Dùng bảng băm (Hashing). Tốc độ thêm/xóa/tìm kiếm cực nhanh ($O(1)$). Không bảo toàn thứ tự.
- **LinkedHashSet**: Giống HashSet nhưng bảo toàn thứ tự thêm vào.
- **TreeSet**: Các phần tử được sắp xếp tự động theo thứ tự tăng dần (dùng cấu trúc Cây đỏ đen). Truy cập chậm hơn HashSet ($O(\log n)$).

#### c. Queue & Deque (Hàng đợi)
- **Queue**: FIFO (First-In-First-Out).
- **PriorityQueue**: Phần tử được lấy ra dựa trên độ ưu tiên thay vì thứ tự thêm vào.
- **Deque**: Hàng đợi hai đầu (Double-ended queue), có thể thêm/xóa ở cả hai đầu.

### 3. Sắp xếp đối tượng (Sorting)
Để sắp xếp một danh sách các đối tượng phức tạp (vd: Danh sách SinhVien), Java cung cấp 2 Interface:
- **Comparable**: 
    - Triển khai phương thức `compareTo(T o)` bên trong Class của đối tượng. 
    - Quy định thứ tự sắp xếp "mặc định" (vốn có) của đối tượng đó.
- **Comparator**: 
    - Tạo một Class riêng biệt triển khai `compare(T o1, T o2)`. 
    - Cho phép tạo ra nhiều chiến lược sắp xếp khác nhau (vd: theo Tên, theo Tuổi, theo Điểm) mà không cần sửa code của Class gốc.

### 4. Lớp tiện ích `java.util.Collections`
Khác với Interface `Collection`, lớp `Collections` (có chữ 's') cung cấp các phương thức tĩnh để thao tác trên tập hợp:
- `sort()`: Sắp xếp.
- `shuffle()`: Trộn ngẫu nhiên.
- `reverse()`: Đảo ngược danh sách.
- `binarySearch()`: Tìm kiếm nhị phân (trên List đã sắp xếp).
- `max()`, `min()`: Tìm phần tử lớn nhất, nhỏ nhất.

## Danh sách bài học

| STT | Tên bài | Mô tả chi tiết | Tham khảo |
|:---:|:---|:---|:---|
| 01 | [Generic](./Generic) | Cách tự định nghĩa Class và Method Generic để tối ưu hóa tái sử dụng code. | https://www.w3schools.com/java/java_generic.asp |
| 02 | [QuanLyDanhSachSV-ArrayList](./QuanLyDanhSachSV-ArrayList) | Project thực tế: Thêm, sửa, xóa, tìm kiếm và quản lý sinh viên bằng ArrayList. | https://www.w3schools.com/java/java_arraylist.asp |
| 03 | [Stack-Java](./Stack-Java) | Tìm hiểu cơ chế LIFO (Last-In-First-Out) và các ứng dụng của ngăn xếp. | https://www.geeksforgeeks.org/stack-class-in-java/ |
| 04 | [Queue-Deque](./Queue-Deque) | Cơ chế FIFO (First-In-First-Out) và quản lý hàng đợi, hàng đợi hai đầu. | https://www.geeksforgeeks.org/queue-interface-java/ |
| 05 | [SET](./SET) | Cách sử dụng HashSet để lọc dữ liệu trùng lặp và so sánh các tập hợp. | https://www.w3schools.com/java/java_hashset.asp |
| 06 | [compareTo-Comparable](./compareTo-Comparable) | Thực hành kỹ thuật sắp xếp đối tượng đa tiêu chí với Comparable và Comparator. | https://www.geeksforgeeks.org/comparable-interface-in-java-with-examples/ |

---

## Tài liệu tham khảo mở rộng
- Internal Working of ArrayList in Java: https://www.geeksforgeeks.org/internal-working-of-arraylist-in-java/
- Java Collections Framework Hierarchy: https://www.javatpoint.com/collections-in-java
- Big-O Complexity of Collections: https://www.jrebel.com/blog/java-collections-cheat-sheet
- Generic Wildcards in Java: https://docs.oracle.com/javase/tutorial/java/generics/wildcards.html
