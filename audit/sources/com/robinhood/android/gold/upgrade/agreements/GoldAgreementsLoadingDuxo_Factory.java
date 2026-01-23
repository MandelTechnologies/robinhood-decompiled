package com.robinhood.android.gold.upgrade.agreements;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.gold.lib.upgrade.store.GoldUpgradeStore;
import com.robinhood.android.lib.store.margin.MarginSettingsStore;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldAgreementsLoadingDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsLoadingDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsLoadingDuxo;", "goldUpgradeStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/gold/lib/upgrade/store/GoldUpgradeStore;", "marginSettingsStore", "Lcom/robinhood/android/lib/store/margin/MarginSettingsStore;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "stateProvider", "Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsLoadingStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-gold-upgrade-agreements_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class GoldAgreementsLoadingDuxo_Factory implements Factory<GoldAgreementsLoadingDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<GoldUpgradeStore> goldUpgradeStore;
    private final Provider<MarginSettingsStore> marginSettingsStore;
    private final Provider<MarginSubscriptionStore> marginSubscriptionStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<GoldAgreementsLoadingStateProvider> stateProvider;
    private final Provider<StaticContentStore> staticContentStore;
    private final Provider<UnifiedAccountStore> unifiedAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final GoldAgreementsLoadingDuxo_Factory create(Provider<GoldUpgradeStore> provider, Provider<MarginSettingsStore> provider2, Provider<MarginSubscriptionStore> provider3, Provider<StaticContentStore> provider4, Provider<UnifiedAccountStore> provider5, Provider<GoldAgreementsLoadingStateProvider> provider6, Provider<DuxoBundle> provider7, Provider<SavedStateHandle> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final GoldAgreementsLoadingDuxo newInstance(GoldUpgradeStore goldUpgradeStore, MarginSettingsStore marginSettingsStore, MarginSubscriptionStore marginSubscriptionStore, StaticContentStore staticContentStore, UnifiedAccountStore unifiedAccountStore, GoldAgreementsLoadingStateProvider goldAgreementsLoadingStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(goldUpgradeStore, marginSettingsStore, marginSubscriptionStore, staticContentStore, unifiedAccountStore, goldAgreementsLoadingStateProvider, duxoBundle, savedStateHandle);
    }

    public GoldAgreementsLoadingDuxo_Factory(Provider<GoldUpgradeStore> goldUpgradeStore, Provider<MarginSettingsStore> marginSettingsStore, Provider<MarginSubscriptionStore> marginSubscriptionStore, Provider<StaticContentStore> staticContentStore, Provider<UnifiedAccountStore> unifiedAccountStore, Provider<GoldAgreementsLoadingStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(goldUpgradeStore, "goldUpgradeStore");
        Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.goldUpgradeStore = goldUpgradeStore;
        this.marginSettingsStore = marginSettingsStore;
        this.marginSubscriptionStore = marginSubscriptionStore;
        this.staticContentStore = staticContentStore;
        this.unifiedAccountStore = unifiedAccountStore;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public GoldAgreementsLoadingDuxo get() {
        Companion companion = INSTANCE;
        GoldUpgradeStore goldUpgradeStore = this.goldUpgradeStore.get();
        Intrinsics.checkNotNullExpressionValue(goldUpgradeStore, "get(...)");
        MarginSettingsStore marginSettingsStore = this.marginSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(marginSettingsStore, "get(...)");
        MarginSubscriptionStore marginSubscriptionStore = this.marginSubscriptionStore.get();
        Intrinsics.checkNotNullExpressionValue(marginSubscriptionStore, "get(...)");
        StaticContentStore staticContentStore = this.staticContentStore.get();
        Intrinsics.checkNotNullExpressionValue(staticContentStore, "get(...)");
        UnifiedAccountStore unifiedAccountStore = this.unifiedAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(unifiedAccountStore, "get(...)");
        GoldAgreementsLoadingStateProvider goldAgreementsLoadingStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(goldAgreementsLoadingStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(goldUpgradeStore, marginSettingsStore, marginSubscriptionStore, staticContentStore, unifiedAccountStore, goldAgreementsLoadingStateProvider, duxoBundle, savedStateHandle);
    }

    /* compiled from: GoldAgreementsLoadingDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007JH\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsLoadingDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsLoadingDuxo_Factory;", "goldUpgradeStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/gold/lib/upgrade/store/GoldUpgradeStore;", "marginSettingsStore", "Lcom/robinhood/android/lib/store/margin/MarginSettingsStore;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "stateProvider", "Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsLoadingStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsLoadingDuxo;", "feature-gold-upgrade-agreements_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final GoldAgreementsLoadingDuxo_Factory create(Provider<GoldUpgradeStore> goldUpgradeStore, Provider<MarginSettingsStore> marginSettingsStore, Provider<MarginSubscriptionStore> marginSubscriptionStore, Provider<StaticContentStore> staticContentStore, Provider<UnifiedAccountStore> unifiedAccountStore, Provider<GoldAgreementsLoadingStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(goldUpgradeStore, "goldUpgradeStore");
            Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
            Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new GoldAgreementsLoadingDuxo_Factory(goldUpgradeStore, marginSettingsStore, marginSubscriptionStore, staticContentStore, unifiedAccountStore, stateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final GoldAgreementsLoadingDuxo newInstance(GoldUpgradeStore goldUpgradeStore, MarginSettingsStore marginSettingsStore, MarginSubscriptionStore marginSubscriptionStore, StaticContentStore staticContentStore, UnifiedAccountStore unifiedAccountStore, GoldAgreementsLoadingStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(goldUpgradeStore, "goldUpgradeStore");
            Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
            Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new GoldAgreementsLoadingDuxo(goldUpgradeStore, marginSettingsStore, marginSubscriptionStore, staticContentStore, unifiedAccountStore, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}
