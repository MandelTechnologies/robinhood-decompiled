package com.robinhood.shared.equities.store.subzero;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.equity.EquitiesBrokeback;
import com.robinhood.shared.equities.subzero.ShortingInfo;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;

/* compiled from: ShortingInfoStore.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u000e\u001a\u00020\nJ\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00120\r2\u0006\u0010\u000e\u001a\u00020\nJ\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00120\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/equities/store/subzero/ShortingInfoStore;", "Lcom/robinhood/store/Store;", "brokeback", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/equity/EquitiesBrokeback;Lcom/robinhood/store/StoreBundle;)V", "getShortingInfo", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/shared/equities/subzero/ShortingInfo;", "streamShortingInfo", "Lkotlinx/coroutines/flow/Flow;", "instrumentId", "borrowFeeSharedFlows", "", "Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlin/Result;", "streamShortingInfoResult", "borrowFeeFailureShown", "", "getBorrowFeeFailureShown", "()Ljava/util/Map;", "getShortingInfoOnce", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-subzero_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class ShortingInfoStore extends Store {
    private final Map<UUID, Boolean> borrowFeeFailureShown;
    private final Map<UUID, SharedFlow<Result<ShortingInfo>>> borrowFeeSharedFlows;
    private final EquitiesBrokeback brokeback;
    private final Endpoint<UUID, ShortingInfo> getShortingInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortingInfoStore(EquitiesBrokeback brokeback, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.brokeback = brokeback;
        this.getShortingInfo = Endpoint.Companion.create$default(Endpoint.INSTANCE, new ShortingInfoStore2(this, null), getLogoutKillswitch(), new ShortingInfoStore3(null), storeBundle.getClock(), null, 16, null);
        this.borrowFeeSharedFlows = new LinkedHashMap();
        this.borrowFeeFailureShown = new LinkedHashMap();
    }

    public final Flow<ShortingInfo> streamShortingInfo(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return Endpoint.DefaultImpls.poll$default(this.getShortingInfo, instrumentId, null, null, 6, null);
    }

    public final Flow<Result<ShortingInfo>> streamShortingInfoResult(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Map<UUID, SharedFlow<Result<ShortingInfo>>> map = this.borrowFeeSharedFlows;
        SharedFlow<Result<ShortingInfo>> sharedFlowShareIn = map.get(instrumentId);
        if (sharedFlowShareIn == null) {
            sharedFlowShareIn = FlowKt.shareIn(FlowKt.onCompletion(FlowKt.flow(new ShortingInfoStore4(this, instrumentId, null)), new ShortingInfoStore5(this, instrumentId, null)), getStoreScope(), SharingStarted.INSTANCE.WhileSubscribed(1000L, 1000L), 1);
            map.put(instrumentId, sharedFlowShareIn);
        }
        return sharedFlowShareIn;
    }

    public final Map<UUID, Boolean> getBorrowFeeFailureShown() {
        return this.borrowFeeFailureShown;
    }

    public final Object getShortingInfoOnce(UUID uuid, Continuation<? super ShortingInfo> continuation) {
        return Endpoint.DefaultImpls.fetch$default(this.getShortingInfo, uuid, null, continuation, 2, null);
    }
}
