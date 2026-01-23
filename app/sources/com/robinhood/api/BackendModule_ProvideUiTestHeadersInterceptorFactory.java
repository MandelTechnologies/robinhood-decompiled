package com.robinhood.api;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import okhttp3.Interceptor;

/* compiled from: BackendModule_ProvideUiTestHeadersInterceptorFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/api/BackendModule_ProvideUiTestHeadersInterceptorFactory;", "Ldagger/internal/Factory;", "Lokhttp3/Interceptor;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideUiTestHeadersInterceptor", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class BackendModule_ProvideUiTestHeadersInterceptorFactory implements Factory<Interceptor> {
    public static final BackendModule_ProvideUiTestHeadersInterceptorFactory INSTANCE = new BackendModule_ProvideUiTestHeadersInterceptorFactory();

    private BackendModule_ProvideUiTestHeadersInterceptorFactory() {
    }

    @Override // javax.inject.Provider
    public Interceptor get() {
        return provideUiTestHeadersInterceptor();
    }

    @JvmStatic
    public static final BackendModule_ProvideUiTestHeadersInterceptorFactory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final Interceptor provideUiTestHeadersInterceptor() {
        return BackendModule.INSTANCE.provideUiTestHeadersInterceptor();
    }
}
