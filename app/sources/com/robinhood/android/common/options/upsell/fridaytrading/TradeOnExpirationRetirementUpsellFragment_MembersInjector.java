package com.robinhood.android.common.options.upsell.fridaytrading;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.account.AccountDisplayNameStore;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.compose.app.GenericComposeFragment_MembersInjector;
import com.robinhood.compose.app.GenericComposeSingletons;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TradeOnExpirationRetirementUpsellFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/common/options/upsell/fridaytrading/TradeOnExpirationRetirementUpsellFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/common/options/upsell/fridaytrading/TradeOnExpirationRetirementUpsellFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "genericComposeSingletons", "Lcom/robinhood/compose/app/GenericComposeSingletons;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountDisplayNameStore", "Lcom/robinhood/android/account/AccountDisplayNameStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class TradeOnExpirationRetirementUpsellFragment_MembersInjector implements MembersInjector<TradeOnExpirationRetirementUpsellFragment> {
    private final Provider<AccountDisplayNameStore> accountDisplayNameStore;
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<GenericComposeSingletons> genericComposeSingletons;
    private final Provider<OptionSettingsStore> optionSettingsStore;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<TradeOnExpirationRetirementUpsellFragment> create(Provider<BaseFragmentSingletons> provider, Provider<GenericComposeSingletons> provider2, Provider<AccountProvider> provider3, Provider<AccountDisplayNameStore> provider4, Provider<AnalyticsLogger> provider5, Provider<ExperimentsStore> provider6, Provider<OptionSettingsStore> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final void injectAccountDisplayNameStore(TradeOnExpirationRetirementUpsellFragment tradeOnExpirationRetirementUpsellFragment, AccountDisplayNameStore accountDisplayNameStore) {
        INSTANCE.injectAccountDisplayNameStore(tradeOnExpirationRetirementUpsellFragment, accountDisplayNameStore);
    }

    @JvmStatic
    public static final void injectAccountProvider(TradeOnExpirationRetirementUpsellFragment tradeOnExpirationRetirementUpsellFragment, AccountProvider accountProvider) {
        INSTANCE.injectAccountProvider(tradeOnExpirationRetirementUpsellFragment, accountProvider);
    }

    @JvmStatic
    public static final void injectAnalytics(TradeOnExpirationRetirementUpsellFragment tradeOnExpirationRetirementUpsellFragment, AnalyticsLogger analyticsLogger) {
        INSTANCE.injectAnalytics(tradeOnExpirationRetirementUpsellFragment, analyticsLogger);
    }

    @JvmStatic
    public static final void injectExperimentsStore(TradeOnExpirationRetirementUpsellFragment tradeOnExpirationRetirementUpsellFragment, ExperimentsStore experimentsStore) {
        INSTANCE.injectExperimentsStore(tradeOnExpirationRetirementUpsellFragment, experimentsStore);
    }

    @JvmStatic
    public static final void injectOptionSettingsStore(TradeOnExpirationRetirementUpsellFragment tradeOnExpirationRetirementUpsellFragment, OptionSettingsStore optionSettingsStore) {
        INSTANCE.injectOptionSettingsStore(tradeOnExpirationRetirementUpsellFragment, optionSettingsStore);
    }

    public TradeOnExpirationRetirementUpsellFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<GenericComposeSingletons> genericComposeSingletons, Provider<AccountProvider> accountProvider, Provider<AccountDisplayNameStore> accountDisplayNameStore, Provider<AnalyticsLogger> analytics, Provider<ExperimentsStore> experimentsStore, Provider<OptionSettingsStore> optionSettingsStore) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(genericComposeSingletons, "genericComposeSingletons");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(accountDisplayNameStore, "accountDisplayNameStore");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
        this.singletons = singletons;
        this.genericComposeSingletons = genericComposeSingletons;
        this.accountProvider = accountProvider;
        this.accountDisplayNameStore = accountDisplayNameStore;
        this.analytics = analytics;
        this.experimentsStore = experimentsStore;
        this.optionSettingsStore = optionSettingsStore;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TradeOnExpirationRetirementUpsellFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        GenericComposeFragment_MembersInjector.Companion companion2 = GenericComposeFragment_MembersInjector.INSTANCE;
        GenericComposeSingletons genericComposeSingletons = this.genericComposeSingletons.get();
        Intrinsics.checkNotNullExpressionValue(genericComposeSingletons, "get(...)");
        companion2.injectGenericComposeSingletons(instance, genericComposeSingletons);
        Companion companion3 = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        companion3.injectAccountProvider(instance, accountProvider);
        AccountDisplayNameStore accountDisplayNameStore = this.accountDisplayNameStore.get();
        Intrinsics.checkNotNullExpressionValue(accountDisplayNameStore, "get(...)");
        companion3.injectAccountDisplayNameStore(instance, accountDisplayNameStore);
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion3.injectAnalytics(instance, analyticsLogger);
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        companion3.injectExperimentsStore(instance, experimentsStore);
        OptionSettingsStore optionSettingsStore = this.optionSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(optionSettingsStore, "get(...)");
        companion3.injectOptionSettingsStore(instance, optionSettingsStore);
    }

    /* compiled from: TradeOnExpirationRetirementUpsellFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jp\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\bH\u0007J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/common/options/upsell/fridaytrading/TradeOnExpirationRetirementUpsellFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/common/options/upsell/fridaytrading/TradeOnExpirationRetirementUpsellFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "genericComposeSingletons", "Lcom/robinhood/compose/app/GenericComposeSingletons;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountDisplayNameStore", "Lcom/robinhood/android/account/AccountDisplayNameStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "injectAccountProvider", "", "instance", "injectAccountDisplayNameStore", "injectAnalytics", "injectExperimentsStore", "injectOptionSettingsStore", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<TradeOnExpirationRetirementUpsellFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<GenericComposeSingletons> genericComposeSingletons, Provider<AccountProvider> accountProvider, Provider<AccountDisplayNameStore> accountDisplayNameStore, Provider<AnalyticsLogger> analytics, Provider<ExperimentsStore> experimentsStore, Provider<OptionSettingsStore> optionSettingsStore) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(genericComposeSingletons, "genericComposeSingletons");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(accountDisplayNameStore, "accountDisplayNameStore");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
            return new TradeOnExpirationRetirementUpsellFragment_MembersInjector(singletons, genericComposeSingletons, accountProvider, accountDisplayNameStore, analytics, experimentsStore, optionSettingsStore);
        }

        @JvmStatic
        public final void injectAccountProvider(TradeOnExpirationRetirementUpsellFragment instance, AccountProvider accountProvider) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            instance.setAccountProvider(accountProvider);
        }

        @JvmStatic
        public final void injectAccountDisplayNameStore(TradeOnExpirationRetirementUpsellFragment instance, AccountDisplayNameStore accountDisplayNameStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(accountDisplayNameStore, "accountDisplayNameStore");
            instance.setAccountDisplayNameStore(accountDisplayNameStore);
        }

        @JvmStatic
        public final void injectAnalytics(TradeOnExpirationRetirementUpsellFragment instance, AnalyticsLogger analytics) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            instance.setAnalytics(analytics);
        }

        @JvmStatic
        public final void injectExperimentsStore(TradeOnExpirationRetirementUpsellFragment instance, ExperimentsStore experimentsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            instance.setExperimentsStore(experimentsStore);
        }

        @JvmStatic
        public final void injectOptionSettingsStore(TradeOnExpirationRetirementUpsellFragment instance, OptionSettingsStore optionSettingsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
            instance.setOptionSettingsStore(optionSettingsStore);
        }
    }
}
