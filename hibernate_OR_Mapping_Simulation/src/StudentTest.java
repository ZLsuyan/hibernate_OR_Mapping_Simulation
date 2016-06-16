
import com.hit.hibernate.model.Student;



public class StudentTest {
	public static void main(String[] args) throws Exception {
		Student s = new Student();
		s.setId(2);
		s.setName("s2");
		s.setAge(2);

		Session session = new Session();

		session.save(s);

	}
}
