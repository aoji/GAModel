/**
 */
package gaSalesMan.impl;

import gaSalesMan.Chromosome;
import gaSalesMan.CitiesMap;
import gaSalesMan.City;
import gaSalesMan.CompleteTour;
import gaSalesMan.GaSalesManFactory;
import gaSalesMan.GaSalesManPackage;
import gaSalesMan.Gene;
import gaSalesMan.IncompleteTour;
import gaSalesMan.Optimizer;
import gaSalesMan.Population;
import gaSalesMan.TourOptimizer;
import gaSalesMan.TourPopulation;

import gaSalesMan.util.GaSalesManValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GaSalesManPackageImpl extends EPackageImpl implements GaSalesManPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass populationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chromosomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incompleteTourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass completeTourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optimizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass citiesMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tourPopulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tourOptimizerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see gaSalesMan.GaSalesManPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GaSalesManPackageImpl() {
		super(eNS_URI, GaSalesManFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GaSalesManPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GaSalesManPackage init() {
		if (isInited) return (GaSalesManPackage)EPackage.Registry.INSTANCE.getEPackage(GaSalesManPackage.eNS_URI);

		// Obtain or create and register package
		GaSalesManPackageImpl theGaSalesManPackage = (GaSalesManPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GaSalesManPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GaSalesManPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGaSalesManPackage.createPackageContents();

		// Initialize created meta-data
		theGaSalesManPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theGaSalesManPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return GaSalesManValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theGaSalesManPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GaSalesManPackage.eNS_URI, theGaSalesManPackage);
		return theGaSalesManPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPopulation() {
		return populationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPopulation_PSize() {
		return (EAttribute)populationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPopulation_Chromosomes() {
		return (EReference)populationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPopulation_MProb() {
		return (EAttribute)populationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPopulation__Crossover() {
		return populationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPopulation__Mutate() {
		return populationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPopulation__FindFittest() {
		return populationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPopulation__GenerateChromosomes() {
		return populationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChromosome() {
		return chromosomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChromosome_Fitness() {
		return (EAttribute)chromosomeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChromosome_Genes() {
		return (EReference)chromosomeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChromosome__Fitness() {
		return chromosomeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGene() {
		return geneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCity() {
		return cityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCity_Name() {
		return (EAttribute)cityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCity_X() {
		return (EAttribute)cityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCity_Y() {
		return (EAttribute)cityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncompleteTour() {
		return incompleteTourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncompleteTour_Model() {
		return (EAttribute)incompleteTourEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncompleteTour_Cities() {
		return (EReference)incompleteTourEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncompleteTour_Maps() {
		return (EReference)incompleteTourEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIncompleteTour__IsValidCity__City() {
		return incompleteTourEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompleteTour() {
		return completeTourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompleteTour_Model() {
		return (EAttribute)completeTourEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompleteTour_Cities() {
		return (EReference)completeTourEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompleteTour_Maps() {
		return (EReference)completeTourEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompleteTour__IsValidCity__City() {
		return completeTourEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptimizer() {
		return optimizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptimizer_MaxGenerations() {
		return (EAttribute)optimizerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptimizer_Iterations() {
		return (EAttribute)optimizerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptimizer_Populations() {
		return (EReference)optimizerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOptimizer__SetupPopulation() {
		return optimizerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOptimizer__EvolvePopulation() {
		return optimizerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCitiesMap() {
		return citiesMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCitiesMap_Cities() {
		return (EReference)citiesMapEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCitiesMap_XRange() {
		return (EAttribute)citiesMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCitiesMap_YRange() {
		return (EAttribute)citiesMapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCitiesMap_NumCities() {
		return (EAttribute)citiesMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCitiesMap__Initialize() {
		return citiesMapEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCitiesMap__AppearsOnce__City() {
		return citiesMapEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTourPopulation() {
		return tourPopulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTourPopulation_Maps() {
		return (EReference)tourPopulationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTourOptimizer() {
		return tourOptimizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTourOptimizer_Maps() {
		return (EReference)tourOptimizerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTourOptimizer_Tourpopulations() {
		return (EReference)tourOptimizerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaSalesManFactory getGaSalesManFactory() {
		return (GaSalesManFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		populationEClass = createEClass(POPULATION);
		createEAttribute(populationEClass, POPULATION__PSIZE);
		createEAttribute(populationEClass, POPULATION__MPROB);
		createEReference(populationEClass, POPULATION__CHROMOSOMES);
		createEOperation(populationEClass, POPULATION___CROSSOVER);
		createEOperation(populationEClass, POPULATION___MUTATE);
		createEOperation(populationEClass, POPULATION___FIND_FITTEST);
		createEOperation(populationEClass, POPULATION___GENERATE_CHROMOSOMES);

		tourPopulationEClass = createEClass(TOUR_POPULATION);
		createEReference(tourPopulationEClass, TOUR_POPULATION__MAPS);

		chromosomeEClass = createEClass(CHROMOSOME);
		createEAttribute(chromosomeEClass, CHROMOSOME__FITNESS);
		createEReference(chromosomeEClass, CHROMOSOME__GENES);
		createEOperation(chromosomeEClass, CHROMOSOME___FITNESS);

		incompleteTourEClass = createEClass(INCOMPLETE_TOUR);
		createEAttribute(incompleteTourEClass, INCOMPLETE_TOUR__MODEL);
		createEReference(incompleteTourEClass, INCOMPLETE_TOUR__CITIES);
		createEReference(incompleteTourEClass, INCOMPLETE_TOUR__MAPS);
		createEOperation(incompleteTourEClass, INCOMPLETE_TOUR___IS_VALID_CITY__CITY);

		completeTourEClass = createEClass(COMPLETE_TOUR);
		createEAttribute(completeTourEClass, COMPLETE_TOUR__MODEL);
		createEReference(completeTourEClass, COMPLETE_TOUR__CITIES);
		createEReference(completeTourEClass, COMPLETE_TOUR__MAPS);
		createEOperation(completeTourEClass, COMPLETE_TOUR___IS_VALID_CITY__CITY);

		geneEClass = createEClass(GENE);

		cityEClass = createEClass(CITY);
		createEAttribute(cityEClass, CITY__NAME);
		createEAttribute(cityEClass, CITY__X);
		createEAttribute(cityEClass, CITY__Y);

		optimizerEClass = createEClass(OPTIMIZER);
		createEAttribute(optimizerEClass, OPTIMIZER__MAX_GENERATIONS);
		createEAttribute(optimizerEClass, OPTIMIZER__ITERATIONS);
		createEReference(optimizerEClass, OPTIMIZER__POPULATIONS);
		createEOperation(optimizerEClass, OPTIMIZER___SETUP_POPULATION);
		createEOperation(optimizerEClass, OPTIMIZER___EVOLVE_POPULATION);

		tourOptimizerEClass = createEClass(TOUR_OPTIMIZER);
		createEReference(tourOptimizerEClass, TOUR_OPTIMIZER__MAPS);
		createEReference(tourOptimizerEClass, TOUR_OPTIMIZER__TOURPOPULATIONS);

		citiesMapEClass = createEClass(CITIES_MAP);
		createEAttribute(citiesMapEClass, CITIES_MAP__NUM_CITIES);
		createEAttribute(citiesMapEClass, CITIES_MAP__XRANGE);
		createEAttribute(citiesMapEClass, CITIES_MAP__YRANGE);
		createEReference(citiesMapEClass, CITIES_MAP__CITIES);
		createEOperation(citiesMapEClass, CITIES_MAP___INITIALIZE);
		createEOperation(citiesMapEClass, CITIES_MAP___APPEARS_ONCE__CITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tourPopulationEClass.getESuperTypes().add(this.getPopulation());
		incompleteTourEClass.getESuperTypes().add(this.getChromosome());
		completeTourEClass.getESuperTypes().add(this.getChromosome());
		cityEClass.getESuperTypes().add(this.getGene());
		tourOptimizerEClass.getESuperTypes().add(this.getOptimizer());

		// Initialize classes, features, and operations; add parameters
		initEClass(populationEClass, Population.class, "Population", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPopulation_PSize(), ecorePackage.getEInt(), "pSize", "10", 0, 1, Population.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPopulation_MProb(), ecorePackage.getEFloat(), "mProb", "0.2", 0, 1, Population.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPopulation_Chromosomes(), this.getChromosome(), null, "chromosomes", null, 0, -1, Population.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPopulation__Crossover(), null, "crossover", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPopulation__Mutate(), null, "mutate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPopulation__FindFittest(), this.getChromosome(), "findFittest", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPopulation__GenerateChromosomes(), null, "generateChromosomes", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tourPopulationEClass, TourPopulation.class, "TourPopulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTourPopulation_Maps(), this.getCitiesMap(), null, "maps", null, 1, 1, TourPopulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chromosomeEClass, Chromosome.class, "Chromosome", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChromosome_Fitness(), ecorePackage.getEDouble(), "fitness", null, 0, 1, Chromosome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChromosome_Genes(), this.getGene(), null, "genes", null, 0, -1, Chromosome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getChromosome__Fitness(), ecorePackage.getEDouble(), "fitness", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(incompleteTourEClass, IncompleteTour.class, "IncompleteTour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIncompleteTour_Model(), ecorePackage.getEString(), "model", null, 0, 1, IncompleteTour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIncompleteTour_Cities(), this.getCity(), null, "cities", null, 0, -1, IncompleteTour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIncompleteTour_Maps(), this.getCitiesMap(), null, "maps", null, 1, 1, IncompleteTour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getIncompleteTour__IsValidCity__City(), ecorePackage.getEBoolean(), "isValidCity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCity(), "city", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(completeTourEClass, CompleteTour.class, "CompleteTour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompleteTour_Model(), ecorePackage.getEString(), "model", null, 0, 1, CompleteTour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompleteTour_Cities(), this.getCity(), null, "cities", null, 0, -1, CompleteTour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompleteTour_Maps(), this.getCitiesMap(), null, "maps", null, 1, 1, CompleteTour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCompleteTour__IsValidCity__City(), ecorePackage.getEBoolean(), "isValidCity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCity(), "city", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(geneEClass, Gene.class, "Gene", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cityEClass, City.class, "City", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCity_Name(), ecorePackage.getEString(), "name", null, 0, 1, City.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCity_X(), ecorePackage.getEFloat(), "x", null, 0, 1, City.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCity_Y(), ecorePackage.getEFloat(), "y", null, 0, 1, City.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optimizerEClass, Optimizer.class, "Optimizer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOptimizer_MaxGenerations(), ecorePackage.getEInt(), "maxGenerations", null, 0, 1, Optimizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptimizer_Iterations(), ecorePackage.getEInt(), "iterations", null, 0, 1, Optimizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptimizer_Populations(), this.getPopulation(), null, "populations", null, 1, 1, Optimizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOptimizer__SetupPopulation(), null, "setupPopulation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOptimizer__EvolvePopulation(), null, "evolvePopulation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tourOptimizerEClass, TourOptimizer.class, "TourOptimizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTourOptimizer_Maps(), this.getCitiesMap(), null, "maps", null, 1, 1, TourOptimizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTourOptimizer_Tourpopulations(), this.getTourPopulation(), null, "tourpopulations", null, 1, 1, TourOptimizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(citiesMapEClass, CitiesMap.class, "CitiesMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCitiesMap_NumCities(), ecorePackage.getEInt(), "numCities", "5", 0, 1, CitiesMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCitiesMap_XRange(), ecorePackage.getEFloat(), "xRange", "5.0", 0, 1, CitiesMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCitiesMap_YRange(), ecorePackage.getEFloat(), "yRange", "5.0", 0, 1, CitiesMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCitiesMap_Cities(), this.getCity(), null, "cities", null, 0, -1, CitiesMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCitiesMap__Initialize(), null, "initialize", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCitiesMap__AppearsOnce__City(), ecorePackage.getEBoolean(), "appearsOnce", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCity(), "city", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (populationEClass, 
		   source, 
		   new String[] {
			 "constraints", "numOfChromosomes"
		   });	
		addAnnotation
		  (incompleteTourEClass, 
		   source, 
		   new String[] {
			 "constraints", "numOfCities validateCities"
		   });	
		addAnnotation
		  (completeTourEClass, 
		   source, 
		   new String[] {
			 "constraints", "numOfCities validateCities"
		   });	
		addAnnotation
		  (optimizerEClass, 
		   source, 
		   new String[] {
			 "constraints", "numOfGenerations"
		   });	
		addAnnotation
		  (citiesMapEClass, 
		   source, 
		   new String[] {
			 "constraints", "numOfCities xyCoordinates validateCity"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (populationEClass, 
		   source, 
		   new String[] {
			 "numOfChromosomes", "self.chromosomes->size() <= self.pSize"
		   });	
		addAnnotation
		  (incompleteTourEClass, 
		   source, 
		   new String[] {
			 "numOfCities", "self.cities->size() <= self.maps.numCities",
			 "validateCities", "self.cities->forAll(c | (isValidCity(c)))"
		   });	
		addAnnotation
		  (getIncompleteTour__IsValidCity__City(), 
		   source, 
		   new String[] {
			 "body", "(self.maps.cities->select(c | (c.name = city.name) and (c.x = city.x) and (c.y = city.y))->size() = 1) and\n\t\t\t\t\t(self.cities->select(c | (c.name = city.name) and (c.x = city.x) and (c.y = city.y))->size() >= 1)"
		   });	
		addAnnotation
		  (completeTourEClass, 
		   source, 
		   new String[] {
			 "numOfCities", "self.cities->size() = self.maps.numCities",
			 "validateCities", "self.cities->forAll(c | (isValidCity(c)))"
		   });	
		addAnnotation
		  (getCompleteTour__IsValidCity__City(), 
		   source, 
		   new String[] {
			 "body", "(self.maps.cities->select(c | (c.name = city.name) and (c.x = city.x) and (c.y = city.y))->size() = 1) and \n\t\t\t\t\t(self.cities->select(c | (c.name = city.name) and (c.x = city.x) and (c.y = city.y))->size() = 1)"
		   });	
		addAnnotation
		  (optimizerEClass, 
		   source, 
		   new String[] {
			 "numOfGenerations", "self.iterations <= self.maxGenerations"
		   });	
		addAnnotation
		  (citiesMapEClass, 
		   source, 
		   new String[] {
			 "numOfCities", "self.cities->size() = self.numCities",
			 "xyCoordinates", "self.cities->forAll(c | (c.x <= self.xRange) and (c.y <= self.yRange))",
			 "validateCity", "self.cities->forAll(c | appearsOnce(c))"
		   });	
		addAnnotation
		  (getCitiesMap__AppearsOnce__City(), 
		   source, 
		   new String[] {
			 "body", "self.cities->select(c | (c.name = city.name) and (c.x = city.x) and (c.y = city.y))->size() = 1"
		   });
	}

} //GaSalesManPackageImpl
