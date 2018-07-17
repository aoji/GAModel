/**
 */
package gaSalesMan.impl;

import gaSalesMan.GaSalesManPackage;
import gaSalesMan.Optimizer;
import gaSalesMan.Population;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Optimizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gaSalesMan.impl.OptimizerImpl#getPopulation <em>Population</em>}</li>
 *   <li>{@link gaSalesMan.impl.OptimizerImpl#getMaxGenerations <em>Max Generations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OptimizerImpl extends MinimalEObjectImpl.Container implements Optimizer {
	/**
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected Population population;

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
	public Population getPopulation() {
		if (population != null && population.eIsProxy()) {
			InternalEObject oldPopulation = (InternalEObject)population;
			population = (Population)eResolveProxy(oldPopulation);
			if (population != oldPopulation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GaSalesManPackage.OPTIMIZER__POPULATION, oldPopulation, population));
			}
		}
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Population basicGetPopulation() {
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopulation(Population newPopulation) {
		Population oldPopulation = population;
		population = newPopulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaSalesManPackage.OPTIMIZER__POPULATION, oldPopulation, population));
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
	public abstract void setupPopulation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public abstract void evolvePopulation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GaSalesManPackage.OPTIMIZER__POPULATION:
				if (resolve) return getPopulation();
				return basicGetPopulation();
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GaSalesManPackage.OPTIMIZER__POPULATION:
				setPopulation((Population)newValue);
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
			case GaSalesManPackage.OPTIMIZER__POPULATION:
				setPopulation((Population)null);
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
			case GaSalesManPackage.OPTIMIZER__POPULATION:
				return population != null;
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
			case GaSalesManPackage.OPTIMIZER___SETUP_POPULATION:
				setupPopulation();
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
