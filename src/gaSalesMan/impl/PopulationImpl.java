/**
 */
package gaSalesMan.impl;

import gaSalesMan.Chromosome;
import gaSalesMan.GaSalesManPackage;
import gaSalesMan.Population;

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
 * An implementation of the model object '<em><b>Population</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gaSalesMan.impl.PopulationImpl#getPSize <em>PSize</em>}</li>
 *   <li>{@link gaSalesMan.impl.PopulationImpl#getChromosomes <em>Chromosomes</em>}</li>
 *   <li>{@link gaSalesMan.impl.PopulationImpl#getMProb <em>MProb</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PopulationImpl extends MinimalEObjectImpl.Container implements Population {
	/**
	 * The default value of the '{@link #getPSize() <em>PSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSize()
	 * @generated
	 * @ordered
	 */
	protected static final int PSIZE_EDEFAULT = 10;

	/**
	 * The cached value of the '{@link #getPSize() <em>PSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSize()
	 * @generated
	 * @ordered
	 */
	protected int pSize = PSIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChromosomes() <em>Chromosomes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChromosomes()
	 * @generated
	 * @ordered
	 */
	protected EList<Chromosome> chromosomes;

	/**
	 * The default value of the '{@link #getMProb() <em>MProb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMProb()
	 * @generated
	 * @ordered
	 */
	protected static final float MPROB_EDEFAULT = 0.2F;

	/**
	 * The cached value of the '{@link #getMProb() <em>MProb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMProb()
	 * @generated
	 * @ordered
	 */
	protected float mProb = MPROB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PopulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GaSalesManPackage.Literals.POPULATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPSize() {
		return pSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPSize(int newPSize) {
		int oldPSize = pSize;
		pSize = newPSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaSalesManPackage.POPULATION__PSIZE, oldPSize, pSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Chromosome> getChromosomes() {
		if (chromosomes == null) {
			chromosomes = new EObjectContainmentEList<Chromosome>(Chromosome.class, this, GaSalesManPackage.POPULATION__CHROMOSOMES);
		}
		return chromosomes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMProb() {
		return mProb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMProb(float newMProb) {
		float oldMProb = mProb;
		mProb = newMProb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaSalesManPackage.POPULATION__MPROB, oldMProb, mProb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public abstract void crossover();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public abstract void mutate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public abstract Chromosome findFittest();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public abstract void generateChromosomes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GaSalesManPackage.POPULATION__CHROMOSOMES:
				return ((InternalEList<?>)getChromosomes()).basicRemove(otherEnd, msgs);
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
			case GaSalesManPackage.POPULATION__PSIZE:
				return getPSize();
			case GaSalesManPackage.POPULATION__CHROMOSOMES:
				return getChromosomes();
			case GaSalesManPackage.POPULATION__MPROB:
				return getMProb();
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
			case GaSalesManPackage.POPULATION__PSIZE:
				setPSize((Integer)newValue);
				return;
			case GaSalesManPackage.POPULATION__CHROMOSOMES:
				getChromosomes().clear();
				getChromosomes().addAll((Collection<? extends Chromosome>)newValue);
				return;
			case GaSalesManPackage.POPULATION__MPROB:
				setMProb((Float)newValue);
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
			case GaSalesManPackage.POPULATION__PSIZE:
				setPSize(PSIZE_EDEFAULT);
				return;
			case GaSalesManPackage.POPULATION__CHROMOSOMES:
				getChromosomes().clear();
				return;
			case GaSalesManPackage.POPULATION__MPROB:
				setMProb(MPROB_EDEFAULT);
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
			case GaSalesManPackage.POPULATION__PSIZE:
				return pSize != PSIZE_EDEFAULT;
			case GaSalesManPackage.POPULATION__CHROMOSOMES:
				return chromosomes != null && !chromosomes.isEmpty();
			case GaSalesManPackage.POPULATION__MPROB:
				return mProb != MPROB_EDEFAULT;
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
			case GaSalesManPackage.POPULATION___CROSSOVER:
				crossover();
				return null;
			case GaSalesManPackage.POPULATION___MUTATE:
				mutate();
				return null;
			case GaSalesManPackage.POPULATION___FIND_FITTEST:
				return findFittest();
			case GaSalesManPackage.POPULATION___GENERATE_CHROMOSOMES:
				generateChromosomes();
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
		result.append(" (pSize: ");
		result.append(pSize);
		result.append(", mProb: ");
		result.append(mProb);
		result.append(')');
		return result.toString();
	}

} //PopulationImpl
