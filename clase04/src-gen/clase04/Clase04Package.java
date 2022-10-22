/**
 */
package clase04;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see clase04.Clase04Factory
 * @model kind="package"
 * @generated
 */
public interface Clase04Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "clase04";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/clase04";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "clase04";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Clase04Package eINSTANCE = clase04.impl.Clase04PackageImpl.init();

	/**
	 * The meta object id for the '{@link clase04.impl.CicloImpl <em>Ciclo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clase04.impl.CicloImpl
	 * @see clase04.impl.Clase04PackageImpl#getCiclo()
	 * @generated
	 */
	int CICLO = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CICLO__NOMBRE = 0;

	/**
	 * The number of structural features of the '<em>Ciclo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CICLO_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link clase04.impl.EstudianteImpl <em>Estudiante</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see clase04.impl.EstudianteImpl
	 * @see clase04.impl.Clase04PackageImpl#getEstudiante()
	 * @generated
	 */
	int ESTUDIANTE = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTUDIANTE__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Ciclo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTUDIANTE__CICLO = 1;

	/**
	 * The number of structural features of the '<em>Estudiante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTUDIANTE_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link clase04.Ciclo <em>Ciclo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ciclo</em>'.
	 * @see clase04.Ciclo
	 * @generated
	 */
	EClass getCiclo();

	/**
	 * Returns the meta object for the attribute '{@link clase04.Ciclo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see clase04.Ciclo#getNombre()
	 * @see #getCiclo()
	 * @generated
	 */
	EAttribute getCiclo_Nombre();

	/**
	 * Returns the meta object for class '{@link clase04.Estudiante <em>Estudiante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Estudiante</em>'.
	 * @see clase04.Estudiante
	 * @generated
	 */
	EClass getEstudiante();

	/**
	 * Returns the meta object for the attribute '{@link clase04.Estudiante#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see clase04.Estudiante#getNombre()
	 * @see #getEstudiante()
	 * @generated
	 */
	EAttribute getEstudiante_Nombre();

	/**
	 * Returns the meta object for the reference '{@link clase04.Estudiante#getCiclo <em>Ciclo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ciclo</em>'.
	 * @see clase04.Estudiante#getCiclo()
	 * @see #getEstudiante()
	 * @generated
	 */
	EReference getEstudiante_Ciclo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Clase04Factory getClase04Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link clase04.impl.CicloImpl <em>Ciclo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clase04.impl.CicloImpl
		 * @see clase04.impl.Clase04PackageImpl#getCiclo()
		 * @generated
		 */
		EClass CICLO = eINSTANCE.getCiclo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CICLO__NOMBRE = eINSTANCE.getCiclo_Nombre();

		/**
		 * The meta object literal for the '{@link clase04.impl.EstudianteImpl <em>Estudiante</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see clase04.impl.EstudianteImpl
		 * @see clase04.impl.Clase04PackageImpl#getEstudiante()
		 * @generated
		 */
		EClass ESTUDIANTE = eINSTANCE.getEstudiante();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTUDIANTE__NOMBRE = eINSTANCE.getEstudiante_Nombre();

		/**
		 * The meta object literal for the '<em><b>Ciclo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTUDIANTE__CICLO = eINSTANCE.getEstudiante_Ciclo();

	}

} //Clase04Package
