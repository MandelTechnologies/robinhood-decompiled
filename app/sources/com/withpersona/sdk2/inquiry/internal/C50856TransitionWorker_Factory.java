package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.fallbackmode.FallbackModeManager;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker;
import com.withpersona.sdk2.inquiry.internal.network.InquiryService;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import dagger.internal.Provider;

/* renamed from: com.withpersona.sdk2.inquiry.internal.TransitionWorker_Factory, reason: case insensitive filesystem */
/* loaded from: classes18.dex */
public final class C50856TransitionWorker_Factory {
    private final Provider<FallbackModeManager> fallbackModeManagerProvider;
    private final Provider<InquiryService> serviceProvider;
    private final Provider<UiStepSavedStateHelper> uiStepSavedStateHelperProvider;

    public C50856TransitionWorker_Factory(Provider<InquiryService> provider, Provider<FallbackModeManager> provider2, Provider<UiStepSavedStateHelper> provider3) {
        this.serviceProvider = provider;
        this.fallbackModeManagerProvider = provider2;
        this.uiStepSavedStateHelperProvider = provider3;
    }

    public TransitionWorker get(String str, String str2, InquirySessionConfig inquirySessionConfig, TransitionWorker.TransitionData transitionData) {
        return newInstance(str, str2, inquirySessionConfig, transitionData, this.serviceProvider.get(), this.fallbackModeManagerProvider.get(), this.uiStepSavedStateHelperProvider.get());
    }

    public static C50856TransitionWorker_Factory create(Provider<InquiryService> provider, Provider<FallbackModeManager> provider2, Provider<UiStepSavedStateHelper> provider3) {
        return new C50856TransitionWorker_Factory(provider, provider2, provider3);
    }

    public static TransitionWorker newInstance(String str, String str2, InquirySessionConfig inquirySessionConfig, TransitionWorker.TransitionData transitionData, InquiryService inquiryService, FallbackModeManager fallbackModeManager, UiStepSavedStateHelper uiStepSavedStateHelper) {
        return new TransitionWorker(str, str2, inquirySessionConfig, transitionData, inquiryService, fallbackModeManager, uiStepSavedStateHelper);
    }
}
