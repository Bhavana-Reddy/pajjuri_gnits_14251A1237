import java.util.Date;
import java.util.*;
/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if (students == null){
			throw new IllegalArgumentException();
		}		
		this.students = students;
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		
		if (index < 0 || index > students.length - 1) {
			throw new IllegalArgumentException();
		}
		
		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		
		if (students == null){
			throw new IllegalArgumentException();
		}
		
		if (index < 0 || index > students.length - 1) {
			throw new IllegalArgumentException();
		}
		students[index] = student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if (students == null){
			throw new IllegalArgumentException();
		}
		students[0] = student;
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if (students == null){
			throw new IllegalArgumentException();
		}
		students[students.length] = student;
	}

	@Override
	public void add(Student student, int index) {
		if (students == null){
			throw new IllegalArgumentException();
		}
		
		if (index < 0 || index > students.length - 1) {
			throw new IllegalArgumentException();
		}
		students[index] = student;
	}

	@Override
	public void remove(int index) {
		if (index < 0 || index > students.length - 1) {
			throw new IllegalArgumentException();
		}
		students[index] = null;
	}

	@Override
	public void remove(Student student) {
		
		if (students == null){
			throw new IllegalArgumentException();
		}
		int removed =0;
		for (int i =0; i< students.length ; i ++ ){
			if (students[i].compareTo(student) == 0){
				students[i] = null;
				removed =1;
				break;
			}
		}
		if(removed ==0){
			throw new IllegalArgumentException("Student not exists");
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if (index < 0 || index > students.length - 1) {
			throw new IllegalArgumentException();
		}
		for(int i = index +1;i<students.length;i++){
			students[i] = null;
		}
	}

	@Override
	public void removeFromElement(Student student) {
		
		if (students == null){
			throw new IllegalArgumentException();
		}
		int removed =0;
		int i =0;
		for (i =0; i< students.length ; i ++ ){
			if (students[i].compareTo(student) == 0){
				break;
			}
		}
		i++;
		for (; i< students.length ; i ++){
			students[i] = null;
		}
	}

	@Override
	public void removeToIndex(int index) {
		if (index < 0 || index > students.length - 1) {
			throw new IllegalArgumentException();
		}
		for(int i =0;i < index;i++) {
			students[i] = null;
		}
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		if (students == null){
			throw new IllegalArgumentException();
		}
		
		for (int i =0;i< students.length;i++){
			if (students[i].compareTo(student) == 0){
				break;
			} else {
				students[i] =  null;
			}
		}
	}

	@Override
	public void bubbleSort() {
		Arrays.sort(students);
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		
		if (date == null){
			throw new IllegalArgumentException();
		}
		
		int count =0;
		
		for (int i =0;i< students.length;i++) {
			if (students[i].getBirthDate().before(date) ||  students[i].getBirthDate().equals(date) ) {
			} else {
				students[i] = null;
			}
		}
		
		return sameStudents;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		
		if (firstDate == null || lastDate == null){
			throw new IllegalArgumentException();
		}
		
		List<Student> studentList = new ArrayList<Student>();
		
		for (int i =0;i < students.length; i++) {
			if ( ( students[i].getBirthDate().before(lastDate) || students[i].getBirthDate().equals(lastDate) )  && (students[i].getBirthDate().after(firstDate) || students[i].getBirthDate().equals(firstDate) )  ) {
				studentList.add(students[i]);
			}
		}
		
		Student[] studentbeteen = new Student[studentList.size()];
		studentbeteen = studentList.toArray(studentbeteen);

		return studentbeteen;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
