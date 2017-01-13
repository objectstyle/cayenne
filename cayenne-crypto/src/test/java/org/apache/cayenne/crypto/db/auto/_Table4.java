package org.apache.cayenne.crypto.db.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _Table4 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Table4 extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<Integer> PLAIN_INT = new Property<>("plainInt");
    public static final Property<String> PLAIN_STRING = new Property<>("plainString");

    public void setPlainInt(int plainInt) {
        writeProperty("plainInt", plainInt);
    }
    public int getPlainInt() {
        Object value = readProperty("plainInt");
        return (value != null) ? (Integer) value : 0;
    }

    public void setPlainString(String plainString) {
        writeProperty("plainString", plainString);
    }
    public String getPlainString() {
        return (String)readProperty("plainString");
    }

}
