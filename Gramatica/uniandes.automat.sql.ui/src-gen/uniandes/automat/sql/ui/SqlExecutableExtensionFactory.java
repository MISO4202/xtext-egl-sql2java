/*
 * generated by Xtext 2.10.0
 */
package uniandes.automat.sql.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import uniandes.automat.sql.ui.internal.SqlActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SqlExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SqlActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return SqlActivator.getInstance().getInjector(SqlActivator.UNIANDES_AUTOMAT_SQL_SQL);
	}
	
}
