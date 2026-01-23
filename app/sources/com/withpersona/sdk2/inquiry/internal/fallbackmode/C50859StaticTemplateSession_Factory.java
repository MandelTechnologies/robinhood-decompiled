package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import androidx.lifecycle.SavedStateHandle;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import dagger.internal.Provider;
import java.util.List;

/* renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.StaticTemplateSession_Factory, reason: case insensitive filesystem */
/* loaded from: classes18.dex */
public final class C50859StaticTemplateSession_Factory {
    private final Provider<SavedStateHandle> savedStateHandleProvider;

    public C50859StaticTemplateSession_Factory(Provider<SavedStateHandle> provider) {
        this.savedStateHandleProvider = provider;
    }

    public StaticTemplateSession get(List<? extends NextStep> list, String str) {
        return newInstance(list, str, this.savedStateHandleProvider.get());
    }

    public static C50859StaticTemplateSession_Factory create(Provider<SavedStateHandle> provider) {
        return new C50859StaticTemplateSession_Factory(provider);
    }

    public static StaticTemplateSession newInstance(List<? extends NextStep> list, String str, SavedStateHandle savedStateHandle) {
        return new StaticTemplateSession(list, str, savedStateHandle);
    }
}
