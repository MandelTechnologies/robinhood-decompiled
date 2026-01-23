package com.robinhood.android.history.p153ui;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.LegacyAcatsTransferStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LegacyAcatsTransferDetailFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/history/ui/LegacyAcatsTransferDetailFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/history/ui/LegacyAcatsTransferDetailFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "acatsTransferStore", "Lcom/robinhood/librobinhood/data/store/LegacyAcatsTransferStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class LegacyAcatsTransferDetailFragment_MembersInjector implements MembersInjector<LegacyAcatsTransferDetailFragment> {
    private final Provider<LegacyAcatsTransferStore> acatsTransferStore;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<LegacyAcatsTransferDetailFragment> create(Provider<BaseFragmentSingletons> provider, Provider<LegacyAcatsTransferStore> provider2, Provider<InstrumentStore> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final void injectAcatsTransferStore(LegacyAcatsTransferDetailFragment legacyAcatsTransferDetailFragment, LegacyAcatsTransferStore legacyAcatsTransferStore) {
        INSTANCE.injectAcatsTransferStore(legacyAcatsTransferDetailFragment, legacyAcatsTransferStore);
    }

    @JvmStatic
    public static final void injectInstrumentStore(LegacyAcatsTransferDetailFragment legacyAcatsTransferDetailFragment, InstrumentStore instrumentStore) {
        INSTANCE.injectInstrumentStore(legacyAcatsTransferDetailFragment, instrumentStore);
    }

    public LegacyAcatsTransferDetailFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<LegacyAcatsTransferStore> acatsTransferStore, Provider<InstrumentStore> instrumentStore) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(acatsTransferStore, "acatsTransferStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        this.singletons = singletons;
        this.acatsTransferStore = acatsTransferStore;
        this.instrumentStore = instrumentStore;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(LegacyAcatsTransferDetailFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        LegacyAcatsTransferStore legacyAcatsTransferStore = this.acatsTransferStore.get();
        Intrinsics.checkNotNullExpressionValue(legacyAcatsTransferStore, "get(...)");
        companion2.injectAcatsTransferStore(instance, legacyAcatsTransferStore);
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        companion2.injectInstrumentStore(instance, instrumentStore);
    }

    /* compiled from: LegacyAcatsTransferDetailFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/history/ui/LegacyAcatsTransferDetailFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/history/ui/LegacyAcatsTransferDetailFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "acatsTransferStore", "Lcom/robinhood/librobinhood/data/store/LegacyAcatsTransferStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "injectAcatsTransferStore", "", "instance", "injectInstrumentStore", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<LegacyAcatsTransferDetailFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<LegacyAcatsTransferStore> acatsTransferStore, Provider<InstrumentStore> instrumentStore) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(acatsTransferStore, "acatsTransferStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            return new LegacyAcatsTransferDetailFragment_MembersInjector(singletons, acatsTransferStore, instrumentStore);
        }

        @JvmStatic
        public final void injectAcatsTransferStore(LegacyAcatsTransferDetailFragment instance, LegacyAcatsTransferStore acatsTransferStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(acatsTransferStore, "acatsTransferStore");
            instance.setAcatsTransferStore(acatsTransferStore);
        }

        @JvmStatic
        public final void injectInstrumentStore(LegacyAcatsTransferDetailFragment instance, InstrumentStore instrumentStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            instance.setInstrumentStore(instrumentStore);
        }
    }
}
