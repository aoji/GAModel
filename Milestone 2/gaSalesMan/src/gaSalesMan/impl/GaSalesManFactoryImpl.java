/**
 */
package gaSalesMan.impl;

import gaSalesMan.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GaSalesManFactoryImpl extends EFactoryImpl implements GaSalesManFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GaSalesManFactory init() {
		try {
			GaSalesManFactory theGaSalesManFactory = (GaSalesManFactory)EPackage.Registry.INSTANCE.getEFactory(GaSalesManPackage.eNS_URI);
			if (theGaSalesManFactory != null) {
				return theGaSalesManFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GaSalesManFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaSalesManFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GaSalesManPackage.TOUR_POPULATION: return createTourPopulation();
			case GaSalesManPackage.INCOMPLETE_TOUR: return createIncompleteTour();
			case GaSalesManPackage.COMPLETE_TOUR: return createCompleteTour();
			case GaSalesManPackage.CITY: return createCity();
			case GaSalesManPackage.TOUR_OPTIMIZER: return createTourOptimizer();
			case GaSalesManPackage.CITIES_MAP: return createCitiesMap();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City createCity() {
		CityImpl city = new CityImpl();
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncompleteTour createIncompleteTour() {
		IncompleteTourImpl incompleteTour = new IncompleteTourImpl();
		return incompleteTour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompleteTour createCompleteTour() {
		CompleteTourImpl completeTour = new CompleteTourImpl();
		return completeTour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitiesMap createCitiesMap() {
		CitiesMapImpl citiesMap = new CitiesMapImpl();
		return citiesMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TourPopulation createTourPopulation() {
		TourPopulationImpl tourPopulation = new TourPopulationImpl();
		return tourPopulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TourOptimizer createTourOptimizer() {
		TourOptimizerImpl tourOptimizer = new TourOptimizerImpl();
		return tourOptimizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaSalesManPackage getGaSalesManPackage() {
		return (GaSalesManPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GaSalesManPackage getPackage() {
		return GaSalesManPackage.eINSTANCE;
	}

} //GaSalesManFactoryImpl
