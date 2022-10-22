/**
 */
package clase04;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see clase04.Clase04Package
 * @generated
 */
public interface Clase04Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Clase04Factory eINSTANCE = clase04.impl.Clase04FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ciclo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ciclo</em>'.
	 * @generated
	 */
	Ciclo createCiclo();

	/**
	 * Returns a new object of class '<em>Estudiante</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Estudiante</em>'.
	 * @generated
	 */
	Estudiante createEstudiante();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Clase04Package getClase04Package();

} //Clase04Factory
