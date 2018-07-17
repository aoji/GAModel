/**
 */
package gaSalesMan;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tour Optimizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gaSalesMan.TourOptimizer#getMaps <em>Maps</em>}</li>
 *   <li>{@link gaSalesMan.TourOptimizer#getTourpopulation <em>Tourpopulation</em>}</li>
 * </ul>
 *
 * @see gaSalesMan.GaSalesManPackage#getTourOptimizer()
 * @model
 * @generated
 */
public interface TourOptimizer extends Optimizer {
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
	 * @see gaSalesMan.GaSalesManPackage#getTourOptimizer_Maps()
	 * @model required="true"
	 * @generated
	 */
	CitiesMap getMaps();

	/**
	 * Sets the value of the '{@link gaSalesMan.TourOptimizer#getMaps <em>Maps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maps</em>' reference.
	 * @see #getMaps()
	 * @generated
	 */
	void setMaps(CitiesMap value);

	/**
	 * Returns the value of the '<em><b>Tourpopulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tourpopulation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tourpopulation</em>' reference.
	 * @see #setTourpopulation(TourPopulation)
	 * @see gaSalesMan.GaSalesManPackage#getTourOptimizer_Tourpopulation()
	 * @model required="true"
	 * @generated
	 */
	TourPopulation getTourpopulation();

	/**
	 * Sets the value of the '{@link gaSalesMan.TourOptimizer#getTourpopulation <em>Tourpopulation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tourpopulation</em>' reference.
	 * @see #getTourpopulation()
	 * @generated
	 */
	void setTourpopulation(TourPopulation value);

} // TourOptimizer
