package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class UiStepSavedStateHelper_Factory implements Factory<UiStepSavedStateHelper> {
    private final Provider<Context> applicationContextProvider;

    public UiStepSavedStateHelper_Factory(Provider<Context> provider) {
        this.applicationContextProvider = provider;
    }

    @Override // javax.inject.Provider
    public UiStepSavedStateHelper get() {
        return newInstance(this.applicationContextProvider.get());
    }

    public static UiStepSavedStateHelper_Factory create(Provider<Context> provider) {
        return new UiStepSavedStateHelper_Factory(provider);
    }

    public static UiStepSavedStateHelper newInstance(Context context) {
        return new UiStepSavedStateHelper(context);
    }
}
