package com.robinhood.android.lib.trade;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseOrderParentFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f*\u0010\b\u0000\u0010\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003:\u0001\u000fB#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/BaseOrderParentFragment_MembersInjector;", "OrderManagerT", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/lib/trade/BaseOrderParentFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "orderSingletons", "Lcom/robinhood/android/lib/trade/BaseOrderParentFragmentSingletons;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class BaseOrderParentFragment_MembersInjector<OrderManagerT extends OrderSubmissionManager<?, ?>> implements MembersInjector<BaseOrderParentFragment<OrderManagerT>> {
    private final Provider<BaseOrderParentFragmentSingletons> orderSingletons;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final <OrderManagerT extends OrderSubmissionManager<?, ?>> MembersInjector<BaseOrderParentFragment<OrderManagerT>> create(Provider<BaseFragmentSingletons> provider, Provider<BaseOrderParentFragmentSingletons> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final <OrderManagerT extends OrderSubmissionManager<?, ?>> void injectOrderSingletons(BaseOrderParentFragment<OrderManagerT> baseOrderParentFragment, BaseOrderParentFragmentSingletons baseOrderParentFragmentSingletons) {
        INSTANCE.injectOrderSingletons(baseOrderParentFragment, baseOrderParentFragmentSingletons);
    }

    public BaseOrderParentFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<BaseOrderParentFragmentSingletons> orderSingletons) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(orderSingletons, "orderSingletons");
        this.singletons = singletons;
        this.orderSingletons = orderSingletons;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BaseOrderParentFragment<OrderManagerT> instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        BaseOrderParentFragmentSingletons baseOrderParentFragmentSingletons = this.orderSingletons.get();
        Intrinsics.checkNotNullExpressionValue(baseOrderParentFragmentSingletons, "get(...)");
        companion2.injectOrderSingletons(instance, baseOrderParentFragmentSingletons);
    }

    /* compiled from: BaseOrderParentFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00060\u0005\"\u0010\b\u0001\u0010\u0007*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u0007J0\u0010\u000e\u001a\u00020\u000f\"\u0010\b\u0001\u0010\u0007*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/BaseOrderParentFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/lib/trade/BaseOrderParentFragment;", "OrderManagerT", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "orderSingletons", "Lcom/robinhood/android/lib/trade/BaseOrderParentFragmentSingletons;", "injectOrderSingletons", "", "instance", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final <OrderManagerT extends OrderSubmissionManager<?, ?>> MembersInjector<BaseOrderParentFragment<OrderManagerT>> create(Provider<BaseFragmentSingletons> singletons, Provider<BaseOrderParentFragmentSingletons> orderSingletons) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(orderSingletons, "orderSingletons");
            return new BaseOrderParentFragment_MembersInjector(singletons, orderSingletons);
        }

        @JvmStatic
        public final <OrderManagerT extends OrderSubmissionManager<?, ?>> void injectOrderSingletons(BaseOrderParentFragment<OrderManagerT> instance, BaseOrderParentFragmentSingletons orderSingletons) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(orderSingletons, "orderSingletons");
            instance.setOrderSingletons(orderSingletons);
        }
    }
}
