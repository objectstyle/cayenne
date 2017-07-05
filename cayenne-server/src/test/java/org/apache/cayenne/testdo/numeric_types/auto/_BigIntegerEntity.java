package org.apache.cayenne.testdo.numeric_types.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _BigIntegerEntity was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _BigIntegerEntity extends BaseDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<BigInteger> BIG_INTEGER_FIELD = Property.create("bigIntegerField", BigInteger.class);

    protected BigInteger bigIntegerField;


    public void setBigIntegerField(BigInteger bigIntegerField) {
        beforePropertyWrite("bigIntegerField", this.bigIntegerField, bigIntegerField);
        this.bigIntegerField = bigIntegerField;
    }

    public BigInteger getBigIntegerField() {
        beforePropertyRead("bigIntegerField");
        return bigIntegerField;
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "bigIntegerField":
                return this.bigIntegerField;
            default:
                return super.readPropertyDirectly(propName);
        }
    }

    @Override
    public void writePropertyDirectly(String propName, Object val) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch (propName) {
            case "bigIntegerField":
                this.bigIntegerField = (BigInteger)val;
                break;
            default:
                super.writePropertyDirectly(propName, val);
        }
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        writeSerialized(out);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        readSerialized(in);
    }

    @Override
    protected void writeState(ObjectOutputStream out) throws IOException {
        super.writeState(out);
        out.writeObject(bigIntegerField);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        bigIntegerField = (BigInteger)in.readObject();
    }

}
