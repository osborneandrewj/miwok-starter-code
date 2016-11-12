package com.example.android.miwok;

/**
 * Created by Zark on 11/11/2016.
 * {@link Word} represents a vocabulary word the user wants to learn. It contains a
 * default translation and a Miwok translation for that word.
 */
public class Word {

    /** Default translation */
    private String mDefaultTranslation;

    /** Miwok translation */
    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get the default translation of the word.
     * @return the default translation
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     * @return the Miwok translation
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
