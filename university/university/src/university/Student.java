/**
 */
package university;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link university.Student#getName <em>Name</em>}</li>
 *   <li>{@link university.Student#getGrades <em>Grades</em>}</li>
 *   <li>{@link university.Student#getBirthdate <em>Birthdate</em>}</li>
 *   <li>{@link university.Student#getDegree <em>Degree</em>}</li>
 * </ul>
 *
 * @see university.UniversityPackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see university.UniversityPackage#getStudent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link university.Student#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Grades</b></em>' containment reference list.
	 * The list contents are of type {@link university.Grade}.
	 * It is bidirectional and its opposite is '{@link university.Grade#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grades</em>' containment reference list.
	 * @see university.UniversityPackage#getStudent_Grades()
	 * @see university.Grade#getStudent
	 * @model opposite="student" containment="true"
	 * @generated
	 */
	EList<Grade> getGrades();

	/**
	 * Returns the value of the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birthdate</em>' attribute.
	 * @see #setBirthdate(Date)
	 * @see university.UniversityPackage#getStudent_Birthdate()
	 * @model
	 * @generated
	 */
	Date getBirthdate();

	/**
	 * Sets the value of the '{@link university.Student#getBirthdate <em>Birthdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birthdate</em>' attribute.
	 * @see #getBirthdate()
	 * @generated
	 */
	void setBirthdate(Date value);

	/**
	 * Returns the value of the '<em><b>Degree</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link university.Degree#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree</em>' reference.
	 * @see #setDegree(Degree)
	 * @see university.UniversityPackage#getStudent_Degree()
	 * @see university.Degree#getStudents
	 * @model opposite="students"
	 * @generated
	 */
	Degree getDegree();

	/**
	 * Sets the value of the '{@link university.Student#getDegree <em>Degree</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degree</em>' reference.
	 * @see #getDegree()
	 * @generated
	 */
	void setDegree(Degree value);

} // Student
