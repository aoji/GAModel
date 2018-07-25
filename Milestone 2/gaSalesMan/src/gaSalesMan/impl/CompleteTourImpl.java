/**
 */
package gaSalesMan.impl;

import gaSalesMan.CitiesMap;
import gaSalesMan.City;
import gaSalesMan.CompleteTour;
import gaSalesMan.GaSalesManPackage;

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
 * An implementation of the model object '<em><b>Complete Tour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gaSalesMan.impl.CompleteTourImpl#getModelB <em>Model B</em>}</li>
 *   <li>{@link gaSalesMan.impl.CompleteTourImpl#getCities <em>Cities</em>}</li>
 *   <li>{@link gaSalesMan.impl.CompleteTourImpl#getMaps <em>Maps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompleteTourImpl extends ChromosomeImpl implements CompleteTour {
	/**
	 * The default value of the '{@link #getModelB() <em>Model B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelB()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelB() <em>Model B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelB()
	 * @generated
	 * @ordered
	 */
	protected String modelB = MODEL_B_EDEFAULT;

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
	protected CompleteTourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GaSalesManPackage.Literals.COMPLETE_TOUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelB() {
		return modelB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelB(String newModelB) {
		String oldModelB = modelB;
		modelB = newModelB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaSalesManPackage.COMPLETE_TOUR__MODEL_B, oldModelB, modelB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<City> getCities() {
		if (cities == null) {
			cities = new EObjectContainmentEList<City>(City.class, this, GaSalesManPackage.COMPLETE_TOUR__CITIES);
		}
		return cities;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GaSalesManPackage.COMPLETE_TOUR__MAPS, oldMaps, maps));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GaSalesManPackage.COMPLETE_TOUR__MAPS, oldMaps, maps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
			case GaSalesManPackage.COMPLETE_TOUR__CITIES:
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
			case GaSalesManPackage.COMPLETE_TOUR__MODEL_B:
				return getModelB();
			case GaSalesManPackage.COMPLETE_TOUR__CITIES:
				return getCities();
			case GaSalesManPackage.COMPLETE_TOUR__MAPS:
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
			case GaSalesManPackage.COMPLETE_TOUR__MODEL_B:
				setModelB((String)newValue);
				return;
			case GaSalesManPackage.COMPLETE_TOUR__CITIES:
				getCities().clear();
				getCities().addAll((Collection<? extends City>)newValue);
				return;
			case GaSalesManPackage.COMPLETE_TOUR__MAPS:
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
			case GaSalesManPackage.COMPLETE_TOUR__MODEL_B:
				setModelB(MODEL_B_EDEFAULT);
				return;
			case GaSalesManPackage.COMPLETE_TOUR__CITIES:
				getCities().clear();
				return;
			case GaSalesManPackage.COMPLETE_TOUR__MAPS:
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
			case GaSalesManPackage.COMPLETE_TOUR__MODEL_B:
				return MODEL_B_EDEFAULT == null ? modelB != null : !MODEL_B_EDEFAULT.equals(modelB);
			case GaSalesManPackage.COMPLETE_TOUR__CITIES:
				return cities != null && !cities.isEmpty();
			case GaSalesManPackage.COMPLETE_TOUR__MAPS:
				return maps != null;
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
			case GaSalesManPackage.COMPLETE_TOUR___INITIALIZE:
				initialize();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (modelB: ");
		result.append(modelB);
		result.append(')');
		return result.toString();
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

} //CompleteTourImpl
