package com.example.android.miwok;

/**
 * Created by Zark on 11/11/2016.
 * {@link Word} represents a vocabulary word the user wants to learn. It contains a
 * default translation and a Miwok translation for that word.
 */
public class Word {

    /**
     * Default translation
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation
     */
    private String mMiwokTranslation;

    //Image resource ID
    private int mImageResourceId;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Constructor to needed for image addition
     *
     * @param defaultTranslation of the word to be translated
     * @param miwokTranslation of the word to be translated
     * @param imageResourceId to set the image to the left of the translation
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the default translation of the word.
     *
     * @return the default translation
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     *
     * @return the Miwok translation
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Method to get the image resource ID
     *
     * @return the image resource ID as an int
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
