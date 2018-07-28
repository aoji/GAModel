/**
 */
package gaSalesMan.util;

import gaSalesMan.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gaSalesMan.GaSalesManPackage
 * @generated
 */
public class GaSalesManSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GaSalesManPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaSalesManSwitch() {
		if (modelPackage == null) {
			modelPackage = GaSalesManPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GaSalesManPackage.POPULATION: {
				Population population = (Population)theEObject;
				T result = casePopulation(population);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaSalesManPackage.TOUR_POPULATION: {
				TourPopulation tourPopulation = (TourPopulation)theEObject;
				T result = caseTourPopulation(tourPopulation);
				if (result == null) result = casePopulation(tourPopulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaSalesManPackage.CHROMOSOME: {
				Chromosome chromosome = (Chromosome)theEObject;
				T result = caseChromosome(chromosome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaSalesManPackage.INCOMPLETE_TOUR: {
				IncompleteTour incompleteTour = (IncompleteTour)theEObject;
				T result = caseIncompleteTour(incompleteTour);
				if (result == null) result = caseChromosome(incompleteTour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaSalesManPackage.COMPLETE_TOUR: {
				CompleteTour completeTour = (CompleteTour)theEObject;
				T result = caseCompleteTour(completeTour);
				if (result == null) result = caseChromosome(completeTour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaSalesManPackage.GENE: {
				Gene gene = (Gene)theEObject;
				T result = caseGene(gene);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaSalesManPackage.CITY: {
				City city = (City)theEObject;
				T result = caseCity(city);
				if (result == null) result = caseGene(city);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaSalesManPackage.OPTIMIZER: {
				Optimizer optimizer = (Optimizer)theEObject;
				T result = caseOptimizer(optimizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaSalesManPackage.TOUR_OPTIMIZER: {
				TourOptimizer tourOptimizer = (TourOptimizer)theEObject;
				T result = caseTourOptimizer(tourOptimizer);
				if (result == null) result = caseOptimizer(tourOptimizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaSalesManPackage.CITIES_MAP: {
				CitiesMap citiesMap = (CitiesMap)theEObject;
				T result = caseCitiesMap(citiesMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Population</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Population</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePopulation(Population object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chromosome</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chromosome</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChromosome(Chromosome object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gene</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gene</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGene(Gene object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>City</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>City</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCity(City object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incomplete Tour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incomplete Tour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncompleteTour(IncompleteTour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complete Tour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complete Tour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompleteTour(CompleteTour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optimizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optimizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptimizer(Optimizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cities Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cities Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCitiesMap(CitiesMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tour Population</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tour Population</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTourPopulation(TourPopulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tour Optimizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tour Optimizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTourOptimizer(TourOptimizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GaSalesManSwitch
