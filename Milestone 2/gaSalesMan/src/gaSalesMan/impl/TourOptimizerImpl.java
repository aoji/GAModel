/**
 */
package gaSalesMan.impl;

import gaSalesMan.CitiesMap;
import gaSalesMan.GaSalesManPackage;
import gaSalesMan.TourOptimizer;
import gaSalesMan.TourPopulation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tour Optimizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gaSalesMan.impl.TourOptimizerImpl#getMaps <em>Maps</em>}</li>
 *   <li>{@link gaSalesMan.impl.TourOptimizerImpl#getTourpopulations <em>Tourpopulations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TourOptimizerImpl extends OptimizerImpl implements TourOptimizer {
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
	 * The cached value of the '{@link #getTourpopulations() <em>Tourpopulations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTourpopulations()
	 * @generated
	 * @ordered
	 */
	protected TourPopulation tourpopulations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TourOptimizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GaSalesManPackage.Literals.TOUR_OPTIMIZER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GaSalesManPackage.TOUR_OPTIMIZER__MAPS, oldMaps, maps));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GaSalesManPackage.TOUR_OPTIMIZER__MAPS, oldMaps, maps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TourPopulation getTourpopulations() {
		if (tourpopulations != null && tourpopulations.eIsProxy()) {
			InternalEObject oldTourpopulations = (InternalEObject)tourpopulations;
			tourpopulations = (TourPopulation)eResolveProxy(oldTourpopulations);
			if (tourpopulations != oldTourpopulations) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GaSalesManPackage.TOUR_OPTIMIZER__TOURPOPULATIONS, oldTourpopulations, tourpopulations));
			}
		}
		return tourpopulations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TourPopulation basicGetTourpopulations() {
		return tourpopulations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTourpopulations(TourPopulation newTourpopulations) {
		TourPopulation oldTourpopulations = tourpopulations;
		tourpopulations = newTourpopulations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaSalesManPackage.TOUR_OPTIMIZER__TOURPOPULATIONS, oldTourpopulations, tourpopulations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GaSalesManPackage.TOUR_OPTIMIZER__MAPS:
				if (resolve) return getMaps();
				return basicGetMaps();
			case GaSalesManPackage.TOUR_OPTIMIZER__TOURPOPULATIONS:
				if (resolve) return getTourpopulations();
				return basicGetTourpopulations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GaSalesManPackage.TOUR_OPTIMIZER__MAPS:
				setMaps((CitiesMap)newValue);
				return;
			case GaSalesManPackage.TOUR_OPTIMIZER__TOURPOPULATIONS:
				setTourpopulations((TourPopulation)newValue);
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
			case GaSalesManPackage.TOUR_OPTIMIZER__MAPS:
				setMaps((CitiesMap)null);
				return;
			case GaSalesManPackage.TOUR_OPTIMIZER__TOURPOPULATIONS:
				setTourpopulations((TourPopulation)null);
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
			case GaSalesManPackage.TOUR_OPTIMIZER__MAPS:
				return maps != null;
			case GaSalesManPackage.TOUR_OPTIMIZER__TOURPOPULATIONS:
				return tourpopulations != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void setupPopulation() {
		for (int i = 0; i < tourpopulations.getPSize(); i++) {
			tourpopulations.generateChromosomes();
		}
	}

	@Override
	public void evolvePopulation() {
		tourpopulations.crossover();
		tourpopulations.mutate();
	}

} //TourOptimizerImpl
