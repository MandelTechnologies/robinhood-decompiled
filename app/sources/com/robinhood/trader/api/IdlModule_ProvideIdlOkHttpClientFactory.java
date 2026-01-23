package com.robinhood.trader.api;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.idl.IdlContractProtectedInterceptor;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* compiled from: IdlModule_ProvideIdlOkHttpClientFactory.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/trader/api/IdlModule_ProvideIdlOkHttpClientFactory;", "Ldagger/internal/Factory;", "Lokhttp3/OkHttpClient;", "module", "Lcom/robinhood/trader/api/IdlModule;", "okHttpClient", "Ljavax/inject/Provider;", "idlContractProtectedInterceptor", "Lcom/robinhood/idl/IdlContractProtectedInterceptor;", "<init>", "(Lcom/robinhood/trader/api/IdlModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class IdlModule_ProvideIdlOkHttpClientFactory implements Factory<OkHttpClient> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<IdlContractProtectedInterceptor> idlContractProtectedInterceptor;
    private final IdlModule module;
    private final Provider<OkHttpClient> okHttpClient;

    @JvmStatic
    public static final IdlModule_ProvideIdlOkHttpClientFactory create(IdlModule idlModule, Provider<OkHttpClient> provider, Provider<IdlContractProtectedInterceptor> provider2) {
        return INSTANCE.create(idlModule, provider, provider2);
    }

    @JvmStatic
    public static final OkHttpClient provideIdlOkHttpClient(IdlModule idlModule, OkHttpClient okHttpClient, IdlContractProtectedInterceptor idlContractProtectedInterceptor) {
        return INSTANCE.provideIdlOkHttpClient(idlModule, okHttpClient, idlContractProtectedInterceptor);
    }

    public IdlModule_ProvideIdlOkHttpClientFactory(IdlModule module, Provider<OkHttpClient> okHttpClient, Provider<IdlContractProtectedInterceptor> idlContractProtectedInterceptor) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(idlContractProtectedInterceptor, "idlContractProtectedInterceptor");
        this.module = module;
        this.okHttpClient = okHttpClient;
        this.idlContractProtectedInterceptor = idlContractProtectedInterceptor;
    }

    @Override // javax.inject.Provider
    public OkHttpClient get() {
        Companion companion = INSTANCE;
        IdlModule idlModule = this.module;
        OkHttpClient okHttpClient = this.okHttpClient.get();
        Intrinsics.checkNotNullExpressionValue(okHttpClient, "get(...)");
        IdlContractProtectedInterceptor idlContractProtectedInterceptor = this.idlContractProtectedInterceptor.get();
        Intrinsics.checkNotNullExpressionValue(idlContractProtectedInterceptor, "get(...)");
        return companion.provideIdlOkHttpClient(idlModule, okHttpClient, idlContractProtectedInterceptor);
    }

    /* compiled from: IdlModule_ProvideIdlOkHttpClientFactory.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0007J \u0010\r\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/trader/api/IdlModule_ProvideIdlOkHttpClientFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/trader/api/IdlModule_ProvideIdlOkHttpClientFactory;", "module", "Lcom/robinhood/trader/api/IdlModule;", "okHttpClient", "Ljavax/inject/Provider;", "Lokhttp3/OkHttpClient;", "idlContractProtectedInterceptor", "Lcom/robinhood/idl/IdlContractProtectedInterceptor;", "provideIdlOkHttpClient", "lib-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IdlModule_ProvideIdlOkHttpClientFactory create(IdlModule module, Provider<OkHttpClient> okHttpClient, Provider<IdlContractProtectedInterceptor> idlContractProtectedInterceptor) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Intrinsics.checkNotNullParameter(idlContractProtectedInterceptor, "idlContractProtectedInterceptor");
            return new IdlModule_ProvideIdlOkHttpClientFactory(module, okHttpClient, idlContractProtectedInterceptor);
        }

        @JvmStatic
        public final OkHttpClient provideIdlOkHttpClient(IdlModule module, OkHttpClient okHttpClient, IdlContractProtectedInterceptor idlContractProtectedInterceptor) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Intrinsics.checkNotNullParameter(idlContractProtectedInterceptor, "idlContractProtectedInterceptor");
            Object objCheckNotNull = Preconditions.checkNotNull(module.provideIdlOkHttpClient(okHttpClient, idlContractProtectedInterceptor), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (OkHttpClient) objCheckNotNull;
        }
    }
}
