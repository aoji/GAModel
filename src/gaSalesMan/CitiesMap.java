/**
 */
package gaSalesMan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cities Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gaSalesMan.CitiesMap#getCities <em>Cities</em>}</li>
 *   <li>{@link gaSalesMan.CitiesMap#getXRange <em>XRange</em>}</li>
 *   <li>{@link gaSalesMan.CitiesMap#getYRange <em>YRange</em>}</li>
 *   <li>{@link gaSalesMan.CitiesMap#getNumCities <em>Num Cities</em>}</li>
 * </ul>
 *
 * @see gaSalesMan.GaSalesManPackage#getCitiesMap()
 * @model
 * @generated
 */
public interface CitiesMap extends EObject {
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
	 * @see gaSalesMan.GaSalesManPackage#getCitiesMap_Cities()
	 * @model containment="true"
	 * @generated
	 */
	EList<City> getCities();

	/**
	 * Returns the value of the '<em><b>XRange</b></em>' attribute.
	 * The default value is <code>"5.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRange</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRange</em>' attribute.
	 * @see #setXRange(float)
	 * @see gaSalesMan.GaSalesManPackage#getCitiesMap_XRange()
	 * @model default="5.0"
	 * @generated
	 */
	float getXRange();

	/**
	 * Sets the value of the '{@link gaSalesMan.CitiesMap#getXRange <em>XRange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRange</em>' attribute.
	 * @see #getXRange()
	 * @generated
	 */
	void setXRange(float value);

	/**
	 * Returns the value of the '<em><b>YRange</b></em>' attribute.
	 * The default value is <code>"5.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YRange</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YRange</em>' attribute.
	 * @see #setYRange(float)
	 * @see gaSalesMan.GaSalesManPackage#getCitiesMap_YRange()
	 * @model default="5.0"
	 * @generated
	 */
	float getYRange();

	/**
	 * Sets the value of the '{@link gaSalesMan.CitiesMap#getYRange <em>YRange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YRange</em>' attribute.
	 * @see #getYRange()
	 * @generated
	 */
	void setYRange(float value);

	/**
	 * Returns the value of the '<em><b>Num Cities</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Cities</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Cities</em>' attribute.
	 * @see #setNumCities(int)
	 * @see gaSalesMan.GaSalesManPackage#getCitiesMap_NumCities()
	 * @model default="5"
	 * @generated
	 */
	int getNumCities();

	/**
	 * Sets the value of the '{@link gaSalesMan.CitiesMap#getNumCities <em>Num Cities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Cities</em>' attribute.
	 * @see #getNumCities()
	 * @generated
	 */
	void setNumCities(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialize();

} // CitiesMap
