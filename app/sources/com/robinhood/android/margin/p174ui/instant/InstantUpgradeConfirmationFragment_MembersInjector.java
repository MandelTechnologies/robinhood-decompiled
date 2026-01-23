package com.robinhood.android.margin.p174ui.instant;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.store.margin.MarginUpgradeStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstantUpgradeConfirmationFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/instant/InstantUpgradeConfirmationFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeConfirmationFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "marginUpgradeStore", "Lcom/robinhood/android/lib/store/margin/MarginUpgradeStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class InstantUpgradeConfirmationFragment_MembersInjector implements MembersInjector<InstantUpgradeConfirmationFragment> {
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<MarginUpgradeStore> marginUpgradeStore;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<InstantUpgradeConfirmationFragment> create(Provider<BaseFragmentSingletons> provider, Provider<MarginUpgradeStore> provider2, Provider<ExperimentsStore> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final void injectExperimentsStore(InstantUpgradeConfirmationFragment instantUpgradeConfirmationFragment, ExperimentsStore experimentsStore) {
        INSTANCE.injectExperimentsStore(instantUpgradeConfirmationFragment, experimentsStore);
    }

    @JvmStatic
    public static final void injectMarginUpgradeStore(InstantUpgradeConfirmationFragment instantUpgradeConfirmationFragment, MarginUpgradeStore marginUpgradeStore) {
        INSTANCE.injectMarginUpgradeStore(instantUpgradeConfirmationFragment, marginUpgradeStore);
    }

    public InstantUpgradeConfirmationFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<MarginUpgradeStore> marginUpgradeStore, Provider<ExperimentsStore> experimentsStore) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(marginUpgradeStore, "marginUpgradeStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        this.singletons = singletons;
        this.marginUpgradeStore = marginUpgradeStore;
        this.experimentsStore = experimentsStore;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(InstantUpgradeConfirmationFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        MarginUpgradeStore marginUpgradeStore = this.marginUpgradeStore.get();
        Intrinsics.checkNotNullExpressionValue(marginUpgradeStore, "get(...)");
        companion2.injectMarginUpgradeStore(instance, marginUpgradeStore);
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        companion2.injectExperimentsStore(instance, experimentsStore);
    }

    /* compiled from: InstantUpgradeConfirmationFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/instant/InstantUpgradeConfirmationFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeConfirmationFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "marginUpgradeStore", "Lcom/robinhood/android/lib/store/margin/MarginUpgradeStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "injectMarginUpgradeStore", "", "instance", "injectExperimentsStore", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<InstantUpgradeConfirmationFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<MarginUpgradeStore> marginUpgradeStore, Provider<ExperimentsStore> experimentsStore) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(marginUpgradeStore, "marginUpgradeStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            return new InstantUpgradeConfirmationFragment_MembersInjector(singletons, marginUpgradeStore, experimentsStore);
        }

        @JvmStatic
        public final void injectMarginUpgradeStore(InstantUpgradeConfirmationFragment instance, MarginUpgradeStore marginUpgradeStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(marginUpgradeStore, "marginUpgradeStore");
            instance.setMarginUpgradeStore(marginUpgradeStore);
        }

        @JvmStatic
        public final void injectExperimentsStore(InstantUpgradeConfirmationFragment instance, ExperimentsStore experimentsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            instance.setExperimentsStore(experimentsStore);
        }
    }
}
