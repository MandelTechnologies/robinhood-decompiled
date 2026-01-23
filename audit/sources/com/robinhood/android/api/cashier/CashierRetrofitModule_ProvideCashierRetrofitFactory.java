package com.robinhood.android.api.cashier;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.targetbackend.Endpoint;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* compiled from: CashierRetrofitModule_ProvideCashierRetrofitFactory.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/api/cashier/CashierRetrofitModule_ProvideCashierRetrofitFactory;", "Ldagger/internal/Factory;", "Lretrofit2/Retrofit;", "module", "Lcom/robinhood/android/api/cashier/CashierRetrofitModule;", "retrofit", "Ljavax/inject/Provider;", "endpoint", "Lcom/robinhood/targetbackend/Endpoint;", "<init>", "(Lcom/robinhood/android/api/cashier/CashierRetrofitModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-api-cashier_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CashierRetrofitModule_ProvideCashierRetrofitFactory implements Factory<Retrofit> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Endpoint> endpoint;
    private final CashierRetrofitModule module;
    private final Provider<Retrofit> retrofit;

    @JvmStatic
    public static final CashierRetrofitModule_ProvideCashierRetrofitFactory create(CashierRetrofitModule cashierRetrofitModule, Provider<Retrofit> provider, Provider<Endpoint> provider2) {
        return INSTANCE.create(cashierRetrofitModule, provider, provider2);
    }

    @JvmStatic
    public static final Retrofit provideCashierRetrofit(CashierRetrofitModule cashierRetrofitModule, Retrofit retrofit, Endpoint endpoint) {
        return INSTANCE.provideCashierRetrofit(cashierRetrofitModule, retrofit, endpoint);
    }

    public CashierRetrofitModule_ProvideCashierRetrofitFactory(CashierRetrofitModule module, Provider<Retrofit> retrofit, Provider<Endpoint> endpoint) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        this.module = module;
        this.retrofit = retrofit;
        this.endpoint = endpoint;
    }

    @Override // javax.inject.Provider
    public Retrofit get() {
        Companion companion = INSTANCE;
        CashierRetrofitModule cashierRetrofitModule = this.module;
        Retrofit retrofit = this.retrofit.get();
        Intrinsics.checkNotNullExpressionValue(retrofit, "get(...)");
        Endpoint endpoint = this.endpoint.get();
        Intrinsics.checkNotNullExpressionValue(endpoint, "get(...)");
        return companion.provideCashierRetrofit(cashierRetrofitModule, retrofit, endpoint);
    }

    /* compiled from: CashierRetrofitModule_ProvideCashierRetrofitFactory.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0007J \u0010\r\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/api/cashier/CashierRetrofitModule_ProvideCashierRetrofitFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/api/cashier/CashierRetrofitModule_ProvideCashierRetrofitFactory;", "module", "Lcom/robinhood/android/api/cashier/CashierRetrofitModule;", "retrofit", "Ljavax/inject/Provider;", "Lretrofit2/Retrofit;", "endpoint", "Lcom/robinhood/targetbackend/Endpoint;", "provideCashierRetrofit", "lib-api-cashier_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CashierRetrofitModule_ProvideCashierRetrofitFactory create(CashierRetrofitModule module, Provider<Retrofit> retrofit, Provider<Endpoint> endpoint) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            return new CashierRetrofitModule_ProvideCashierRetrofitFactory(module, retrofit, endpoint);
        }

        @JvmStatic
        public final Retrofit provideCashierRetrofit(CashierRetrofitModule module, Retrofit retrofit, Endpoint endpoint) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            Object objCheckNotNull = Preconditions.checkNotNull(module.provideCashierRetrofit(retrofit, endpoint), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Retrofit) objCheckNotNull;
        }
    }
}
