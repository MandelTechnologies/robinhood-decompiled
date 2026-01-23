package com.robinhood.android.common.recurring.upsell;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore;
import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.LongSetPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityRecurringOrderUpsellManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/upsell/EquityRecurringOrderUpsellManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/recurring/upsell/EquityRecurringOrderUpsellManager;", "investmentScheduleStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "equityRecurringOrderUpsellTimestampsPref", "Lcom/robinhood/prefs/LongSetPreference;", "equityRecurringOrderUpsellViewCountPref", "Lcom/robinhood/prefs/IntPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class EquityRecurringOrderUpsellManager_Factory implements Factory<EquityRecurringOrderUpsellManager> {
    private final Provider<LongSetPreference> equityRecurringOrderUpsellTimestampsPref;
    private final Provider<IntPreference> equityRecurringOrderUpsellViewCountPref;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<TraderInvestmentScheduleStore> investmentScheduleStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final EquityRecurringOrderUpsellManager_Factory create(Provider<TraderInvestmentScheduleStore> provider, Provider<ExperimentsStore> provider2, Provider<LongSetPreference> provider3, Provider<IntPreference> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final EquityRecurringOrderUpsellManager newInstance(TraderInvestmentScheduleStore traderInvestmentScheduleStore, ExperimentsStore experimentsStore, LongSetPreference longSetPreference, IntPreference intPreference) {
        return INSTANCE.newInstance(traderInvestmentScheduleStore, experimentsStore, longSetPreference, intPreference);
    }

    public EquityRecurringOrderUpsellManager_Factory(Provider<TraderInvestmentScheduleStore> investmentScheduleStore, Provider<ExperimentsStore> experimentsStore, Provider<LongSetPreference> equityRecurringOrderUpsellTimestampsPref, Provider<IntPreference> equityRecurringOrderUpsellViewCountPref) {
        Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(equityRecurringOrderUpsellTimestampsPref, "equityRecurringOrderUpsellTimestampsPref");
        Intrinsics.checkNotNullParameter(equityRecurringOrderUpsellViewCountPref, "equityRecurringOrderUpsellViewCountPref");
        this.investmentScheduleStore = investmentScheduleStore;
        this.experimentsStore = experimentsStore;
        this.equityRecurringOrderUpsellTimestampsPref = equityRecurringOrderUpsellTimestampsPref;
        this.equityRecurringOrderUpsellViewCountPref = equityRecurringOrderUpsellViewCountPref;
    }

    @Override // javax.inject.Provider
    public EquityRecurringOrderUpsellManager get() {
        Companion companion = INSTANCE;
        TraderInvestmentScheduleStore traderInvestmentScheduleStore = this.investmentScheduleStore.get();
        Intrinsics.checkNotNullExpressionValue(traderInvestmentScheduleStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        LongSetPreference longSetPreference = this.equityRecurringOrderUpsellTimestampsPref.get();
        Intrinsics.checkNotNullExpressionValue(longSetPreference, "get(...)");
        IntPreference intPreference = this.equityRecurringOrderUpsellViewCountPref.get();
        Intrinsics.checkNotNullExpressionValue(intPreference, "get(...)");
        return companion.newInstance(traderInvestmentScheduleStore, experimentsStore, longSetPreference, intPreference);
    }

    /* compiled from: EquityRecurringOrderUpsellManager_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/upsell/EquityRecurringOrderUpsellManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/common/recurring/upsell/EquityRecurringOrderUpsellManager_Factory;", "investmentScheduleStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "equityRecurringOrderUpsellTimestampsPref", "Lcom/robinhood/prefs/LongSetPreference;", "equityRecurringOrderUpsellViewCountPref", "Lcom/robinhood/prefs/IntPreference;", "newInstance", "Lcom/robinhood/android/common/recurring/upsell/EquityRecurringOrderUpsellManager;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EquityRecurringOrderUpsellManager_Factory create(Provider<TraderInvestmentScheduleStore> investmentScheduleStore, Provider<ExperimentsStore> experimentsStore, Provider<LongSetPreference> equityRecurringOrderUpsellTimestampsPref, Provider<IntPreference> equityRecurringOrderUpsellViewCountPref) {
            Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(equityRecurringOrderUpsellTimestampsPref, "equityRecurringOrderUpsellTimestampsPref");
            Intrinsics.checkNotNullParameter(equityRecurringOrderUpsellViewCountPref, "equityRecurringOrderUpsellViewCountPref");
            return new EquityRecurringOrderUpsellManager_Factory(investmentScheduleStore, experimentsStore, equityRecurringOrderUpsellTimestampsPref, equityRecurringOrderUpsellViewCountPref);
        }

        @JvmStatic
        public final EquityRecurringOrderUpsellManager newInstance(TraderInvestmentScheduleStore investmentScheduleStore, ExperimentsStore experimentsStore, LongSetPreference equityRecurringOrderUpsellTimestampsPref, IntPreference equityRecurringOrderUpsellViewCountPref) {
            Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(equityRecurringOrderUpsellTimestampsPref, "equityRecurringOrderUpsellTimestampsPref");
            Intrinsics.checkNotNullParameter(equityRecurringOrderUpsellViewCountPref, "equityRecurringOrderUpsellViewCountPref");
            return new EquityRecurringOrderUpsellManager(investmentScheduleStore, experimentsStore, equityRecurringOrderUpsellTimestampsPref, equityRecurringOrderUpsellViewCountPref);
        }
    }
}
