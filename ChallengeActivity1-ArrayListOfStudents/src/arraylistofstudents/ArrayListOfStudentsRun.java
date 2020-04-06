/** Challenge Activity 1 - Array List of Students
 * 
 * This challenge activity will get you familiar with using ArrayLists of Objects,
 * and the methods associated with ArrayLists.
 * 
 * Below you'll find code to create an ArrayList of Students, and then populate 
 * the students object with 4 students. 
 * 
 * Do the following inside the main method?:
 * 
 * 1) Remove Dave... print the list of students.
 * 2) Add Dave back to the end of the list... print the list of students
 * 3) Change Kim's GPA to 2.0... print the list of students 
 * 4) Add Bill with GPA 1.0 after Sally... print the list of students 
 * 5) Make Kim and Sally swap positions... print the list of students 
 * 
 SAMPLE RUN:
#	Student	GPA
-	-------	-------
0	Bob	2.900000
1	Dave	3.200000
2	Sally	4.000000
3	Kim	3.300000

Removing student Dave...
#	Student	GPA
-	-------	-------
0	Bob	2.900000
1	Sally	4.000000
2	Kim	3.300000

Adding Dave back to the end...
#	Student	GPA
-	-------	-------
0	Bob	2.900000
1	Sally	4.000000
2	Kim	3.300000
3	Dave	3.200000

Changing Kim's GPA to 2.0...
#	Student	GPA
-	-------	-------
0	Bob	2.900000
1	Sally	4.000000
2	Kim	2.000000
3	Dave	3.200000

Adding Bill after Sally...
#	Student	GPA
-	-------	-------
0	Bob	2.900000
1	Sally	4.000000
2	Bill	1.000000
3	Kim	2.000000
4	Dave	3.200000

Make Kim and Sally swap positions...
#	Student	GPA
-	-------	-------
0	Bob	2.900000
1	Kim	2.000000
2	Bill	1.000000
3	Sally	4.000000
4	Dave	3.200000
 */
package arraylistofstudents;

import java.util.ArrayList;

public class ArrayListOfStudentsRun {

	static Student temp;
	
    public static void main(String[] args) {
        // ArrayList are dynamic collections of objects (reference types only)
        ArrayList<Student> students = new ArrayList<>();        
        // Adding some students
        students.add(new Student("Bob",2.9));
        students.add(new Student("Dave",3.2));
        students.add(new Student("Sally",4.0));
        students.add(new Student("Kim", 3.3));        
        printStudents(students);              

        // 1) Remove Dave... print the list of students.
        remove_Dave(students);

        // 2) Add Dave back to the end of the list... print the list of students
        add_dave_back(students);

        // 3) Change Kim's GPA to 2.0... print the list of students 
        change_kim_gpa_to_20(students);

        // 4) Add Bill with GPA 1.0 after Sally... print the list of students 
        add_bill_after_sally(students);

        // 5) Make Kim and Sally swap positions... print the list of students 
        swap_kim_and_sally(students);
        
    }

    /**
     *  This Method swaps the {@link Student Students} Kim and Sally, who are number 1 and 3.
    */
	private static void swap_kim_and_sally(ArrayList<Student> students) {
		System.out.println("Make Kim and Sally swap positions...");  
        temp = students.get(3);
        students.remove(3);
        students.add(1, temp);
        temp = students.get(2);
        students.remove(2);
        students.add(3, temp);
        printStudents(students);
	}

	 /**
     *  This Method adds the {@link Student Student} Bill after Sally.<br>
     *  Bill is Number 2 in the List and has a GPA of 1.0.
    */
	private static void add_bill_after_sally(ArrayList<Student> students) {
		System.out.println("Adding Bill after Sally..."); 
        students.add(2, (new Student("Bill", 1.0)));
        printStudents(students);
	}

	 /**
     *  This Method changes the {@link Student Student} Kim's GPA to 2.0.
    */
	private static void change_kim_gpa_to_20(ArrayList<Student> students) {
		System.out.println("Changing Kim's GPA to 2.0..."); 
        students.get(2).setGPA(2.0);
        printStudents(students);
	}

	 /**
     *  This Method adds the {@link Student Student} Dave to the end of the list.
    */
	private static void add_dave_back(ArrayList<Student> students) {
		System.out.println("Adding Dave back to the end...");
        students.add(temp);
        printStudents(students);
	}

	 /**
     *  This Method removes the {@link Student Student} Dave from the list.
    */
	private static void remove_Dave(ArrayList<Student> students) {
		System.out.println("Removing student Dave...");
        temp = students.get(1);
        students.remove(1);
        printStudents(students);
	}
    
    public static void printStudents(ArrayList<Student> al) {
        System.out.printf("#\tStudent\tGPA\n");
        System.out.printf("-\t-------\t-------\n");
        for(int i=0;i< al.size();i++) {
            System.out.printf("%d\t%s\t%f\n", 
                        i, 
                        al.get(i).getName(), 
                        al.get(i).getGPA());
        }
        System.out.println();
    }
}

