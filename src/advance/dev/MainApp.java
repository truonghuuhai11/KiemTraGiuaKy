package advance.dev;

public class MainApp {
	public static void main(String[] args) {
		Person[] persons = new Person[5]; // Khai báo mảng persons chứa 5 phần tử

		input(persons); // Nhập danh sách 3 student và 2 teacher
		print(persons); // Xuất thông tin mảng persons
	}

	// Hàm nhập thông tin cho mảng persons
	public static void input(Person[] persons) {
		persons[0] = new Student("Hải", 18, 8.5, 9.0, 7.5);
		persons[1] = new Student("Tiến", 19, 7.0, 8.0, 8.5);
		persons[2] = new Student("Nguyên", 20, 6.5, 7.5, 6.0);
		persons[3] = new Teacher("Trung", 35, 2.0);
		persons[4] = new Teacher("Hạ", 40, 2.5);
	}

	// Hàm xuất thông tin mảng persons
	public static void print(Person[] persons) {
		for (Person person : persons) {
			System.out.println("Name: " + person.getName());
			System.out.println("Age: " + person.getAge());

			// Kiểm tra xem person có phải là Student hay Teacher để in thông tin phù hợp
			if (person instanceof Student) {
				Student student = (Student) person;
				System.out.println("Toan: " + student.getToan());
				System.out.println("Ly: " + student.getLy());
				System.out.println("Hoa: " + student.getHoa());
				System.out.println("Diem trung binh: " + student.diemTrungBinh());
			} else if (person instanceof Teacher) {
				Teacher teacher = (Teacher) person;
				System.out.println("Hsl: " + teacher.getHsl());
				System.out.println("Luong: " + teacher.tinhLuong());
			}

			System.out.println("--------------------");
		}
	}
}
