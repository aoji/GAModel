/**
 */
package gaSalesMan.impl;

import gaSalesMan.Chromosome;
import gaSalesMan.CitiesMap;
import gaSalesMan.GaSalesManPackage;
import gaSalesMan.Gene;
import gaSalesMan.CompleteTour;
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
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gaSalesMan.impl.TourPopulationImpl#getMaps <em>Maps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TourPopulationImpl extends PopulationImpl implements TourPopulation {
	
	
	/**
	 * The cached value of the '{@link #getMaps() <em>Maps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaps()
	 * @generated
	 * @ordered
	 */
	protected CitiesMap maps;

	
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitiesMap getMaps() {
		if (maps != null && maps.eIsProxy()) {
			InternalEObject oldMaps = (InternalEObject)maps;
			maps = (CitiesMap)eResolveProxy(oldMaps);
			if (maps != oldMaps) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GaSalesManPackage.TOUR_POPULATION__MAPS, oldMaps, maps));
			}
		}
		return maps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitiesMap basicGetMaps() {
		return maps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaps(CitiesMap newMaps) {
		CitiesMap oldMaps = maps;
		maps = newMaps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaSalesManPackage.TOUR_POPULATION__MAPS, oldMaps, maps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GaSalesManPackage.TOUR_POPULATION__MAPS:
				if (resolve) return getMaps();
				return basicGetMaps();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GaSalesManPackage.TOUR_POPULATION__MAPS:
				setMaps((CitiesMap)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GaSalesManPackage.TOUR_POPULATION__MAPS:
				setMaps((CitiesMap)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GaSalesManPackage.TOUR_POPULATION__MAPS:
				return maps != null;
		}
		return super.eIsSet(featureID);
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
			CompleteTour t = new CompleteTourImpl();
			
			chromosomes.add(t);
		}
	}
	
} //TourPopulationImpl
