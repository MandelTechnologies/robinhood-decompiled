package com.robinhood.android.transfers.p271ui.p272v2.additionaldata;

import bff_money_movement.service.p019v1.BffMoneyMovementService;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTransferV2AdditionalDataClient_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient;", "bffMoneyMovementService", "Ljavax/inject/Provider;", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class CreateTransferV2AdditionalDataClient_Factory implements Factory<CreateTransferV2AdditionalDataClient> {
    private final Provider<BffMoneyMovementService> bffMoneyMovementService;
    private final Provider<LazyMoshi> moshi;
    private final Provider<TransfersBonfireApi> transfersBonfireApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CreateTransferV2AdditionalDataClient_Factory create(Provider<BffMoneyMovementService> provider, Provider<TransfersBonfireApi> provider2, Provider<LazyMoshi> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final CreateTransferV2AdditionalDataClient newInstance(BffMoneyMovementService bffMoneyMovementService, TransfersBonfireApi transfersBonfireApi, LazyMoshi lazyMoshi) {
        return INSTANCE.newInstance(bffMoneyMovementService, transfersBonfireApi, lazyMoshi);
    }

    public CreateTransferV2AdditionalDataClient_Factory(Provider<BffMoneyMovementService> bffMoneyMovementService, Provider<TransfersBonfireApi> transfersBonfireApi, Provider<LazyMoshi> moshi) {
        Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.bffMoneyMovementService = bffMoneyMovementService;
        this.transfersBonfireApi = transfersBonfireApi;
        this.moshi = moshi;
    }

    @Override // javax.inject.Provider
    public CreateTransferV2AdditionalDataClient get() {
        Companion companion = INSTANCE;
        BffMoneyMovementService bffMoneyMovementService = this.bffMoneyMovementService.get();
        Intrinsics.checkNotNullExpressionValue(bffMoneyMovementService, "get(...)");
        TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(transfersBonfireApi, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        return companion.newInstance(bffMoneyMovementService, transfersBonfireApi, lazyMoshi);
    }

    /* compiled from: CreateTransferV2AdditionalDataClient_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient_Factory;", "bffMoneyMovementService", "Ljavax/inject/Provider;", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "newInstance", "Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CreateTransferV2AdditionalDataClient_Factory create(Provider<BffMoneyMovementService> bffMoneyMovementService, Provider<TransfersBonfireApi> transfersBonfireApi, Provider<LazyMoshi> moshi) {
            Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            return new CreateTransferV2AdditionalDataClient_Factory(bffMoneyMovementService, transfersBonfireApi, moshi);
        }

        @JvmStatic
        public final CreateTransferV2AdditionalDataClient newInstance(BffMoneyMovementService bffMoneyMovementService, TransfersBonfireApi transfersBonfireApi, LazyMoshi moshi) {
            Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            return new CreateTransferV2AdditionalDataClient(bffMoneyMovementService, transfersBonfireApi, moshi);
        }
    }
}
