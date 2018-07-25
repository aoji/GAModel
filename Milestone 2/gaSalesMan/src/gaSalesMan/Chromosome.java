/**
 */
package gaSalesMan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chromosome</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gaSalesMan.Chromosome#getGenes <em>Genes</em>}</li>
 * </ul>
 *
 * @see gaSalesMan.GaSalesManPackage#getChromosome()
 * @model abstract="true"
 * @generated
 */
public interface Chromosome extends EObject {
	/**
	 * Returns the value of the '<em><b>Genes</b></em>' containment reference list.
	 * The list contents are of type {@link gaSalesMan.Gene}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Genes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genes</em>' containment reference list.
	 * @see gaSalesMan.GaSalesManPackage#getChromosome_Genes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Gene> getGenes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double fitness();

} // Chromosome
