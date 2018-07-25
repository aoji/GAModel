/**
 */
package gaSalesMan;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tour Population</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gaSalesMan.TourPopulation#getMaps <em>Maps</em>}</li>
 * </ul>
 *
 * @see gaSalesMan.GaSalesManPackage#getTourPopulation()
 * @model
 * @generated
 */
public interface TourPopulation extends Population {

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
	 * @see gaSalesMan.GaSalesManPackage#getTourPopulation_Maps()
	 * @model required="true"
	 * @generated
	 */
	CitiesMap getMaps();

	/**
	 * Sets the value of the '{@link gaSalesMan.TourPopulation#getMaps <em>Maps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maps</em>' reference.
	 * @see #getMaps()
	 * @generated
	 */
	void setMaps(CitiesMap value);
} // TourPopulation
