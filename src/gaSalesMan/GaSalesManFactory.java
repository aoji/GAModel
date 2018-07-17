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
	 * Returns a new object of class '<em>Cities Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cities Map</em>'.
	 * @generated
	 */
	CitiesMap createCitiesMap();

	/**
	 * Returns a new object of class '<em>Tour Population</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tour Population</em>'.
	 * @generated
	 */
	TourPopulation createTourPopulation();

	/**
	 * Returns a new object of class '<em>Tour Optimizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tour Optimizer</em>'.
	 * @generated
	 */
	TourOptimizer createTourOptimizer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GaSalesManPackage getGaSalesManPackage();

} //GaSalesManFactory
