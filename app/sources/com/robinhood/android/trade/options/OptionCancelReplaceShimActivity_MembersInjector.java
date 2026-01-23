package com.robinhood.android.trade.options;

import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.OptionOrderStore;
import com.robinhood.librobinhood.data.store.OptionRemoveReplaceOrderConfirmationStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionCancelReplaceShimActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionCancelReplaceShimActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/trade/options/OptionCancelReplaceShimActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "cancelReplaceStore", "Lcom/robinhood/librobinhood/data/store/OptionRemoveReplaceOrderConfirmationStore;", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "positionsV2Store", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OptionCancelReplaceShimActivity_MembersInjector implements MembersInjector<OptionCancelReplaceShimActivity> {
    private final Provider<OptionRemoveReplaceOrderConfirmationStore> cancelReplaceStore;
    private final Provider<OptionOrderStore> optionOrderStore;
    private final Provider<PositionStore> positionStore;
    private final Provider<PositionsV2Store> positionsV2Store;
    private final Provider<BaseActivitySingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<OptionCancelReplaceShimActivity> create(Provider<BaseActivitySingletons> provider, Provider<OptionRemoveReplaceOrderConfirmationStore> provider2, Provider<OptionOrderStore> provider3, Provider<PositionStore> provider4, Provider<PositionsV2Store> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final void injectCancelReplaceStore(OptionCancelReplaceShimActivity optionCancelReplaceShimActivity, OptionRemoveReplaceOrderConfirmationStore optionRemoveReplaceOrderConfirmationStore) {
        INSTANCE.injectCancelReplaceStore(optionCancelReplaceShimActivity, optionRemoveReplaceOrderConfirmationStore);
    }

    @JvmStatic
    public static final void injectOptionOrderStore(OptionCancelReplaceShimActivity optionCancelReplaceShimActivity, OptionOrderStore optionOrderStore) {
        INSTANCE.injectOptionOrderStore(optionCancelReplaceShimActivity, optionOrderStore);
    }

    @JvmStatic
    public static final void injectPositionStore(OptionCancelReplaceShimActivity optionCancelReplaceShimActivity, PositionStore positionStore) {
        INSTANCE.injectPositionStore(optionCancelReplaceShimActivity, positionStore);
    }

    @JvmStatic
    public static final void injectPositionsV2Store(OptionCancelReplaceShimActivity optionCancelReplaceShimActivity, PositionsV2Store positionsV2Store) {
        INSTANCE.injectPositionsV2Store(optionCancelReplaceShimActivity, positionsV2Store);
    }

    public OptionCancelReplaceShimActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<OptionRemoveReplaceOrderConfirmationStore> cancelReplaceStore, Provider<OptionOrderStore> optionOrderStore, Provider<PositionStore> positionStore, Provider<PositionsV2Store> positionsV2Store) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(cancelReplaceStore, "cancelReplaceStore");
        Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(positionsV2Store, "positionsV2Store");
        this.singletons = singletons;
        this.cancelReplaceStore = cancelReplaceStore;
        this.optionOrderStore = optionOrderStore;
        this.positionStore = positionStore;
        this.positionsV2Store = positionsV2Store;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OptionCancelReplaceShimActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        Companion companion2 = INSTANCE;
        OptionRemoveReplaceOrderConfirmationStore optionRemoveReplaceOrderConfirmationStore = this.cancelReplaceStore.get();
        Intrinsics.checkNotNullExpressionValue(optionRemoveReplaceOrderConfirmationStore, "get(...)");
        companion2.injectCancelReplaceStore(instance, optionRemoveReplaceOrderConfirmationStore);
        OptionOrderStore optionOrderStore = this.optionOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(optionOrderStore, "get(...)");
        companion2.injectOptionOrderStore(instance, optionOrderStore);
        PositionStore positionStore = this.positionStore.get();
        Intrinsics.checkNotNullExpressionValue(positionStore, "get(...)");
        companion2.injectPositionStore(instance, positionStore);
        PositionsV2Store positionsV2Store = this.positionsV2Store.get();
        Intrinsics.checkNotNullExpressionValue(positionsV2Store, "get(...)");
        companion2.injectPositionsV2Store(instance, positionsV2Store);
    }

    /* compiled from: OptionCancelReplaceShimActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionCancelReplaceShimActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/trade/options/OptionCancelReplaceShimActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "cancelReplaceStore", "Lcom/robinhood/librobinhood/data/store/OptionRemoveReplaceOrderConfirmationStore;", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "positionsV2Store", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store;", "injectCancelReplaceStore", "", "instance", "injectOptionOrderStore", "injectPositionStore", "injectPositionsV2Store", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<OptionCancelReplaceShimActivity> create(Provider<BaseActivitySingletons> singletons, Provider<OptionRemoveReplaceOrderConfirmationStore> cancelReplaceStore, Provider<OptionOrderStore> optionOrderStore, Provider<PositionStore> positionStore, Provider<PositionsV2Store> positionsV2Store) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(cancelReplaceStore, "cancelReplaceStore");
            Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(positionsV2Store, "positionsV2Store");
            return new OptionCancelReplaceShimActivity_MembersInjector(singletons, cancelReplaceStore, optionOrderStore, positionStore, positionsV2Store);
        }

        @JvmStatic
        public final void injectCancelReplaceStore(OptionCancelReplaceShimActivity instance, OptionRemoveReplaceOrderConfirmationStore cancelReplaceStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(cancelReplaceStore, "cancelReplaceStore");
            instance.setCancelReplaceStore(cancelReplaceStore);
        }

        @JvmStatic
        public final void injectOptionOrderStore(OptionCancelReplaceShimActivity instance, OptionOrderStore optionOrderStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
            instance.setOptionOrderStore(optionOrderStore);
        }

        @JvmStatic
        public final void injectPositionStore(OptionCancelReplaceShimActivity instance, PositionStore positionStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            instance.setPositionStore(positionStore);
        }

        @JvmStatic
        public final void injectPositionsV2Store(OptionCancelReplaceShimActivity instance, PositionsV2Store positionsV2Store) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(positionsV2Store, "positionsV2Store");
            instance.setPositionsV2Store(positionsV2Store);
        }
    }
}
