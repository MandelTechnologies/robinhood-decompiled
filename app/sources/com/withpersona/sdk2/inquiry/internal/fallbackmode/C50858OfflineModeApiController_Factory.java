package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import android.content.Context;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.StaticTemplateSession;
import dagger.internal.Provider;

/* renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.OfflineModeApiController_Factory, reason: case insensitive filesystem */
/* loaded from: classes18.dex */
public final class C50858OfflineModeApiController_Factory {
    private final Provider<Context> contextProvider;
    private final Provider<Moshi> moshiProvider;
    private final Provider<StaticTemplateSession.Factory> staticTemplateSessionFactoryProvider;

    public C50858OfflineModeApiController_Factory(Provider<Moshi> provider, Provider<Context> provider2, Provider<StaticTemplateSession.Factory> provider3) {
        this.moshiProvider = provider;
        this.contextProvider = provider2;
        this.staticTemplateSessionFactoryProvider = provider3;
    }

    public OfflineModeApiController get(int i) {
        return newInstance(this.moshiProvider.get(), this.contextProvider.get(), this.staticTemplateSessionFactoryProvider.get(), i);
    }

    public static C50858OfflineModeApiController_Factory create(Provider<Moshi> provider, Provider<Context> provider2, Provider<StaticTemplateSession.Factory> provider3) {
        return new C50858OfflineModeApiController_Factory(provider, provider2, provider3);
    }

    public static OfflineModeApiController newInstance(Moshi moshi, Context context, StaticTemplateSession.Factory factory, int i) {
        return new OfflineModeApiController(moshi, context, factory, i);
    }
}
