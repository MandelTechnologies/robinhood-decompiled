package com.robinhood.android.marketdatadisclosure;

import com.robinhood.nbbo.models.p359db.NbboSummary;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MarketDataDisclosureDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/marketdatadisclosure/MarketDataDisclosureDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.marketdatadisclosure.MarketDataDisclosureDuxo$onCreate$1$1", m3645f = "MarketDataDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.marketdatadisclosure.MarketDataDisclosureDuxo$onCreate$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MarketDataDisclosureDuxo3 extends ContinuationImpl7 implements Function2<MarketDataDisclosureDataState, Continuation<? super MarketDataDisclosureDataState>, Object> {
    final /* synthetic */ NbboSummary $nbboSummary;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarketDataDisclosureDuxo3(NbboSummary nbboSummary, Continuation<? super MarketDataDisclosureDuxo3> continuation) {
        super(2, continuation);
        this.$nbboSummary = nbboSummary;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketDataDisclosureDuxo3 marketDataDisclosureDuxo3 = new MarketDataDisclosureDuxo3(this.$nbboSummary, continuation);
        marketDataDisclosureDuxo3.L$0 = obj;
        return marketDataDisclosureDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MarketDataDisclosureDataState marketDataDisclosureDataState, Continuation<? super MarketDataDisclosureDataState> continuation) {
        return ((MarketDataDisclosureDuxo3) create(marketDataDisclosureDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return MarketDataDisclosureDataState.copy$default((MarketDataDisclosureDataState) this.L$0, null, this.$nbboSummary, null, null, null, null, 61, null);
    }
}
