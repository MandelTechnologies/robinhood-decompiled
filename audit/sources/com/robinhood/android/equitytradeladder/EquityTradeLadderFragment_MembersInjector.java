package com.robinhood.android.equitytradeladder;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equities.ladderftux.EquityTradeLadderFtuxManager;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.compose.app.GenericComposeFragment_MembersInjector;
import com.robinhood.compose.app.GenericComposeSingletons;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityTradeLadderFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "genericComposeSingletons", "Lcom/robinhood/compose/app/GenericComposeSingletons;", "ladderFtuxManager", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxManager;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityTradeLadderFragment_MembersInjector implements MembersInjector<EquityTradeLadderFragment> {
    private final Provider<GenericComposeSingletons> genericComposeSingletons;
    private final Provider<EquityTradeLadderFtuxManager> ladderFtuxManager;
    private final Provider<PerformanceLogger> performanceLogger;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<EquityTradeLadderFragment> create(Provider<BaseFragmentSingletons> provider, Provider<GenericComposeSingletons> provider2, Provider<EquityTradeLadderFtuxManager> provider3, Provider<PerformanceLogger> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectLadderFtuxManager(EquityTradeLadderFragment equityTradeLadderFragment, EquityTradeLadderFtuxManager equityTradeLadderFtuxManager) {
        INSTANCE.injectLadderFtuxManager(equityTradeLadderFragment, equityTradeLadderFtuxManager);
    }

    @JvmStatic
    public static final void injectPerformanceLogger(EquityTradeLadderFragment equityTradeLadderFragment, PerformanceLogger performanceLogger) {
        INSTANCE.injectPerformanceLogger(equityTradeLadderFragment, performanceLogger);
    }

    public EquityTradeLadderFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<GenericComposeSingletons> genericComposeSingletons, Provider<EquityTradeLadderFtuxManager> ladderFtuxManager, Provider<PerformanceLogger> performanceLogger) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(genericComposeSingletons, "genericComposeSingletons");
        Intrinsics.checkNotNullParameter(ladderFtuxManager, "ladderFtuxManager");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        this.singletons = singletons;
        this.genericComposeSingletons = genericComposeSingletons;
        this.ladderFtuxManager = ladderFtuxManager;
        this.performanceLogger = performanceLogger;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(EquityTradeLadderFragment instance) {
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
        EquityTradeLadderFtuxManager equityTradeLadderFtuxManager = this.ladderFtuxManager.get();
        Intrinsics.checkNotNullExpressionValue(equityTradeLadderFtuxManager, "get(...)");
        companion3.injectLadderFtuxManager(instance, equityTradeLadderFtuxManager);
        PerformanceLogger performanceLogger = this.performanceLogger.get();
        Intrinsics.checkNotNullExpressionValue(performanceLogger, "get(...)");
        companion3.injectPerformanceLogger(instance, performanceLogger);
    }

    /* compiled from: EquityTradeLadderFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "genericComposeSingletons", "Lcom/robinhood/compose/app/GenericComposeSingletons;", "ladderFtuxManager", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxManager;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "injectLadderFtuxManager", "", "instance", "injectPerformanceLogger", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<EquityTradeLadderFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<GenericComposeSingletons> genericComposeSingletons, Provider<EquityTradeLadderFtuxManager> ladderFtuxManager, Provider<PerformanceLogger> performanceLogger) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(genericComposeSingletons, "genericComposeSingletons");
            Intrinsics.checkNotNullParameter(ladderFtuxManager, "ladderFtuxManager");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            return new EquityTradeLadderFragment_MembersInjector(singletons, genericComposeSingletons, ladderFtuxManager, performanceLogger);
        }

        @JvmStatic
        public final void injectLadderFtuxManager(EquityTradeLadderFragment instance, EquityTradeLadderFtuxManager ladderFtuxManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(ladderFtuxManager, "ladderFtuxManager");
            instance.setLadderFtuxManager(ladderFtuxManager);
        }

        @JvmStatic
        public final void injectPerformanceLogger(EquityTradeLadderFragment instance, PerformanceLogger performanceLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            instance.setPerformanceLogger(performanceLogger);
        }
    }
}
