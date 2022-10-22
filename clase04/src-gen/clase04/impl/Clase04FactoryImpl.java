/**
 */
package clase04.impl;

import clase04.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Clase04FactoryImpl extends EFactoryImpl implements Clase04Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Clase04Factory init() {
		try {
			Clase04Factory theClase04Factory = (Clase04Factory) EPackage.Registry.INSTANCE
					.getEFactory(Clase04Package.eNS_URI);
			if (theClase04Factory != null) {
				return theClase04Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Clase04FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase04FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Clase04Package.CICLO:
			return createCiclo();
		case Clase04Package.ESTUDIANTE:
			return createEstudiante();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ciclo createCiclo() {
		CicloImpl ciclo = new CicloImpl();
		return ciclo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Estudiante createEstudiante() {
		EstudianteImpl estudiante = new EstudianteImpl();
		return estudiante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase04Package getClase04Package() {
		return (Clase04Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static Clase04Package getPackage() {
		return Clase04Package.eINSTANCE;
	}

} //Clase04FactoryImpl
