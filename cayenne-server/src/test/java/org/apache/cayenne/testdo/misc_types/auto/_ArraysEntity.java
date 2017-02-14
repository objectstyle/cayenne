package org.apache.cayenne.testdo.misc_types.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _ArraysEntity was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ArraysEntity extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<byte[]> BYTE_ARRAY = Property.create("byteArray", byte[].class);
    public static final Property<Byte[]> BYTE_WRAPPER_ARRAY = Property.create("byteWrapperArray", Byte[].class);
    public static final Property<char[]> CHAR_ARRAY = Property.create("charArray", char[].class);
    public static final Property<Character[]> CHAR_WRAPPER_ARRAY = Property.create("charWrapperArray", Character[].class);

    public void setByteArray(byte[] byteArray) {
        writeProperty("byteArray", byteArray);
    }
    public byte[] getByteArray() {
        return (byte[])readProperty("byteArray");
    }

    public void setByteWrapperArray(Byte[] byteWrapperArray) {
        writeProperty("byteWrapperArray", byteWrapperArray);
    }
    public Byte[] getByteWrapperArray() {
        return (Byte[])readProperty("byteWrapperArray");
    }

    public void setCharArray(char[] charArray) {
        writeProperty("charArray", charArray);
    }
    public char[] getCharArray() {
        return (char[])readProperty("charArray");
    }

    public void setCharWrapperArray(Character[] charWrapperArray) {
        writeProperty("charWrapperArray", charWrapperArray);
    }
    public Character[] getCharWrapperArray() {
        return (Character[])readProperty("charWrapperArray");
    }

}
