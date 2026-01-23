package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.transfer.ApiPreCreateTransferResponse;
import com.robinhood.models.api.bonfire.transfer.ApiPreCreateTransferSduiContainer;
import com.robinhood.models.api.bonfire.transfer.PreCreatePopupType;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.extensions.Throwables;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransferPrecreateStore.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0086@¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000RN\u0010\b\u001aB\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\f0\f \u000b* \u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\f0\f\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/TransferPrecreateStore;", "Lcom/robinhood/store/Store;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/store/StoreBundle;)V", "requestsThatWerePrecreated", "Ljava/util/concurrent/ConcurrentHashMap$KeySetView;", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest;", "kotlin.jvm.PlatformType", "", "precreate", "Lcom/robinhood/models/api/bonfire/transfer/ApiPreCreateTransferSduiContainer;", "request", "ignore", "", "Lcom/robinhood/models/api/bonfire/transfer/PreCreatePopupType;", "(Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class TransferPrecreateStore extends Store {
    private final ConcurrentHashMap.KeySetView<ApiCreateTransferRequest, Boolean> requestsThatWerePrecreated;
    private final TransfersBonfireApi transfersBonfireApi;

    /* compiled from: TransferPrecreateStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.TransferPrecreateStore", m3645f = "TransferPrecreateStore.kt", m3646l = {46}, m3647m = "precreate")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.TransferPrecreateStore$precreate$1 */
    static final class C346171 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C346171(Continuation<? super C346171> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransferPrecreateStore.this.precreate(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferPrecreateStore(TransfersBonfireApi transfersBonfireApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.transfersBonfireApi = transfersBonfireApi;
        this.requestsThatWerePrecreated = ConcurrentHashMap.newKeySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object precreate(ApiCreateTransferRequest apiCreateTransferRequest, Set<? extends PreCreatePopupType> set, Continuation<? super ApiPreCreateTransferSduiContainer> continuation) {
        C346171 c346171;
        Object next;
        if (continuation instanceof C346171) {
            c346171 = (C346171) continuation;
            int i = c346171.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c346171.label = i - Integer.MIN_VALUE;
            } else {
                c346171 = new C346171(continuation);
            }
        }
        Object preCreateTransferContent = c346171.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c346171.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(preCreateTransferContent);
                if (this.requestsThatWerePrecreated.contains(apiCreateTransferRequest)) {
                    return null;
                }
                TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi;
                c346171.L$0 = apiCreateTransferRequest;
                c346171.L$1 = set;
                c346171.label = 1;
                preCreateTransferContent = transfersBonfireApi.getPreCreateTransferContent(apiCreateTransferRequest, c346171);
                if (preCreateTransferContent == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                set = (Set) c346171.L$1;
                apiCreateTransferRequest = (ApiCreateTransferRequest) c346171.L$0;
                ResultKt.throwOnFailure(preCreateTransferContent);
            }
            this.requestsThatWerePrecreated.add(apiCreateTransferRequest);
            Iterator<T> it = ((ApiPreCreateTransferResponse) preCreateTransferContent).getPreTransferActions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (!set.contains(((ApiPreCreateTransferSduiContainer) next).getType())) {
                    break;
                }
            }
            return (ApiPreCreateTransferSduiContainer) next;
        } catch (Throwable th) {
            if (Throwables.isNetworkRelated(th)) {
                return null;
            }
            throw th;
        }
    }
}
