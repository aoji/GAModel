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
 *   <li>{@link gaSalesMan.TourOptimizer#getTourpopulations <em>Tourpopulations</em>}</li>
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
	 * Returns the value of the '<em><b>Tourpopulations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tourpopulations</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tourpopulations</em>' reference.
	 * @see #setTourpopulations(TourPopulation)
	 * @see gaSalesMan.GaSalesManPackage#getTourOptimizer_Tourpopulations()
	 * @model required="true"
	 * @generated
	 */
	TourPopulation getTourpopulations();

	/**
	 * Sets the value of the '{@link gaSalesMan.TourOptimizer#getTourpopulations <em>Tourpopulations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tourpopulations</em>' reference.
	 * @see #getTourpopulations()
	 * @generated
	 */
	void setTourpopulations(TourPopulation value);

} // TourOptimizer
