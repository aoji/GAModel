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
			case GaSalesManPackage.POPULATION: return createPopulation();
			case GaSalesManPackage.CHROMOSOME: return createChromosome();
			case GaSalesManPackage.GENE: return createGene();
			case GaSalesManPackage.CITY: return createCity();
			case GaSalesManPackage.TOUR: return createTour();
			case GaSalesManPackage.OPTIMIZER: return createOptimizer();
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
	public Population createPopulation() {
		PopulationImpl population = new PopulationImpl();
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chromosome createChromosome() {
		ChromosomeImpl chromosome = new ChromosomeImpl();
		return chromosome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gene createGene() {
		GeneImpl gene = new GeneImpl();
		return gene;
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
	public Tour createTour() {
		TourImpl tour = new TourImpl();
		return tour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Optimizer createOptimizer() {
		OptimizerImpl optimizer = new OptimizerImpl();
		return optimizer;
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
