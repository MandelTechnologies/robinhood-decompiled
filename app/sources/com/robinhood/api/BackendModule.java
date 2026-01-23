package com.robinhood.api;

import com.robinhood.android.lib.utils.NoopInterceptor;
import com.robinhood.api.utils.TargetBackendFactory;
import com.robinhood.networking.annotation.ContentfulStaging;
import com.robinhood.networking.annotation.UiTestInterceptor;
import com.robinhood.targetbackend.Endpoint;
import com.robinhood.targetbackend.TargetBackend;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;

/* compiled from: BackendModule.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\b\u0010\r\u001a\u00020\fH\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/api/BackendModule;", "", "<init>", "()V", "provideEndpoint", "Lcom/robinhood/targetbackend/Endpoint;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "provideTargetBackend", "targetBackendFactory", "Lcom/robinhood/api/utils/TargetBackendFactory;", "provideUiTestHeadersInterceptor", "Lokhttp3/Interceptor;", "provideContentfulStagingInterceptor", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class BackendModule {
    public static final BackendModule INSTANCE = new BackendModule();

    @UiTestInterceptor
    public final Interceptor provideUiTestHeadersInterceptor() {
        return null;
    }

    private BackendModule() {
    }

    public final Endpoint provideEndpoint(TargetBackend targetBackend) {
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        return targetBackend.getEndpoint();
    }

    public final TargetBackend provideTargetBackend(TargetBackendFactory targetBackendFactory) {
        Intrinsics.checkNotNullParameter(targetBackendFactory, "targetBackendFactory");
        return targetBackendFactory.getById(TargetBackend.EnumC41639Id.PROD);
    }

    @ContentfulStaging
    public final Interceptor provideContentfulStagingInterceptor() {
        return NoopInterceptor.INSTANCE;
    }
}
