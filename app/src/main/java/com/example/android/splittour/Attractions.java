package com.example.android.splittour;


public class Attractions {
    /**
     * Name of the attraction
     */
    private int mAttractionName;

    /**
     * Description of the attraction
     */
    private int mAttractionDescription;


    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param attractionName        is the name of the attraction
     * @param attractionDescription is the word in the Miwok language
     */
    public Attractions(int attractionName, int attractionDescription) {
        mAttractionName = attractionName;
        mAttractionDescription = attractionDescription;

    }


    /**
     * Create a new Word object.
     *
     * @param attractionName        is the name of the attraction
     * @param attractionDescription is the word in the Miwok language
     * @param imageResourceId       is the drawable resource ID for the image associated with the attraction
     */
    public Attractions(int attractionName, int attractionDescription, int imageResourceId) {
        mAttractionName = attractionName;
        mAttractionDescription = attractionDescription;
        mImageResourceId = imageResourceId;
    }


    /**
     * Get the name of the attraction.
     */
    public int getAttractionName() {
        return mAttractionName;
    }

    /**
     * Get the attraction description.
     */
    public int getAttractionDescription() {
        return mAttractionDescription;

    }

    /**
     * +     * Return the image resource ID of the word.
     * +
     */

    public int getImageResourceId() {
        return mImageResourceId;

    }

    /**
     * Returns whether or not there is an image for this word.
     */

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}

