package com.robinhood.android.trade.equity.p261ui.dollar;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equity.submission.EquityOrderManager;
import com.robinhood.android.lib.trade.BaseOrderParentFragmentSingletons;
import com.robinhood.android.lib.trade.BaseOrderParentFragment_MembersInjector;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityDollarOrderParentFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderParentFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderParentFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "orderSingletons", "Lcom/robinhood/android/lib/trade/BaseOrderParentFragmentSingletons;", "orderManager", "Lcom/robinhood/android/equity/submission/EquityOrderManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class EquityDollarOrderParentFragment_MembersInjector implements MembersInjector<EquityDollarOrderParentFragment> {
    private final Provider<EquityOrderManager> orderManager;
    private final Provider<BaseOrderParentFragmentSingletons> orderSingletons;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<EquityDollarOrderParentFragment> create(Provider<BaseFragmentSingletons> provider, Provider<BaseOrderParentFragmentSingletons> provider2, Provider<EquityOrderManager> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final void injectOrderManager(EquityDollarOrderParentFragment equityDollarOrderParentFragment, EquityOrderManager equityOrderManager) {
        INSTANCE.injectOrderManager(equityDollarOrderParentFragment, equityOrderManager);
    }

    public EquityDollarOrderParentFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<BaseOrderParentFragmentSingletons> orderSingletons, Provider<EquityOrderManager> orderManager) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(orderSingletons, "orderSingletons");
        Intrinsics.checkNotNullParameter(orderManager, "orderManager");
        this.singletons = singletons;
        this.orderSingletons = orderSingletons;
        this.orderManager = orderManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(EquityDollarOrderParentFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        BaseOrderParentFragment_MembersInjector.Companion companion2 = BaseOrderParentFragment_MembersInjector.INSTANCE;
        BaseOrderParentFragmentSingletons baseOrderParentFragmentSingletons = this.orderSingletons.get();
        Intrinsics.checkNotNullExpressionValue(baseOrderParentFragmentSingletons, "get(...)");
        companion2.injectOrderSingletons(instance, baseOrderParentFragmentSingletons);
        Companion companion3 = INSTANCE;
        EquityOrderManager equityOrderManager = this.orderManager.get();
        Intrinsics.checkNotNullExpressionValue(equityOrderManager, "get(...)");
        companion3.injectOrderManager(instance, equityOrderManager);
    }

    /* compiled from: EquityDollarOrderParentFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderParentFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderParentFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "orderSingletons", "Lcom/robinhood/android/lib/trade/BaseOrderParentFragmentSingletons;", "orderManager", "Lcom/robinhood/android/equity/submission/EquityOrderManager;", "injectOrderManager", "", "instance", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<EquityDollarOrderParentFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<BaseOrderParentFragmentSingletons> orderSingletons, Provider<EquityOrderManager> orderManager) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(orderSingletons, "orderSingletons");
            Intrinsics.checkNotNullParameter(orderManager, "orderManager");
            return new EquityDollarOrderParentFragment_MembersInjector(singletons, orderSingletons, orderManager);
        }

        @JvmStatic
        public final void injectOrderManager(EquityDollarOrderParentFragment instance, EquityOrderManager orderManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(orderManager, "orderManager");
            instance.setOrderManager(orderManager);
        }
    }
}
