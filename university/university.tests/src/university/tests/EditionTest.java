/**
 */
package university.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import university.Edition;
import university.UniversityFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Edition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EditionTest extends TestCase {

	/**
	 * The fixture for this Edition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Edition fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EditionTest.class);
	}

	/**
	 * Constructs a new Edition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Edition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Edition fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Edition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Edition getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UniversityFactory.eINSTANCE.createEdition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //EditionTest
