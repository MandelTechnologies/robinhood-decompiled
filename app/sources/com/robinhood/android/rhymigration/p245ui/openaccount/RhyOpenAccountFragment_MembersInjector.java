package com.robinhood.android.rhymigration.p245ui.openaccount;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.mcduckling.prefs.ShouldResetCashTabPref;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.librobinhood.logging.RhyGlobalLoggingContext;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.ShowRhyFundingBottomSheetPref;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyOpenAccountFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/openaccount/RhyOpenAccountFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/rhymigration/ui/openaccount/RhyOpenAccountFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "rhyGlobalLoggingContext", "Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "shouldResetCashTabPref", "Lcom/robinhood/prefs/BooleanPreference;", "showRhyFundingBottomSheetPref", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RhyOpenAccountFragment_MembersInjector implements MembersInjector<RhyOpenAccountFragment> {
    private final Provider<EventLogger> eventLogger;
    private final Provider<RhyAccountStore> rhyAccountStore;
    private final Provider<RhyGlobalLoggingContext> rhyGlobalLoggingContext;
    private final Provider<BooleanPreference> shouldResetCashTabPref;
    private final Provider<BooleanPreference> showRhyFundingBottomSheetPref;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<RhyOpenAccountFragment> create(Provider<BaseFragmentSingletons> provider, Provider<EventLogger> provider2, Provider<RhyAccountStore> provider3, Provider<RhyGlobalLoggingContext> provider4, Provider<BooleanPreference> provider5, Provider<BooleanPreference> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final void injectEventLogger(RhyOpenAccountFragment rhyOpenAccountFragment, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(rhyOpenAccountFragment, eventLogger);
    }

    @JvmStatic
    public static final void injectRhyAccountStore(RhyOpenAccountFragment rhyOpenAccountFragment, RhyAccountStore rhyAccountStore) {
        INSTANCE.injectRhyAccountStore(rhyOpenAccountFragment, rhyAccountStore);
    }

    @JvmStatic
    public static final void injectRhyGlobalLoggingContext(RhyOpenAccountFragment rhyOpenAccountFragment, RhyGlobalLoggingContext rhyGlobalLoggingContext) {
        INSTANCE.injectRhyGlobalLoggingContext(rhyOpenAccountFragment, rhyGlobalLoggingContext);
    }

    @JvmStatic
    @ShouldResetCashTabPref
    public static final void injectShouldResetCashTabPref(RhyOpenAccountFragment rhyOpenAccountFragment, BooleanPreference booleanPreference) {
        INSTANCE.injectShouldResetCashTabPref(rhyOpenAccountFragment, booleanPreference);
    }

    @JvmStatic
    @ShowRhyFundingBottomSheetPref
    public static final void injectShowRhyFundingBottomSheetPref(RhyOpenAccountFragment rhyOpenAccountFragment, BooleanPreference booleanPreference) {
        INSTANCE.injectShowRhyFundingBottomSheetPref(rhyOpenAccountFragment, booleanPreference);
    }

    public RhyOpenAccountFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<EventLogger> eventLogger, Provider<RhyAccountStore> rhyAccountStore, Provider<RhyGlobalLoggingContext> rhyGlobalLoggingContext, Provider<BooleanPreference> shouldResetCashTabPref, Provider<BooleanPreference> showRhyFundingBottomSheetPref) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(rhyGlobalLoggingContext, "rhyGlobalLoggingContext");
        Intrinsics.checkNotNullParameter(shouldResetCashTabPref, "shouldResetCashTabPref");
        Intrinsics.checkNotNullParameter(showRhyFundingBottomSheetPref, "showRhyFundingBottomSheetPref");
        this.singletons = singletons;
        this.eventLogger = eventLogger;
        this.rhyAccountStore = rhyAccountStore;
        this.rhyGlobalLoggingContext = rhyGlobalLoggingContext;
        this.shouldResetCashTabPref = shouldResetCashTabPref;
        this.showRhyFundingBottomSheetPref = showRhyFundingBottomSheetPref;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RhyOpenAccountFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion2.injectEventLogger(instance, eventLogger);
        RhyAccountStore rhyAccountStore = this.rhyAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyAccountStore, "get(...)");
        companion2.injectRhyAccountStore(instance, rhyAccountStore);
        RhyGlobalLoggingContext rhyGlobalLoggingContext = this.rhyGlobalLoggingContext.get();
        Intrinsics.checkNotNullExpressionValue(rhyGlobalLoggingContext, "get(...)");
        companion2.injectRhyGlobalLoggingContext(instance, rhyGlobalLoggingContext);
        BooleanPreference booleanPreference = this.shouldResetCashTabPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        companion2.injectShouldResetCashTabPref(instance, booleanPreference);
        BooleanPreference booleanPreference2 = this.showRhyFundingBottomSheetPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference2, "get(...)");
        companion2.injectShowRhyFundingBottomSheetPref(instance, booleanPreference2);
    }

    /* compiled from: RhyOpenAccountFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jb\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/openaccount/RhyOpenAccountFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/rhymigration/ui/openaccount/RhyOpenAccountFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "rhyGlobalLoggingContext", "Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "shouldResetCashTabPref", "Lcom/robinhood/prefs/BooleanPreference;", "showRhyFundingBottomSheetPref", "injectEventLogger", "", "instance", "injectRhyAccountStore", "injectRhyGlobalLoggingContext", "injectShouldResetCashTabPref", "injectShowRhyFundingBottomSheetPref", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<RhyOpenAccountFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<EventLogger> eventLogger, Provider<RhyAccountStore> rhyAccountStore, Provider<RhyGlobalLoggingContext> rhyGlobalLoggingContext, Provider<BooleanPreference> shouldResetCashTabPref, Provider<BooleanPreference> showRhyFundingBottomSheetPref) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(rhyGlobalLoggingContext, "rhyGlobalLoggingContext");
            Intrinsics.checkNotNullParameter(shouldResetCashTabPref, "shouldResetCashTabPref");
            Intrinsics.checkNotNullParameter(showRhyFundingBottomSheetPref, "showRhyFundingBottomSheetPref");
            return new RhyOpenAccountFragment_MembersInjector(singletons, eventLogger, rhyAccountStore, rhyGlobalLoggingContext, shouldResetCashTabPref, showRhyFundingBottomSheetPref);
        }

        @JvmStatic
        public final void injectEventLogger(RhyOpenAccountFragment instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectRhyAccountStore(RhyOpenAccountFragment instance, RhyAccountStore rhyAccountStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            instance.setRhyAccountStore(rhyAccountStore);
        }

        @JvmStatic
        public final void injectRhyGlobalLoggingContext(RhyOpenAccountFragment instance, RhyGlobalLoggingContext rhyGlobalLoggingContext) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(rhyGlobalLoggingContext, "rhyGlobalLoggingContext");
            instance.setRhyGlobalLoggingContext(rhyGlobalLoggingContext);
        }

        @JvmStatic
        @ShouldResetCashTabPref
        public final void injectShouldResetCashTabPref(RhyOpenAccountFragment instance, BooleanPreference shouldResetCashTabPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(shouldResetCashTabPref, "shouldResetCashTabPref");
            instance.setShouldResetCashTabPref(shouldResetCashTabPref);
        }

        @JvmStatic
        @ShowRhyFundingBottomSheetPref
        public final void injectShowRhyFundingBottomSheetPref(RhyOpenAccountFragment instance, BooleanPreference showRhyFundingBottomSheetPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(showRhyFundingBottomSheetPref, "showRhyFundingBottomSheetPref");
            instance.setShowRhyFundingBottomSheetPref(showRhyFundingBottomSheetPref);
        }
    }
}
