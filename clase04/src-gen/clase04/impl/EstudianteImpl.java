/**
 */
package clase04.impl;

import clase04.Ciclo;
import clase04.Clase04Package;
import clase04.Estudiante;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Estudiante</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link clase04.impl.EstudianteImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link clase04.impl.EstudianteImpl#getCiclo <em>Ciclo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EstudianteImpl extends MinimalEObjectImpl.Container implements Estudiante {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCiclo() <em>Ciclo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCiclo()
	 * @generated
	 * @ordered
	 */
	protected Ciclo ciclo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EstudianteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Clase04Package.Literals.ESTUDIANTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Clase04Package.ESTUDIANTE__NOMBRE, oldNombre,
					nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ciclo getCiclo() {
		if (ciclo != null && ciclo.eIsProxy()) {
			InternalEObject oldCiclo = (InternalEObject) ciclo;
			ciclo = (Ciclo) eResolveProxy(oldCiclo);
			if (ciclo != oldCiclo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Clase04Package.ESTUDIANTE__CICLO,
							oldCiclo, ciclo));
			}
		}
		return ciclo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ciclo basicGetCiclo() {
		return ciclo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCiclo(Ciclo newCiclo) {
		Ciclo oldCiclo = ciclo;
		ciclo = newCiclo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Clase04Package.ESTUDIANTE__CICLO, oldCiclo, ciclo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Clase04Package.ESTUDIANTE__NOMBRE:
			return getNombre();
		case Clase04Package.ESTUDIANTE__CICLO:
			if (resolve)
				return getCiclo();
			return basicGetCiclo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Clase04Package.ESTUDIANTE__NOMBRE:
			setNombre((String) newValue);
			return;
		case Clase04Package.ESTUDIANTE__CICLO:
			setCiclo((Ciclo) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
		case Clase04Package.ESTUDIANTE__NOMBRE:
			setNombre(NOMBRE_EDEFAULT);
			return;
		case Clase04Package.ESTUDIANTE__CICLO:
			setCiclo((Ciclo) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Clase04Package.ESTUDIANTE__NOMBRE:
			return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
		case Clase04Package.ESTUDIANTE__CICLO:
			return ciclo != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //EstudianteImpl
