package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiLimitsHubBulkResponse;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiLimitsHubResponse;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiLimitsHubResponseDetails;
import com.robinhood.models.api.bonfire.transfer.limitsv1.TransferProductType;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransferLimitsStore.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\b\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nj\u0002`\r\u0012\u0004\u0012\u00020\u000e0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/TransferLimitsStore;", "Lcom/robinhood/store/Store;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/store/StoreBundle;)V", "cache", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/Pair;", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/TransferProductType;", "Lcom/robinhood/models/db/TransferDirection;", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferLimitsKey;", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiLimitsHubResponse;", "getTransferLimits", "direction", "transferProductType", "(Lcom/robinhood/models/db/TransferDirection;Lcom/robinhood/models/api/bonfire/transfer/limitsv1/TransferProductType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class TransferLimitsStore extends Store {
    private final ConcurrentHashMap<Tuples2<TransferProductType, TransferDirection>, ApiLimitsHubResponse> cache;
    private final TransfersBonfireApi transfersBonfireApi;

    /* compiled from: TransferLimitsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.TransferLimitsStore", m3645f = "TransferLimitsStore.kt", m3646l = {27}, m3647m = "getTransferLimits")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.TransferLimitsStore$getTransferLimits$1 */
    static final class C346161 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C346161(Continuation<? super C346161> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransferLimitsStore.this.getTransferLimits(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferLimitsStore(TransfersBonfireApi transfersBonfireApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.transfersBonfireApi = transfersBonfireApi;
        this.cache = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getTransferLimits(TransferDirection transferDirection, TransferProductType transferProductType, Continuation<? super ApiLimitsHubResponse> continuation) {
        C346161 c346161;
        Tuples2<TransferProductType, TransferDirection> tuples2M3642to;
        Object transferLimitsV1$default;
        if (continuation instanceof C346161) {
            c346161 = (C346161) continuation;
            int i = c346161.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c346161.label = i - Integer.MIN_VALUE;
            } else {
                c346161 = new C346161(continuation);
            }
        }
        C346161 c3461612 = c346161;
        Object obj = c3461612.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3461612.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            tuples2M3642to = Tuples4.m3642to(transferProductType, transferDirection);
            ApiLimitsHubResponse apiLimitsHubResponse = this.cache.get(tuples2M3642to);
            if (apiLimitsHubResponse != null) {
                return apiLimitsHubResponse;
            }
            TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi;
            List listListOf = CollectionsKt.listOf(transferProductType);
            c3461612.L$0 = transferDirection;
            c3461612.L$1 = tuples2M3642to;
            c3461612.label = 1;
            transferLimitsV1$default = TransfersBonfireApi.DefaultImpls.getTransferLimitsV1$default(transfersBonfireApi, null, listListOf, c3461612, 1, null);
            if (transferLimitsV1$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Tuples2<TransferProductType, TransferDirection> tuples2 = (Tuples2) c3461612.L$1;
            TransferDirection transferDirection2 = (TransferDirection) c3461612.L$0;
            ResultKt.throwOnFailure(obj);
            tuples2M3642to = tuples2;
            transferDirection = transferDirection2;
            transferLimitsV1$default = obj;
        }
        for (ApiLimitsHubResponse apiLimitsHubResponse2 : ((ApiLimitsHubBulkResponse) transferLimitsV1$default).getProduct_limits()) {
            ApiLimitsHubResponseDetails details = apiLimitsHubResponse2.getDetails();
            if ((details != null ? details.getDirection() : null) == transferDirection) {
                this.cache.put(tuples2M3642to, apiLimitsHubResponse2);
                return apiLimitsHubResponse2;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
