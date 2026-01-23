package com.robinhood.android.cash.cushion.upsell;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.cash.cushion.annotation.HasVisitedCashCushionUpsellPref;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment_MembersInjector;
import com.robinhood.android.common.p088ui.BaseDialogFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseDialogSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.librobinhood.data.store.rhy.RhyAccountLoggingStore;
import com.robinhood.prefs.BooleanPreference;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CashCushionUpsellBottomSheetDialogFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/cash/cushion/upsell/CashCushionUpsellBottomSheetDialogFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/cash/cushion/upsell/CashCushionUpsellBottomSheetDialogFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "hasVisitedCashCushionUpsellPref", "Lcom/robinhood/prefs/BooleanPreference;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "rhyAccountLoggingStore", "Lcom/robinhood/librobinhood/data/store/rhy/RhyAccountLoggingStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-lib-cash-cushion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CashCushionUpsellBottomSheetDialogFragment_MembersInjector implements MembersInjector<CashCushionUpsellBottomSheetDialogFragment> {
    private final Provider<EventLogger> eventLogger;
    private final Provider<BooleanPreference> hasVisitedCashCushionUpsellPref;
    private final Provider<Navigator> navigator;
    private final Provider<RhyAccountLoggingStore> rhyAccountLoggingStore;
    private final Provider<BaseDialogSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<CashCushionUpsellBottomSheetDialogFragment> create(Provider<BaseDialogSingletons> provider, Provider<Navigator> provider2, Provider<BooleanPreference> provider3, Provider<EventLogger> provider4, Provider<RhyAccountLoggingStore> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final void injectEventLogger(CashCushionUpsellBottomSheetDialogFragment cashCushionUpsellBottomSheetDialogFragment, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(cashCushionUpsellBottomSheetDialogFragment, eventLogger);
    }

    @HasVisitedCashCushionUpsellPref
    @JvmStatic
    public static final void injectHasVisitedCashCushionUpsellPref(CashCushionUpsellBottomSheetDialogFragment cashCushionUpsellBottomSheetDialogFragment, BooleanPreference booleanPreference) {
        INSTANCE.injectHasVisitedCashCushionUpsellPref(cashCushionUpsellBottomSheetDialogFragment, booleanPreference);
    }

    @JvmStatic
    public static final void injectRhyAccountLoggingStore(CashCushionUpsellBottomSheetDialogFragment cashCushionUpsellBottomSheetDialogFragment, RhyAccountLoggingStore rhyAccountLoggingStore) {
        INSTANCE.injectRhyAccountLoggingStore(cashCushionUpsellBottomSheetDialogFragment, rhyAccountLoggingStore);
    }

    public CashCushionUpsellBottomSheetDialogFragment_MembersInjector(Provider<BaseDialogSingletons> singletons, Provider<Navigator> navigator, Provider<BooleanPreference> hasVisitedCashCushionUpsellPref, Provider<EventLogger> eventLogger, Provider<RhyAccountLoggingStore> rhyAccountLoggingStore) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(hasVisitedCashCushionUpsellPref, "hasVisitedCashCushionUpsellPref");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(rhyAccountLoggingStore, "rhyAccountLoggingStore");
        this.singletons = singletons;
        this.navigator = navigator;
        this.hasVisitedCashCushionUpsellPref = hasVisitedCashCushionUpsellPref;
        this.eventLogger = eventLogger;
        this.rhyAccountLoggingStore = rhyAccountLoggingStore;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CashCushionUpsellBottomSheetDialogFragment instance) {
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
        BooleanPreference booleanPreference = this.hasVisitedCashCushionUpsellPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        companion3.injectHasVisitedCashCushionUpsellPref(instance, booleanPreference);
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion3.injectEventLogger(instance, eventLogger);
        RhyAccountLoggingStore rhyAccountLoggingStore = this.rhyAccountLoggingStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyAccountLoggingStore, "get(...)");
        companion3.injectRhyAccountLoggingStore(instance, rhyAccountLoggingStore);
    }

    /* compiled from: CashCushionUpsellBottomSheetDialogFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/cash/cushion/upsell/CashCushionUpsellBottomSheetDialogFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/cash/cushion/upsell/CashCushionUpsellBottomSheetDialogFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "hasVisitedCashCushionUpsellPref", "Lcom/robinhood/prefs/BooleanPreference;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "rhyAccountLoggingStore", "Lcom/robinhood/librobinhood/data/store/rhy/RhyAccountLoggingStore;", "injectHasVisitedCashCushionUpsellPref", "", "instance", "injectEventLogger", "injectRhyAccountLoggingStore", "feature-lib-cash-cushion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<CashCushionUpsellBottomSheetDialogFragment> create(Provider<BaseDialogSingletons> singletons, Provider<Navigator> navigator, Provider<BooleanPreference> hasVisitedCashCushionUpsellPref, Provider<EventLogger> eventLogger, Provider<RhyAccountLoggingStore> rhyAccountLoggingStore) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(hasVisitedCashCushionUpsellPref, "hasVisitedCashCushionUpsellPref");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(rhyAccountLoggingStore, "rhyAccountLoggingStore");
            return new CashCushionUpsellBottomSheetDialogFragment_MembersInjector(singletons, navigator, hasVisitedCashCushionUpsellPref, eventLogger, rhyAccountLoggingStore);
        }

        @HasVisitedCashCushionUpsellPref
        @JvmStatic
        public final void injectHasVisitedCashCushionUpsellPref(CashCushionUpsellBottomSheetDialogFragment instance, BooleanPreference hasVisitedCashCushionUpsellPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(hasVisitedCashCushionUpsellPref, "hasVisitedCashCushionUpsellPref");
            instance.setHasVisitedCashCushionUpsellPref(hasVisitedCashCushionUpsellPref);
        }

        @JvmStatic
        public final void injectEventLogger(CashCushionUpsellBottomSheetDialogFragment instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectRhyAccountLoggingStore(CashCushionUpsellBottomSheetDialogFragment instance, RhyAccountLoggingStore rhyAccountLoggingStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(rhyAccountLoggingStore, "rhyAccountLoggingStore");
            instance.setRhyAccountLoggingStore(rhyAccountLoggingStore);
        }
    }
}
