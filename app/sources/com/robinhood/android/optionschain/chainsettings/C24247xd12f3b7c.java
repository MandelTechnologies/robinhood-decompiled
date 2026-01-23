package com.robinhood.android.optionschain.chainsettings;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment_MembersInjector;
import com.robinhood.android.common.p088ui.BaseDialogFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseDialogSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainSettingsBidAskPriceLabelBottomSheetFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsBidAskPriceLabelBottomSheetFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsBidAskPriceLabelBottomSheetFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsBidAskPriceLabelBottomSheetFragment_MembersInjector */
/* loaded from: classes11.dex */
public final class C24247xd12f3b7c implements MembersInjector<OptionChainSettingsBidAskPriceLabelBottomSheetFragment> {
    private final Provider<EventLogger> eventLogger;
    private final Provider<Navigator> navigator;
    private final Provider<OptionSettingsStore> optionSettingsStore;
    private final Provider<BaseDialogSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<OptionChainSettingsBidAskPriceLabelBottomSheetFragment> create(Provider<BaseDialogSingletons> provider, Provider<Navigator> provider2, Provider<OptionSettingsStore> provider3, Provider<EventLogger> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectEventLogger(OptionChainSettingsBidAskPriceLabelBottomSheetFragment optionChainSettingsBidAskPriceLabelBottomSheetFragment, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(optionChainSettingsBidAskPriceLabelBottomSheetFragment, eventLogger);
    }

    @JvmStatic
    public static final void injectOptionSettingsStore(OptionChainSettingsBidAskPriceLabelBottomSheetFragment optionChainSettingsBidAskPriceLabelBottomSheetFragment, OptionSettingsStore optionSettingsStore) {
        INSTANCE.injectOptionSettingsStore(optionChainSettingsBidAskPriceLabelBottomSheetFragment, optionSettingsStore);
    }

    public C24247xd12f3b7c(Provider<BaseDialogSingletons> singletons, Provider<Navigator> navigator, Provider<OptionSettingsStore> optionSettingsStore, Provider<EventLogger> eventLogger) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.singletons = singletons;
        this.navigator = navigator;
        this.optionSettingsStore = optionSettingsStore;
        this.eventLogger = eventLogger;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OptionChainSettingsBidAskPriceLabelBottomSheetFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseDialogFragment_MembersInjector.Companion companion = BaseDialogFragment_MembersInjector.INSTANCE;
        BaseDialogSingletons baseDialogSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseDialogSingletons, "get(...)");
        companion.injectSingletons(instance, baseDialogSingletons);
        BaseBottomSheetDialogFragment_MembersInjector.Companion companion2 = BaseBottomSheetDialogFragment_MembersInjector.INSTANCE;
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        companion2.injectNavigator(instance, navigator);
        Companion companion3 = INSTANCE;
        OptionSettingsStore optionSettingsStore = this.optionSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(optionSettingsStore, "get(...)");
        companion3.injectOptionSettingsStore(instance, optionSettingsStore);
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion3.injectEventLogger(instance, eventLogger);
    }

    /* compiled from: OptionChainSettingsBidAskPriceLabelBottomSheetFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsBidAskPriceLabelBottomSheetFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsBidAskPriceLabelBottomSheetFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "injectOptionSettingsStore", "", "instance", "injectEventLogger", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsBidAskPriceLabelBottomSheetFragment_MembersInjector$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<OptionChainSettingsBidAskPriceLabelBottomSheetFragment> create(Provider<BaseDialogSingletons> singletons, Provider<Navigator> navigator, Provider<OptionSettingsStore> optionSettingsStore, Provider<EventLogger> eventLogger) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            return new C24247xd12f3b7c(singletons, navigator, optionSettingsStore, eventLogger);
        }

        @JvmStatic
        public final void injectOptionSettingsStore(OptionChainSettingsBidAskPriceLabelBottomSheetFragment instance, OptionSettingsStore optionSettingsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
            instance.setOptionSettingsStore(optionSettingsStore);
        }

        @JvmStatic
        public final void injectEventLogger(OptionChainSettingsBidAskPriceLabelBottomSheetFragment instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }
    }
}
