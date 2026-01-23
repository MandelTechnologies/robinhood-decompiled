package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equity.ShareBasedMarketBuysRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EquityTradingSessionChangedStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.EquityTradingSessionChangedStore$determineCurrentSessionConfiguration$2$1$shareBasedMarketBuysEnabled$1", m3645f = "EquityTradingSessionChangedStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.EquityTradingSessionChangedStore$determineCurrentSessionConfiguration$2$1$shareBasedMarketBuysEnabled$1 */
/* loaded from: classes13.dex */
final class C33838xff4fbdeb extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ EquityTradingSessionChangedStore $this_runCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C33838xff4fbdeb(EquityTradingSessionChangedStore equityTradingSessionChangedStore, Continuation<? super C33838xff4fbdeb> continuation) {
        super(2, continuation);
        this.$this_runCatching = equityTradingSessionChangedStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C33838xff4fbdeb(this.$this_runCatching, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((C33838xff4fbdeb) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        RegionGateProvider regionGateProvider = this.$this_runCatching.regionGateProvider;
        ShareBasedMarketBuysRegionGate shareBasedMarketBuysRegionGate = ShareBasedMarketBuysRegionGate.INSTANCE;
        this.label = 1;
        Object regionGateState$default = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider, shareBasedMarketBuysRegionGate, false, this, 2, null);
        return regionGateState$default == coroutine_suspended ? coroutine_suspended : regionGateState$default;
    }
}
