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
 *   <li>{@link gaSalesMan.impl.OptimizerImpl#getMaxGenerations <em>Max Generations</em>}</li>
 *   <li>{@link gaSalesMan.impl.OptimizerImpl#getIterations <em>Iterations</em>}</li>
 *   <li>{@link gaSalesMan.impl.OptimizerImpl#getPopulations <em>Populations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OptimizerImpl extends MinimalEObjectImpl.Container implements Optimizer {
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
	 * The default value of the '{@link #getIterations() <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterations()
	 * @generated
	 * @ordered
	 */
	protected static final int ITERATIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIterations() <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterations()
	 * @generated
	 * @ordered
	 */
	protected int iterations = ITERATIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPopulations() <em>Populations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulations()
	 * @generated
	 * @ordered
	 */
	protected Population populations;

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
	public int getIterations() {
		return iterations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterations(int newIterations) {
		int oldIterations = iterations;
		iterations = newIterations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaSalesManPackage.OPTIMIZER__ITERATIONS, oldIterations, iterations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Population getPopulations() {
		if (populations != null && populations.eIsProxy()) {
			InternalEObject oldPopulations = (InternalEObject)populations;
			populations = (Population)eResolveProxy(oldPopulations);
			if (populations != oldPopulations) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GaSalesManPackage.OPTIMIZER__POPULATIONS, oldPopulations, populations));
			}
		}
		return populations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Population basicGetPopulations() {
		return populations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopulations(Population newPopulations) {
		Population oldPopulations = populations;
		populations = newPopulations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaSalesManPackage.OPTIMIZER__POPULATIONS, oldPopulations, populations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setupPopulation() {
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
			case GaSalesManPackage.OPTIMIZER__MAX_GENERATIONS:
				return getMaxGenerations();
			case GaSalesManPackage.OPTIMIZER__ITERATIONS:
				return getIterations();
			case GaSalesManPackage.OPTIMIZER__POPULATIONS:
				if (resolve) return getPopulations();
				return basicGetPopulations();
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
			case GaSalesManPackage.OPTIMIZER__MAX_GENERATIONS:
				setMaxGenerations((Integer)newValue);
				return;
			case GaSalesManPackage.OPTIMIZER__ITERATIONS:
				setIterations((Integer)newValue);
				return;
			case GaSalesManPackage.OPTIMIZER__POPULATIONS:
				setPopulations((Population)newValue);
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
			case GaSalesManPackage.OPTIMIZER__MAX_GENERATIONS:
				setMaxGenerations(MAX_GENERATIONS_EDEFAULT);
				return;
			case GaSalesManPackage.OPTIMIZER__ITERATIONS:
				setIterations(ITERATIONS_EDEFAULT);
				return;
			case GaSalesManPackage.OPTIMIZER__POPULATIONS:
				setPopulations((Population)null);
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
			case GaSalesManPackage.OPTIMIZER__MAX_GENERATIONS:
				return maxGenerations != MAX_GENERATIONS_EDEFAULT;
			case GaSalesManPackage.OPTIMIZER__ITERATIONS:
				return iterations != ITERATIONS_EDEFAULT;
			case GaSalesManPackage.OPTIMIZER__POPULATIONS:
				return populations != null;
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
		result.append(", iterations: ");
		result.append(iterations);
		result.append(')');
		return result.toString();
	}

} //OptimizerImpl
