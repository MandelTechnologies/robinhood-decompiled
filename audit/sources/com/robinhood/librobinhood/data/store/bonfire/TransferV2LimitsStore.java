package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiLimitsHubBulkResponse;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiLimitsHubResponse;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiLimitsHubResponseDetails;
import com.robinhood.models.api.bonfire.transfer.limitsv1.TransferProductType;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TransferV2LimitsStore.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000f\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nj\u0002`\r\u0012\u0004\u0012\u00020\u000e0\u0010H\u0086@¢\u0006\u0002\u0010\u0011J,\u0010\u0012\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nj\u0002`\r\u0012\u0004\u0012\u00020\u000e0\u0010H\u0082@¢\u0006\u0002\u0010\u0011J\u0011\u0010\u0013\u001a\r\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u00150\u0014J\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\b\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nj\u0002`\r\u0012\u0004\u0012\u00020\u000e0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/TransferV2LimitsStore;", "Lcom/robinhood/store/Store;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/store/StoreBundle;)V", "cache", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/Pair;", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/TransferProductType;", "Lcom/robinhood/models/db/TransferDirection;", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferLimitsKey;", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiLimitsHubResponse;", "getAllTransferLimits", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAndCacheLimits", "getCachedTransferLimits", "", "Lkotlin/jvm/internal/EnhancedNullability;", "refresh", "", "lib-store-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class TransferV2LimitsStore extends Store {
    private final ConcurrentHashMap<Tuples2<TransferProductType, TransferDirection>, ApiLimitsHubResponse> cache;
    private final TransfersBonfireApi transfersBonfireApi;

    /* compiled from: TransferV2LimitsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.TransferV2LimitsStore", m3645f = "TransferV2LimitsStore.kt", m3646l = {31}, m3647m = "fetchAndCacheLimits")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.TransferV2LimitsStore$fetchAndCacheLimits$1 */
    static final class C346181 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C346181(Continuation<? super C346181> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransferV2LimitsStore.this.fetchAndCacheLimits(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferV2LimitsStore(TransfersBonfireApi transfersBonfireApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.transfersBonfireApi = transfersBonfireApi;
        this.cache = new ConcurrentHashMap<>();
    }

    public final Object getAllTransferLimits(Continuation<? super Map<Tuples2<TransferProductType, TransferDirection>, ApiLimitsHubResponse>> continuation) {
        if (!this.cache.isEmpty()) {
            return MapsKt.toMap(this.cache);
        }
        return fetchAndCacheLimits(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchAndCacheLimits(Continuation<? super Map<Tuples2<TransferProductType, TransferDirection>, ApiLimitsHubResponse>> continuation) {
        C346181 c346181;
        if (continuation instanceof C346181) {
            c346181 = (C346181) continuation;
            int i = c346181.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c346181.label = i - Integer.MIN_VALUE;
            } else {
                c346181 = new C346181(continuation);
            }
        }
        C346181 c3461812 = c346181;
        Object transferLimitsV1$default = c3461812.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3461812.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(transferLimitsV1$default);
                TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi;
                c3461812.label = 1;
                transferLimitsV1$default = TransfersBonfireApi.DefaultImpls.getTransferLimitsV1$default(transfersBonfireApi, null, null, c3461812, 1, null);
                if (transferLimitsV1$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(transferLimitsV1$default);
            }
            List<ApiLimitsHubResponse> product_limits = ((ApiLimitsHubBulkResponse) transferLimitsV1$default).getProduct_limits();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(product_limits, 10)), 16));
            for (Object obj : product_limits) {
                ApiLimitsHubResponse apiLimitsHubResponse = (ApiLimitsHubResponse) obj;
                TransferProductType product_type = apiLimitsHubResponse.getProduct_type();
                ApiLimitsHubResponseDetails details = apiLimitsHubResponse.getDetails();
                linkedHashMap.put(Tuples4.m3642to(product_type, details != null ? details.getDirection() : null), obj);
            }
            this.cache.putAll(linkedHashMap);
            return linkedHashMap;
        } catch (Exception unused) {
            return MapsKt.emptyMap();
        }
    }

    public final Collection<ApiLimitsHubResponse> getCachedTransferLimits() {
        Collection<ApiLimitsHubResponse> collectionValues = this.cache.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        return collectionValues;
    }

    /* compiled from: TransferV2LimitsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.TransferV2LimitsStore$refresh$1", m3645f = "TransferV2LimitsStore.kt", m3646l = {48}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.TransferV2LimitsStore$refresh$1 */
    static final class C346191 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C346191(Continuation<? super C346191> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TransferV2LimitsStore.this.new C346191(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C346191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TransferV2LimitsStore transferV2LimitsStore = TransferV2LimitsStore.this;
                this.label = 1;
                if (transferV2LimitsStore.fetchAndCacheLimits(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void refresh() {
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C346191(null), 3, null);
    }
}
