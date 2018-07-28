/**
 */
package gaSalesMan.impl;

import gaSalesMan.Chromosome;
import gaSalesMan.GaSalesManPackage;
import gaSalesMan.Gene;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chromosome</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gaSalesMan.impl.ChromosomeImpl#getFitness <em>Fitness</em>}</li>
 *   <li>{@link gaSalesMan.impl.ChromosomeImpl#getGenes <em>Genes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ChromosomeImpl extends MinimalEObjectImpl.Container implements Chromosome {
	/**
	 * The default value of the '{@link #getFitness() <em>Fitness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFitness()
	 * @generated
	 * @ordered
	 */
	protected static final double FITNESS_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getFitness() <em>Fitness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFitness()
	 * @generated
	 * @ordered
	 */
	protected double fitness = FITNESS_EDEFAULT;
	/**
	 * The cached value of the '{@link #getGenes() <em>Genes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenes()
	 * @generated
	 * @ordered
	 */
	protected EList<Gene> genes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChromosomeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GaSalesManPackage.Literals.CHROMOSOME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFitness() {
		return fitness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFitness(double newFitness) {
		double oldFitness = fitness;
		fitness = newFitness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaSalesManPackage.CHROMOSOME__FITNESS, oldFitness, fitness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gene> getGenes() {
		if (genes == null) {
			genes = new EObjectContainmentEList<Gene>(Gene.class, this, GaSalesManPackage.CHROMOSOME__GENES);
		}
		return genes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double fitness() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GaSalesManPackage.CHROMOSOME__GENES:
				return ((InternalEList<?>)getGenes()).basicRemove(otherEnd, msgs);
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
			case GaSalesManPackage.CHROMOSOME__FITNESS:
				return getFitness();
			case GaSalesManPackage.CHROMOSOME__GENES:
				return getGenes();
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
			case GaSalesManPackage.CHROMOSOME__FITNESS:
				setFitness((Double)newValue);
				return;
			case GaSalesManPackage.CHROMOSOME__GENES:
				getGenes().clear();
				getGenes().addAll((Collection<? extends Gene>)newValue);
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
			case GaSalesManPackage.CHROMOSOME__FITNESS:
				setFitness(FITNESS_EDEFAULT);
				return;
			case GaSalesManPackage.CHROMOSOME__GENES:
				getGenes().clear();
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
			case GaSalesManPackage.CHROMOSOME__FITNESS:
				return fitness != FITNESS_EDEFAULT;
			case GaSalesManPackage.CHROMOSOME__GENES:
				return genes != null && !genes.isEmpty();
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
			case GaSalesManPackage.CHROMOSOME___FITNESS:
				return fitness();
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
		result.append(" (fitness: ");
		result.append(fitness);
		result.append(')');
		return result.toString();
	}

} //ChromosomeImpl
