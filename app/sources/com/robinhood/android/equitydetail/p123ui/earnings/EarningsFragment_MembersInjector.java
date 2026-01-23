package com.robinhood.android.equitydetail.p123ui.earnings;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.InstrumentPositionStore;
import com.robinhood.shared.equities.models.store.TraderEarningStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EarningsFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/earnings/EarningsFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/equitydetail/ui/earnings/EarningsFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "earningStore", "Lcom/robinhood/shared/equities/models/store/TraderEarningStore;", "instrumentPositionStore", "Lcom/robinhood/librobinhood/data/store/InstrumentPositionStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class EarningsFragment_MembersInjector implements MembersInjector<EarningsFragment> {
    private final Provider<TraderEarningStore> earningStore;
    private final Provider<InstrumentPositionStore> instrumentPositionStore;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<EarningsFragment> create(Provider<BaseFragmentSingletons> provider, Provider<TraderEarningStore> provider2, Provider<InstrumentPositionStore> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final void injectEarningStore(EarningsFragment earningsFragment, TraderEarningStore traderEarningStore) {
        INSTANCE.injectEarningStore(earningsFragment, traderEarningStore);
    }

    @JvmStatic
    public static final void injectInstrumentPositionStore(EarningsFragment earningsFragment, InstrumentPositionStore instrumentPositionStore) {
        INSTANCE.injectInstrumentPositionStore(earningsFragment, instrumentPositionStore);
    }

    public EarningsFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<TraderEarningStore> earningStore, Provider<InstrumentPositionStore> instrumentPositionStore) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(earningStore, "earningStore");
        Intrinsics.checkNotNullParameter(instrumentPositionStore, "instrumentPositionStore");
        this.singletons = singletons;
        this.earningStore = earningStore;
        this.instrumentPositionStore = instrumentPositionStore;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(EarningsFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        TraderEarningStore traderEarningStore = this.earningStore.get();
        Intrinsics.checkNotNullExpressionValue(traderEarningStore, "get(...)");
        companion2.injectEarningStore(instance, traderEarningStore);
        InstrumentPositionStore instrumentPositionStore = this.instrumentPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentPositionStore, "get(...)");
        companion2.injectInstrumentPositionStore(instance, instrumentPositionStore);
    }

    /* compiled from: EarningsFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/earnings/EarningsFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/equitydetail/ui/earnings/EarningsFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "earningStore", "Lcom/robinhood/shared/equities/models/store/TraderEarningStore;", "instrumentPositionStore", "Lcom/robinhood/librobinhood/data/store/InstrumentPositionStore;", "injectEarningStore", "", "instance", "injectInstrumentPositionStore", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<EarningsFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<TraderEarningStore> earningStore, Provider<InstrumentPositionStore> instrumentPositionStore) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(earningStore, "earningStore");
            Intrinsics.checkNotNullParameter(instrumentPositionStore, "instrumentPositionStore");
            return new EarningsFragment_MembersInjector(singletons, earningStore, instrumentPositionStore);
        }

        @JvmStatic
        public final void injectEarningStore(EarningsFragment instance, TraderEarningStore earningStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(earningStore, "earningStore");
            instance.setEarningStore(earningStore);
        }

        @JvmStatic
        public final void injectInstrumentPositionStore(EarningsFragment instance, InstrumentPositionStore instrumentPositionStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(instrumentPositionStore, "instrumentPositionStore");
            instance.setInstrumentPositionStore(instrumentPositionStore);
        }
    }
}
