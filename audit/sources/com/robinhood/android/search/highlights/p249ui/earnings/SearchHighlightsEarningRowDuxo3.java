package com.robinhood.android.search.highlights.p249ui.earnings;

import com.robinhood.android.redesign.model.AssetQuote;
import com.robinhood.shared.equities.models.instrumentdetails.p380db.Earning;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: SearchHighlightsEarningRowDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/highlights/ui/earnings/SearchHighlightEarningsItem;", "assetQuote", "Lcom/robinhood/android/redesign/model/AssetQuote$Equity;", "recentEarning", "Lcom/robinhood/shared/equities/models/instrumentdetails/db/Earning;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.earnings.SearchHighlightsEarningRowDuxo$bind$1$1$3", m3645f = "SearchHighlightsEarningRowDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.search.highlights.ui.earnings.SearchHighlightsEarningRowDuxo$bind$1$1$3, reason: use source file name */
/* loaded from: classes5.dex */
final class SearchHighlightsEarningRowDuxo3 extends ContinuationImpl7 implements Function3<AssetQuote.Equity, Earning, Continuation<? super SearchHighlightEarningsItem>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    SearchHighlightsEarningRowDuxo3(Continuation<? super SearchHighlightsEarningRowDuxo3> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(AssetQuote.Equity equity, Earning earning, Continuation<? super SearchHighlightEarningsItem> continuation) {
        SearchHighlightsEarningRowDuxo3 searchHighlightsEarningRowDuxo3 = new SearchHighlightsEarningRowDuxo3(continuation);
        searchHighlightsEarningRowDuxo3.L$0 = equity;
        searchHighlightsEarningRowDuxo3.L$1 = earning;
        return searchHighlightsEarningRowDuxo3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AssetQuote.Equity equity = (AssetQuote.Equity) this.L$0;
        Earning earning = (Earning) this.L$1;
        return new SearchHighlightEarningsItem(earning != null ? earning.getCall() : null, earning != null ? earning.getEps() : null, earning != null ? earning.getReport() : null, equity);
    }
}
