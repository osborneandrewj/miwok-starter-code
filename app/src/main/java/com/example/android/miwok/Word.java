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
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    //Used to determine if image has been provided
    private static final int NO_IMAGE_PROVIDED = -1;
    //Sound resource ID
    private int mSoundResourceId = NO_SOUND_PROVIDED;
    //Used to determine if a sound has been provided
    private static final int NO_SOUND_PROVIDED = -1;

    /**
     * Create a new Word object
     * Constructor to needed for image addition
     *
     * @param defaultTranslation of the word to be translated
     * @param miwokTranslation of the word to be translated
     * @param imageResourceId to set image
     */
    public Word(String defaultTranslation, String miwokTranslation, int soundResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mSoundResourceId = soundResourceId;
    }

    /**
     * Constructor to needed for sound addition
     *
     * @param defaultTranslation of the word to be translated
     * @param miwokTranslation of the word to be translated
     * @param imageResourceId to set the image to the left of the translation
     * @param soundResourceId to set the sound
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int soundResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mSoundResourceId = soundResourceId;
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

    /**
     * Method to tell an adapter whether or not there is an image associated with the list
     *
     * @return true if an image is attached, false if no image exists.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getSoundResourceId() {
        return mSoundResourceId;
    }

    /**
     * Method to tell an adapter whether or not there is a sound associated with the list
     *
     * @return true if a sound is attached, false if no sound
     */
    public boolean hasSound() {
        return mSoundResourceId != NO_SOUND_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mSoundResourceId=" + mSoundResourceId +
                '}';
    }
}
