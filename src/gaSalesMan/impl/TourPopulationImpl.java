/**
 */
package gaSalesMan.impl;

import gaSalesMan.Chromosome;
import gaSalesMan.CitiesMap;
import gaSalesMan.GaSalesManPackage;
import gaSalesMan.Gene;
import gaSalesMan.Tour;
import gaSalesMan.TourPopulation;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tour Population</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TourPopulationImpl extends PopulationImpl implements TourPopulation {
	
	
	protected CitiesMap citiesmap;

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TourPopulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GaSalesManPackage.Literals.TOUR_POPULATION;
	}

	@Override
	public void crossover() {
		
	}

	@Override
	public void mutate() {
		
		for (int i = 0; i < pSize; i++){
			Chromosome c = chromosomes.get(i);
			
			List<Integer> range = IntStream.rangeClosed(0, c.getGenes().size())
				    .boxed().collect(Collectors.toList());	
			
			Collections.shuffle(range);
			
			EList<Gene> g = c.getGenes();
			
			Gene a = g.get(range.get(0));
			Gene b = g.get(range.get(1));
			
			g.set(range.get(1), a);
			g.set(range.get(0), b);
		}
		
	}

	@Override
	public Chromosome findFittest() {
		Chromosome fittest = null;
		double fitness = 0;
		
		for (int i = 0; i < pSize; i++) {
			Chromosome c = chromosomes.get(i);
			
			if (c.fitness() < fitness || fitness == 0) {
				fitness = c.fitness();
				fittest = c;
			}
		}
		
		return fittest;
	}

	@Override
	public void generateChromosomes() {
		for (int i = 0; i < pSize; i++) {
			Tour t = new TourImpl();
			t.initialize();
			
			chromosomes.add(t);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitiesMap getCitiesmap() {
		if (citiesmap != null && citiesmap.eIsProxy()) {
			InternalEObject oldCitiesmap = (InternalEObject)citiesmap;
			citiesmap = (CitiesMap)eResolveProxy(oldCitiesmap);
			if (citiesmap != oldCitiesmap) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GaSalesManPackage.TOUR_POPULATION__CITIESMAP, oldCitiesmap, citiesmap));
			}
		}
		return citiesmap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitiesMap basicGetCitiesmap() {
		return citiesmap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCitiesmap(CitiesMap newCitiesmap) {
		CitiesMap oldCitiesmap = citiesmap;
		citiesmap = newCitiesmap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaSalesManPackage.TOUR_POPULATION__CITIESMAP, oldCitiesmap, citiesmap));
	}

} //TourPopulationImpl
