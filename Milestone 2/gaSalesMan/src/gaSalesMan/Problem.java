/**
 */
package gaSalesMan;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Problem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gaSalesMan.Problem#getMap <em>Map</em>}</li>
 *   <li>{@link gaSalesMan.Problem#getTouroptimizer <em>Touroptimizer</em>}</li>
 * </ul>
 *
 * @see gaSalesMan.GaSalesManPackage#getProblem()
 * @model
 * @generated
 */
public interface Problem extends EObject {
	/**
	 * Returns the value of the '<em><b>Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' containment reference.
	 * @see #setMap(CitiesMap)
	 * @see gaSalesMan.GaSalesManPackage#getProblem_Map()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CitiesMap getMap();

	/**
	 * Sets the value of the '{@link gaSalesMan.Problem#getMap <em>Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' containment reference.
	 * @see #getMap()
	 * @generated
	 */
	void setMap(CitiesMap value);

	/**
	 * Returns the value of the '<em><b>Touroptimizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Touroptimizer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Touroptimizer</em>' containment reference.
	 * @see #setTouroptimizer(TourOptimizer)
	 * @see gaSalesMan.GaSalesManPackage#getProblem_Touroptimizer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TourOptimizer getTouroptimizer();

	/**
	 * Sets the value of the '{@link gaSalesMan.Problem#getTouroptimizer <em>Touroptimizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Touroptimizer</em>' containment reference.
	 * @see #getTouroptimizer()
	 * @generated
	 */
	void setTouroptimizer(TourOptimizer value);

} // Problem
