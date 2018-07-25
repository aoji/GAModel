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
 *   <li>{@link gaSalesMan.Optimizer#getMaxGenerations <em>Max Generations</em>}</li>
 *   <li>{@link gaSalesMan.Optimizer#getIterations <em>Iterations</em>}</li>
 *   <li>{@link gaSalesMan.Optimizer#getPopulations <em>Populations</em>}</li>
 * </ul>
 *
 * @see gaSalesMan.GaSalesManPackage#getOptimizer()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='numOfPopulations'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot numOfPopulations='self.iterations <= self.maxGenerations'"
 * @generated
 */
public interface Optimizer extends EObject {
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
	 * Returns the value of the '<em><b>Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iterations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterations</em>' attribute.
	 * @see #setIterations(int)
	 * @see gaSalesMan.GaSalesManPackage#getOptimizer_Iterations()
	 * @model
	 * @generated
	 */
	int getIterations();

	/**
	 * Sets the value of the '{@link gaSalesMan.Optimizer#getIterations <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterations</em>' attribute.
	 * @see #getIterations()
	 * @generated
	 */
	void setIterations(int value);

	/**
	 * Returns the value of the '<em><b>Populations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Populations</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Populations</em>' reference.
	 * @see #setPopulations(Population)
	 * @see gaSalesMan.GaSalesManPackage#getOptimizer_Populations()
	 * @model required="true"
	 * @generated
	 */
	Population getPopulations();

	/**
	 * Sets the value of the '{@link gaSalesMan.Optimizer#getPopulations <em>Populations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Populations</em>' reference.
	 * @see #getPopulations()
	 * @generated
	 */
	void setPopulations(Population value);

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
