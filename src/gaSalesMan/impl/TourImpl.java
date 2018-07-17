/**
 */
package gaSalesMan.impl;

import gaSalesMan.CitiesMap;
import gaSalesMan.City;
import gaSalesMan.GaSalesManPackage;
import gaSalesMan.Tour;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Collections;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gaSalesMan.impl.TourImpl#getCities <em>Cities</em>}</li>
 *   <li>{@link gaSalesMan.impl.TourImpl#getCitiesmap <em>Citiesmap</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TourImpl extends ChromosomeImpl implements Tour {
	/**
	 * The cached value of the '{@link #getCities() <em>Cities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCities()
	 * @generated
	 * @ordered
	 */
	protected EList<City> cities;

	/**
	 * The cached value of the '{@link #getCitiesmap() <em>Citiesmap</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitiesmap()
	 * @generated
	 * @ordered
	 */
	protected CitiesMap citiesmap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GaSalesManPackage.Literals.TOUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<City> getCities() {
		if (cities == null) {
			cities = new EObjectContainmentEList<City>(City.class, this, GaSalesManPackage.TOUR__CITIES);
		}
		return cities;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GaSalesManPackage.TOUR__CITIESMAP, oldCitiesmap, citiesmap));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GaSalesManPackage.TOUR__CITIESMAP, oldCitiesmap, citiesmap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initialize() {
		Collections.shuffle(cities);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GaSalesManPackage.TOUR__CITIES:
				return ((InternalEList<?>)getCities()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GaSalesManPackage.TOUR__CITIES:
				return getCities();
			case GaSalesManPackage.TOUR__CITIESMAP:
				if (resolve) return getCitiesmap();
				return basicGetCitiesmap();
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
			case GaSalesManPackage.TOUR__CITIES:
				getCities().clear();
				getCities().addAll((Collection<? extends City>)newValue);
				return;
			case GaSalesManPackage.TOUR__CITIESMAP:
				setCitiesmap((CitiesMap)newValue);
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
			case GaSalesManPackage.TOUR__CITIES:
				getCities().clear();
				return;
			case GaSalesManPackage.TOUR__CITIESMAP:
				setCitiesmap((CitiesMap)null);
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
			case GaSalesManPackage.TOUR__CITIES:
				return cities != null && !cities.isEmpty();
			case GaSalesManPackage.TOUR__CITIESMAP:
				return citiesmap != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GaSalesManPackage.TOUR___INITIALIZE:
				initialize();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public double fitness() {
		double dX = 0;
		double dY = 0;
		
		double oX = 0;
		double oY = 0;
		
		for (int i = 0; i < cities.size(); i++) {
			City c = cities.get(i);
			
			if (i == 0){
				oX = c.getX();
				oY = c.getY();
			}
			
			
			dX = dX + Math.abs(c.getX() - oX);
			dY = dY + Math.abs(c.getY() - oY);
			
			oX = c.getX();
			oY = c.getY();
		}
		
		return Math.sqrt(Math.pow(dX, 2) + Math.pow(dY, 2));
	}

} //TourImpl
