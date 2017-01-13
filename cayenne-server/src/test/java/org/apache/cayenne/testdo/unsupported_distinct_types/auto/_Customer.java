package org.apache.cayenne.testdo.unsupported_distinct_types.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.unsupported_distinct_types.Product;

/**
 * Class _Customer was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Customer extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<String> LONGVARCHAR_COL = new Property<>("longvarcharCol");
    public static final Property<List<Product>> ORDER = new Property<>("order");

    public void setLongvarcharCol(String longvarcharCol) {
        writeProperty("longvarcharCol", longvarcharCol);
    }
    public String getLongvarcharCol() {
        return (String)readProperty("longvarcharCol");
    }

    public void addToOrder(Product obj) {
        addToManyTarget("order", obj, true);
    }
    public void removeFromOrder(Product obj) {
        removeToManyTarget("order", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Product> getOrder() {
        return (List<Product>)readProperty("order");
    }


}
