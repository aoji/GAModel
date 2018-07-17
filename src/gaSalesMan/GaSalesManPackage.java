/**
 */
package gaSalesMan;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gaSalesMan.GaSalesManFactory
 * @model kind="package"
 * @generated
 */
public interface GaSalesManPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gaSalesMan";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/gaSalesMan";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gaSalesMan";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GaSalesManPackage eINSTANCE = gaSalesMan.impl.GaSalesManPackageImpl.init();

	/**
	 * The meta object id for the '{@link gaSalesMan.impl.PopulationImpl <em>Population</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaSalesMan.impl.PopulationImpl
	 * @see gaSalesMan.impl.GaSalesManPackageImpl#getPopulation()
	 * @generated
	 */
	int POPULATION = 0;

	/**
	 * The feature id for the '<em><b>PSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION__PSIZE = 0;

	/**
	 * The feature id for the '<em><b>Chromosomes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION__CHROMOSOMES = 1;

	/**
	 * The feature id for the '<em><b>MProb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION__MPROB = 2;

	/**
	 * The number of structural features of the '<em>Population</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Crossover</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION___CROSSOVER = 0;

	/**
	 * The operation id for the '<em>Mutate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION___MUTATE = 1;

	/**
	 * The operation id for the '<em>Find Fittest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION___FIND_FITTEST = 2;

	/**
	 * The operation id for the '<em>Generate Chromosomes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION___GENERATE_CHROMOSOMES = 3;

	/**
	 * The number of operations of the '<em>Population</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link gaSalesMan.impl.ChromosomeImpl <em>Chromosome</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaSalesMan.impl.ChromosomeImpl
	 * @see gaSalesMan.impl.GaSalesManPackageImpl#getChromosome()
	 * @generated
	 */
	int CHROMOSOME = 1;

	/**
	 * The feature id for the '<em><b>Genes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHROMOSOME__GENES = 0;

	/**
	 * The number of structural features of the '<em>Chromosome</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHROMOSOME_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Fitness</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHROMOSOME___FITNESS = 0;

	/**
	 * The number of operations of the '<em>Chromosome</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHROMOSOME_OPERATION_COUNT = 1;
	
	/**
	 * The feature id for the '<em><b>Citiesmap</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR__CITIESMAP = CHROMOSOME_FEATURE_COUNT + 1;
	
	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR___INITIALIZE = CHROMOSOME_OPERATION_COUNT + 0;
	
	/**
	 * The meta object id for the '{@link gaSalesMan.impl.GeneImpl <em>Gene</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaSalesMan.impl.GeneImpl
	 * @see gaSalesMan.impl.GaSalesManPackageImpl#getGene()
	 * @generated
	 */
	int GENE = 2;

	/**
	 * The number of structural features of the '<em>Gene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Gene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gaSalesMan.impl.CityImpl <em>City</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaSalesMan.impl.CityImpl
	 * @see gaSalesMan.impl.GaSalesManPackageImpl#getCity()
	 * @generated
	 */
	int CITY = 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__X = GENE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__Y = GENE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_FEATURE_COUNT = GENE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OPERATION_COUNT = GENE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gaSalesMan.impl.TourImpl <em>Tour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaSalesMan.impl.TourImpl
	 * @see gaSalesMan.impl.GaSalesManPackageImpl#getTour()
	 * @generated
	 */
	int TOUR = 4;

	/**
	 * The feature id for the '<em><b>Genes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR__GENES = CHROMOSOME__GENES;

	/**
	 * The feature id for the '<em><b>Cities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR__CITIES = CHROMOSOME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_FEATURE_COUNT = CHROMOSOME_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Fitness</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR___FITNESS = CHROMOSOME___FITNESS;

	/**
	 * The number of operations of the '<em>Tour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_OPERATION_COUNT = CHROMOSOME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gaSalesMan.impl.OptimizerImpl <em>Optimizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaSalesMan.impl.OptimizerImpl
	 * @see gaSalesMan.impl.GaSalesManPackageImpl#getOptimizer()
	 * @generated
	 */
	int OPTIMIZER = 5;

	/**
	 * The feature id for the '<em><b>Population</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZER__POPULATION = 0;

	/**
	 * The feature id for the '<em><b>Max Generations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZER__MAX_GENERATIONS = 1;

	/**
	 * The number of structural features of the '<em>Optimizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Setup Population</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZER___SETUP_POPULATION = 0;

	/**
	 * The operation id for the '<em>Evolve Population</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZER___EVOLVE_POPULATION = 1;

	/**
	 * The number of operations of the '<em>Optimizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link gaSalesMan.impl.CitiesMapImpl <em>Cities Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaSalesMan.impl.CitiesMapImpl
	 * @see gaSalesMan.impl.GaSalesManPackageImpl#getCitiesMap()
	 * @generated
	 */
	int CITIES_MAP = 6;

	/**
	 * The feature id for the '<em><b>Cities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITIES_MAP__CITIES = 0;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITIES_MAP__XRANGE = 1;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITIES_MAP__YRANGE = 2;

	/**
	 * The feature id for the '<em><b>Num Cities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITIES_MAP__NUM_CITIES = 3;

	/**
	 * The number of structural features of the '<em>Cities Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITIES_MAP_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITIES_MAP___INITIALIZE = 0;

	/**
	 * The number of operations of the '<em>Cities Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITIES_MAP_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link gaSalesMan.impl.TourPopulationImpl <em>Tour Population</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaSalesMan.impl.TourPopulationImpl
	 * @see gaSalesMan.impl.GaSalesManPackageImpl#getTourPopulation()
	 * @generated
	 */
	int TOUR_POPULATION = 7;

	/**
	 * The feature id for the '<em><b>PSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_POPULATION__PSIZE = POPULATION__PSIZE;

	/**
	 * The feature id for the '<em><b>Chromosomes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_POPULATION__CHROMOSOMES = POPULATION__CHROMOSOMES;

	/**
	 * The feature id for the '<em><b>MProb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_POPULATION__MPROB = POPULATION__MPROB;

	/**
	 * The number of structural features of the '<em>Tour Population</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_POPULATION_FEATURE_COUNT = POPULATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Crossover</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_POPULATION___CROSSOVER = POPULATION___CROSSOVER;

	/**
	 * The operation id for the '<em>Mutate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_POPULATION___MUTATE = POPULATION___MUTATE;

	/**
	 * The operation id for the '<em>Find Fittest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_POPULATION___FIND_FITTEST = POPULATION___FIND_FITTEST;

	/**
	 * The operation id for the '<em>Generate Chromosomes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_POPULATION___GENERATE_CHROMOSOMES = POPULATION___GENERATE_CHROMOSOMES;

	/**
	 * The number of operations of the '<em>Tour Population</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_POPULATION_OPERATION_COUNT = POPULATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gaSalesMan.impl.TourOptimizerImpl <em>Tour Optimizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaSalesMan.impl.TourOptimizerImpl
	 * @see gaSalesMan.impl.GaSalesManPackageImpl#getTourOptimizer()
	 * @generated
	 */
	int TOUR_OPTIMIZER = 8;

	/**
	 * The feature id for the '<em><b>Population</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_OPTIMIZER__POPULATION = OPTIMIZER__POPULATION;

	/**
	 * The feature id for the '<em><b>Max Generations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_OPTIMIZER__MAX_GENERATIONS = OPTIMIZER__MAX_GENERATIONS;

	/**
	 * The feature id for the '<em><b>Maps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_OPTIMIZER__MAPS = OPTIMIZER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tourpopulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_OPTIMIZER__TOURPOPULATION = OPTIMIZER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tour Optimizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_OPTIMIZER_FEATURE_COUNT = OPTIMIZER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Setup Population</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_OPTIMIZER___SETUP_POPULATION = OPTIMIZER___SETUP_POPULATION;

	/**
	 * The operation id for the '<em>Evolve Population</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_OPTIMIZER___EVOLVE_POPULATION = OPTIMIZER___EVOLVE_POPULATION;

	/**
	 * The number of operations of the '<em>Tour Optimizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_OPTIMIZER_OPERATION_COUNT = OPTIMIZER_OPERATION_COUNT + 0;


	/**
	 * The feature id for the '<em><b>Citiesmap</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUR_POPULATION__CITIESMAP = POPULATION_FEATURE_COUNT + 0;
	
	/**
	 * Returns the meta object for class '{@link gaSalesMan.Population <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Population</em>'.
	 * @see gaSalesMan.Population
	 * @generated
	 */
	EClass getPopulation();

	/**
	 * Returns the meta object for the attribute '{@link gaSalesMan.Population#getPSize <em>PSize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PSize</em>'.
	 * @see gaSalesMan.Population#getPSize()
	 * @see #getPopulation()
	 * @generated
	 */
	EAttribute getPopulation_PSize();

	/**
	 * Returns the meta object for the containment reference list '{@link gaSalesMan.Population#getChromosomes <em>Chromosomes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chromosomes</em>'.
	 * @see gaSalesMan.Population#getChromosomes()
	 * @see #getPopulation()
	 * @generated
	 */
	EReference getPopulation_Chromosomes();

	/**
	 * Returns the meta object for the attribute '{@link gaSalesMan.Population#getMProb <em>MProb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MProb</em>'.
	 * @see gaSalesMan.Population#getMProb()
	 * @see #getPopulation()
	 * @generated
	 */
	EAttribute getPopulation_MProb();

	/**
	 * Returns the meta object for the '{@link gaSalesMan.Population#crossover() <em>Crossover</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crossover</em>' operation.
	 * @see gaSalesMan.Population#crossover()
	 * @generated
	 */
	EOperation getPopulation__Crossover();

	/**
	 * Returns the meta object for the '{@link gaSalesMan.Population#mutate() <em>Mutate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mutate</em>' operation.
	 * @see gaSalesMan.Population#mutate()
	 * @generated
	 */
	EOperation getPopulation__Mutate();

	/**
	 * Returns the meta object for the '{@link gaSalesMan.Population#findFittest() <em>Find Fittest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Fittest</em>' operation.
	 * @see gaSalesMan.Population#findFittest()
	 * @generated
	 */
	EOperation getPopulation__FindFittest();

	/**
	 * Returns the meta object for the '{@link gaSalesMan.Population#generateChromosomes() <em>Generate Chromosomes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Chromosomes</em>' operation.
	 * @see gaSalesMan.Population#generateChromosomes()
	 * @generated
	 */
	EOperation getPopulation__GenerateChromosomes();

	/**
	 * Returns the meta object for class '{@link gaSalesMan.Chromosome <em>Chromosome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chromosome</em>'.
	 * @see gaSalesMan.Chromosome
	 * @generated
	 */
	EClass getChromosome();

	/**
	 * Returns the meta object for the containment reference list '{@link gaSalesMan.Chromosome#getGenes <em>Genes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Genes</em>'.
	 * @see gaSalesMan.Chromosome#getGenes()
	 * @see #getChromosome()
	 * @generated
	 */
	EReference getChromosome_Genes();

	/**
	 * Returns the meta object for the '{@link gaSalesMan.Chromosome#fitness() <em>Fitness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fitness</em>' operation.
	 * @see gaSalesMan.Chromosome#fitness()
	 * @generated
	 */
	EOperation getChromosome__Fitness();

	/**
	 * Returns the meta object for class '{@link gaSalesMan.Gene <em>Gene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gene</em>'.
	 * @see gaSalesMan.Gene
	 * @generated
	 */
	EClass getGene();

	/**
	 * Returns the meta object for class '{@link gaSalesMan.City <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>City</em>'.
	 * @see gaSalesMan.City
	 * @generated
	 */
	EClass getCity();

	/**
	 * Returns the meta object for the attribute '{@link gaSalesMan.City#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see gaSalesMan.City#getX()
	 * @see #getCity()
	 * @generated
	 */
	EAttribute getCity_X();

	/**
	 * Returns the meta object for the attribute '{@link gaSalesMan.City#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see gaSalesMan.City#getY()
	 * @see #getCity()
	 * @generated
	 */
	EAttribute getCity_Y();

	/**
	 * Returns the meta object for class '{@link gaSalesMan.Tour <em>Tour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tour</em>'.
	 * @see gaSalesMan.Tour
	 * @generated
	 */
	EClass getTour();

	/**
	 * Returns the meta object for the containment reference list '{@link gaSalesMan.Tour#getCities <em>Cities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cities</em>'.
	 * @see gaSalesMan.Tour#getCities()
	 * @see #getTour()
	 * @generated
	 */
	EReference getTour_Cities();

	/**
	 * Returns the meta object for class '{@link gaSalesMan.Optimizer <em>Optimizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optimizer</em>'.
	 * @see gaSalesMan.Optimizer
	 * @generated
	 */
	EClass getOptimizer();

	/**
	 * Returns the meta object for the reference '{@link gaSalesMan.Optimizer#getPopulation <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Population</em>'.
	 * @see gaSalesMan.Optimizer#getPopulation()
	 * @see #getOptimizer()
	 * @generated
	 */
	EReference getOptimizer_Population();

	/**
	 * Returns the meta object for the attribute '{@link gaSalesMan.Optimizer#getMaxGenerations <em>Max Generations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Generations</em>'.
	 * @see gaSalesMan.Optimizer#getMaxGenerations()
	 * @see #getOptimizer()
	 * @generated
	 */
	EAttribute getOptimizer_MaxGenerations();

	/**
	 * Returns the meta object for the '{@link gaSalesMan.Optimizer#setupPopulation() <em>Setup Population</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Setup Population</em>' operation.
	 * @see gaSalesMan.Optimizer#setupPopulation()
	 * @generated
	 */
	EOperation getOptimizer__SetupPopulation();

	/**
	 * Returns the meta object for the '{@link gaSalesMan.Optimizer#evolvePopulation() <em>Evolve Population</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evolve Population</em>' operation.
	 * @see gaSalesMan.Optimizer#evolvePopulation()
	 * @generated
	 */
	EOperation getOptimizer__EvolvePopulation();

	/**
	 * Returns the meta object for class '{@link gaSalesMan.CitiesMap <em>Cities Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cities Map</em>'.
	 * @see gaSalesMan.CitiesMap
	 * @generated
	 */
	EClass getCitiesMap();

	/**
	 * Returns the meta object for the containment reference list '{@link gaSalesMan.CitiesMap#getCities <em>Cities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cities</em>'.
	 * @see gaSalesMan.CitiesMap#getCities()
	 * @see #getCitiesMap()
	 * @generated
	 */
	EReference getCitiesMap_Cities();

	/**
	 * Returns the meta object for the attribute '{@link gaSalesMan.CitiesMap#getXRange <em>XRange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XRange</em>'.
	 * @see gaSalesMan.CitiesMap#getXRange()
	 * @see #getCitiesMap()
	 * @generated
	 */
	EAttribute getCitiesMap_XRange();

	/**
	 * Returns the meta object for the attribute '{@link gaSalesMan.CitiesMap#getYRange <em>YRange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YRange</em>'.
	 * @see gaSalesMan.CitiesMap#getYRange()
	 * @see #getCitiesMap()
	 * @generated
	 */
	EAttribute getCitiesMap_YRange();

	/**
	 * Returns the meta object for the attribute '{@link gaSalesMan.CitiesMap#getNumCities <em>Num Cities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Cities</em>'.
	 * @see gaSalesMan.CitiesMap#getNumCities()
	 * @see #getCitiesMap()
	 * @generated
	 */
	EAttribute getCitiesMap_NumCities();

	/**
	 * Returns the meta object for the '{@link gaSalesMan.CitiesMap#initialize() <em>Initialize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see gaSalesMan.CitiesMap#initialize()
	 * @generated
	 */
	EOperation getCitiesMap__Initialize();

	/**
	 * Returns the meta object for class '{@link gaSalesMan.TourPopulation <em>Tour Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tour Population</em>'.
	 * @see gaSalesMan.TourPopulation
	 * @generated
	 */
	EClass getTourPopulation();

	/**
	 * Returns the meta object for class '{@link gaSalesMan.TourOptimizer <em>Tour Optimizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tour Optimizer</em>'.
	 * @see gaSalesMan.TourOptimizer
	 * @generated
	 */
	EClass getTourOptimizer();

	/**
	 * Returns the meta object for the reference '{@link gaSalesMan.TourOptimizer#getMaps <em>Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maps</em>'.
	 * @see gaSalesMan.TourOptimizer#getMaps()
	 * @see #getTourOptimizer()
	 * @generated
	 */
	EReference getTourOptimizer_Maps();

	/**
	 * Returns the meta object for the reference '{@link gaSalesMan.TourOptimizer#getTourpopulation <em>Tourpopulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tourpopulation</em>'.
	 * @see gaSalesMan.TourOptimizer#getTourpopulation()
	 * @see #getTourOptimizer()
	 * @generated
	 */
	EReference getTourOptimizer_Tourpopulation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GaSalesManFactory getGaSalesManFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gaSalesMan.impl.PopulationImpl <em>Population</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaSalesMan.impl.PopulationImpl
		 * @see gaSalesMan.impl.GaSalesManPackageImpl#getPopulation()
		 * @generated
		 */
		EClass POPULATION = eINSTANCE.getPopulation();

		/**
		 * The meta object literal for the '<em><b>PSize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POPULATION__PSIZE = eINSTANCE.getPopulation_PSize();

		/**
		 * The meta object literal for the '<em><b>Chromosomes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POPULATION__CHROMOSOMES = eINSTANCE.getPopulation_Chromosomes();

		/**
		 * The meta object literal for the '<em><b>MProb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POPULATION__MPROB = eINSTANCE.getPopulation_MProb();

		/**
		 * The meta object literal for the '<em><b>Crossover</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POPULATION___CROSSOVER = eINSTANCE.getPopulation__Crossover();

		/**
		 * The meta object literal for the '<em><b>Mutate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POPULATION___MUTATE = eINSTANCE.getPopulation__Mutate();

		/**
		 * The meta object literal for the '<em><b>Find Fittest</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POPULATION___FIND_FITTEST = eINSTANCE.getPopulation__FindFittest();

		/**
		 * The meta object literal for the '<em><b>Generate Chromosomes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POPULATION___GENERATE_CHROMOSOMES = eINSTANCE.getPopulation__GenerateChromosomes();

		/**
		 * The meta object literal for the '{@link gaSalesMan.impl.ChromosomeImpl <em>Chromosome</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaSalesMan.impl.ChromosomeImpl
		 * @see gaSalesMan.impl.GaSalesManPackageImpl#getChromosome()
		 * @generated
		 */
		EClass CHROMOSOME = eINSTANCE.getChromosome();

		/**
		 * The meta object literal for the '<em><b>Genes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHROMOSOME__GENES = eINSTANCE.getChromosome_Genes();

		/**
		 * The meta object literal for the '<em><b>Fitness</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHROMOSOME___FITNESS = eINSTANCE.getChromosome__Fitness();

		/**
		 * The meta object literal for the '{@link gaSalesMan.impl.GeneImpl <em>Gene</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaSalesMan.impl.GeneImpl
		 * @see gaSalesMan.impl.GaSalesManPackageImpl#getGene()
		 * @generated
		 */
		EClass GENE = eINSTANCE.getGene();

		/**
		 * The meta object literal for the '{@link gaSalesMan.impl.CityImpl <em>City</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaSalesMan.impl.CityImpl
		 * @see gaSalesMan.impl.GaSalesManPackageImpl#getCity()
		 * @generated
		 */
		EClass CITY = eINSTANCE.getCity();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY__X = eINSTANCE.getCity_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY__Y = eINSTANCE.getCity_Y();

		/**
		 * The meta object literal for the '{@link gaSalesMan.impl.TourImpl <em>Tour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaSalesMan.impl.TourImpl
		 * @see gaSalesMan.impl.GaSalesManPackageImpl#getTour()
		 * @generated
		 */
		EClass TOUR = eINSTANCE.getTour();

		/**
		 * The meta object literal for the '<em><b>Cities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUR__CITIES = eINSTANCE.getTour_Cities();

		/**
		 * The meta object literal for the '{@link gaSalesMan.impl.OptimizerImpl <em>Optimizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaSalesMan.impl.OptimizerImpl
		 * @see gaSalesMan.impl.GaSalesManPackageImpl#getOptimizer()
		 * @generated
		 */
		EClass OPTIMIZER = eINSTANCE.getOptimizer();

		/**
		 * The meta object literal for the '<em><b>Population</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIMIZER__POPULATION = eINSTANCE.getOptimizer_Population();

		/**
		 * The meta object literal for the '<em><b>Max Generations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIMIZER__MAX_GENERATIONS = eINSTANCE.getOptimizer_MaxGenerations();

		/**
		 * The meta object literal for the '<em><b>Setup Population</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPTIMIZER___SETUP_POPULATION = eINSTANCE.getOptimizer__SetupPopulation();

		/**
		 * The meta object literal for the '<em><b>Evolve Population</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPTIMIZER___EVOLVE_POPULATION = eINSTANCE.getOptimizer__EvolvePopulation();

		/**
		 * The meta object literal for the '{@link gaSalesMan.impl.CitiesMapImpl <em>Cities Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaSalesMan.impl.CitiesMapImpl
		 * @see gaSalesMan.impl.GaSalesManPackageImpl#getCitiesMap()
		 * @generated
		 */
		EClass CITIES_MAP = eINSTANCE.getCitiesMap();

		/**
		 * The meta object literal for the '<em><b>Cities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITIES_MAP__CITIES = eINSTANCE.getCitiesMap_Cities();

		/**
		 * The meta object literal for the '<em><b>XRange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITIES_MAP__XRANGE = eINSTANCE.getCitiesMap_XRange();

		/**
		 * The meta object literal for the '<em><b>YRange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITIES_MAP__YRANGE = eINSTANCE.getCitiesMap_YRange();

		/**
		 * The meta object literal for the '<em><b>Num Cities</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITIES_MAP__NUM_CITIES = eINSTANCE.getCitiesMap_NumCities();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CITIES_MAP___INITIALIZE = eINSTANCE.getCitiesMap__Initialize();

		/**
		 * The meta object literal for the '{@link gaSalesMan.impl.TourPopulationImpl <em>Tour Population</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaSalesMan.impl.TourPopulationImpl
		 * @see gaSalesMan.impl.GaSalesManPackageImpl#getTourPopulation()
		 * @generated
		 */
		EClass TOUR_POPULATION = eINSTANCE.getTourPopulation();

		/**
		 * The meta object literal for the '{@link gaSalesMan.impl.TourOptimizerImpl <em>Tour Optimizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaSalesMan.impl.TourOptimizerImpl
		 * @see gaSalesMan.impl.GaSalesManPackageImpl#getTourOptimizer()
		 * @generated
		 */
		EClass TOUR_OPTIMIZER = eINSTANCE.getTourOptimizer();

		/**
		 * The meta object literal for the '<em><b>Maps</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUR_OPTIMIZER__MAPS = eINSTANCE.getTourOptimizer_Maps();

		/**
		 * The meta object literal for the '<em><b>Tourpopulation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUR_OPTIMIZER__TOURPOPULATION = eINSTANCE.getTourOptimizer_Tourpopulation();

	}

} //GaSalesManPackage
