package com.robinhood.android.transfers.p271ui.max.upsell;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.gold.boost.maxawareness.GoldDepositBoostMaxAwarenessStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.SweepsStatusStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringFrequencyUpsellDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellDuxo;", "sweepsStatusStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/SweepsStatusStore;", "goldDepositBoostMaxAwarenessStore", "Lcom/robinhood/android/gold/boost/maxawareness/GoldDepositBoostMaxAwarenessStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RecurringFrequencyUpsellDuxo_Factory implements Factory<RecurringFrequencyUpsellDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<GoldDepositBoostMaxAwarenessStore> goldDepositBoostMaxAwarenessStore;
    private final Provider<SweepsStatusStore> sweepsStatusStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final RecurringFrequencyUpsellDuxo_Factory create(Provider<SweepsStatusStore> provider, Provider<GoldDepositBoostMaxAwarenessStore> provider2, Provider<DuxoBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final RecurringFrequencyUpsellDuxo newInstance(SweepsStatusStore sweepsStatusStore, GoldDepositBoostMaxAwarenessStore goldDepositBoostMaxAwarenessStore, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(sweepsStatusStore, goldDepositBoostMaxAwarenessStore, duxoBundle);
    }

    public RecurringFrequencyUpsellDuxo_Factory(Provider<SweepsStatusStore> sweepsStatusStore, Provider<GoldDepositBoostMaxAwarenessStore> goldDepositBoostMaxAwarenessStore, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(sweepsStatusStore, "sweepsStatusStore");
        Intrinsics.checkNotNullParameter(goldDepositBoostMaxAwarenessStore, "goldDepositBoostMaxAwarenessStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.sweepsStatusStore = sweepsStatusStore;
        this.goldDepositBoostMaxAwarenessStore = goldDepositBoostMaxAwarenessStore;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public RecurringFrequencyUpsellDuxo get() {
        Companion companion = INSTANCE;
        SweepsStatusStore sweepsStatusStore = this.sweepsStatusStore.get();
        Intrinsics.checkNotNullExpressionValue(sweepsStatusStore, "get(...)");
        GoldDepositBoostMaxAwarenessStore goldDepositBoostMaxAwarenessStore = this.goldDepositBoostMaxAwarenessStore.get();
        Intrinsics.checkNotNullExpressionValue(goldDepositBoostMaxAwarenessStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(sweepsStatusStore, goldDepositBoostMaxAwarenessStore, duxoBundle);
    }

    /* compiled from: RecurringFrequencyUpsellDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellDuxo_Factory;", "sweepsStatusStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/SweepsStatusStore;", "goldDepositBoostMaxAwarenessStore", "Lcom/robinhood/android/gold/boost/maxawareness/GoldDepositBoostMaxAwarenessStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellDuxo;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RecurringFrequencyUpsellDuxo_Factory create(Provider<SweepsStatusStore> sweepsStatusStore, Provider<GoldDepositBoostMaxAwarenessStore> goldDepositBoostMaxAwarenessStore, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(sweepsStatusStore, "sweepsStatusStore");
            Intrinsics.checkNotNullParameter(goldDepositBoostMaxAwarenessStore, "goldDepositBoostMaxAwarenessStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new RecurringFrequencyUpsellDuxo_Factory(sweepsStatusStore, goldDepositBoostMaxAwarenessStore, duxoBundle);
        }

        @JvmStatic
        public final RecurringFrequencyUpsellDuxo newInstance(SweepsStatusStore sweepsStatusStore, GoldDepositBoostMaxAwarenessStore goldDepositBoostMaxAwarenessStore, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(sweepsStatusStore, "sweepsStatusStore");
            Intrinsics.checkNotNullParameter(goldDepositBoostMaxAwarenessStore, "goldDepositBoostMaxAwarenessStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new RecurringFrequencyUpsellDuxo(sweepsStatusStore, goldDepositBoostMaxAwarenessStore, duxoBundle);
        }
    }
}
