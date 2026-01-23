package com.withpersona.sdk2.inquiry.internal;

import dagger.internal.Provider;

/* renamed from: com.withpersona.sdk2.inquiry.internal.RestoreUiStepStateWorker_Factory, reason: case insensitive filesystem */
/* loaded from: classes18.dex */
public final class C50854RestoreUiStepStateWorker_Factory {
    private final Provider<UiStepSavedStateHelper> uiStepSavedStateHelperProvider;

    public C50854RestoreUiStepStateWorker_Factory(Provider<UiStepSavedStateHelper> provider) {
        this.uiStepSavedStateHelperProvider = provider;
    }

    public RestoreUiStepStateWorker get(String str, String str2, String str3) {
        return newInstance(this.uiStepSavedStateHelperProvider.get(), str, str2, str3);
    }

    public static C50854RestoreUiStepStateWorker_Factory create(Provider<UiStepSavedStateHelper> provider) {
        return new C50854RestoreUiStepStateWorker_Factory(provider);
    }

    public static RestoreUiStepStateWorker newInstance(UiStepSavedStateHelper uiStepSavedStateHelper, String str, String str2, String str3) {
        return new RestoreUiStepStateWorker(uiStepSavedStateHelper, str, str2, str3);
    }
}
