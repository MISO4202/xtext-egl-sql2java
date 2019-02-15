/**
 * generated by Xtext 2.10.0
 */
package uniandes.automat.sql.sql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uniandes.automat.sql.sql.ForeignKey#getLocalColumns <em>Local Columns</em>}</li>
 *   <li>{@link uniandes.automat.sql.sql.ForeignKey#getForeignTable <em>Foreign Table</em>}</li>
 *   <li>{@link uniandes.automat.sql.sql.ForeignKey#getForeignColumns <em>Foreign Columns</em>}</li>
 * </ul>
 *
 * @see uniandes.automat.sql.sql.SqlPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends EObject
{
  /**
   * Returns the value of the '<em><b>Local Columns</b></em>' reference list.
   * The list contents are of type {@link uniandes.automat.sql.sql.Column}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Local Columns</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Local Columns</em>' reference list.
   * @see uniandes.automat.sql.sql.SqlPackage#getForeignKey_LocalColumns()
   * @model
   * @generated
   */
  EList<Column> getLocalColumns();

  /**
   * Returns the value of the '<em><b>Foreign Table</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Foreign Table</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Foreign Table</em>' reference.
   * @see #setForeignTable(Table)
   * @see uniandes.automat.sql.sql.SqlPackage#getForeignKey_ForeignTable()
   * @model
   * @generated
   */
  Table getForeignTable();

  /**
   * Sets the value of the '{@link uniandes.automat.sql.sql.ForeignKey#getForeignTable <em>Foreign Table</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Foreign Table</em>' reference.
   * @see #getForeignTable()
   * @generated
   */
  void setForeignTable(Table value);

  /**
   * Returns the value of the '<em><b>Foreign Columns</b></em>' reference list.
   * The list contents are of type {@link uniandes.automat.sql.sql.Column}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Foreign Columns</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Foreign Columns</em>' reference list.
   * @see uniandes.automat.sql.sql.SqlPackage#getForeignKey_ForeignColumns()
   * @model
   * @generated
   */
  EList<Column> getForeignColumns();

} // ForeignKey
