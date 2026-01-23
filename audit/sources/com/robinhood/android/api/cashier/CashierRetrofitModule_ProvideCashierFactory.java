package com.robinhood.android.api.cashier;

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

/* compiled from: CashierRetrofitModule_ProvideCashierFactory.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\"\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0011\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0006¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/api/cashier/CashierRetrofitModule_ProvideCashierFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/api/cashier/Cashier;", "module", "Lcom/robinhood/android/api/cashier/CashierRetrofitModule;", "retrofit", "Ljavax/inject/Provider;", "Lretrofit2/Retrofit;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Lcom/robinhood/android/api/cashier/CashierRetrofitModule;Ljavax/inject/Provider;)V", "get", "Companion", "lib-api-cashier_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CashierRetrofitModule_ProvideCashierFactory implements Factory<Cashier> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final CashierRetrofitModule module;
    private final Provider<Retrofit> retrofit;

    @JvmStatic
    public static final CashierRetrofitModule_ProvideCashierFactory create(CashierRetrofitModule cashierRetrofitModule, Provider<Retrofit> provider) {
        return INSTANCE.create(cashierRetrofitModule, provider);
    }

    @JvmStatic
    public static final Cashier provideCashier(CashierRetrofitModule cashierRetrofitModule, Lazy<Retrofit> lazy) {
        return INSTANCE.provideCashier(cashierRetrofitModule, lazy);
    }

    public CashierRetrofitModule_ProvideCashierFactory(CashierRetrofitModule module, Provider<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.module = module;
        this.retrofit = retrofit;
    }

    @Override // javax.inject.Provider
    public Cashier get() {
        Companion companion = INSTANCE;
        CashierRetrofitModule cashierRetrofitModule = this.module;
        Lazy<Retrofit> lazy = DoubleCheck.lazy(this.retrofit);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        return companion.provideCashier(cashierRetrofitModule, lazy);
    }

    /* compiled from: CashierRetrofitModule_ProvideCashierFactory.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\tH\u0007J#\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\u000eH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/api/cashier/CashierRetrofitModule_ProvideCashierFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/api/cashier/CashierRetrofitModule_ProvideCashierFactory;", "module", "Lcom/robinhood/android/api/cashier/CashierRetrofitModule;", "retrofit", "Ljavax/inject/Provider;", "Lretrofit2/Retrofit;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideCashier", "Lcom/robinhood/android/api/cashier/Cashier;", "Ldagger/Lazy;", "lib-api-cashier_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CashierRetrofitModule_ProvideCashierFactory create(CashierRetrofitModule module, Provider<Retrofit> retrofit) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            return new CashierRetrofitModule_ProvideCashierFactory(module, retrofit);
        }

        @JvmStatic
        public final Cashier provideCashier(CashierRetrofitModule module, Lazy<Retrofit> retrofit) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Object objCheckNotNull = Preconditions.checkNotNull(module.provideCashier(retrofit), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Cashier) objCheckNotNull;
        }
    }
}
