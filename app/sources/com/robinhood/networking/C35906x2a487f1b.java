package com.robinhood.networking;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;

/* compiled from: ExternalReleaseNetworkingModule_ProvideFlipperOkHttpInterceptorFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/networking/ExternalReleaseNetworkingModule_ProvideFlipperOkHttpInterceptorFactory;", "Ldagger/internal/Factory;", "Lokhttp3/Interceptor;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideFlipperOkHttpInterceptor", "lib-networking_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.networking.ExternalReleaseNetworkingModule_ProvideFlipperOkHttpInterceptorFactory */
/* loaded from: classes22.dex */
public final class C35906x2a487f1b implements Factory<Interceptor> {
    public static final C35906x2a487f1b INSTANCE = new C35906x2a487f1b();

    private C35906x2a487f1b() {
    }

    @Override // javax.inject.Provider
    public Interceptor get() {
        return provideFlipperOkHttpInterceptor();
    }

    @JvmStatic
    public static final C35906x2a487f1b create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final Interceptor provideFlipperOkHttpInterceptor() {
        Object objCheckNotNull = Preconditions.checkNotNull(ExternalReleaseNetworkingModule.INSTANCE.provideFlipperOkHttpInterceptor(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (Interceptor) objCheckNotNull;
    }
}
