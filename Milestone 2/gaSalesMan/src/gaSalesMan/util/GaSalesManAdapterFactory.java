/**
 */
package gaSalesMan.util;

import gaSalesMan.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gaSalesMan.GaSalesManPackage
 * @generated
 */
public class GaSalesManAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GaSalesManPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaSalesManAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GaSalesManPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GaSalesManSwitch<Adapter> modelSwitch =
		new GaSalesManSwitch<Adapter>() {
			@Override
			public Adapter casePopulation(Population object) {
				return createPopulationAdapter();
			}
			@Override
			public Adapter caseTourPopulation(TourPopulation object) {
				return createTourPopulationAdapter();
			}
			@Override
			public Adapter caseChromosome(Chromosome object) {
				return createChromosomeAdapter();
			}
			@Override
			public Adapter caseIncompleteTour(IncompleteTour object) {
				return createIncompleteTourAdapter();
			}
			@Override
			public Adapter caseCompleteTour(CompleteTour object) {
				return createCompleteTourAdapter();
			}
			@Override
			public Adapter caseGene(Gene object) {
				return createGeneAdapter();
			}
			@Override
			public Adapter caseCity(City object) {
				return createCityAdapter();
			}
			@Override
			public Adapter caseOptimizer(Optimizer object) {
				return createOptimizerAdapter();
			}
			@Override
			public Adapter caseTourOptimizer(TourOptimizer object) {
				return createTourOptimizerAdapter();
			}
			@Override
			public Adapter caseCitiesMap(CitiesMap object) {
				return createCitiesMapAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link gaSalesMan.Population <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaSalesMan.Population
	 * @generated
	 */
	public Adapter createPopulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaSalesMan.Chromosome <em>Chromosome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaSalesMan.Chromosome
	 * @generated
	 */
	public Adapter createChromosomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaSalesMan.Gene <em>Gene</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaSalesMan.Gene
	 * @generated
	 */
	public Adapter createGeneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaSalesMan.City <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaSalesMan.City
	 * @generated
	 */
	public Adapter createCityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaSalesMan.IncompleteTour <em>Incomplete Tour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaSalesMan.IncompleteTour
	 * @generated
	 */
	public Adapter createIncompleteTourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaSalesMan.CompleteTour <em>Complete Tour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaSalesMan.CompleteTour
	 * @generated
	 */
	public Adapter createCompleteTourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaSalesMan.Optimizer <em>Optimizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaSalesMan.Optimizer
	 * @generated
	 */
	public Adapter createOptimizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaSalesMan.CitiesMap <em>Cities Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaSalesMan.CitiesMap
	 * @generated
	 */
	public Adapter createCitiesMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaSalesMan.TourPopulation <em>Tour Population</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaSalesMan.TourPopulation
	 * @generated
	 */
	public Adapter createTourPopulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaSalesMan.TourOptimizer <em>Tour Optimizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaSalesMan.TourOptimizer
	 * @generated
	 */
	public Adapter createTourOptimizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GaSalesManAdapterFactory
