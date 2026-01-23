package com.robinhood.store.futures.marketdata;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.models.futures.api.marketdata.ApiFuturesQuote;
import com.robinhood.android.models.futures.api.marketdata.ApiMarketdataResponse;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;
import retrofit2.Response;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.store.futures.marketdata.FuturesQuoteStore$queryQuotes$lambda$6$$inlined$flatMapLatest$1", m3645f = "FuturesQuoteStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class FuturesQuoteStore$queryQuotes$lambda$6$$inlined$flatMapLatest$1 extends ContinuationImpl7 implements Function3<FlowCollector<? super Response<ApiMarketdataResponse<List<? extends ApiMarketdataResponse<ApiFuturesQuote>>>>>, Duration, Continuation<? super Unit>, Object> {
    final /* synthetic */ Collection $contractIds$inlined;
    final /* synthetic */ MarketdataPollLocation $location$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ FuturesQuoteStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesQuoteStore$queryQuotes$lambda$6$$inlined$flatMapLatest$1(Continuation continuation, FuturesQuoteStore futuresQuoteStore, Collection collection, MarketdataPollLocation marketdataPollLocation) {
        super(3, continuation);
        this.this$0 = futuresQuoteStore;
        this.$contractIds$inlined = collection;
        this.$location$inlined = marketdataPollLocation;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Response<ApiMarketdataResponse<List<? extends ApiMarketdataResponse<ApiFuturesQuote>>>>> flowCollector, Duration duration, Continuation<? super Unit> continuation) {
        FuturesQuoteStore$queryQuotes$lambda$6$$inlined$flatMapLatest$1 futuresQuoteStore$queryQuotes$lambda$6$$inlined$flatMapLatest$1 = new FuturesQuoteStore$queryQuotes$lambda$6$$inlined$flatMapLatest$1(continuation, this.this$0, this.$contractIds$inlined, this.$location$inlined);
        futuresQuoteStore$queryQuotes$lambda$6$$inlined$flatMapLatest$1.L$0 = flowCollector;
        futuresQuoteStore$queryQuotes$lambda$6$$inlined$flatMapLatest$1.L$1 = duration;
        return futuresQuoteStore$queryQuotes$lambda$6$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Duration duration = (Duration) this.L$1;
            Endpoint endpoint = this.this$0.getQuotes;
            Tuples2 tuples2M3642to = Tuples4.m3642to(this.$contractIds$inlined, this.$location$inlined);
            Intrinsics.checkNotNull(duration);
            Flow flowBackendPoll$default = Endpoint8.backendPoll$default(endpoint, tuples2M3642to, duration, null, 4, null);
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowBackendPoll$default, this) == coroutine_suspended) {
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
