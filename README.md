SYSTEM DESGIN PROJECT
1. Thiết kế các lớp (Class Design)
1.1. Lớp Student
id (String): mã sinh viên
name (String): tên sinh viên
classes (List<Classroom>): danh sách lớp học mà sinh viên tham gia
1.2. Lớp Teacher
id (String): mã giáo viên
name (String): tên giáo viên
subjects (List<Subject>): danh sách môn học mà giáo viên giảng dạy
1.3. Lớp Subject
id (String): mã môn học
name (String): tên môn học
teacher (Teacher): giáo viên dạy môn này
1.4. Lớp Classroom
id (String): mã lớp học
name (String): tên lớp học
subjects (List<Subject>): danh sách môn học của lớp
students (List<Student>): danh sách sinh viên tham gia lớp
2. Thiết kế chức năng quản lý (Management Functions)
2.1. Quản lý Student
Thêm mới sinh viên
Sửa thông tin sinh viên
Xóa sinh viên
2.2. Quản lý Teacher
Thêm mới giáo viên
Sửa thông tin giáo viên
Xóa giáo viên
2.3. Quản lý Subject
Thêm mới môn học
Sửa thông tin môn học
Xóa môn học
2.4. Quản lý Classroom
Thêm mới lớp học
Sửa thông tin lớp học
Xóa lớp học
Phân lớp cho sinh viên
Phân môn học cho lớp
Phân giáo viên cho môn học
3. Giao diện Console
Menu chính: Chọn chức năng quản lý (Student, Teacher, Subject, Classroom)
Các menu con: Thêm, sửa, xóa, phân lớp, phân môn học, phân giáo viên
4. Mô hình MVC
Model: Chứa các lớp dữ liệu (Student, Teacher, Subject, Classroom)
View: Chứa các lớp liên quan đến giao diện người dùng (hiển thị menu và nhận input)
Controller: Chứa các lớp điều khiển (quản lý các chức năng thêm, sửa, xóa,...)
5. Multi-threading
Sử dụng để xử lý các chức năng đọc/ghi file
6. Caching
Sử dụng bộ nhớ đệm để tăng tốc độ truy xuất dữ liệu
7. Constants và Enum
Sử dụng constants và enum để định nghĩa các giá trị cố định (như các lựa chọn trong menu)
8. Data Persistence
Đọc/ghi dữ liệu từ/to file data.dat
Sử dụng Serializable để chuyển đổi đối tượng thành byte khi lưu file
