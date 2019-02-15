/*
 * generated by Xtext 2.10.0
 */
package uniandes.automat.sql.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import uniandes.automat.sql.services.SqlGrammarAccess;
import uniandes.automat.sql.sql.Column;
import uniandes.automat.sql.sql.Database;
import uniandes.automat.sql.sql.ForeignKey;
import uniandes.automat.sql.sql.Model;
import uniandes.automat.sql.sql.PrimaryKey;
import uniandes.automat.sql.sql.SqlPackage;
import uniandes.automat.sql.sql.Table;

@SuppressWarnings("all")
public class SqlSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SqlGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SqlPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SqlPackage.COLUMN:
				sequence_Column(context, (Column) semanticObject); 
				return; 
			case SqlPackage.DATABASE:
				sequence_Database(context, (Database) semanticObject); 
				return; 
			case SqlPackage.FOREIGN_KEY:
				sequence_ForeignKey(context, (ForeignKey) semanticObject); 
				return; 
			case SqlPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case SqlPackage.PRIMARY_KEY:
				sequence_PrimaryKey(context, (PrimaryKey) semanticObject); 
				return; 
			case SqlPackage.TABLE:
				sequence_Table(context, (Table) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Column returns Column
	 *
	 * Constraint:
	 *     (name=ID type=DataType isNotNull?='NOT NULL'?)
	 */
	protected void sequence_Column(ISerializationContext context, Column semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Database returns Database
	 *
	 * Constraint:
	 *     tables+=Table+
	 */
	protected void sequence_Database(ISerializationContext context, Database semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ForeignKey returns ForeignKey
	 *
	 * Constraint:
	 *     (localColumns+=[Column|ID] localColumns+=[Column|ID]* foreignTable=[Table|ID] foreignColumns+=[Column|ID] foreignColumns+=[Column|ID]*)
	 */
	protected void sequence_ForeignKey(ISerializationContext context, ForeignKey semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     database+=Database
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryKey returns PrimaryKey
	 *
	 * Constraint:
	 *     (col+=[Column|ID] col+=[Column|ID]*)
	 */
	protected void sequence_PrimaryKey(ISerializationContext context, PrimaryKey semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Table returns Table
	 *
	 * Constraint:
	 *     (name=ID (facts+=Column | facts+=PrimaryKey | facts+=ForeignKey) facts+=Column? ((facts+=PrimaryKey | facts+=ForeignKey)? facts+=Column?)*)
	 */
	protected void sequence_Table(ISerializationContext context, Table semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
