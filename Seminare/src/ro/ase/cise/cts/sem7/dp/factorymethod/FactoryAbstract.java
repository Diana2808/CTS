package ro.ase.cise.cts.sem7.dp.factorymethod;

import ro.ase.csie.cts.sem7.dp.simplefactory.SuperErouAbstract;
import ro.ase.csie.cts.sem7.dp.simplefactory.TipErou;

public abstract class FactoryAbstract {
	public abstract SuperErouAbstract getSuperErou(TipErou tip, String nume);
}
