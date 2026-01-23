package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import androidx.lifecycle.SavedStateHandle;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes18.dex */
public final class FallbackModeModule_SavedStateHandleFactory implements Factory<SavedStateHandle> {
    private final FallbackModeModule module;

    public FallbackModeModule_SavedStateHandleFactory(FallbackModeModule fallbackModeModule) {
        this.module = fallbackModeModule;
    }

    @Override // javax.inject.Provider
    public SavedStateHandle get() {
        return savedStateHandle(this.module);
    }

    public static FallbackModeModule_SavedStateHandleFactory create(FallbackModeModule fallbackModeModule) {
        return new FallbackModeModule_SavedStateHandleFactory(fallbackModeModule);
    }

    public static SavedStateHandle savedStateHandle(FallbackModeModule fallbackModeModule) {
        return (SavedStateHandle) Preconditions.checkNotNullFromProvides(fallbackModeModule.getSavedStateHandle());
    }
}
