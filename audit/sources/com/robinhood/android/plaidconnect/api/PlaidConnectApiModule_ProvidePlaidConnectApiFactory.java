package com.robinhood.android.plaidconnect.api;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* compiled from: PlaidConnectApiModule_ProvidePlaidConnectApiFactory.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\"\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0011\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0006¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/plaidconnect/api/PlaidConnectApiModule_ProvidePlaidConnectApiFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/plaidconnect/api/PlaidConnectApi;", "module", "Lcom/robinhood/android/plaidconnect/api/PlaidConnectApiModule;", "retrofit", "Ljavax/inject/Provider;", "Lretrofit2/Retrofit;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Lcom/robinhood/android/plaidconnect/api/PlaidConnectApiModule;Ljavax/inject/Provider;)V", "get", "Companion", "lib-api-plaidconnect_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PlaidConnectApiModule_ProvidePlaidConnectApiFactory implements Factory<PlaidConnectApi> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final PlaidConnectApiModule module;
    private final Provider<Retrofit> retrofit;

    @JvmStatic
    public static final PlaidConnectApiModule_ProvidePlaidConnectApiFactory create(PlaidConnectApiModule plaidConnectApiModule, Provider<Retrofit> provider) {
        return INSTANCE.create(plaidConnectApiModule, provider);
    }

    @JvmStatic
    public static final PlaidConnectApi providePlaidConnectApi(PlaidConnectApiModule plaidConnectApiModule, Lazy<Retrofit> lazy) {
        return INSTANCE.providePlaidConnectApi(plaidConnectApiModule, lazy);
    }

    public PlaidConnectApiModule_ProvidePlaidConnectApiFactory(PlaidConnectApiModule module, Provider<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.module = module;
        this.retrofit = retrofit;
    }

    @Override // javax.inject.Provider
    public PlaidConnectApi get() {
        Companion companion = INSTANCE;
        PlaidConnectApiModule plaidConnectApiModule = this.module;
        Lazy<Retrofit> lazy = DoubleCheck.lazy(this.retrofit);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        return companion.providePlaidConnectApi(plaidConnectApiModule, lazy);
    }

    /* compiled from: PlaidConnectApiModule_ProvidePlaidConnectApiFactory.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\tH\u0007J#\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\u000eH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/plaidconnect/api/PlaidConnectApiModule_ProvidePlaidConnectApiFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/plaidconnect/api/PlaidConnectApiModule_ProvidePlaidConnectApiFactory;", "module", "Lcom/robinhood/android/plaidconnect/api/PlaidConnectApiModule;", "retrofit", "Ljavax/inject/Provider;", "Lretrofit2/Retrofit;", "Lkotlin/jvm/JvmSuppressWildcards;", "providePlaidConnectApi", "Lcom/robinhood/android/plaidconnect/api/PlaidConnectApi;", "Ldagger/Lazy;", "lib-api-plaidconnect_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PlaidConnectApiModule_ProvidePlaidConnectApiFactory create(PlaidConnectApiModule module, Provider<Retrofit> retrofit) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            return new PlaidConnectApiModule_ProvidePlaidConnectApiFactory(module, retrofit);
        }

        @JvmStatic
        public final PlaidConnectApi providePlaidConnectApi(PlaidConnectApiModule module, Lazy<Retrofit> retrofit) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Object objCheckNotNull = Preconditions.checkNotNull(module.providePlaidConnectApi(retrofit), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (PlaidConnectApi) objCheckNotNull;
        }
    }
}
