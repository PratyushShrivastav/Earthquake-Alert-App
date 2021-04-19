package com.example.earthquakealert;

public class Earthquake {

    /** Magnitude of the earthquake */
    private double mMagnitude ;

    /** Location of the earthquake */
    private String mLocation ;

    /** Date of the earthquake */
    private long mTimeInMilliseconds;

    /** url of the earthquake */
    private String mUrl;

    public String getUrl() {
        return mUrl;
    }

    /**
     * Construct a new {@link Earthquake} object .
     * @param magnitude is the magnitude (size) of the earthquake .
     * @param location is the city location of the earthquake .
     * @param timeInMilliseconds is the timeInMilliseconds the earthquake happened .
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     * @return the Magnitude of the earthquake .
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * @return the Location of the earthquake .
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * @return the Date of the earthquake .
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
