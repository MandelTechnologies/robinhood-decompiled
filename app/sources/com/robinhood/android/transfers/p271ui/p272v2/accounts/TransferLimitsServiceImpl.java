package com.robinhood.android.transfers.p271ui.p272v2.accounts;

import com.robinhood.lib.transfers.contracts.TransferLimitsService;
import com.robinhood.lib.transfers.contracts.models.TransferLimits;
import com.robinhood.librobinhood.data.store.bonfire.TransferV2LimitsStore;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiLimitsHubResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransferLimitsServiceImpl.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0096@¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/accounts/TransferLimitsServiceImpl;", "Lcom/robinhood/lib/transfers/contracts/TransferLimitsService;", "transferLimitsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferV2LimitsStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/TransferV2LimitsStore;)V", "getTransferLimits", "", "Lcom/robinhood/lib/transfers/contracts/models/TransferLimits;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class TransferLimitsServiceImpl implements TransferLimitsService {
    public static final int $stable = 8;
    private final TransferV2LimitsStore transferLimitsStore;

    public TransferLimitsServiceImpl(TransferV2LimitsStore transferLimitsStore) {
        Intrinsics.checkNotNullParameter(transferLimitsStore, "transferLimitsStore");
        this.transferLimitsStore = transferLimitsStore;
    }

    @Override // com.robinhood.lib.transfers.contracts.TransferLimitsService
    public Object getTransferLimits(Continuation<? super List<TransferLimits>> continuation) {
        Collection<ApiLimitsHubResponse> cachedTransferLimits = this.transferLimitsStore.getCachedTransferLimits();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(cachedTransferLimits, 10));
        for (ApiLimitsHubResponse apiLimitsHubResponse : cachedTransferLimits) {
            Intrinsics.checkNotNull(apiLimitsHubResponse);
            arrayList.add(TransferLimits2.toMicrogramTransferLimits(apiLimitsHubResponse));
        }
        return arrayList;
    }
}
