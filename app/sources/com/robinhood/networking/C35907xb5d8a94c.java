package com.robinhood.networking;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;

/* compiled from: ExternalReleaseNetworkingModule_ProvideNetworkInterceptorsFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0016J\b\u0010\b\u001a\u00020\u0000H\u0007J\u0013\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/networking/ExternalReleaseNetworkingModule_ProvideNetworkInterceptorsFactory;", "Ldagger/internal/Factory;", "", "Lokhttp3/Interceptor;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideNetworkInterceptors", "lib-networking_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.networking.ExternalReleaseNetworkingModule_ProvideNetworkInterceptorsFactory */
/* loaded from: classes22.dex */
public final class C35907xb5d8a94c implements Factory<List<Interceptor>> {
    public static final C35907xb5d8a94c INSTANCE = new C35907xb5d8a94c();

    private C35907xb5d8a94c() {
    }

    @Override // javax.inject.Provider
    public List<Interceptor> get() {
        return provideNetworkInterceptors();
    }

    @JvmStatic
    public static final C35907xb5d8a94c create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final List<Interceptor> provideNetworkInterceptors() {
        Object objCheckNotNull = Preconditions.checkNotNull(ExternalReleaseNetworkingModule.INSTANCE.provideNetworkInterceptors(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (List) objCheckNotNull;
    }
}
