/**
 */
package gaSalesMan.impl;

import gaSalesMan.CitiesMap;
import gaSalesMan.City;
import gaSalesMan.GaSalesManPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cities Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gaSalesMan.impl.CitiesMapImpl#getNumCities <em>Num Cities</em>}</li>
 *   <li>{@link gaSalesMan.impl.CitiesMapImpl#getXRange <em>XRange</em>}</li>
 *   <li>{@link gaSalesMan.impl.CitiesMapImpl#getYRange <em>YRange</em>}</li>
 *   <li>{@link gaSalesMan.impl.CitiesMapImpl#getCities <em>Cities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CitiesMapImpl extends MinimalEObjectImpl.Container implements CitiesMap {
	/**
	 * The default value of the '{@link #getNumCities() <em>Num Cities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumCities()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_CITIES_EDEFAULT = 5;

	/**
	 * The cached value of the '{@link #getNumCities() <em>Num Cities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumCities()
	 * @generated
	 * @ordered
	 */
	protected int numCities = NUM_CITIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getXRange() <em>XRange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRange()
	 * @generated
	 * @ordered
	 */
	protected static final float XRANGE_EDEFAULT = 5.0F;

	/**
	 * The cached value of the '{@link #getXRange() <em>XRange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRange()
	 * @generated
	 * @ordered
	 */
	protected float xRange = XRANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYRange() <em>YRange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYRange()
	 * @generated
	 * @ordered
	 */
	protected static final float YRANGE_EDEFAULT = 5.0F;

	/**
	 * The cached value of the '{@link #getYRange() <em>YRange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYRange()
	 * @generated
	 * @ordered
	 */
	protected float yRange = YRANGE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitiesMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GaSalesManPackage.Literals.CITIES_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<City> getCities() {
		if (cities == null) {
			cities = new EObjectContainmentEList<City>(City.class, this, GaSalesManPackage.CITIES_MAP__CITIES);
		}
		return cities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getXRange() {
		return xRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRange(float newXRange) {
		float oldXRange = xRange;
		xRange = newXRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaSalesManPackage.CITIES_MAP__XRANGE, oldXRange, xRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getYRange() {
		return yRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYRange(float newYRange) {
		float oldYRange = yRange;
		yRange = newYRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaSalesManPackage.CITIES_MAP__YRANGE, oldYRange, yRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumCities() {
		return numCities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumCities(int newNumCities) {
		int oldNumCities = numCities;
		numCities = newNumCities;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaSalesManPackage.CITIES_MAP__NUM_CITIES, oldNumCities, numCities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void initialize() {
		
		for (int i = 0; i < numCities; i++){
			CityImpl city = new CityImpl();
			city.setX((float) Math.random() * xRange);
			city.setY((float) Math.random() * yRange);
			
			cities.add(city);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #appearsOnce(gaSalesMan.City) <em>Appears Once</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #appearsOnce(gaSalesMan.City)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate APPEARS_ONCE_CITY__EINVOCATION_DELEGATE = ((EOperation.Internal)GaSalesManPackage.Literals.CITIES_MAP___APPEARS_ONCE__CITY).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean appearsOnce(City city) {
		try {
			return (Boolean)APPEARS_ONCE_CITY__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{city}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GaSalesManPackage.CITIES_MAP__CITIES:
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
			case GaSalesManPackage.CITIES_MAP__NUM_CITIES:
				return getNumCities();
			case GaSalesManPackage.CITIES_MAP__XRANGE:
				return getXRange();
			case GaSalesManPackage.CITIES_MAP__YRANGE:
				return getYRange();
			case GaSalesManPackage.CITIES_MAP__CITIES:
				return getCities();
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
			case GaSalesManPackage.CITIES_MAP__NUM_CITIES:
				setNumCities((Integer)newValue);
				return;
			case GaSalesManPackage.CITIES_MAP__XRANGE:
				setXRange((Float)newValue);
				return;
			case GaSalesManPackage.CITIES_MAP__YRANGE:
				setYRange((Float)newValue);
				return;
			case GaSalesManPackage.CITIES_MAP__CITIES:
				getCities().clear();
				getCities().addAll((Collection<? extends City>)newValue);
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
			case GaSalesManPackage.CITIES_MAP__NUM_CITIES:
				setNumCities(NUM_CITIES_EDEFAULT);
				return;
			case GaSalesManPackage.CITIES_MAP__XRANGE:
				setXRange(XRANGE_EDEFAULT);
				return;
			case GaSalesManPackage.CITIES_MAP__YRANGE:
				setYRange(YRANGE_EDEFAULT);
				return;
			case GaSalesManPackage.CITIES_MAP__CITIES:
				getCities().clear();
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
			case GaSalesManPackage.CITIES_MAP__NUM_CITIES:
				return numCities != NUM_CITIES_EDEFAULT;
			case GaSalesManPackage.CITIES_MAP__XRANGE:
				return xRange != XRANGE_EDEFAULT;
			case GaSalesManPackage.CITIES_MAP__YRANGE:
				return yRange != YRANGE_EDEFAULT;
			case GaSalesManPackage.CITIES_MAP__CITIES:
				return cities != null && !cities.isEmpty();
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
			case GaSalesManPackage.CITIES_MAP___INITIALIZE:
				initialize();
				return null;
			case GaSalesManPackage.CITIES_MAP___APPEARS_ONCE__CITY:
				return appearsOnce((City)arguments.get(0));
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
		result.append(" (numCities: ");
		result.append(numCities);
		result.append(", xRange: ");
		result.append(xRange);
		result.append(", yRange: ");
		result.append(yRange);
		result.append(')');
		return result.toString();
	}

} //CitiesMapImpl
