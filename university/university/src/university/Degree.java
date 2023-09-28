/**
 */
package university;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Degree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link university.Degree#getName <em>Name</em>}</li>
 *   <li>{@link university.Degree#getCourses <em>Courses</em>}</li>
 *   <li>{@link university.Degree#getStudents <em>Students</em>}</li>
 * </ul>
 *
 * @see university.UniversityPackage#getDegree()
 * @model
 * @generated
 */
public interface Degree extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see university.UniversityPackage#getDegree_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link university.Degree#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link university.Course#getDegrees <em>Degrees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference.
	 * @see #setCourses(Course)
	 * @see university.UniversityPackage#getDegree_Courses()
	 * @see university.Course#getDegrees
	 * @model opposite="degrees"
	 * @generated
	 */
	Course getCourses();

	/**
	 * Sets the value of the '{@link university.Degree#getCourses <em>Courses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Courses</em>' reference.
	 * @see #getCourses()
	 * @generated
	 */
	void setCourses(Course value);

	/**
	 * Returns the value of the '<em><b>Students</b></em>' reference list.
	 * The list contents are of type {@link university.Student}.
	 * It is bidirectional and its opposite is '{@link university.Student#getDegree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Students</em>' reference list.
	 * @see university.UniversityPackage#getDegree_Students()
	 * @see university.Student#getDegree
	 * @model opposite="degree"
	 * @generated
	 */
	EList<Student> getStudents();

} // Degree
