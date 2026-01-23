package com.robinhood.android.trade.options;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.android.common.p088ui.BaseDialogFragment_MembersInjector;
import com.robinhood.android.common.p088ui.RhDialogFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseDialogSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.librobinhood.data.store.OptionOrderStore;
import com.robinhood.librobinhood.data.store.OptionRemoveReplaceOrderConfirmationStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReplaceOptionOrderDialogFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/trade/options/ReplaceOptionOrderDialogFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/trade/options/ReplaceOptionOrderDialogFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionRemoveReplaceOrderConfirmationStore", "Lcom/robinhood/librobinhood/data/store/OptionRemoveReplaceOrderConfirmationStore;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class ReplaceOptionOrderDialogFragment_MembersInjector implements MembersInjector<ReplaceOptionOrderDialogFragment> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<TraderEventLogger> eventLogger;
    private final Provider<Navigator> navigator;
    private final Provider<OptionChainStore> optionChainStore;
    private final Provider<OptionOrderStore> optionOrderStore;
    private final Provider<OptionRemoveReplaceOrderConfirmationStore> optionRemoveReplaceOrderConfirmationStore;
    private final Provider<BaseDialogSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<ReplaceOptionOrderDialogFragment> create(Provider<BaseDialogSingletons> provider, Provider<AnalyticsLogger> provider2, Provider<OptionOrderStore> provider3, Provider<OptionChainStore> provider4, Provider<OptionRemoveReplaceOrderConfirmationStore> provider5, Provider<Navigator> provider6, Provider<TraderEventLogger> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final void injectEventLogger(ReplaceOptionOrderDialogFragment replaceOptionOrderDialogFragment, TraderEventLogger traderEventLogger) {
        INSTANCE.injectEventLogger(replaceOptionOrderDialogFragment, traderEventLogger);
    }

    @JvmStatic
    public static final void injectNavigator(ReplaceOptionOrderDialogFragment replaceOptionOrderDialogFragment, Navigator navigator) {
        INSTANCE.injectNavigator(replaceOptionOrderDialogFragment, navigator);
    }

    @JvmStatic
    public static final void injectOptionChainStore(ReplaceOptionOrderDialogFragment replaceOptionOrderDialogFragment, OptionChainStore optionChainStore) {
        INSTANCE.injectOptionChainStore(replaceOptionOrderDialogFragment, optionChainStore);
    }

    @JvmStatic
    public static final void injectOptionOrderStore(ReplaceOptionOrderDialogFragment replaceOptionOrderDialogFragment, OptionOrderStore optionOrderStore) {
        INSTANCE.injectOptionOrderStore(replaceOptionOrderDialogFragment, optionOrderStore);
    }

    @JvmStatic
    public static final void injectOptionRemoveReplaceOrderConfirmationStore(ReplaceOptionOrderDialogFragment replaceOptionOrderDialogFragment, OptionRemoveReplaceOrderConfirmationStore optionRemoveReplaceOrderConfirmationStore) {
        INSTANCE.injectOptionRemoveReplaceOrderConfirmationStore(replaceOptionOrderDialogFragment, optionRemoveReplaceOrderConfirmationStore);
    }

    public ReplaceOptionOrderDialogFragment_MembersInjector(Provider<BaseDialogSingletons> singletons, Provider<AnalyticsLogger> analytics, Provider<OptionOrderStore> optionOrderStore, Provider<OptionChainStore> optionChainStore, Provider<OptionRemoveReplaceOrderConfirmationStore> optionRemoveReplaceOrderConfirmationStore, Provider<Navigator> navigator, Provider<TraderEventLogger> eventLogger) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(optionRemoveReplaceOrderConfirmationStore, "optionRemoveReplaceOrderConfirmationStore");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.singletons = singletons;
        this.analytics = analytics;
        this.optionOrderStore = optionOrderStore;
        this.optionChainStore = optionChainStore;
        this.optionRemoveReplaceOrderConfirmationStore = optionRemoveReplaceOrderConfirmationStore;
        this.navigator = navigator;
        this.eventLogger = eventLogger;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ReplaceOptionOrderDialogFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseDialogFragment_MembersInjector.Companion companion = BaseDialogFragment_MembersInjector.INSTANCE;
        BaseDialogSingletons baseDialogSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseDialogSingletons, "get(...)");
        companion.injectSingletons(instance, baseDialogSingletons);
        RhDialogFragment_MembersInjector.Companion companion2 = RhDialogFragment_MembersInjector.INSTANCE;
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion2.injectAnalytics(instance, analyticsLogger);
        Companion companion3 = INSTANCE;
        OptionOrderStore optionOrderStore = this.optionOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(optionOrderStore, "get(...)");
        companion3.injectOptionOrderStore(instance, optionOrderStore);
        OptionChainStore optionChainStore = this.optionChainStore.get();
        Intrinsics.checkNotNullExpressionValue(optionChainStore, "get(...)");
        companion3.injectOptionChainStore(instance, optionChainStore);
        OptionRemoveReplaceOrderConfirmationStore optionRemoveReplaceOrderConfirmationStore = this.optionRemoveReplaceOrderConfirmationStore.get();
        Intrinsics.checkNotNullExpressionValue(optionRemoveReplaceOrderConfirmationStore, "get(...)");
        companion3.injectOptionRemoveReplaceOrderConfirmationStore(instance, optionRemoveReplaceOrderConfirmationStore);
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        companion3.injectNavigator(instance, navigator);
        TraderEventLogger traderEventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(traderEventLogger, "get(...)");
        companion3.injectEventLogger(instance, traderEventLogger);
    }

    /* compiled from: ReplaceOptionOrderDialogFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jp\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\bH\u0007J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/trade/options/ReplaceOptionOrderDialogFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/trade/options/ReplaceOptionOrderDialogFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionRemoveReplaceOrderConfirmationStore", "Lcom/robinhood/librobinhood/data/store/OptionRemoveReplaceOrderConfirmationStore;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "injectOptionOrderStore", "", "instance", "injectOptionChainStore", "injectOptionRemoveReplaceOrderConfirmationStore", "injectNavigator", "injectEventLogger", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<ReplaceOptionOrderDialogFragment> create(Provider<BaseDialogSingletons> singletons, Provider<AnalyticsLogger> analytics, Provider<OptionOrderStore> optionOrderStore, Provider<OptionChainStore> optionChainStore, Provider<OptionRemoveReplaceOrderConfirmationStore> optionRemoveReplaceOrderConfirmationStore, Provider<Navigator> navigator, Provider<TraderEventLogger> eventLogger) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            Intrinsics.checkNotNullParameter(optionRemoveReplaceOrderConfirmationStore, "optionRemoveReplaceOrderConfirmationStore");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            return new ReplaceOptionOrderDialogFragment_MembersInjector(singletons, analytics, optionOrderStore, optionChainStore, optionRemoveReplaceOrderConfirmationStore, navigator, eventLogger);
        }

        @JvmStatic
        public final void injectOptionOrderStore(ReplaceOptionOrderDialogFragment instance, OptionOrderStore optionOrderStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
            instance.setOptionOrderStore(optionOrderStore);
        }

        @JvmStatic
        public final void injectOptionChainStore(ReplaceOptionOrderDialogFragment instance, OptionChainStore optionChainStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            instance.setOptionChainStore(optionChainStore);
        }

        @JvmStatic
        public final void injectOptionRemoveReplaceOrderConfirmationStore(ReplaceOptionOrderDialogFragment instance, OptionRemoveReplaceOrderConfirmationStore optionRemoveReplaceOrderConfirmationStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(optionRemoveReplaceOrderConfirmationStore, "optionRemoveReplaceOrderConfirmationStore");
            instance.setOptionRemoveReplaceOrderConfirmationStore(optionRemoveReplaceOrderConfirmationStore);
        }

        @JvmStatic
        public final void injectNavigator(ReplaceOptionOrderDialogFragment instance, Navigator navigator) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            instance.setNavigator(navigator);
        }

        @JvmStatic
        public final void injectEventLogger(ReplaceOptionOrderDialogFragment instance, TraderEventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }
    }
}
