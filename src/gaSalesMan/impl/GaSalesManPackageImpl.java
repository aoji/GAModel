/**
 */
package gaSalesMan.impl;

import gaSalesMan.Chromosome;
import gaSalesMan.CitiesMap;
import gaSalesMan.City;
import gaSalesMan.GaSalesManFactory;
import gaSalesMan.GaSalesManPackage;
import gaSalesMan.Gene;
import gaSalesMan.Optimizer;
import gaSalesMan.Population;
import gaSalesMan.Tour;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
	private EClass tourEClass = null;

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
		return (EReference)populationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPopulation_MProb() {
		return (EAttribute)populationEClass.getEStructuralFeatures().get(2);
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
	public EOperation getPopulation__GenerateChromosome() {
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
	public EReference getChromosome_Genes() {
		return (EReference)chromosomeEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getCity_X() {
		return (EAttribute)cityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCity_Y() {
		return (EAttribute)cityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTour() {
		return tourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTour_Cities() {
		return (EReference)tourEClass.getEStructuralFeatures().get(0);
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
	public EReference getOptimizer_Populations() {
		return (EReference)optimizerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptimizer_Maps() {
		return (EReference)optimizerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptimizer_MaxGenerations() {
		return (EAttribute)optimizerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOptimizer__GeneratePopulation() {
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
		return (EReference)citiesMapEClass.getEStructuralFeatures().get(0);
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
		return (EAttribute)citiesMapEClass.getEStructuralFeatures().get(3);
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
		createEReference(populationEClass, POPULATION__CHROMOSOMES);
		createEAttribute(populationEClass, POPULATION__MPROB);
		createEOperation(populationEClass, POPULATION___CROSSOVER);
		createEOperation(populationEClass, POPULATION___MUTATE);
		createEOperation(populationEClass, POPULATION___FIND_FITTEST);
		createEOperation(populationEClass, POPULATION___GENERATE_CHROMOSOME);

		chromosomeEClass = createEClass(CHROMOSOME);
		createEReference(chromosomeEClass, CHROMOSOME__GENES);
		createEOperation(chromosomeEClass, CHROMOSOME___FITNESS);

		geneEClass = createEClass(GENE);

		cityEClass = createEClass(CITY);
		createEAttribute(cityEClass, CITY__X);
		createEAttribute(cityEClass, CITY__Y);

		tourEClass = createEClass(TOUR);
		createEReference(tourEClass, TOUR__CITIES);

		optimizerEClass = createEClass(OPTIMIZER);
		createEReference(optimizerEClass, OPTIMIZER__POPULATIONS);
		createEReference(optimizerEClass, OPTIMIZER__MAPS);
		createEAttribute(optimizerEClass, OPTIMIZER__MAX_GENERATIONS);
		createEOperation(optimizerEClass, OPTIMIZER___GENERATE_POPULATION);
		createEOperation(optimizerEClass, OPTIMIZER___EVOLVE_POPULATION);

		citiesMapEClass = createEClass(CITIES_MAP);
		createEReference(citiesMapEClass, CITIES_MAP__CITIES);
		createEAttribute(citiesMapEClass, CITIES_MAP__XRANGE);
		createEAttribute(citiesMapEClass, CITIES_MAP__YRANGE);
		createEAttribute(citiesMapEClass, CITIES_MAP__NUM_CITIES);
		createEOperation(citiesMapEClass, CITIES_MAP___INITIALIZE);
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
		cityEClass.getESuperTypes().add(this.getGene());
		tourEClass.getESuperTypes().add(this.getChromosome());

		// Initialize classes, features, and operations; add parameters
		initEClass(populationEClass, Population.class, "Population", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPopulation_PSize(), ecorePackage.getEInt(), "pSize", null, 0, 1, Population.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPopulation_Chromosomes(), this.getChromosome(), null, "chromosomes", null, 0, -1, Population.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPopulation_MProb(), ecorePackage.getEFloat(), "mProb", null, 0, 1, Population.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPopulation__Crossover(), null, "crossover", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPopulation__Mutate(), null, "mutate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPopulation__FindFittest(), null, "findFittest", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPopulation__GenerateChromosome(), null, "generateChromosome", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(chromosomeEClass, Chromosome.class, "Chromosome", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChromosome_Genes(), this.getGene(), null, "genes", null, 0, -1, Chromosome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getChromosome__Fitness(), null, "fitness", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(geneEClass, Gene.class, "Gene", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cityEClass, City.class, "City", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCity_X(), ecorePackage.getEFloat(), "x", null, 0, 1, City.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCity_Y(), ecorePackage.getEFloat(), "y", null, 0, 1, City.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tourEClass, Tour.class, "Tour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTour_Cities(), this.getCity(), null, "cities", null, 0, -1, Tour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optimizerEClass, Optimizer.class, "Optimizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptimizer_Populations(), this.getPopulation(), null, "populations", null, 0, -1, Optimizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptimizer_Maps(), this.getCitiesMap(), null, "maps", null, 0, -1, Optimizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptimizer_MaxGenerations(), ecorePackage.getEInt(), "maxGenerations", null, 0, 1, Optimizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOptimizer__GeneratePopulation(), null, "generatePopulation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOptimizer__EvolvePopulation(), null, "evolvePopulation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(citiesMapEClass, CitiesMap.class, "CitiesMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCitiesMap_Cities(), this.getCity(), null, "cities", null, 0, -1, CitiesMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCitiesMap_XRange(), ecorePackage.getEFloat(), "xRange", null, 0, 1, CitiesMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCitiesMap_YRange(), ecorePackage.getEFloat(), "yRange", null, 0, 1, CitiesMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCitiesMap_NumCities(), ecorePackage.getEInt(), "numCities", null, 0, 1, CitiesMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCitiesMap__Initialize(), null, "initialize", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GaSalesManPackageImpl
