/**
 */
package university;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link university.Edition#getYear <em>Year</em>}</li>
 *   <li>{@link university.Edition#getName <em>Name</em>}</li>
 *   <li>{@link university.Edition#getProfessors <em>Professors</em>}</li>
 *   <li>{@link university.Edition#getGrades <em>Grades</em>}</li>
 * </ul>
 *
 * @see university.UniversityPackage#getEdition()
 * @model
 * @generated
 */
public interface Edition extends EObject {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see university.UniversityPackage#getEdition_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link university.Edition#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see university.UniversityPackage#getEdition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link university.Edition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Professors</b></em>' reference list.
	 * The list contents are of type {@link university.Professor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Professors</em>' reference list.
	 * @see university.UniversityPackage#getEdition_Professors()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Professor> getProfessors();

	/**
	 * Returns the value of the '<em><b>Grades</b></em>' reference list.
	 * The list contents are of type {@link university.Grade}.
	 * It is bidirectional and its opposite is '{@link university.Grade#getEdition <em>Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grades</em>' reference list.
	 * @see university.UniversityPackage#getEdition_Grades()
	 * @see university.Grade#getEdition
	 * @model opposite="edition"
	 * @generated
	 */
	EList<Grade> getGrades();

} // Edition
