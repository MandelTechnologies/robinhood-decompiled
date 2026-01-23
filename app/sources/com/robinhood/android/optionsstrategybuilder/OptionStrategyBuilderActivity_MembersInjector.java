package com.robinhood.android.optionsstrategybuilder;

import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.librobinhood.data.store.OptionMarketHoursStore;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore;
import com.robinhood.tooltips.TooltipManager;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionStrategyBuilderActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionStrategyBuilderStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore;", "tooltipManager", "Lcom/robinhood/tooltips/TooltipManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class OptionStrategyBuilderActivity_MembersInjector implements MembersInjector<OptionStrategyBuilderActivity> {
    private final Provider<OptionChainStore> optionChainStore;
    private final Provider<OptionMarketHoursStore> optionMarketHoursStore;
    private final Provider<OptionSettingsStore> optionSettingsStore;
    private final Provider<OptionStrategyBuilderStore> optionStrategyBuilderStore;
    private final Provider<BaseActivitySingletons> singletons;
    private final Provider<TooltipManager> tooltipManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<OptionStrategyBuilderActivity> create(Provider<BaseActivitySingletons> provider, Provider<OptionChainStore> provider2, Provider<OptionMarketHoursStore> provider3, Provider<OptionSettingsStore> provider4, Provider<OptionStrategyBuilderStore> provider5, Provider<TooltipManager> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final void injectOptionChainStore(OptionStrategyBuilderActivity optionStrategyBuilderActivity, OptionChainStore optionChainStore) {
        INSTANCE.injectOptionChainStore(optionStrategyBuilderActivity, optionChainStore);
    }

    @JvmStatic
    public static final void injectOptionMarketHoursStore(OptionStrategyBuilderActivity optionStrategyBuilderActivity, OptionMarketHoursStore optionMarketHoursStore) {
        INSTANCE.injectOptionMarketHoursStore(optionStrategyBuilderActivity, optionMarketHoursStore);
    }

    @JvmStatic
    public static final void injectOptionSettingsStore(OptionStrategyBuilderActivity optionStrategyBuilderActivity, OptionSettingsStore optionSettingsStore) {
        INSTANCE.injectOptionSettingsStore(optionStrategyBuilderActivity, optionSettingsStore);
    }

    @JvmStatic
    public static final void injectOptionStrategyBuilderStore(OptionStrategyBuilderActivity optionStrategyBuilderActivity, OptionStrategyBuilderStore optionStrategyBuilderStore) {
        INSTANCE.injectOptionStrategyBuilderStore(optionStrategyBuilderActivity, optionStrategyBuilderStore);
    }

    @JvmStatic
    public static final void injectTooltipManager(OptionStrategyBuilderActivity optionStrategyBuilderActivity, TooltipManager tooltipManager) {
        INSTANCE.injectTooltipManager(optionStrategyBuilderActivity, tooltipManager);
    }

    public OptionStrategyBuilderActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<OptionChainStore> optionChainStore, Provider<OptionMarketHoursStore> optionMarketHoursStore, Provider<OptionSettingsStore> optionSettingsStore, Provider<OptionStrategyBuilderStore> optionStrategyBuilderStore, Provider<TooltipManager> tooltipManager) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
        Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
        Intrinsics.checkNotNullParameter(optionStrategyBuilderStore, "optionStrategyBuilderStore");
        Intrinsics.checkNotNullParameter(tooltipManager, "tooltipManager");
        this.singletons = singletons;
        this.optionChainStore = optionChainStore;
        this.optionMarketHoursStore = optionMarketHoursStore;
        this.optionSettingsStore = optionSettingsStore;
        this.optionStrategyBuilderStore = optionStrategyBuilderStore;
        this.tooltipManager = tooltipManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OptionStrategyBuilderActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        Companion companion2 = INSTANCE;
        OptionChainStore optionChainStore = this.optionChainStore.get();
        Intrinsics.checkNotNullExpressionValue(optionChainStore, "get(...)");
        companion2.injectOptionChainStore(instance, optionChainStore);
        OptionMarketHoursStore optionMarketHoursStore = this.optionMarketHoursStore.get();
        Intrinsics.checkNotNullExpressionValue(optionMarketHoursStore, "get(...)");
        companion2.injectOptionMarketHoursStore(instance, optionMarketHoursStore);
        OptionSettingsStore optionSettingsStore = this.optionSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(optionSettingsStore, "get(...)");
        companion2.injectOptionSettingsStore(instance, optionSettingsStore);
        OptionStrategyBuilderStore optionStrategyBuilderStore = this.optionStrategyBuilderStore.get();
        Intrinsics.checkNotNullExpressionValue(optionStrategyBuilderStore, "get(...)");
        companion2.injectOptionStrategyBuilderStore(instance, optionStrategyBuilderStore);
        TooltipManager tooltipManager = this.tooltipManager.get();
        Intrinsics.checkNotNullExpressionValue(tooltipManager, "get(...)");
        companion2.injectTooltipManager(instance, tooltipManager);
    }

    /* compiled from: OptionStrategyBuilderActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jb\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionStrategyBuilderStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore;", "tooltipManager", "Lcom/robinhood/tooltips/TooltipManager;", "injectOptionChainStore", "", "instance", "injectOptionMarketHoursStore", "injectOptionSettingsStore", "injectOptionStrategyBuilderStore", "injectTooltipManager", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<OptionStrategyBuilderActivity> create(Provider<BaseActivitySingletons> singletons, Provider<OptionChainStore> optionChainStore, Provider<OptionMarketHoursStore> optionMarketHoursStore, Provider<OptionSettingsStore> optionSettingsStore, Provider<OptionStrategyBuilderStore> optionStrategyBuilderStore, Provider<TooltipManager> tooltipManager) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
            Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
            Intrinsics.checkNotNullParameter(optionStrategyBuilderStore, "optionStrategyBuilderStore");
            Intrinsics.checkNotNullParameter(tooltipManager, "tooltipManager");
            return new OptionStrategyBuilderActivity_MembersInjector(singletons, optionChainStore, optionMarketHoursStore, optionSettingsStore, optionStrategyBuilderStore, tooltipManager);
        }

        @JvmStatic
        public final void injectOptionChainStore(OptionStrategyBuilderActivity instance, OptionChainStore optionChainStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            instance.setOptionChainStore(optionChainStore);
        }

        @JvmStatic
        public final void injectOptionMarketHoursStore(OptionStrategyBuilderActivity instance, OptionMarketHoursStore optionMarketHoursStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
            instance.setOptionMarketHoursStore(optionMarketHoursStore);
        }

        @JvmStatic
        public final void injectOptionSettingsStore(OptionStrategyBuilderActivity instance, OptionSettingsStore optionSettingsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
            instance.setOptionSettingsStore(optionSettingsStore);
        }

        @JvmStatic
        public final void injectOptionStrategyBuilderStore(OptionStrategyBuilderActivity instance, OptionStrategyBuilderStore optionStrategyBuilderStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(optionStrategyBuilderStore, "optionStrategyBuilderStore");
            instance.setOptionStrategyBuilderStore(optionStrategyBuilderStore);
        }

        @JvmStatic
        public final void injectTooltipManager(OptionStrategyBuilderActivity instance, TooltipManager tooltipManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(tooltipManager, "tooltipManager");
            instance.setTooltipManager(tooltipManager);
        }
    }
}
