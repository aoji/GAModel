/**
 */
package gaSalesMan.impl;

import gaSalesMan.CitiesMap;
import gaSalesMan.GaSalesManPackage;
import gaSalesMan.Optimizer;
import gaSalesMan.Population;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Optimizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gaSalesMan.impl.OptimizerImpl#getPopulations <em>Populations</em>}</li>
 *   <li>{@link gaSalesMan.impl.OptimizerImpl#getMaps <em>Maps</em>}</li>
 *   <li>{@link gaSalesMan.impl.OptimizerImpl#getMaxGenerations <em>Max Generations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptimizerImpl extends MinimalEObjectImpl.Container implements Optimizer {
	/**
	 * The cached value of the '{@link #getPopulations() <em>Populations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulations()
	 * @generated
	 * @ordered
	 */
	protected EList<Population> populations;

	/**
	 * The cached value of the '{@link #getMaps() <em>Maps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaps()
	 * @generated
	 * @ordered
	 */
	protected EList<CitiesMap> maps;

	/**
	 * The default value of the '{@link #getMaxGenerations() <em>Max Generations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxGenerations()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_GENERATIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxGenerations() <em>Max Generations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxGenerations()
	 * @generated
	 * @ordered
	 */
	protected int maxGenerations = MAX_GENERATIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptimizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GaSalesManPackage.Literals.OPTIMIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Population> getPopulations() {
		if (populations == null) {
			populations = new EObjectResolvingEList<Population>(Population.class, this, GaSalesManPackage.OPTIMIZER__POPULATIONS);
		}
		return populations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CitiesMap> getMaps() {
		if (maps == null) {
			maps = new EObjectResolvingEList<CitiesMap>(CitiesMap.class, this, GaSalesManPackage.OPTIMIZER__MAPS);
		}
		return maps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxGenerations() {
		return maxGenerations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxGenerations(int newMaxGenerations) {
		int oldMaxGenerations = maxGenerations;
		maxGenerations = newMaxGenerations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaSalesManPackage.OPTIMIZER__MAX_GENERATIONS, oldMaxGenerations, maxGenerations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void generatePopulation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void evolvePopulation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GaSalesManPackage.OPTIMIZER__POPULATIONS:
				return getPopulations();
			case GaSalesManPackage.OPTIMIZER__MAPS:
				return getMaps();
			case GaSalesManPackage.OPTIMIZER__MAX_GENERATIONS:
				return getMaxGenerations();
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
			case GaSalesManPackage.OPTIMIZER__POPULATIONS:
				getPopulations().clear();
				getPopulations().addAll((Collection<? extends Population>)newValue);
				return;
			case GaSalesManPackage.OPTIMIZER__MAPS:
				getMaps().clear();
				getMaps().addAll((Collection<? extends CitiesMap>)newValue);
				return;
			case GaSalesManPackage.OPTIMIZER__MAX_GENERATIONS:
				setMaxGenerations((Integer)newValue);
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
			case GaSalesManPackage.OPTIMIZER__POPULATIONS:
				getPopulations().clear();
				return;
			case GaSalesManPackage.OPTIMIZER__MAPS:
				getMaps().clear();
				return;
			case GaSalesManPackage.OPTIMIZER__MAX_GENERATIONS:
				setMaxGenerations(MAX_GENERATIONS_EDEFAULT);
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
			case GaSalesManPackage.OPTIMIZER__POPULATIONS:
				return populations != null && !populations.isEmpty();
			case GaSalesManPackage.OPTIMIZER__MAPS:
				return maps != null && !maps.isEmpty();
			case GaSalesManPackage.OPTIMIZER__MAX_GENERATIONS:
				return maxGenerations != MAX_GENERATIONS_EDEFAULT;
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
			case GaSalesManPackage.OPTIMIZER___GENERATE_POPULATION:
				generatePopulation();
				return null;
			case GaSalesManPackage.OPTIMIZER___EVOLVE_POPULATION:
				evolvePopulation();
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
		result.append(" (maxGenerations: ");
		result.append(maxGenerations);
		result.append(')');
		return result.toString();
	}

} //OptimizerImpl
