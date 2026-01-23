package com.robinhood.android.feature.lib.sweep.interest;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.data.store.SweepsInterestStore;
import com.robinhood.librobinhood.data.store.SweepsTimelineSummaryStore;
import com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SweepInterestContextFactory_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/feature/lib/sweep/interest/SweepInterestContextFactory_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/feature/lib/sweep/interest/SweepInterestContextFactory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "sweepsInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "sweepsTimelineSummaryStore", "Lcom/robinhood/librobinhood/data/store/SweepsTimelineSummaryStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "sweepEnrollmentStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-lib-sweep-interest_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class SweepInterestContextFactory_Factory implements Factory<SweepInterestContextFactory> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountProvider> accountProvider;
    private final Provider<MinervaAccountStore> minervaAccountStore;
    private final Provider<PaymentTransferStore> paymentTransferStore;
    private final Provider<SweepEnrollmentStore> sweepEnrollmentStore;
    private final Provider<SweepsInterestStore> sweepsInterestStore;
    private final Provider<SweepsTimelineSummaryStore> sweepsTimelineSummaryStore;
    private final Provider<UnifiedAccountStore> unifiedAccountStore;

    @JvmStatic
    public static final SweepInterestContextFactory_Factory create(Provider<AccountProvider> provider, Provider<MinervaAccountStore> provider2, Provider<PaymentTransferStore> provider3, Provider<SweepsInterestStore> provider4, Provider<SweepsTimelineSummaryStore> provider5, Provider<UnifiedAccountStore> provider6, Provider<SweepEnrollmentStore> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final SweepInterestContextFactory newInstance(AccountProvider accountProvider, MinervaAccountStore minervaAccountStore, PaymentTransferStore paymentTransferStore, SweepsInterestStore sweepsInterestStore, SweepsTimelineSummaryStore sweepsTimelineSummaryStore, UnifiedAccountStore unifiedAccountStore, SweepEnrollmentStore sweepEnrollmentStore) {
        return INSTANCE.newInstance(accountProvider, minervaAccountStore, paymentTransferStore, sweepsInterestStore, sweepsTimelineSummaryStore, unifiedAccountStore, sweepEnrollmentStore);
    }

    public SweepInterestContextFactory_Factory(Provider<AccountProvider> accountProvider, Provider<MinervaAccountStore> minervaAccountStore, Provider<PaymentTransferStore> paymentTransferStore, Provider<SweepsInterestStore> sweepsInterestStore, Provider<SweepsTimelineSummaryStore> sweepsTimelineSummaryStore, Provider<UnifiedAccountStore> unifiedAccountStore, Provider<SweepEnrollmentStore> sweepEnrollmentStore) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
        Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
        Intrinsics.checkNotNullParameter(sweepsTimelineSummaryStore, "sweepsTimelineSummaryStore");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
        this.accountProvider = accountProvider;
        this.minervaAccountStore = minervaAccountStore;
        this.paymentTransferStore = paymentTransferStore;
        this.sweepsInterestStore = sweepsInterestStore;
        this.sweepsTimelineSummaryStore = sweepsTimelineSummaryStore;
        this.unifiedAccountStore = unifiedAccountStore;
        this.sweepEnrollmentStore = sweepEnrollmentStore;
    }

    @Override // javax.inject.Provider
    public SweepInterestContextFactory get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        MinervaAccountStore minervaAccountStore = this.minervaAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(minervaAccountStore, "get(...)");
        PaymentTransferStore paymentTransferStore = this.paymentTransferStore.get();
        Intrinsics.checkNotNullExpressionValue(paymentTransferStore, "get(...)");
        SweepsInterestStore sweepsInterestStore = this.sweepsInterestStore.get();
        Intrinsics.checkNotNullExpressionValue(sweepsInterestStore, "get(...)");
        SweepsTimelineSummaryStore sweepsTimelineSummaryStore = this.sweepsTimelineSummaryStore.get();
        Intrinsics.checkNotNullExpressionValue(sweepsTimelineSummaryStore, "get(...)");
        UnifiedAccountStore unifiedAccountStore = this.unifiedAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(unifiedAccountStore, "get(...)");
        SweepEnrollmentStore sweepEnrollmentStore = this.sweepEnrollmentStore.get();
        Intrinsics.checkNotNullExpressionValue(sweepEnrollmentStore, "get(...)");
        return companion.newInstance(accountProvider, minervaAccountStore, paymentTransferStore, sweepsInterestStore, sweepsTimelineSummaryStore, unifiedAccountStore, sweepEnrollmentStore);
    }

    /* compiled from: SweepInterestContextFactory_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/feature/lib/sweep/interest/SweepInterestContextFactory_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/feature/lib/sweep/interest/SweepInterestContextFactory_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "sweepsInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "sweepsTimelineSummaryStore", "Lcom/robinhood/librobinhood/data/store/SweepsTimelineSummaryStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "sweepEnrollmentStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "newInstance", "Lcom/robinhood/android/feature/lib/sweep/interest/SweepInterestContextFactory;", "feature-lib-sweep-interest_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SweepInterestContextFactory_Factory create(Provider<AccountProvider> accountProvider, Provider<MinervaAccountStore> minervaAccountStore, Provider<PaymentTransferStore> paymentTransferStore, Provider<SweepsInterestStore> sweepsInterestStore, Provider<SweepsTimelineSummaryStore> sweepsTimelineSummaryStore, Provider<UnifiedAccountStore> unifiedAccountStore, Provider<SweepEnrollmentStore> sweepEnrollmentStore) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
            Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
            Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
            Intrinsics.checkNotNullParameter(sweepsTimelineSummaryStore, "sweepsTimelineSummaryStore");
            Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
            Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
            return new SweepInterestContextFactory_Factory(accountProvider, minervaAccountStore, paymentTransferStore, sweepsInterestStore, sweepsTimelineSummaryStore, unifiedAccountStore, sweepEnrollmentStore);
        }

        @JvmStatic
        public final SweepInterestContextFactory newInstance(AccountProvider accountProvider, MinervaAccountStore minervaAccountStore, PaymentTransferStore paymentTransferStore, SweepsInterestStore sweepsInterestStore, SweepsTimelineSummaryStore sweepsTimelineSummaryStore, UnifiedAccountStore unifiedAccountStore, SweepEnrollmentStore sweepEnrollmentStore) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
            Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
            Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
            Intrinsics.checkNotNullParameter(sweepsTimelineSummaryStore, "sweepsTimelineSummaryStore");
            Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
            Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
            return new SweepInterestContextFactory(accountProvider, minervaAccountStore, paymentTransferStore, sweepsInterestStore, sweepsTimelineSummaryStore, unifiedAccountStore, sweepEnrollmentStore);
        }
    }
}
