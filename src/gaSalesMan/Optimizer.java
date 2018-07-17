/**
 */
package gaSalesMan;

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
 *   <li>{@link gaSalesMan.Optimizer#getPopulation <em>Population</em>}</li>
 *   <li>{@link gaSalesMan.Optimizer#getMaxGenerations <em>Max Generations</em>}</li>
 * </ul>
 *
 * @see gaSalesMan.GaSalesManPackage#getOptimizer()
 * @model abstract="true"
 * @generated
 */
public interface Optimizer extends EObject {
	/**
	 * Returns the value of the '<em><b>Population</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Population</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population</em>' reference.
	 * @see #setPopulation(Population)
	 * @see gaSalesMan.GaSalesManPackage#getOptimizer_Population()
	 * @model required="true"
	 * @generated
	 */
	Population getPopulation();

	/**
	 * Sets the value of the '{@link gaSalesMan.Optimizer#getPopulation <em>Population</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population</em>' reference.
	 * @see #getPopulation()
	 * @generated
	 */
	void setPopulation(Population value);

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
	void setupPopulation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void evolvePopulation();

} // Optimizer
