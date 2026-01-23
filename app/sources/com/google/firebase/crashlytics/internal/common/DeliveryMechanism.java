package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes.dex */
public enum DeliveryMechanism {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* renamed from: id */
    private final int f904id;

    DeliveryMechanism(int i) {
        this.f904id = i;
    }

    public int getId() {
        return this.f904id;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f904id);
    }

    public static DeliveryMechanism determineFrom(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }
}
