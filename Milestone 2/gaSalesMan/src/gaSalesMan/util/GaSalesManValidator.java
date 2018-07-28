/**
 */
package gaSalesMan.util;

import gaSalesMan.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see gaSalesMan.GaSalesManPackage
 * @generated
 */
public class GaSalesManValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GaSalesManValidator INSTANCE = new GaSalesManValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "gaSalesMan";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaSalesManValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return GaSalesManPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case GaSalesManPackage.POPULATION:
				return validatePopulation((Population)value, diagnostics, context);
			case GaSalesManPackage.TOUR_POPULATION:
				return validateTourPopulation((TourPopulation)value, diagnostics, context);
			case GaSalesManPackage.CHROMOSOME:
				return validateChromosome((Chromosome)value, diagnostics, context);
			case GaSalesManPackage.INCOMPLETE_TOUR:
				return validateIncompleteTour((IncompleteTour)value, diagnostics, context);
			case GaSalesManPackage.COMPLETE_TOUR:
				return validateCompleteTour((CompleteTour)value, diagnostics, context);
			case GaSalesManPackage.GENE:
				return validateGene((Gene)value, diagnostics, context);
			case GaSalesManPackage.CITY:
				return validateCity((City)value, diagnostics, context);
			case GaSalesManPackage.OPTIMIZER:
				return validateOptimizer((Optimizer)value, diagnostics, context);
			case GaSalesManPackage.TOUR_OPTIMIZER:
				return validateTourOptimizer((TourOptimizer)value, diagnostics, context);
			case GaSalesManPackage.CITIES_MAP:
				return validateCitiesMap((CitiesMap)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePopulation(Population population, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(population, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(population, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(population, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(population, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(population, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(population, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(population, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(population, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(population, diagnostics, context);
		if (result || diagnostics != null) result &= validatePopulation_numOfChromosomes(population, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the numOfChromosomes constraint of '<em>Population</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POPULATION__NUM_OF_CHROMOSOMES__EEXPRESSION = "self.chromosomes->size() <= self.pSize";

	/**
	 * Validates the numOfChromosomes constraint of '<em>Population</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePopulation_numOfChromosomes(Population population, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GaSalesManPackage.Literals.POPULATION,
				 population,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "numOfChromosomes",
				 POPULATION__NUM_OF_CHROMOSOMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChromosome(Chromosome chromosome, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(chromosome, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGene(Gene gene, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gene, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCity(City city, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(city, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncompleteTour(IncompleteTour incompleteTour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(incompleteTour, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(incompleteTour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(incompleteTour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(incompleteTour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(incompleteTour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(incompleteTour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(incompleteTour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(incompleteTour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(incompleteTour, diagnostics, context);
		if (result || diagnostics != null) result &= validateIncompleteTour_numOfCities(incompleteTour, diagnostics, context);
		if (result || diagnostics != null) result &= validateIncompleteTour_validateCities(incompleteTour, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the numOfCities constraint of '<em>Incomplete Tour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INCOMPLETE_TOUR__NUM_OF_CITIES__EEXPRESSION = "self.cities->size() <= self.maps.numCities";

	/**
	 * Validates the numOfCities constraint of '<em>Incomplete Tour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncompleteTour_numOfCities(IncompleteTour incompleteTour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GaSalesManPackage.Literals.INCOMPLETE_TOUR,
				 incompleteTour,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "numOfCities",
				 INCOMPLETE_TOUR__NUM_OF_CITIES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the validateCities constraint of '<em>Incomplete Tour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INCOMPLETE_TOUR__VALIDATE_CITIES__EEXPRESSION = "self.cities->forAll(c | (isValidCity(c)))";

	/**
	 * Validates the validateCities constraint of '<em>Incomplete Tour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncompleteTour_validateCities(IncompleteTour incompleteTour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GaSalesManPackage.Literals.INCOMPLETE_TOUR,
				 incompleteTour,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "validateCities",
				 INCOMPLETE_TOUR__VALIDATE_CITIES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompleteTour(CompleteTour completeTour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(completeTour, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(completeTour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(completeTour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(completeTour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(completeTour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(completeTour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(completeTour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(completeTour, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(completeTour, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompleteTour_numOfCities(completeTour, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompleteTour_validateCities(completeTour, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the numOfCities constraint of '<em>Complete Tour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPLETE_TOUR__NUM_OF_CITIES__EEXPRESSION = "self.cities->size() = self.maps.numCities";

	/**
	 * Validates the numOfCities constraint of '<em>Complete Tour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompleteTour_numOfCities(CompleteTour completeTour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GaSalesManPackage.Literals.COMPLETE_TOUR,
				 completeTour,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "numOfCities",
				 COMPLETE_TOUR__NUM_OF_CITIES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the validateCities constraint of '<em>Complete Tour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPLETE_TOUR__VALIDATE_CITIES__EEXPRESSION = "self.cities->forAll(c | (isValidCity(c)))";

	/**
	 * Validates the validateCities constraint of '<em>Complete Tour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompleteTour_validateCities(CompleteTour completeTour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GaSalesManPackage.Literals.COMPLETE_TOUR,
				 completeTour,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "validateCities",
				 COMPLETE_TOUR__VALIDATE_CITIES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptimizer(Optimizer optimizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(optimizer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(optimizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(optimizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(optimizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(optimizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(optimizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(optimizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(optimizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(optimizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateOptimizer_numOfGenerations(optimizer, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the numOfGenerations constraint of '<em>Optimizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPTIMIZER__NUM_OF_GENERATIONS__EEXPRESSION = "self.iterations <= self.maxGenerations";

	/**
	 * Validates the numOfGenerations constraint of '<em>Optimizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptimizer_numOfGenerations(Optimizer optimizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GaSalesManPackage.Literals.OPTIMIZER,
				 optimizer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "numOfGenerations",
				 OPTIMIZER__NUM_OF_GENERATIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitiesMap(CitiesMap citiesMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(citiesMap, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(citiesMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(citiesMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(citiesMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(citiesMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(citiesMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(citiesMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(citiesMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(citiesMap, diagnostics, context);
		if (result || diagnostics != null) result &= validateCitiesMap_numOfCities(citiesMap, diagnostics, context);
		if (result || diagnostics != null) result &= validateCitiesMap_xyCoordinates(citiesMap, diagnostics, context);
		if (result || diagnostics != null) result &= validateCitiesMap_validateCity(citiesMap, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the numOfCities constraint of '<em>Cities Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CITIES_MAP__NUM_OF_CITIES__EEXPRESSION = "self.cities->size() = self.numCities";

	/**
	 * Validates the numOfCities constraint of '<em>Cities Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitiesMap_numOfCities(CitiesMap citiesMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GaSalesManPackage.Literals.CITIES_MAP,
				 citiesMap,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "numOfCities",
				 CITIES_MAP__NUM_OF_CITIES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the xyCoordinates constraint of '<em>Cities Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CITIES_MAP__XY_COORDINATES__EEXPRESSION = "self.cities->forAll(c | (c.x <= self.xRange) and (c.y <= self.yRange))";

	/**
	 * Validates the xyCoordinates constraint of '<em>Cities Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitiesMap_xyCoordinates(CitiesMap citiesMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GaSalesManPackage.Literals.CITIES_MAP,
				 citiesMap,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "xyCoordinates",
				 CITIES_MAP__XY_COORDINATES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the validateCity constraint of '<em>Cities Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CITIES_MAP__VALIDATE_CITY__EEXPRESSION = "self.cities->forAll(c | appearsOnce(c))";

	/**
	 * Validates the validateCity constraint of '<em>Cities Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitiesMap_validateCity(CitiesMap citiesMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GaSalesManPackage.Literals.CITIES_MAP,
				 citiesMap,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "validateCity",
				 CITIES_MAP__VALIDATE_CITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTourOptimizer(TourOptimizer tourOptimizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tourOptimizer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tourOptimizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tourOptimizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tourOptimizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tourOptimizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tourOptimizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tourOptimizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tourOptimizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tourOptimizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateOptimizer_numOfGenerations(tourOptimizer, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTourPopulation(TourPopulation tourPopulation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tourPopulation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tourPopulation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tourPopulation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tourPopulation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tourPopulation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tourPopulation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tourPopulation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tourPopulation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tourPopulation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePopulation_numOfChromosomes(tourPopulation, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //GaSalesManValidator
