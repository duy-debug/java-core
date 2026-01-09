# Step 05: Collections Framework và Generics

Chương này tập trung vào các cấu trúc dữ liệu động mạnh mẽ của Java, giúp quản lý hàng triệu dữ liệu một cách tối ưu và an toàn.

## Lý thuyết chuyên sâu

### 1. Generics - Tại sao lại quan trọng?
- **Khái niệm**: Cho phép tham số hóa kiểu dữ liệu, giúp một Class/Method có thể làm việc với mọi loại dữ liệu mà vẫn đảm bảo **Type-safety** lúc compile.
- **Ký hiệu thông dụng**: `<T>` (Type), `<E>` (Element), `<K>` (Key), `<V>` (Value).
- **Wildcards (`?`)**: 
    - `<? extends T>`: Chỉ chấp nhận T hoặc các lớp con của T (Upper bound).
    - `<? super T>`: Chỉ chấp nhận T hoặc các lớp cha của T (Lower bound).

### 2. Collection Hierarchy (Chi tiết cấu trúc bên trong)
Tất cả đều kế thừa từ interface `Iterable`.
- **List Interface**: Bảo toàn thứ tự thêm vào.
    - `ArrayList`: Dùng mảng động. Khi mảng đầy, nó tự tạo mảng mới lớn hơn ~1.5 lần và copy dữ liệu qua. Truy cập theo index cực nhanh $O(1)$.
    - `LinkedList`: Dùng danh sách liên kết đôi (Doubly Linked List). Thêm/xóa ở đầu/cuối cực nhanh $O(1)$.
- **Set Interface**: Không cho phép trùng lặp.
    - `HashSet`: Dùng cấu trúc **HashTable**. Tốc độ thêm/xóa/sửa gần như bằng $O(1)$.
    - `TreeSet`: Dùng cấu trúc **Red-Black Tree**. Các phần tử luôn được sắp xếp tự động.
- **Queue/Deque Interface**:
    - `PriorityQueue`: Sắp xếp phần tử theo mức độ ưu tiên.
    - `ArrayDeque`: Hàng đợi hai đầu nhanh hơn `Stack` và `LinkedList` cũ.

### 3. Sắp xếp đối tượng (Comparable vs Comparator)
- **Comparable**: Dùng để định nghĩa thứ tự "tự nhiên" cho class (Ví dụ: Sinh viên xếp theo ID). Triển khai `compareTo()`.
- **Comparator**: Dùng để định nghĩa nhiều chiến lược sắp xếp khác nhau mà không cần sửa code của class gốc (Ví dụ: Xếp sinh viên theo Tên, theo Điểm, theo Tuổi). Triển khai `compare()`.

### 4. Các thuật toán với Collections Class
Lớp `java.util.Collections` (có chữ 's') cung cấp các phương thức tĩnh:
- `sort()`: Sắp xếp.
- `reverse()`: Đảo ngược.
- `shuffle()`: Trộn ngẫu nhiên.
- `binarySearch()`: Tìm kiếm nhị phân trên List.
- `unmodifiableCollection()`: Biến một collection thành dạng chỉ đọc (Read-only).

## Danh sách bài học

| STT | Tên bài | Mô tả chi tiết | Tham khảo |
|:---:|:---|:---|:---|
| 01 | [Generic](./Generic) | Cách thiết lập Class và Phương thức tổng quát an toàn. | [W3Schools](https://www.w3schools.com/java/java_generic.asp) |
| 02 | [QuanLyDanhSachSV-ArrayList](./QuanLyDanhSachSV-ArrayList) | Project: Thêm, sửa, xóa, tìm kiếm, sắp xếp danh sách SV. | [W3Schools](https://www.w3schools.com/java/java_arraylist.asp) |
| 03 | [Stack-Java](./Stack-Java) | Ứng dụng Stack để giải các bài toán đảo ngược, hậu tố. | [GeeksforGeeks](https://www.geeksforgeeks.org/stack-class-in-java/) |
| 04 | [Queue-Deque](./Queue-Deque) | Quản lý hàng đợi và hàng đợi ưu tiên trong thực tế. | [GeeksforGeeks](https://www.geeksforgeeks.org/queue-interface-java/) |
| 05 | [SET](./SET) | Kỹ thuật lọc bỏ dữ liệu trùng lặp và so sánh các tập hợp. | [W3Schools](https://www.w3schools.com/java/java_hashset.asp) |
| 06 | [compareTo-Comparable](./compareTo-Comparable) | Làm chủ việc sắp xếp các đối tượng phức tạp đa tiêu chí. | [GeeksforGeeks](https://www.geeksforgeeks.org/comparable-interface-in-java-with-examples/) |

---

## Tài liệu tham khảo mở rộng
- [Internal Working of ArrayList in Java](https://www.geeksforgeeks.org/internal-working-of-arraylist-in-java/)
- [Java Collections Comprehensive Guide](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html)
