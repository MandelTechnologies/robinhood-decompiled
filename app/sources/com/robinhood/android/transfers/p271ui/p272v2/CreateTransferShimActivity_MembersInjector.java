package com.robinhood.android.transfers.p271ui.p272v2;

import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferV2LimitsStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTransferShimActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferShimActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferShimActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "experimentStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "transferLimitsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferV2LimitsStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class CreateTransferShimActivity_MembersInjector implements MembersInjector<CreateTransferShimActivity> {
    private final Provider<ExperimentsStore> experimentStore;
    private final Provider<BaseActivitySingletons> singletons;
    private final Provider<TransferV2LimitsStore> transferLimitsStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<CreateTransferShimActivity> create(Provider<BaseActivitySingletons> provider, Provider<ExperimentsStore> provider2, Provider<TransferV2LimitsStore> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final void injectExperimentStore(CreateTransferShimActivity createTransferShimActivity, ExperimentsStore experimentsStore) {
        INSTANCE.injectExperimentStore(createTransferShimActivity, experimentsStore);
    }

    @JvmStatic
    public static final void injectTransferLimitsStore(CreateTransferShimActivity createTransferShimActivity, TransferV2LimitsStore transferV2LimitsStore) {
        INSTANCE.injectTransferLimitsStore(createTransferShimActivity, transferV2LimitsStore);
    }

    public CreateTransferShimActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<ExperimentsStore> experimentStore, Provider<TransferV2LimitsStore> transferLimitsStore) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(experimentStore, "experimentStore");
        Intrinsics.checkNotNullParameter(transferLimitsStore, "transferLimitsStore");
        this.singletons = singletons;
        this.experimentStore = experimentStore;
        this.transferLimitsStore = transferLimitsStore;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CreateTransferShimActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        Companion companion2 = INSTANCE;
        ExperimentsStore experimentsStore = this.experimentStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        companion2.injectExperimentStore(instance, experimentsStore);
        TransferV2LimitsStore transferV2LimitsStore = this.transferLimitsStore.get();
        Intrinsics.checkNotNullExpressionValue(transferV2LimitsStore, "get(...)");
        companion2.injectTransferLimitsStore(instance, transferV2LimitsStore);
    }

    /* compiled from: CreateTransferShimActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferShimActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferShimActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "experimentStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "transferLimitsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferV2LimitsStore;", "injectExperimentStore", "", "instance", "injectTransferLimitsStore", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<CreateTransferShimActivity> create(Provider<BaseActivitySingletons> singletons, Provider<ExperimentsStore> experimentStore, Provider<TransferV2LimitsStore> transferLimitsStore) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(experimentStore, "experimentStore");
            Intrinsics.checkNotNullParameter(transferLimitsStore, "transferLimitsStore");
            return new CreateTransferShimActivity_MembersInjector(singletons, experimentStore, transferLimitsStore);
        }

        @JvmStatic
        public final void injectExperimentStore(CreateTransferShimActivity instance, ExperimentsStore experimentStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(experimentStore, "experimentStore");
            instance.setExperimentStore(experimentStore);
        }

        @JvmStatic
        public final void injectTransferLimitsStore(CreateTransferShimActivity instance, TransferV2LimitsStore transferLimitsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(transferLimitsStore, "transferLimitsStore");
            instance.setTransferLimitsStore(transferLimitsStore);
        }
    }
}
