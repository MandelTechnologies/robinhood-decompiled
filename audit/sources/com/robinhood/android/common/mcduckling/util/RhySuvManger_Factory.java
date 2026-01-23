package com.robinhood.android.common.mcduckling.util;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.stepupverification.SuvMigrationManager;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.store.PaymentCardStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhySuvManger_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/util/RhySuvManger_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/mcduckling/util/RhySuvManger;", "googlePayManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "suvMigrationManager", "Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RhySuvManger_Factory implements Factory<RhySuvManger> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<GooglePayManager> googlePayManager;
    private final Provider<PaymentCardStore> paymentCardStore;
    private final Provider<RxFactory> rxFactory;
    private final Provider<SuvMigrationManager> suvMigrationManager;

    @JvmStatic
    public static final RhySuvManger_Factory create(Provider<GooglePayManager> provider, Provider<PaymentCardStore> provider2, Provider<SuvMigrationManager> provider3, Provider<RxFactory> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final RhySuvManger newInstance(GooglePayManager googlePayManager, PaymentCardStore paymentCardStore, SuvMigrationManager suvMigrationManager, RxFactory rxFactory) {
        return INSTANCE.newInstance(googlePayManager, paymentCardStore, suvMigrationManager, rxFactory);
    }

    public RhySuvManger_Factory(Provider<GooglePayManager> googlePayManager, Provider<PaymentCardStore> paymentCardStore, Provider<SuvMigrationManager> suvMigrationManager, Provider<RxFactory> rxFactory) {
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
        Intrinsics.checkNotNullParameter(suvMigrationManager, "suvMigrationManager");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        this.googlePayManager = googlePayManager;
        this.paymentCardStore = paymentCardStore;
        this.suvMigrationManager = suvMigrationManager;
        this.rxFactory = rxFactory;
    }

    @Override // javax.inject.Provider
    public RhySuvManger get() {
        Companion companion = INSTANCE;
        GooglePayManager googlePayManager = this.googlePayManager.get();
        Intrinsics.checkNotNullExpressionValue(googlePayManager, "get(...)");
        PaymentCardStore paymentCardStore = this.paymentCardStore.get();
        Intrinsics.checkNotNullExpressionValue(paymentCardStore, "get(...)");
        SuvMigrationManager suvMigrationManager = this.suvMigrationManager.get();
        Intrinsics.checkNotNullExpressionValue(suvMigrationManager, "get(...)");
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        return companion.newInstance(googlePayManager, paymentCardStore, suvMigrationManager, rxFactory);
    }

    /* compiled from: RhySuvManger_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/util/RhySuvManger_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/common/mcduckling/util/RhySuvManger_Factory;", "googlePayManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "suvMigrationManager", "Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "newInstance", "Lcom/robinhood/android/common/mcduckling/util/RhySuvManger;", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RhySuvManger_Factory create(Provider<GooglePayManager> googlePayManager, Provider<PaymentCardStore> paymentCardStore, Provider<SuvMigrationManager> suvMigrationManager, Provider<RxFactory> rxFactory) {
            Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
            Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
            Intrinsics.checkNotNullParameter(suvMigrationManager, "suvMigrationManager");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            return new RhySuvManger_Factory(googlePayManager, paymentCardStore, suvMigrationManager, rxFactory);
        }

        @JvmStatic
        public final RhySuvManger newInstance(GooglePayManager googlePayManager, PaymentCardStore paymentCardStore, SuvMigrationManager suvMigrationManager, RxFactory rxFactory) {
            Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
            Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
            Intrinsics.checkNotNullParameter(suvMigrationManager, "suvMigrationManager");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            return new RhySuvManger(googlePayManager, paymentCardStore, suvMigrationManager, rxFactory);
        }
    }
}
