package com.robinhood.android.margin.upgrade.rates;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.lib.margin.MarginEligibilityStore;
import com.robinhood.android.lib.margin.MarginInvestingInfoStore;
import com.robinhood.android.lib.margin.MarginTieredRatesStore;
import com.robinhood.android.udf.DuxoBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginUpgradeRatesDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesDuxo;", "marginEligibilityStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/margin/MarginEligibilityStore;", "leveredMarginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "marginTieredRatesStore", "Lcom/robinhood/android/lib/margin/MarginTieredRatesStore;", "marginInvestingInfoStore", "Lcom/robinhood/android/lib/margin/MarginInvestingInfoStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class MarginUpgradeRatesDuxo_Factory implements Factory<MarginUpgradeRatesDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<LeveredMarginSettingsStore> leveredMarginSettingsStore;
    private final Provider<MarginEligibilityStore> marginEligibilityStore;
    private final Provider<MarginInvestingInfoStore> marginInvestingInfoStore;
    private final Provider<MarginTieredRatesStore> marginTieredRatesStore;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MarginUpgradeRatesDuxo_Factory create(Provider<MarginEligibilityStore> provider, Provider<LeveredMarginSettingsStore> provider2, Provider<MarginTieredRatesStore> provider3, Provider<MarginInvestingInfoStore> provider4, Provider<DuxoBundle> provider5, Provider<SavedStateHandle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final MarginUpgradeRatesDuxo newInstance(MarginEligibilityStore marginEligibilityStore, LeveredMarginSettingsStore leveredMarginSettingsStore, MarginTieredRatesStore marginTieredRatesStore, MarginInvestingInfoStore marginInvestingInfoStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(marginEligibilityStore, leveredMarginSettingsStore, marginTieredRatesStore, marginInvestingInfoStore, duxoBundle, savedStateHandle);
    }

    public MarginUpgradeRatesDuxo_Factory(Provider<MarginEligibilityStore> marginEligibilityStore, Provider<LeveredMarginSettingsStore> leveredMarginSettingsStore, Provider<MarginTieredRatesStore> marginTieredRatesStore, Provider<MarginInvestingInfoStore> marginInvestingInfoStore, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(marginEligibilityStore, "marginEligibilityStore");
        Intrinsics.checkNotNullParameter(leveredMarginSettingsStore, "leveredMarginSettingsStore");
        Intrinsics.checkNotNullParameter(marginTieredRatesStore, "marginTieredRatesStore");
        Intrinsics.checkNotNullParameter(marginInvestingInfoStore, "marginInvestingInfoStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.marginEligibilityStore = marginEligibilityStore;
        this.leveredMarginSettingsStore = leveredMarginSettingsStore;
        this.marginTieredRatesStore = marginTieredRatesStore;
        this.marginInvestingInfoStore = marginInvestingInfoStore;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public MarginUpgradeRatesDuxo get() {
        Companion companion = INSTANCE;
        MarginEligibilityStore marginEligibilityStore = this.marginEligibilityStore.get();
        Intrinsics.checkNotNullExpressionValue(marginEligibilityStore, "get(...)");
        LeveredMarginSettingsStore leveredMarginSettingsStore = this.leveredMarginSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(leveredMarginSettingsStore, "get(...)");
        MarginTieredRatesStore marginTieredRatesStore = this.marginTieredRatesStore.get();
        Intrinsics.checkNotNullExpressionValue(marginTieredRatesStore, "get(...)");
        MarginInvestingInfoStore marginInvestingInfoStore = this.marginInvestingInfoStore.get();
        Intrinsics.checkNotNullExpressionValue(marginInvestingInfoStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(marginEligibilityStore, leveredMarginSettingsStore, marginTieredRatesStore, marginInvestingInfoStore, duxoBundle, savedStateHandle);
    }

    /* compiled from: MarginUpgradeRatesDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesDuxo_Factory;", "marginEligibilityStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/margin/MarginEligibilityStore;", "leveredMarginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "marginTieredRatesStore", "Lcom/robinhood/android/lib/margin/MarginTieredRatesStore;", "marginInvestingInfoStore", "Lcom/robinhood/android/lib/margin/MarginInvestingInfoStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesDuxo;", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MarginUpgradeRatesDuxo_Factory create(Provider<MarginEligibilityStore> marginEligibilityStore, Provider<LeveredMarginSettingsStore> leveredMarginSettingsStore, Provider<MarginTieredRatesStore> marginTieredRatesStore, Provider<MarginInvestingInfoStore> marginInvestingInfoStore, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(marginEligibilityStore, "marginEligibilityStore");
            Intrinsics.checkNotNullParameter(leveredMarginSettingsStore, "leveredMarginSettingsStore");
            Intrinsics.checkNotNullParameter(marginTieredRatesStore, "marginTieredRatesStore");
            Intrinsics.checkNotNullParameter(marginInvestingInfoStore, "marginInvestingInfoStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new MarginUpgradeRatesDuxo_Factory(marginEligibilityStore, leveredMarginSettingsStore, marginTieredRatesStore, marginInvestingInfoStore, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final MarginUpgradeRatesDuxo newInstance(MarginEligibilityStore marginEligibilityStore, LeveredMarginSettingsStore leveredMarginSettingsStore, MarginTieredRatesStore marginTieredRatesStore, MarginInvestingInfoStore marginInvestingInfoStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(marginEligibilityStore, "marginEligibilityStore");
            Intrinsics.checkNotNullParameter(leveredMarginSettingsStore, "leveredMarginSettingsStore");
            Intrinsics.checkNotNullParameter(marginTieredRatesStore, "marginTieredRatesStore");
            Intrinsics.checkNotNullParameter(marginInvestingInfoStore, "marginInvestingInfoStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new MarginUpgradeRatesDuxo(marginEligibilityStore, leveredMarginSettingsStore, marginTieredRatesStore, marginInvestingInfoStore, duxoBundle, savedStateHandle);
        }
    }
}
