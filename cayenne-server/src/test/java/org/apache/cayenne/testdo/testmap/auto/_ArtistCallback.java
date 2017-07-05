package org.apache.cayenne.testdo.testmap.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _ArtistCallback was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ArtistCallback extends BaseDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ARTIST_ID_PK_COLUMN = "ARTIST_ID";

    public static final Property<String> ARTIST_NAME = Property.create("artistName", String.class);
    public static final Property<Date> DATE_OF_BIRTH = Property.create("dateOfBirth", Date.class);

    protected String artistName;
    protected Date dateOfBirth;


    public void setArtistName(String artistName) {
        beforePropertyWrite("artistName", this.artistName, artistName);
        this.artistName = artistName;
    }

    public String getArtistName() {
        beforePropertyRead("artistName");
        return artistName;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        beforePropertyWrite("dateOfBirth", this.dateOfBirth, dateOfBirth);
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfBirth() {
        beforePropertyRead("dateOfBirth");
        return dateOfBirth;
    }

protected abstract void prePersistEntityObjEntity();

protected abstract void preRemoveEntityObjEntity();

protected abstract void preUpdateEntityObjEntity();

protected abstract void postPersistEntityObjEntity();

protected abstract void postRemoveEntityObjEntity();

protected abstract void postUpdateEntityObjEntity();

protected abstract void postLoadEntityObjEntity();

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "artistName":
                return this.artistName;
            case "dateOfBirth":
                return this.dateOfBirth;
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
            case "artistName":
                this.artistName = (String)val;
                break;
            case "dateOfBirth":
                this.dateOfBirth = (Date)val;
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
        out.writeObject(artistName);
        out.writeObject(dateOfBirth);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        artistName = (String)in.readObject();
        dateOfBirth = (Date)in.readObject();
    }

}
