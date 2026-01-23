package com.robinhood.android.iav.p154ui.update;

import androidx.lifecycle.SavedStateHandle;
import bff_money_movement.service.p019v1.BffMoneyMovementService;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AutomaticDepositStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlaidDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/update/PlaidDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/iav/ui/update/PlaidDuxo;", "automaticDepositStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;", "bffMoneyMovementService", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "packageName", "", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class PlaidDuxo_Factory implements Factory<PlaidDuxo> {
    private final Provider<AutomaticDepositStore> automaticDepositStore;
    private final Provider<BffMoneyMovementService> bffMoneyMovementService;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<String> packageName;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<TransfersBonfireApi> transfersBonfireApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PlaidDuxo_Factory create(Provider<AutomaticDepositStore> provider, Provider<BffMoneyMovementService> provider2, Provider<TransfersBonfireApi> provider3, Provider<SavedStateHandle> provider4, Provider<String> provider5, Provider<DuxoBundle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final PlaidDuxo newInstance(AutomaticDepositStore automaticDepositStore, BffMoneyMovementService bffMoneyMovementService, TransfersBonfireApi transfersBonfireApi, SavedStateHandle savedStateHandle, String str, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(automaticDepositStore, bffMoneyMovementService, transfersBonfireApi, savedStateHandle, str, duxoBundle);
    }

    public PlaidDuxo_Factory(Provider<AutomaticDepositStore> automaticDepositStore, Provider<BffMoneyMovementService> bffMoneyMovementService, Provider<TransfersBonfireApi> transfersBonfireApi, Provider<SavedStateHandle> savedStateHandle, Provider<String> packageName, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(automaticDepositStore, "automaticDepositStore");
        Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.automaticDepositStore = automaticDepositStore;
        this.bffMoneyMovementService = bffMoneyMovementService;
        this.transfersBonfireApi = transfersBonfireApi;
        this.savedStateHandle = savedStateHandle;
        this.packageName = packageName;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public PlaidDuxo get() {
        Companion companion = INSTANCE;
        AutomaticDepositStore automaticDepositStore = this.automaticDepositStore.get();
        Intrinsics.checkNotNullExpressionValue(automaticDepositStore, "get(...)");
        BffMoneyMovementService bffMoneyMovementService = this.bffMoneyMovementService.get();
        Intrinsics.checkNotNullExpressionValue(bffMoneyMovementService, "get(...)");
        TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(transfersBonfireApi, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        String str = this.packageName.get();
        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(automaticDepositStore, bffMoneyMovementService, transfersBonfireApi, savedStateHandle, str, duxoBundle);
    }

    /* compiled from: PlaidDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/update/PlaidDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/iav/ui/update/PlaidDuxo_Factory;", "automaticDepositStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;", "bffMoneyMovementService", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "packageName", "", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/iav/ui/update/PlaidDuxo;", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PlaidDuxo_Factory create(Provider<AutomaticDepositStore> automaticDepositStore, Provider<BffMoneyMovementService> bffMoneyMovementService, Provider<TransfersBonfireApi> transfersBonfireApi, Provider<SavedStateHandle> savedStateHandle, Provider<String> packageName, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(automaticDepositStore, "automaticDepositStore");
            Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new PlaidDuxo_Factory(automaticDepositStore, bffMoneyMovementService, transfersBonfireApi, savedStateHandle, packageName, duxoBundle);
        }

        @JvmStatic
        public final PlaidDuxo newInstance(AutomaticDepositStore automaticDepositStore, BffMoneyMovementService bffMoneyMovementService, TransfersBonfireApi transfersBonfireApi, SavedStateHandle savedStateHandle, String packageName, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(automaticDepositStore, "automaticDepositStore");
            Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new PlaidDuxo(automaticDepositStore, bffMoneyMovementService, transfersBonfireApi, savedStateHandle, packageName, duxoBundle);
        }
    }
}
