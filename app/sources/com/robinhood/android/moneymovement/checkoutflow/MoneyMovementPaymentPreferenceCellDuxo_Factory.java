package com.robinhood.android.moneymovement.checkoutflow;

import bff_money_movement.service.p019v1.BffMoneyMovementService;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.PackagePreloader;

/* compiled from: MoneyMovementPaymentPreferenceCellDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/moneymovement/checkoutflow/MoneyMovementPaymentPreferenceCellDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/moneymovement/checkoutflow/MoneyMovementPaymentPreferenceCellDuxo;", "transferAccountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "bffMoneyMovementService", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "microgramPackagePreloader", "Lmicrogram/android/PackagePreloader;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-money-movements-checkout-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class MoneyMovementPaymentPreferenceCellDuxo_Factory implements Factory<MoneyMovementPaymentPreferenceCellDuxo> {
    private final Provider<BffMoneyMovementService> bffMoneyMovementService;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<PackagePreloader> microgramPackagePreloader;
    private final Provider<TransferAccountStore> transferAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MoneyMovementPaymentPreferenceCellDuxo_Factory create(Provider<TransferAccountStore> provider, Provider<BffMoneyMovementService> provider2, Provider<PackagePreloader> provider3, Provider<EventLogger> provider4, Provider<DuxoBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final MoneyMovementPaymentPreferenceCellDuxo newInstance(TransferAccountStore transferAccountStore, BffMoneyMovementService bffMoneyMovementService, PackagePreloader packagePreloader, EventLogger eventLogger, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(transferAccountStore, bffMoneyMovementService, packagePreloader, eventLogger, duxoBundle);
    }

    public MoneyMovementPaymentPreferenceCellDuxo_Factory(Provider<TransferAccountStore> transferAccountStore, Provider<BffMoneyMovementService> bffMoneyMovementService, Provider<PackagePreloader> microgramPackagePreloader, Provider<EventLogger> eventLogger, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
        Intrinsics.checkNotNullParameter(microgramPackagePreloader, "microgramPackagePreloader");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.transferAccountStore = transferAccountStore;
        this.bffMoneyMovementService = bffMoneyMovementService;
        this.microgramPackagePreloader = microgramPackagePreloader;
        this.eventLogger = eventLogger;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public MoneyMovementPaymentPreferenceCellDuxo get() {
        Companion companion = INSTANCE;
        TransferAccountStore transferAccountStore = this.transferAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(transferAccountStore, "get(...)");
        BffMoneyMovementService bffMoneyMovementService = this.bffMoneyMovementService.get();
        Intrinsics.checkNotNullExpressionValue(bffMoneyMovementService, "get(...)");
        PackagePreloader packagePreloader = this.microgramPackagePreloader.get();
        Intrinsics.checkNotNullExpressionValue(packagePreloader, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(transferAccountStore, bffMoneyMovementService, packagePreloader, eventLogger, duxoBundle);
    }

    /* compiled from: MoneyMovementPaymentPreferenceCellDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/moneymovement/checkoutflow/MoneyMovementPaymentPreferenceCellDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/moneymovement/checkoutflow/MoneyMovementPaymentPreferenceCellDuxo_Factory;", "transferAccountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "bffMoneyMovementService", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "microgramPackagePreloader", "Lmicrogram/android/PackagePreloader;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/moneymovement/checkoutflow/MoneyMovementPaymentPreferenceCellDuxo;", "lib-money-movements-checkout-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MoneyMovementPaymentPreferenceCellDuxo_Factory create(Provider<TransferAccountStore> transferAccountStore, Provider<BffMoneyMovementService> bffMoneyMovementService, Provider<PackagePreloader> microgramPackagePreloader, Provider<EventLogger> eventLogger, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
            Intrinsics.checkNotNullParameter(microgramPackagePreloader, "microgramPackagePreloader");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new MoneyMovementPaymentPreferenceCellDuxo_Factory(transferAccountStore, bffMoneyMovementService, microgramPackagePreloader, eventLogger, duxoBundle);
        }

        @JvmStatic
        public final MoneyMovementPaymentPreferenceCellDuxo newInstance(TransferAccountStore transferAccountStore, BffMoneyMovementService bffMoneyMovementService, PackagePreloader microgramPackagePreloader, EventLogger eventLogger, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
            Intrinsics.checkNotNullParameter(microgramPackagePreloader, "microgramPackagePreloader");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new MoneyMovementPaymentPreferenceCellDuxo(transferAccountStore, bffMoneyMovementService, microgramPackagePreloader, eventLogger, duxoBundle);
        }
    }
}
