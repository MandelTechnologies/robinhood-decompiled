package com.robinhood.android.internalassettransfers.history;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.jointaccounts.api.JointAccountsApi;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.internalassettransfers.data.store.InternalAssetTransfersStore;
import com.robinhood.shared.store.user.UserStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferHistoryDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryDuxo;", "internalAssetTransfersStore", "Ljavax/inject/Provider;", "Lcom/robinhood/internalassettransfers/data/store/InternalAssetTransfersStore;", "jointAccountsApi", "Lcom/robinhood/android/jointaccounts/api/JointAccountsApi;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "stateProvider", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class InternalAssetTransferHistoryDuxo_Factory implements Factory<InternalAssetTransferHistoryDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<InternalAssetTransfersStore> internalAssetTransfersStore;
    private final Provider<JointAccountsApi> jointAccountsApi;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<InternalAssetTransferHistoryStateProvider> stateProvider;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final InternalAssetTransferHistoryDuxo_Factory create(Provider<InternalAssetTransfersStore> provider, Provider<JointAccountsApi> provider2, Provider<UserStore> provider3, Provider<AccountProvider> provider4, Provider<InternalAssetTransferHistoryStateProvider> provider5, Provider<DuxoBundle> provider6, Provider<SavedStateHandle> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final InternalAssetTransferHistoryDuxo newInstance(InternalAssetTransfersStore internalAssetTransfersStore, JointAccountsApi jointAccountsApi, UserStore userStore, AccountProvider accountProvider, InternalAssetTransferHistoryStateProvider internalAssetTransferHistoryStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(internalAssetTransfersStore, jointAccountsApi, userStore, accountProvider, internalAssetTransferHistoryStateProvider, duxoBundle, savedStateHandle);
    }

    public InternalAssetTransferHistoryDuxo_Factory(Provider<InternalAssetTransfersStore> internalAssetTransfersStore, Provider<JointAccountsApi> jointAccountsApi, Provider<UserStore> userStore, Provider<AccountProvider> accountProvider, Provider<InternalAssetTransferHistoryStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(internalAssetTransfersStore, "internalAssetTransfersStore");
        Intrinsics.checkNotNullParameter(jointAccountsApi, "jointAccountsApi");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.internalAssetTransfersStore = internalAssetTransfersStore;
        this.jointAccountsApi = jointAccountsApi;
        this.userStore = userStore;
        this.accountProvider = accountProvider;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public InternalAssetTransferHistoryDuxo get() {
        Companion companion = INSTANCE;
        InternalAssetTransfersStore internalAssetTransfersStore = this.internalAssetTransfersStore.get();
        Intrinsics.checkNotNullExpressionValue(internalAssetTransfersStore, "get(...)");
        JointAccountsApi jointAccountsApi = this.jointAccountsApi.get();
        Intrinsics.checkNotNullExpressionValue(jointAccountsApi, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        InternalAssetTransferHistoryStateProvider internalAssetTransferHistoryStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(internalAssetTransferHistoryStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(internalAssetTransfersStore, jointAccountsApi, userStore, accountProvider, internalAssetTransferHistoryStateProvider, duxoBundle, savedStateHandle);
    }

    /* compiled from: InternalAssetTransferHistoryDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryDuxo_Factory;", "internalAssetTransfersStore", "Ljavax/inject/Provider;", "Lcom/robinhood/internalassettransfers/data/store/InternalAssetTransfersStore;", "jointAccountsApi", "Lcom/robinhood/android/jointaccounts/api/JointAccountsApi;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "stateProvider", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryDuxo;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InternalAssetTransferHistoryDuxo_Factory create(Provider<InternalAssetTransfersStore> internalAssetTransfersStore, Provider<JointAccountsApi> jointAccountsApi, Provider<UserStore> userStore, Provider<AccountProvider> accountProvider, Provider<InternalAssetTransferHistoryStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(internalAssetTransfersStore, "internalAssetTransfersStore");
            Intrinsics.checkNotNullParameter(jointAccountsApi, "jointAccountsApi");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new InternalAssetTransferHistoryDuxo_Factory(internalAssetTransfersStore, jointAccountsApi, userStore, accountProvider, stateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final InternalAssetTransferHistoryDuxo newInstance(InternalAssetTransfersStore internalAssetTransfersStore, JointAccountsApi jointAccountsApi, UserStore userStore, AccountProvider accountProvider, InternalAssetTransferHistoryStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(internalAssetTransfersStore, "internalAssetTransfersStore");
            Intrinsics.checkNotNullParameter(jointAccountsApi, "jointAccountsApi");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new InternalAssetTransferHistoryDuxo(internalAssetTransfersStore, jointAccountsApi, userStore, accountProvider, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}
