package com.example.android.miwok;

public class Word {
    private static final int NO_IMAGE = -1;
    private String mEngTranslation, mMiwokTranslation;
    private int mImage = NO_IMAGE, mAudio;

    public Word(String engTranslation, String miwokTranslation, int audio) {
        mEngTranslation = engTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudio = audio;
    }

    public Word(String engTranslation, String miwokTranslation, int image, int audio) {
        mEngTranslation = engTranslation;
        mMiwokTranslation = miwokTranslation;
        mImage = image;
        mAudio = audio;
    }

    public String getEngTranslation() {
        return mEngTranslation;
    }

    public int getImage() {
        return mImage;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getAudio() {
        return mAudio;
    }

    public boolean hasImage() {
        return mImage != NO_IMAGE;
    }
}
