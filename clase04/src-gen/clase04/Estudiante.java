/**
 */
package clase04;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Estudiante</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link clase04.Estudiante#getNombre <em>Nombre</em>}</li>
 *   <li>{@link clase04.Estudiante#getCiclo <em>Ciclo</em>}</li>
 * </ul>
 *
 * @see clase04.Clase04Package#getEstudiante()
 * @model
 * @generated
 */
public interface Estudiante extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see clase04.Clase04Package#getEstudiante_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link clase04.Estudiante#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Ciclo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ciclo</em>' reference.
	 * @see #setCiclo(Ciclo)
	 * @see clase04.Clase04Package#getEstudiante_Ciclo()
	 * @model
	 * @generated
	 */
	Ciclo getCiclo();

	/**
	 * Sets the value of the '{@link clase04.Estudiante#getCiclo <em>Ciclo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ciclo</em>' reference.
	 * @see #getCiclo()
	 * @generated
	 */
	void setCiclo(Ciclo value);

} // Estudiante
