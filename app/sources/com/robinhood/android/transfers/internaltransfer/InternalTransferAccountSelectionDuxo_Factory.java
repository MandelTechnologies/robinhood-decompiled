package com.robinhood.android.transfers.internaltransfer;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.shared.store.user.UserStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalTransferAccountSelectionDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionDuxo;", "transferAccountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class InternalTransferAccountSelectionDuxo_Factory implements Factory<InternalTransferAccountSelectionDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<InternalTransferAccountSelectionStateProvider> stateProvider;
    private final Provider<TransferAccountStore> transferAccountStore;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final InternalTransferAccountSelectionDuxo_Factory create(Provider<TransferAccountStore> provider, Provider<UserStore> provider2, Provider<DuxoBundle> provider3, Provider<InternalTransferAccountSelectionStateProvider> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final InternalTransferAccountSelectionDuxo newInstance(TransferAccountStore transferAccountStore, UserStore userStore, DuxoBundle duxoBundle, InternalTransferAccountSelectionStateProvider internalTransferAccountSelectionStateProvider) {
        return INSTANCE.newInstance(transferAccountStore, userStore, duxoBundle, internalTransferAccountSelectionStateProvider);
    }

    public InternalTransferAccountSelectionDuxo_Factory(Provider<TransferAccountStore> transferAccountStore, Provider<UserStore> userStore, Provider<DuxoBundle> duxoBundle, Provider<InternalTransferAccountSelectionStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.transferAccountStore = transferAccountStore;
        this.userStore = userStore;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public InternalTransferAccountSelectionDuxo get() {
        Companion companion = INSTANCE;
        TransferAccountStore transferAccountStore = this.transferAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(transferAccountStore, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        InternalTransferAccountSelectionStateProvider internalTransferAccountSelectionStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(internalTransferAccountSelectionStateProvider, "get(...)");
        return companion.newInstance(transferAccountStore, userStore, duxoBundle, internalTransferAccountSelectionStateProvider);
    }

    /* compiled from: InternalTransferAccountSelectionDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionDuxo_Factory;", "transferAccountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionStateProvider;", "newInstance", "Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionDuxo;", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InternalTransferAccountSelectionDuxo_Factory create(Provider<TransferAccountStore> transferAccountStore, Provider<UserStore> userStore, Provider<DuxoBundle> duxoBundle, Provider<InternalTransferAccountSelectionStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new InternalTransferAccountSelectionDuxo_Factory(transferAccountStore, userStore, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final InternalTransferAccountSelectionDuxo newInstance(TransferAccountStore transferAccountStore, UserStore userStore, DuxoBundle duxoBundle, InternalTransferAccountSelectionStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new InternalTransferAccountSelectionDuxo(transferAccountStore, userStore, duxoBundle, stateProvider);
        }
    }
}
