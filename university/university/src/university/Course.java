/**
 */
package university;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link university.Course#getName <em>Name</em>}</li>
 *   <li>{@link university.Course#getEditions <em>Editions</em>}</li>
 *   <li>{@link university.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link university.Course#getDegrees <em>Degrees</em>}</li>
 * </ul>
 *
 * @see university.UniversityPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see university.UniversityPackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link university.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Editions</b></em>' containment reference list.
	 * The list contents are of type {@link university.Edition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editions</em>' containment reference list.
	 * @see university.UniversityPackage#getCourse_Editions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Edition> getEditions();

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(double)
	 * @see university.UniversityPackage#getCourse_Credits()
	 * @model
	 * @generated
	 */
	double getCredits();

	/**
	 * Sets the value of the '{@link university.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(double value);

	/**
	 * Returns the value of the '<em><b>Degrees</b></em>' reference list.
	 * The list contents are of type {@link university.Degree}.
	 * It is bidirectional and its opposite is '{@link university.Degree#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degrees</em>' reference list.
	 * @see university.UniversityPackage#getCourse_Degrees()
	 * @see university.Degree#getCourses
	 * @model opposite="courses"
	 * @generated
	 */
	EList<Degree> getDegrees();

} // Course
