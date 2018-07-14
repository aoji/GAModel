/**
 */
package gaSalesMan;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gaSalesMan.Tour#getCities <em>Cities</em>}</li>
 * </ul>
 *
 * @see gaSalesMan.GaSalesManPackage#getTour()
 * @model
 * @generated
 */
public interface Tour extends Chromosome {
	/**
	 * Returns the value of the '<em><b>Cities</b></em>' containment reference list.
	 * The list contents are of type {@link gaSalesMan.City}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cities</em>' containment reference list.
	 * @see gaSalesMan.GaSalesManPackage#getTour_Cities()
	 * @model containment="true"
	 * @generated
	 */
	EList<City> getCities();

} // Tour
