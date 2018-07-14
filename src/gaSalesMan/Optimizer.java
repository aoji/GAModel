/**
 */
package gaSalesMan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optimizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gaSalesMan.Optimizer#getPopulations <em>Populations</em>}</li>
 *   <li>{@link gaSalesMan.Optimizer#getMaps <em>Maps</em>}</li>
 *   <li>{@link gaSalesMan.Optimizer#getMaxGenerations <em>Max Generations</em>}</li>
 * </ul>
 *
 * @see gaSalesMan.GaSalesManPackage#getOptimizer()
 * @model
 * @generated
 */
public interface Optimizer extends EObject {
	/**
	 * Returns the value of the '<em><b>Populations</b></em>' reference list.
	 * The list contents are of type {@link gaSalesMan.Population}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Populations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Populations</em>' reference list.
	 * @see gaSalesMan.GaSalesManPackage#getOptimizer_Populations()
	 * @model
	 * @generated
	 */
	EList<Population> getPopulations();

	/**
	 * Returns the value of the '<em><b>Maps</b></em>' reference list.
	 * The list contents are of type {@link gaSalesMan.CitiesMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maps</em>' reference list.
	 * @see gaSalesMan.GaSalesManPackage#getOptimizer_Maps()
	 * @model
	 * @generated
	 */
	EList<CitiesMap> getMaps();

	/**
	 * Returns the value of the '<em><b>Max Generations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Generations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Generations</em>' attribute.
	 * @see #setMaxGenerations(int)
	 * @see gaSalesMan.GaSalesManPackage#getOptimizer_MaxGenerations()
	 * @model
	 * @generated
	 */
	int getMaxGenerations();

	/**
	 * Sets the value of the '{@link gaSalesMan.Optimizer#getMaxGenerations <em>Max Generations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Generations</em>' attribute.
	 * @see #getMaxGenerations()
	 * @generated
	 */
	void setMaxGenerations(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void generatePopulation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void evolvePopulation();

} // Optimizer
