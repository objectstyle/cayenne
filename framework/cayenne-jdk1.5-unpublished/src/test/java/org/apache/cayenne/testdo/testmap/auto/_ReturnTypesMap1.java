package org.apache.cayenne.testdo.testmap.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _ReturnTypesMap1 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ReturnTypesMap1 extends CayenneDataObject {

    public static final String BIGINT_COLUMN_PROPERTY = "bigintColumn";
    public static final String BIT_COLUMN_PROPERTY = "bitColumn";
    public static final String BOOLEAN_COLUMN_PROPERTY = "booleanColumn";
    public static final String CHAR_COLUMN_PROPERTY = "charColumn";
    public static final String DATE_COLUMN_PROPERTY = "dateColumn";
    public static final String DECIMAL_COLUMN_PROPERTY = "decimalColumn";
    public static final String DOUBLE_COLUMN_PROPERTY = "doubleColumn";
    public static final String FLOAT_COLUMN_PROPERTY = "floatColumn";
    public static final String INTEGER_COLUMN_PROPERTY = "integerColumn";
    public static final String LONGVARCHAR_COLUMN_PROPERTY = "longvarcharColumn";
    public static final String NUMERIC_COLUMN_PROPERTY = "numericColumn";
    public static final String REAL_COLUMN_PROPERTY = "realColumn";
    public static final String SMALLINT_COLUMN_PROPERTY = "smallintColumn";
    public static final String TIME_COLUMN_PROPERTY = "timeColumn";
    public static final String TIMESTAMP_COLUMN_PROPERTY = "timestampColumn";
    public static final String TINYINT_COLUMN_PROPERTY = "tinyintColumn";
    public static final String VARCHAR_COLUMN_PROPERTY = "varcharColumn";

    public static final String AAAID_PK_COLUMN = "AAAID";

    public void setBigintColumn(Long bigintColumn) {
        writeProperty(BIGINT_COLUMN_PROPERTY, bigintColumn);
    }
    public Long getBigintColumn() {
        return (Long)readProperty(BIGINT_COLUMN_PROPERTY);
    }

    public void setBitColumn(Boolean bitColumn) {
        writeProperty(BIT_COLUMN_PROPERTY, bitColumn);
    }
    public Boolean getBitColumn() {
        return (Boolean)readProperty(BIT_COLUMN_PROPERTY);
    }

    public void setBooleanColumn(Boolean booleanColumn) {
        writeProperty(BOOLEAN_COLUMN_PROPERTY, booleanColumn);
    }
    public Boolean getBooleanColumn() {
        return (Boolean)readProperty(BOOLEAN_COLUMN_PROPERTY);
    }

    public void setCharColumn(String charColumn) {
        writeProperty(CHAR_COLUMN_PROPERTY, charColumn);
    }
    public String getCharColumn() {
        return (String)readProperty(CHAR_COLUMN_PROPERTY);
    }

    public void setDateColumn(Date dateColumn) {
        writeProperty(DATE_COLUMN_PROPERTY, dateColumn);
    }
    public Date getDateColumn() {
        return (Date)readProperty(DATE_COLUMN_PROPERTY);
    }

    public void setDecimalColumn(BigDecimal decimalColumn) {
        writeProperty(DECIMAL_COLUMN_PROPERTY, decimalColumn);
    }
    public BigDecimal getDecimalColumn() {
        return (BigDecimal)readProperty(DECIMAL_COLUMN_PROPERTY);
    }

    public void setDoubleColumn(Double doubleColumn) {
        writeProperty(DOUBLE_COLUMN_PROPERTY, doubleColumn);
    }
    public Double getDoubleColumn() {
        return (Double)readProperty(DOUBLE_COLUMN_PROPERTY);
    }

    public void setFloatColumn(Float floatColumn) {
        writeProperty(FLOAT_COLUMN_PROPERTY, floatColumn);
    }
    public Float getFloatColumn() {
        return (Float)readProperty(FLOAT_COLUMN_PROPERTY);
    }

    public void setIntegerColumn(Integer integerColumn) {
        writeProperty(INTEGER_COLUMN_PROPERTY, integerColumn);
    }
    public Integer getIntegerColumn() {
        return (Integer)readProperty(INTEGER_COLUMN_PROPERTY);
    }

    public void setLongvarcharColumn(String longvarcharColumn) {
        writeProperty(LONGVARCHAR_COLUMN_PROPERTY, longvarcharColumn);
    }
    public String getLongvarcharColumn() {
        return (String)readProperty(LONGVARCHAR_COLUMN_PROPERTY);
    }

    public void setNumericColumn(BigDecimal numericColumn) {
        writeProperty(NUMERIC_COLUMN_PROPERTY, numericColumn);
    }
    public BigDecimal getNumericColumn() {
        return (BigDecimal)readProperty(NUMERIC_COLUMN_PROPERTY);
    }

    public void setRealColumn(Float realColumn) {
        writeProperty(REAL_COLUMN_PROPERTY, realColumn);
    }
    public Float getRealColumn() {
        return (Float)readProperty(REAL_COLUMN_PROPERTY);
    }

    public void setSmallintColumn(Short smallintColumn) {
        writeProperty(SMALLINT_COLUMN_PROPERTY, smallintColumn);
    }
    public Short getSmallintColumn() {
        return (Short)readProperty(SMALLINT_COLUMN_PROPERTY);
    }

    public void setTimeColumn(Date timeColumn) {
        writeProperty(TIME_COLUMN_PROPERTY, timeColumn);
    }
    public Date getTimeColumn() {
        return (Date)readProperty(TIME_COLUMN_PROPERTY);
    }

    public void setTimestampColumn(Date timestampColumn) {
        writeProperty(TIMESTAMP_COLUMN_PROPERTY, timestampColumn);
    }
    public Date getTimestampColumn() {
        return (Date)readProperty(TIMESTAMP_COLUMN_PROPERTY);
    }

    public void setTinyintColumn(Byte tinyintColumn) {
        writeProperty(TINYINT_COLUMN_PROPERTY, tinyintColumn);
    }
    public Byte getTinyintColumn() {
        return (Byte)readProperty(TINYINT_COLUMN_PROPERTY);
    }

    public void setVarcharColumn(String varcharColumn) {
        writeProperty(VARCHAR_COLUMN_PROPERTY, varcharColumn);
    }
    public String getVarcharColumn() {
        return (String)readProperty(VARCHAR_COLUMN_PROPERTY);
    }

}