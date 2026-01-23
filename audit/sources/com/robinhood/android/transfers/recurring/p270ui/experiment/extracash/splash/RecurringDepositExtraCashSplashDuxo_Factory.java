package com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.splash;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.gold.subscription.store.GoldSubscriptionStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.SweepsInterestStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringDepositExtraCashSplashDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/splash/RecurringDepositExtraCashSplashDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/splash/RecurringDepositExtraCashSplashDuxo;", "goldSubscriptionStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;", "sweepInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "stateProvider", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/splash/RecurringDepositExtraCashSplashStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class RecurringDepositExtraCashSplashDuxo_Factory implements Factory<RecurringDepositExtraCashSplashDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<GoldSubscriptionStore> goldSubscriptionStore;
    private final Provider<RecurringDepositExtraCashSplashStateProvider> stateProvider;
    private final Provider<SweepsInterestStore> sweepInterestStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final RecurringDepositExtraCashSplashDuxo_Factory create(Provider<GoldSubscriptionStore> provider, Provider<SweepsInterestStore> provider2, Provider<RecurringDepositExtraCashSplashStateProvider> provider3, Provider<DuxoBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final RecurringDepositExtraCashSplashDuxo newInstance(GoldSubscriptionStore goldSubscriptionStore, SweepsInterestStore sweepsInterestStore, RecurringDepositExtraCashSplashStateProvider recurringDepositExtraCashSplashStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(goldSubscriptionStore, sweepsInterestStore, recurringDepositExtraCashSplashStateProvider, duxoBundle);
    }

    public RecurringDepositExtraCashSplashDuxo_Factory(Provider<GoldSubscriptionStore> goldSubscriptionStore, Provider<SweepsInterestStore> sweepInterestStore, Provider<RecurringDepositExtraCashSplashStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(goldSubscriptionStore, "goldSubscriptionStore");
        Intrinsics.checkNotNullParameter(sweepInterestStore, "sweepInterestStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.goldSubscriptionStore = goldSubscriptionStore;
        this.sweepInterestStore = sweepInterestStore;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public RecurringDepositExtraCashSplashDuxo get() {
        Companion companion = INSTANCE;
        GoldSubscriptionStore goldSubscriptionStore = this.goldSubscriptionStore.get();
        Intrinsics.checkNotNullExpressionValue(goldSubscriptionStore, "get(...)");
        SweepsInterestStore sweepsInterestStore = this.sweepInterestStore.get();
        Intrinsics.checkNotNullExpressionValue(sweepsInterestStore, "get(...)");
        RecurringDepositExtraCashSplashStateProvider recurringDepositExtraCashSplashStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(recurringDepositExtraCashSplashStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(goldSubscriptionStore, sweepsInterestStore, recurringDepositExtraCashSplashStateProvider, duxoBundle);
    }

    /* compiled from: RecurringDepositExtraCashSplashDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/splash/RecurringDepositExtraCashSplashDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/splash/RecurringDepositExtraCashSplashDuxo_Factory;", "goldSubscriptionStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;", "sweepInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "stateProvider", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/splash/RecurringDepositExtraCashSplashStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/splash/RecurringDepositExtraCashSplashDuxo;", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RecurringDepositExtraCashSplashDuxo_Factory create(Provider<GoldSubscriptionStore> goldSubscriptionStore, Provider<SweepsInterestStore> sweepInterestStore, Provider<RecurringDepositExtraCashSplashStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(goldSubscriptionStore, "goldSubscriptionStore");
            Intrinsics.checkNotNullParameter(sweepInterestStore, "sweepInterestStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new RecurringDepositExtraCashSplashDuxo_Factory(goldSubscriptionStore, sweepInterestStore, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final RecurringDepositExtraCashSplashDuxo newInstance(GoldSubscriptionStore goldSubscriptionStore, SweepsInterestStore sweepInterestStore, RecurringDepositExtraCashSplashStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(goldSubscriptionStore, "goldSubscriptionStore");
            Intrinsics.checkNotNullParameter(sweepInterestStore, "sweepInterestStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new RecurringDepositExtraCashSplashDuxo(goldSubscriptionStore, sweepInterestStore, stateProvider, duxoBundle);
        }
    }
}
