/*
 * generated by Xtext 2.10.0
 */
package uniandes.automat.sql.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class SqlGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uniandes.automat.sql.Sql.Model");
		private final Assignment cDatabaseAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cDatabaseDatabaseParserRuleCall_0 = (RuleCall)cDatabaseAssignment.eContents().get(0);
		
		//Model:
		//	database+=Database;
		@Override public ParserRule getRule() { return rule; }
		
		//database+=Database
		public Assignment getDatabaseAssignment() { return cDatabaseAssignment; }
		
		//Database
		public RuleCall getDatabaseDatabaseParserRuleCall_0() { return cDatabaseDatabaseParserRuleCall_0; }
	}
	public class DatabaseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uniandes.automat.sql.Sql.Database");
		private final Assignment cTablesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cTablesTableParserRuleCall_0 = (RuleCall)cTablesAssignment.eContents().get(0);
		
		//Database:
		//	tables+=Table*;
		@Override public ParserRule getRule() { return rule; }
		
		//tables+=Table*
		public Assignment getTablesAssignment() { return cTablesAssignment; }
		
		//Table
		public RuleCall getTablesTableParserRuleCall_0() { return cTablesTableParserRuleCall_0; }
	}
	public class TableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uniandes.automat.sql.Sql.Table");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCREATEKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cTABLEKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFactsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final Alternatives cFactsAlternatives_4_0 = (Alternatives)cFactsAssignment_4.eContents().get(0);
		private final RuleCall cFactsColumnParserRuleCall_4_0_0 = (RuleCall)cFactsAlternatives_4_0.eContents().get(0);
		private final RuleCall cFactsPrimaryKeyParserRuleCall_4_0_1 = (RuleCall)cFactsAlternatives_4_0.eContents().get(1);
		private final RuleCall cFactsForeignKeyParserRuleCall_4_0_2 = (RuleCall)cFactsAlternatives_4_0.eContents().get(2);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cFactsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final Alternatives cFactsAlternatives_5_1_0 = (Alternatives)cFactsAssignment_5_1.eContents().get(0);
		private final RuleCall cFactsColumnParserRuleCall_5_1_0_0 = (RuleCall)cFactsAlternatives_5_1_0.eContents().get(0);
		private final RuleCall cFactsPrimaryKeyParserRuleCall_5_1_0_1 = (RuleCall)cFactsAlternatives_5_1_0.eContents().get(1);
		private final RuleCall cFactsForeignKeyParserRuleCall_5_1_0_2 = (RuleCall)cFactsAlternatives_5_1_0.eContents().get(2);
		private final Keyword cRightParenthesisKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Table:
		//	"CREATE" "TABLE" name=ID "("
		//	facts+=(Column | PrimaryKey | ForeignKey) ("," facts+=(Column | PrimaryKey | ForeignKey))*
		//	")";
		@Override public ParserRule getRule() { return rule; }
		
		//"CREATE" "TABLE" name=ID "(" facts+=(Column | PrimaryKey | ForeignKey) ("," facts+=(Column | PrimaryKey | ForeignKey))*
		//")"
		public Group getGroup() { return cGroup; }
		
		//"CREATE"
		public Keyword getCREATEKeyword_0() { return cCREATEKeyword_0; }
		
		//"TABLE"
		public Keyword getTABLEKeyword_1() { return cTABLEKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_3() { return cLeftParenthesisKeyword_3; }
		
		//facts+=(Column | PrimaryKey | ForeignKey)
		public Assignment getFactsAssignment_4() { return cFactsAssignment_4; }
		
		//(Column | PrimaryKey | ForeignKey)
		public Alternatives getFactsAlternatives_4_0() { return cFactsAlternatives_4_0; }
		
		//Column
		public RuleCall getFactsColumnParserRuleCall_4_0_0() { return cFactsColumnParserRuleCall_4_0_0; }
		
		//PrimaryKey
		public RuleCall getFactsPrimaryKeyParserRuleCall_4_0_1() { return cFactsPrimaryKeyParserRuleCall_4_0_1; }
		
		//ForeignKey
		public RuleCall getFactsForeignKeyParserRuleCall_4_0_2() { return cFactsForeignKeyParserRuleCall_4_0_2; }
		
		//("," facts+=(Column | PrimaryKey | ForeignKey))*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//facts+=(Column | PrimaryKey | ForeignKey)
		public Assignment getFactsAssignment_5_1() { return cFactsAssignment_5_1; }
		
		//(Column | PrimaryKey | ForeignKey)
		public Alternatives getFactsAlternatives_5_1_0() { return cFactsAlternatives_5_1_0; }
		
		//Column
		public RuleCall getFactsColumnParserRuleCall_5_1_0_0() { return cFactsColumnParserRuleCall_5_1_0_0; }
		
		//PrimaryKey
		public RuleCall getFactsPrimaryKeyParserRuleCall_5_1_0_1() { return cFactsPrimaryKeyParserRuleCall_5_1_0_1; }
		
		//ForeignKey
		public RuleCall getFactsForeignKeyParserRuleCall_5_1_0_2() { return cFactsForeignKeyParserRuleCall_5_1_0_2; }
		
		//")"
		public Keyword getRightParenthesisKeyword_6() { return cRightParenthesisKeyword_6; }
	}
	public class ColumnElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uniandes.automat.sql.Sql.Column");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeDataTypeEnumRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		private final Assignment cIsNotNullAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cIsNotNullNOTNULLKeyword_2_0 = (Keyword)cIsNotNullAssignment_2.eContents().get(0);
		
		////TableFacts:
		////	facts+=TableFact ( "," facts+=TableFact )*
		////;
		////
		////TableFact:
		////	Column | PrimaryKey | ForeignKey
		////;
		//Column:
		//	name=ID type=DataType isNotNull?='NOT NULL'?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID type=DataType isNotNull?='NOT NULL'?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//type=DataType
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//DataType
		public RuleCall getTypeDataTypeEnumRuleCall_1_0() { return cTypeDataTypeEnumRuleCall_1_0; }
		
		//isNotNull?='NOT NULL'?
		public Assignment getIsNotNullAssignment_2() { return cIsNotNullAssignment_2; }
		
		//'NOT NULL'
		public Keyword getIsNotNullNOTNULLKeyword_2_0() { return cIsNotNullNOTNULLKeyword_2_0; }
	}
	public class PrimaryKeyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uniandes.automat.sql.Sql.PrimaryKey");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPRIMARYKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cKEYKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cColAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cColColumnCrossReference_3_0 = (CrossReference)cColAssignment_3.eContents().get(0);
		private final RuleCall cColColumnIDTerminalRuleCall_3_0_1 = (RuleCall)cColColumnCrossReference_3_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cColAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cColColumnCrossReference_4_1_0 = (CrossReference)cColAssignment_4_1.eContents().get(0);
		private final RuleCall cColColumnIDTerminalRuleCall_4_1_0_1 = (RuleCall)cColColumnCrossReference_4_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//PrimaryKey:
		//	"PRIMARY" "KEY" "("
		//	col+=[Column] ("," col+=[Column])*
		//	")";
		@Override public ParserRule getRule() { return rule; }
		
		//"PRIMARY" "KEY" "(" col+=[Column] ("," col+=[Column])* ")"
		public Group getGroup() { return cGroup; }
		
		//"PRIMARY"
		public Keyword getPRIMARYKeyword_0() { return cPRIMARYKeyword_0; }
		
		//"KEY"
		public Keyword getKEYKeyword_1() { return cKEYKeyword_1; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//col+=[Column]
		public Assignment getColAssignment_3() { return cColAssignment_3; }
		
		//[Column]
		public CrossReference getColColumnCrossReference_3_0() { return cColColumnCrossReference_3_0; }
		
		//ID
		public RuleCall getColColumnIDTerminalRuleCall_3_0_1() { return cColColumnIDTerminalRuleCall_3_0_1; }
		
		//("," col+=[Column])*
		public Group getGroup_4() { return cGroup_4; }
		
		//","
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }
		
		//col+=[Column]
		public Assignment getColAssignment_4_1() { return cColAssignment_4_1; }
		
		//[Column]
		public CrossReference getColColumnCrossReference_4_1_0() { return cColColumnCrossReference_4_1_0; }
		
		//ID
		public RuleCall getColColumnIDTerminalRuleCall_4_1_0_1() { return cColColumnIDTerminalRuleCall_4_1_0_1; }
		
		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}
	public class ForeignKeyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uniandes.automat.sql.Sql.ForeignKey");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFOREIGNKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cKEYKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cLocalColumnsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cLocalColumnsColumnCrossReference_3_0 = (CrossReference)cLocalColumnsAssignment_3.eContents().get(0);
		private final RuleCall cLocalColumnsColumnIDTerminalRuleCall_3_0_1 = (RuleCall)cLocalColumnsColumnCrossReference_3_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cLocalColumnsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cLocalColumnsColumnCrossReference_4_1_0 = (CrossReference)cLocalColumnsAssignment_4_1.eContents().get(0);
		private final RuleCall cLocalColumnsColumnIDTerminalRuleCall_4_1_0_1 = (RuleCall)cLocalColumnsColumnCrossReference_4_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cREFERENCESKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cForeignTableAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final CrossReference cForeignTableTableCrossReference_7_0 = (CrossReference)cForeignTableAssignment_7.eContents().get(0);
		private final RuleCall cForeignTableTableIDTerminalRuleCall_7_0_1 = (RuleCall)cForeignTableTableCrossReference_7_0.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cForeignColumnsAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final CrossReference cForeignColumnsColumnCrossReference_9_0 = (CrossReference)cForeignColumnsAssignment_9.eContents().get(0);
		private final RuleCall cForeignColumnsColumnIDTerminalRuleCall_9_0_1 = (RuleCall)cForeignColumnsColumnCrossReference_9_0.eContents().get(1);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cCommaKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Assignment cForeignColumnsAssignment_10_1 = (Assignment)cGroup_10.eContents().get(1);
		private final CrossReference cForeignColumnsColumnCrossReference_10_1_0 = (CrossReference)cForeignColumnsAssignment_10_1.eContents().get(0);
		private final RuleCall cForeignColumnsColumnIDTerminalRuleCall_10_1_0_1 = (RuleCall)cForeignColumnsColumnCrossReference_10_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//ForeignKey:
		//	"FOREIGN" "KEY" "("
		//	localColumns+=[Column] ("," localColumns+=[Column])*
		//	")"
		//	"REFERENCES" foreignTable=[Table] "("
		//	foreignColumns+=[Column] ("," foreignColumns+=[Column])*
		//	")";
		@Override public ParserRule getRule() { return rule; }
		
		//"FOREIGN" "KEY" "(" localColumns+=[Column] ("," localColumns+=[Column])* ")" "REFERENCES" foreignTable=[Table] "("
		//foreignColumns+=[Column] ("," foreignColumns+=[Column])* ")"
		public Group getGroup() { return cGroup; }
		
		//"FOREIGN"
		public Keyword getFOREIGNKeyword_0() { return cFOREIGNKeyword_0; }
		
		//"KEY"
		public Keyword getKEYKeyword_1() { return cKEYKeyword_1; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//localColumns+=[Column]
		public Assignment getLocalColumnsAssignment_3() { return cLocalColumnsAssignment_3; }
		
		//[Column]
		public CrossReference getLocalColumnsColumnCrossReference_3_0() { return cLocalColumnsColumnCrossReference_3_0; }
		
		//ID
		public RuleCall getLocalColumnsColumnIDTerminalRuleCall_3_0_1() { return cLocalColumnsColumnIDTerminalRuleCall_3_0_1; }
		
		//("," localColumns+=[Column])*
		public Group getGroup_4() { return cGroup_4; }
		
		//","
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }
		
		//localColumns+=[Column]
		public Assignment getLocalColumnsAssignment_4_1() { return cLocalColumnsAssignment_4_1; }
		
		//[Column]
		public CrossReference getLocalColumnsColumnCrossReference_4_1_0() { return cLocalColumnsColumnCrossReference_4_1_0; }
		
		//ID
		public RuleCall getLocalColumnsColumnIDTerminalRuleCall_4_1_0_1() { return cLocalColumnsColumnIDTerminalRuleCall_4_1_0_1; }
		
		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
		
		//"REFERENCES"
		public Keyword getREFERENCESKeyword_6() { return cREFERENCESKeyword_6; }
		
		//foreignTable=[Table]
		public Assignment getForeignTableAssignment_7() { return cForeignTableAssignment_7; }
		
		//[Table]
		public CrossReference getForeignTableTableCrossReference_7_0() { return cForeignTableTableCrossReference_7_0; }
		
		//ID
		public RuleCall getForeignTableTableIDTerminalRuleCall_7_0_1() { return cForeignTableTableIDTerminalRuleCall_7_0_1; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_8() { return cLeftParenthesisKeyword_8; }
		
		//foreignColumns+=[Column]
		public Assignment getForeignColumnsAssignment_9() { return cForeignColumnsAssignment_9; }
		
		//[Column]
		public CrossReference getForeignColumnsColumnCrossReference_9_0() { return cForeignColumnsColumnCrossReference_9_0; }
		
		//ID
		public RuleCall getForeignColumnsColumnIDTerminalRuleCall_9_0_1() { return cForeignColumnsColumnIDTerminalRuleCall_9_0_1; }
		
		//("," foreignColumns+=[Column])*
		public Group getGroup_10() { return cGroup_10; }
		
		//","
		public Keyword getCommaKeyword_10_0() { return cCommaKeyword_10_0; }
		
		//foreignColumns+=[Column]
		public Assignment getForeignColumnsAssignment_10_1() { return cForeignColumnsAssignment_10_1; }
		
		//[Column]
		public CrossReference getForeignColumnsColumnCrossReference_10_1_0() { return cForeignColumnsColumnCrossReference_10_1_0; }
		
		//ID
		public RuleCall getForeignColumnsColumnIDTerminalRuleCall_10_1_0_1() { return cForeignColumnsColumnIDTerminalRuleCall_10_1_0_1; }
		
		//")"
		public Keyword getRightParenthesisKeyword_11() { return cRightParenthesisKeyword_11; }
	}
	
	public class DataTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "uniandes.automat.sql.Sql.DataType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cVARCHAR255EnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cVARCHAR255Varchar255Keyword_0_0 = (Keyword)cVARCHAR255EnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cINTEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cINTIntKeyword_1_0 = (Keyword)cINTEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum DataType:
		//	VARCHAR255="varchar(255)" | INT="int";
		public EnumRule getRule() { return rule; }
		
		//VARCHAR255="varchar(255)" | INT="int"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//VARCHAR255="varchar(255)"
		public EnumLiteralDeclaration getVARCHAR255EnumLiteralDeclaration_0() { return cVARCHAR255EnumLiteralDeclaration_0; }
		
		//"varchar(255)"
		public Keyword getVARCHAR255Varchar255Keyword_0_0() { return cVARCHAR255Varchar255Keyword_0_0; }
		
		//INT="int"
		public EnumLiteralDeclaration getINTEnumLiteralDeclaration_1() { return cINTEnumLiteralDeclaration_1; }
		
		//"int"
		public Keyword getINTIntKeyword_1_0() { return cINTIntKeyword_1_0; }
	}
	
	private final ModelElements pModel;
	private final DatabaseElements pDatabase;
	private final TableElements pTable;
	private final ColumnElements pColumn;
	private final PrimaryKeyElements pPrimaryKey;
	private final ForeignKeyElements pForeignKey;
	private final DataTypeElements eDataType;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SqlGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pDatabase = new DatabaseElements();
		this.pTable = new TableElements();
		this.pColumn = new ColumnElements();
		this.pPrimaryKey = new PrimaryKeyElements();
		this.pForeignKey = new ForeignKeyElements();
		this.eDataType = new DataTypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("uniandes.automat.sql.Sql".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	database+=Database;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Database:
	//	tables+=Table*;
	public DatabaseElements getDatabaseAccess() {
		return pDatabase;
	}
	
	public ParserRule getDatabaseRule() {
		return getDatabaseAccess().getRule();
	}
	
	//Table:
	//	"CREATE" "TABLE" name=ID "("
	//	facts+=(Column | PrimaryKey | ForeignKey) ("," facts+=(Column | PrimaryKey | ForeignKey))*
	//	")";
	public TableElements getTableAccess() {
		return pTable;
	}
	
	public ParserRule getTableRule() {
		return getTableAccess().getRule();
	}
	
	////TableFacts:
	////	facts+=TableFact ( "," facts+=TableFact )*
	////;
	////
	////TableFact:
	////	Column | PrimaryKey | ForeignKey
	////;
	//Column:
	//	name=ID type=DataType isNotNull?='NOT NULL'?;
	public ColumnElements getColumnAccess() {
		return pColumn;
	}
	
	public ParserRule getColumnRule() {
		return getColumnAccess().getRule();
	}
	
	//PrimaryKey:
	//	"PRIMARY" "KEY" "("
	//	col+=[Column] ("," col+=[Column])*
	//	")";
	public PrimaryKeyElements getPrimaryKeyAccess() {
		return pPrimaryKey;
	}
	
	public ParserRule getPrimaryKeyRule() {
		return getPrimaryKeyAccess().getRule();
	}
	
	//ForeignKey:
	//	"FOREIGN" "KEY" "("
	//	localColumns+=[Column] ("," localColumns+=[Column])*
	//	")"
	//	"REFERENCES" foreignTable=[Table] "("
	//	foreignColumns+=[Column] ("," foreignColumns+=[Column])*
	//	")";
	public ForeignKeyElements getForeignKeyAccess() {
		return pForeignKey;
	}
	
	public ParserRule getForeignKeyRule() {
		return getForeignKeyAccess().getRule();
	}
	
	//enum DataType:
	//	VARCHAR255="varchar(255)" | INT="int";
	public DataTypeElements getDataTypeAccess() {
		return eDataType;
	}
	
	public EnumRule getDataTypeRule() {
		return getDataTypeAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
