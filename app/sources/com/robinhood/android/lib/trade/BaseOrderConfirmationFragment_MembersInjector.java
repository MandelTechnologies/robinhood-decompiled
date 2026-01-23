package com.robinhood.android.lib.trade;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.plt.contract.PltManager;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseOrderConfirmationFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u0013*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0010\b\u0001\u0010\u0003*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00060\u0005:\u0001\u0013B1\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/BaseOrderConfirmationFragment_MembersInjector;", "OrderT", "", "OrderManagerT", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/lib/trade/BaseOrderConfirmationFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "pltManager", "Lcom/robinhood/android/plt/contract/PltManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class BaseOrderConfirmationFragment_MembersInjector<OrderT, OrderManagerT extends OrderSubmissionManager<?, ?>> implements MembersInjector<BaseOrderConfirmationFragment<OrderT, OrderManagerT>> {
    private final Provider<CardManager> cardManager;
    private final Provider<PltManager> pltManager;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final <OrderT, OrderManagerT extends OrderSubmissionManager<?, ?>> MembersInjector<BaseOrderConfirmationFragment<OrderT, OrderManagerT>> create(Provider<BaseFragmentSingletons> provider, Provider<CardManager> provider2, Provider<PltManager> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final <OrderT, OrderManagerT extends OrderSubmissionManager<?, ?>> void injectCardManager(BaseOrderConfirmationFragment<OrderT, OrderManagerT> baseOrderConfirmationFragment, CardManager cardManager) {
        INSTANCE.injectCardManager(baseOrderConfirmationFragment, cardManager);
    }

    @JvmStatic
    public static final <OrderT, OrderManagerT extends OrderSubmissionManager<?, ?>> void injectPltManager(BaseOrderConfirmationFragment<OrderT, OrderManagerT> baseOrderConfirmationFragment, PltManager pltManager) {
        INSTANCE.injectPltManager(baseOrderConfirmationFragment, pltManager);
    }

    public BaseOrderConfirmationFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<CardManager> cardManager, Provider<PltManager> pltManager) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(cardManager, "cardManager");
        Intrinsics.checkNotNullParameter(pltManager, "pltManager");
        this.singletons = singletons;
        this.cardManager = cardManager;
        this.pltManager = pltManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BaseOrderConfirmationFragment<OrderT, OrderManagerT> instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        CardManager cardManager = this.cardManager.get();
        Intrinsics.checkNotNullExpressionValue(cardManager, "get(...)");
        companion2.injectCardManager(instance, cardManager);
        PltManager pltManager = this.pltManager.get();
        Intrinsics.checkNotNullExpressionValue(pltManager, "get(...)");
        companion2.injectPltManager(instance, pltManager);
    }

    /* compiled from: BaseOrderConfirmationFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J`\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u00060\u0005\"\b\b\u0002\u0010\u0007*\u00020\u0001\"\u0010\b\u0003\u0010\b*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bH\u0007J@\u0010\u0011\u001a\u00020\u0012\"\b\b\u0002\u0010\u0007*\u00020\u0001\"\u0010\b\u0003\u0010\b*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0007J@\u0010\u0014\u001a\u00020\u0012\"\b\b\u0002\u0010\u0007*\u00020\u0001\"\u0010\b\u0003\u0010\b*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/BaseOrderConfirmationFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/lib/trade/BaseOrderConfirmationFragment;", "OrderT", "OrderManagerT", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "pltManager", "Lcom/robinhood/android/plt/contract/PltManager;", "injectCardManager", "", "instance", "injectPltManager", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final <OrderT, OrderManagerT extends OrderSubmissionManager<?, ?>> MembersInjector<BaseOrderConfirmationFragment<OrderT, OrderManagerT>> create(Provider<BaseFragmentSingletons> singletons, Provider<CardManager> cardManager, Provider<PltManager> pltManager) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(cardManager, "cardManager");
            Intrinsics.checkNotNullParameter(pltManager, "pltManager");
            return new BaseOrderConfirmationFragment_MembersInjector(singletons, cardManager, pltManager);
        }

        @JvmStatic
        public final <OrderT, OrderManagerT extends OrderSubmissionManager<?, ?>> void injectCardManager(BaseOrderConfirmationFragment<OrderT, OrderManagerT> instance, CardManager cardManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(cardManager, "cardManager");
            instance.setCardManager(cardManager);
        }

        @JvmStatic
        public final <OrderT, OrderManagerT extends OrderSubmissionManager<?, ?>> void injectPltManager(BaseOrderConfirmationFragment<OrderT, OrderManagerT> instance, PltManager pltManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(pltManager, "pltManager");
            instance.setPltManager(pltManager);
        }
    }
}
