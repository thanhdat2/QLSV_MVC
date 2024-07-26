SYSTEM DESGIN PROJECT
1. Thiết kế các lớp (Class Design)<br>
1.1. Lớp Student<br>
id (String): mã sinh viên<br>
name (String): tên sinh viên<br>
classes (List<Classroom>): danh sách lớp học mà sinh viên tham gia<br>
1.2. Lớp Teacher<br>
id (String): mã giáo viên<br>
name (String): tên giáo viên<br>
subjects (List<Subject>): danh sách môn học mà giáo viên giảng dạy<br>
1.3. Lớp Subject<br>
id (String): mã môn học<br>
name (String): tên môn học<br>
teacher (Teacher): giáo viên dạy môn này<br>
1.4. Lớp Classroom<br>
id (String): mã lớp học<br>
name (String): tên lớp học<br>
subjects (List<Subject>): danh sách môn học của lớp<br>
students (List<Student>): danh sách sinh viên tham gia lớp<br>
2. Thiết kế chức năng quản lý (Management Functions)<br>
2.1. Quản lý Student<br>
Thêm mới sinh viên<br>
Sửa thông tin sinh viên<br>
Xóa sinh viên<br>
2.2. Quản lý Teacher<br>
Thêm mới giáo viên<br>
Sửa thông tin giáo viên<br>
Xóa giáo viên<br>
2.3. Quản lý Subject<br>
Thêm mới môn học<br>
Sửa thông tin môn học<br>
Xóa môn học<br>
2.4. Quản lý Classroom<br>
Thêm mới lớp học<br>
Sửa thông tin lớp học<br>
Xóa lớp học<br>
Phân lớp cho sinh viên<br>
Phân môn học cho lớp<br>
Phân giáo viên cho môn học<br>
3. Giao diện Console<br>
Menu chính: Chọn chức năng quản lý (Student, Teacher, Subject, Classroom)<br>
Các menu con: Thêm, sửa, xóa, phân lớp, phân môn học, phân giáo viên<br>
4. Mô hình MVC<br>
Model: Chứa các lớp dữ liệu (Student, Teacher, Subject, Classroom)<br>
View: Chứa các lớp liên quan đến giao diện người dùng (hiển thị menu và nhận input)<br>
Controller: Chứa các lớp điều khiển (quản lý các chức năng thêm, sửa, xóa,...)<br>
5. Multi-threading<br>
Sử dụng để xử lý các chức năng đọc/ghi file<br>
6. Caching<br>
Sử dụng bộ nhớ đệm để tăng tốc độ truy xuất dữ liệu<br>
7. Constants và Enum<br>
Sử dụng constants và enum để định nghĩa các giá trị cố định (như các lựa chọn trong menu)<br>
8. Data Persistence<br>
Đọc/ghi dữ liệu từ/to file data.dat<br>
Sử dụng Serializable để chuyển đổi đối tượng thành byte khi lưu file<br>
