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
 *   <li>{@link gaSalesMan.TourPopulation#getCitiesmap <em>Citiesmap</em>}</li>
 * </ul>
 *
 * @see gaSalesMan.GaSalesManPackage#getTourPopulation()
 * @model
 * @generated
 */
public interface TourPopulation extends Population {

	/**
	 * Returns the value of the '<em><b>Citiesmap</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Citiesmap</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Citiesmap</em>' reference.
	 * @see #setCitiesmap(CitiesMap)
	 * @see gaSalesMan.GaSalesManPackage#getTourPopulation_Citiesmap()
	 * @model
	 * @generated
	 */
	CitiesMap getCitiesmap();

	/**
	 * Sets the value of the '{@link gaSalesMan.TourPopulation#getCitiesmap <em>Citiesmap</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Citiesmap</em>' reference.
	 * @see #getCitiesmap()
	 * @generated
	 */
	void setCitiesmap(CitiesMap value);
} // TourPopulation
