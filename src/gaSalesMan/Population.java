/**
 */
package gaSalesMan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Population</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gaSalesMan.Population#getPSize <em>PSize</em>}</li>
 *   <li>{@link gaSalesMan.Population#getChromosomes <em>Chromosomes</em>}</li>
 *   <li>{@link gaSalesMan.Population#getMProb <em>MProb</em>}</li>
 * </ul>
 *
 * @see gaSalesMan.GaSalesManPackage#getPopulation()
 * @model abstract="true"
 * @generated
 */
public interface Population extends EObject {
	/**
	 * Returns the value of the '<em><b>PSize</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PSize</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PSize</em>' attribute.
	 * @see #setPSize(int)
	 * @see gaSalesMan.GaSalesManPackage#getPopulation_PSize()
	 * @model default="10"
	 * @generated
	 */
	int getPSize();

	/**
	 * Sets the value of the '{@link gaSalesMan.Population#getPSize <em>PSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PSize</em>' attribute.
	 * @see #getPSize()
	 * @generated
	 */
	void setPSize(int value);

	/**
	 * Returns the value of the '<em><b>Chromosomes</b></em>' containment reference list.
	 * The list contents are of type {@link gaSalesMan.Chromosome}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chromosomes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chromosomes</em>' containment reference list.
	 * @see gaSalesMan.GaSalesManPackage#getPopulation_Chromosomes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Chromosome> getChromosomes();

	/**
	 * Returns the value of the '<em><b>MProb</b></em>' attribute.
	 * The default value is <code>"0.2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MProb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MProb</em>' attribute.
	 * @see #setMProb(float)
	 * @see gaSalesMan.GaSalesManPackage#getPopulation_MProb()
	 * @model default="0.2"
	 * @generated
	 */
	float getMProb();

	/**
	 * Sets the value of the '{@link gaSalesMan.Population#getMProb <em>MProb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MProb</em>' attribute.
	 * @see #getMProb()
	 * @generated
	 */
	void setMProb(float value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void crossover();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void mutate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Chromosome findFittest();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void generateChromosomes();

} // Population
