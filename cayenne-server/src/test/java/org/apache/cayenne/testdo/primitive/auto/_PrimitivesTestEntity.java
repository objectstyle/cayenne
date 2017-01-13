package org.apache.cayenne.testdo.primitive.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _PrimitivesTestEntity was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PrimitivesTestEntity extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<Boolean> BOOLEAN_COLUMN = Property.create("booleanColumn", Boolean.class);
    public static final Property<Integer> INT_COLUMN = Property.create("intColumn", Integer.class);

    public void setBooleanColumn(boolean booleanColumn) {
        writeProperty("booleanColumn", booleanColumn);
    }
	public boolean isBooleanColumn() {
        Boolean value = (Boolean)readProperty("booleanColumn");
        return (value != null) ? value.booleanValue() : false;
    }

    public void setIntColumn(int intColumn) {
        writeProperty("intColumn", intColumn);
    }
    public int getIntColumn() {
        Object value = readProperty("intColumn");
        return (value != null) ? (Integer) value : 0;
    }

}
