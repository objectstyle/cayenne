package org.apache.cayenne.java8.db.auto;

import java.time.LocalTime;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _LocalTimeTestEntity was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _LocalTimeTestEntity extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<LocalTime> TIME = Property.create("time", LocalTime.class);

    public void setTime(LocalTime time) {
        writeProperty("time", time);
    }
    public LocalTime getTime() {
        return (LocalTime)readProperty("time");
    }

}
