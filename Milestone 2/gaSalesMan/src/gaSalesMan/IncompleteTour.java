/**
 */
package gaSalesMan;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Incomplete Tour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gaSalesMan.IncompleteTour#getModelA <em>Model A</em>}</li>
 *   <li>{@link gaSalesMan.IncompleteTour#getCities <em>Cities</em>}</li>
 *   <li>{@link gaSalesMan.IncompleteTour#getMaps <em>Maps</em>}</li>
 * </ul>
 *
 * @see gaSalesMan.GaSalesManPackage#getIncompleteTour()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='checkCities'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot checkCities='self.cities->size() <= self.maps.numCities'"
 * @generated
 */
public interface IncompleteTour extends Chromosome {
	/**
	 * Returns the value of the '<em><b>Model A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model A</em>' attribute.
	 * @see #setModelA(String)
	 * @see gaSalesMan.GaSalesManPackage#getIncompleteTour_ModelA()
	 * @model
	 * @generated
	 */
	String getModelA();

	/**
	 * Sets the value of the '{@link gaSalesMan.IncompleteTour#getModelA <em>Model A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model A</em>' attribute.
	 * @see #getModelA()
	 * @generated
	 */
	void setModelA(String value);

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
	 * @see gaSalesMan.GaSalesManPackage#getIncompleteTour_Cities()
	 * @model containment="true"
	 * @generated
	 */
	EList<City> getCities();

	/**
	 * Returns the value of the '<em><b>Maps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maps</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maps</em>' reference.
	 * @see #setMaps(CitiesMap)
	 * @see gaSalesMan.GaSalesManPackage#getIncompleteTour_Maps()
	 * @model required="true"
	 * @generated
	 */
	CitiesMap getMaps();

	/**
	 * Sets the value of the '{@link gaSalesMan.IncompleteTour#getMaps <em>Maps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maps</em>' reference.
	 * @see #getMaps()
	 * @generated
	 */
	void setMaps(CitiesMap value);

} // IncompleteTour
