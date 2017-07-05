package org.apache.cayenne.testdo.testmap.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.testmap.ArtistExhibit;
import org.apache.cayenne.testdo.testmap.Gallery;

/**
 * Class _Exhibit was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Exhibit extends BaseDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String EXHIBIT_ID_PK_COLUMN = "EXHIBIT_ID";

    public static final Property<Date> CLOSING_DATE = Property.create("closingDate", Date.class);
    public static final Property<Date> OPENING_DATE = Property.create("openingDate", Date.class);
    public static final Property<List<ArtistExhibit>> ARTIST_EXHIBIT_ARRAY = Property.create("artistExhibitArray", List.class);
    public static final Property<Gallery> TO_GALLERY = Property.create("toGallery", Gallery.class);

    protected Date closingDate;
    protected Date openingDate;

    protected Object artistExhibitArray;
    protected Object toGallery;

    public void setClosingDate(Date closingDate) {
        beforePropertyWrite("closingDate", this.closingDate, closingDate);
        this.closingDate = closingDate;
    }

    public Date getClosingDate() {
        beforePropertyRead("closingDate");
        return closingDate;
    }

    public void setOpeningDate(Date openingDate) {
        beforePropertyWrite("openingDate", this.openingDate, openingDate);
        this.openingDate = openingDate;
    }

    public Date getOpeningDate() {
        beforePropertyRead("openingDate");
        return openingDate;
    }

    public void addToArtistExhibitArray(ArtistExhibit obj) {
        addToManyTarget("artistExhibitArray", obj, true);
    }

    public void removeFromArtistExhibitArray(ArtistExhibit obj) {
        removeToManyTarget("artistExhibitArray", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<ArtistExhibit> getArtistExhibitArray() {
        return (List<ArtistExhibit>)readProperty("artistExhibitArray");
    }

    public void setToGallery(Gallery toGallery) {
        setToOneTarget("toGallery", toGallery, true);
    }

    public Gallery getToGallery() {
        return (Gallery)readProperty("toGallery");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "closingDate":
                return this.closingDate;
            case "openingDate":
                return this.openingDate;
            case "artistExhibitArray":
                return this.artistExhibitArray;
            case "toGallery":
                return this.toGallery;
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
            case "closingDate":
                this.closingDate = (Date)val;
                break;
            case "openingDate":
                this.openingDate = (Date)val;
                break;
            case "artistExhibitArray":
                this.artistExhibitArray = val;
                break;
            case "toGallery":
                this.toGallery = val;
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
        out.writeObject(closingDate);
        out.writeObject(openingDate);
        out.writeObject(artistExhibitArray);
        out.writeObject(toGallery);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        closingDate = (Date)in.readObject();
        openingDate = (Date)in.readObject();
        artistExhibitArray = in.readObject();
        toGallery = in.readObject();
    }

}
