/**
 */
package university;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Faculty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link university.Faculty#getName <em>Name</em>}</li>
 *   <li>{@link university.Faculty#getDegrees <em>Degrees</em>}</li>
 *   <li>{@link university.Faculty#getProfessors <em>Professors</em>}</li>
 * </ul>
 *
 * @see university.UniversityPackage#getFaculty()
 * @model
 * @generated
 */
public interface Faculty extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see university.UniversityPackage#getFaculty_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link university.Faculty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Degrees</b></em>' reference list.
	 * The list contents are of type {@link university.Degree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degrees</em>' reference list.
	 * @see university.UniversityPackage#getFaculty_Degrees()
	 * @model
	 * @generated
	 */
	EList<Degree> getDegrees();

	/**
	 * Returns the value of the '<em><b>Professors</b></em>' containment reference list.
	 * The list contents are of type {@link university.Professor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Professors</em>' containment reference list.
	 * @see university.UniversityPackage#getFaculty_Professors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Professor> getProfessors();

} // Faculty
