package com.google.firebase.remoteconfig;

/* loaded from: classes27.dex */
public interface FirebaseRemoteConfigValue {
    boolean asBoolean() throws IllegalArgumentException;

    double asDouble() throws IllegalArgumentException;

    long asLong() throws IllegalArgumentException;

    String asString();

    int getSource();
}
