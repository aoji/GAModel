/**
 */
package gaSalesMan;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gaSalesMan.GaSalesManPackage
 * @generated
 */
public interface GaSalesManFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GaSalesManFactory eINSTANCE = gaSalesMan.impl.GaSalesManFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Population</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Population</em>'.
	 * @generated
	 */
	Population createPopulation();

	/**
	 * Returns a new object of class '<em>Chromosome</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chromosome</em>'.
	 * @generated
	 */
	Chromosome createChromosome();

	/**
	 * Returns a new object of class '<em>Gene</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gene</em>'.
	 * @generated
	 */
	Gene createGene();

	/**
	 * Returns a new object of class '<em>City</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>City</em>'.
	 * @generated
	 */
	City createCity();

	/**
	 * Returns a new object of class '<em>Tour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tour</em>'.
	 * @generated
	 */
	Tour createTour();

	/**
	 * Returns a new object of class '<em>Optimizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Optimizer</em>'.
	 * @generated
	 */
	Optimizer createOptimizer();

	/**
	 * Returns a new object of class '<em>Cities Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cities Map</em>'.
	 * @generated
	 */
	CitiesMap createCitiesMap();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GaSalesManPackage getGaSalesManPackage();

} //GaSalesManFactory
