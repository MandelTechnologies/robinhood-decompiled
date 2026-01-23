package com.robinhood.android.equities.equitytrade;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equityadvancedorder.ordersummary.EquityOrderSummaryService2;
import com.robinhood.models.p320db.DirectOrderRequestDraft;
import com.robinhood.models.p320db.MarketHours;
import equity_order_summary.proto.p459v1.EquityOrderSummaryService;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: EquityTradeService.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equities.equitytrade.EquityTradeService$validateAndSubmit$2$deferredSummary$1", m3645f = "EquityTradeService.kt", m3646l = {492, EnumC7081g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.equitytrade.EquityTradeService$validateAndSubmit$2$deferredSummary$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityTradeService3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ DirectOrderRequestDraft $orderDraft;
    final /* synthetic */ EquityOrderIntent $this_with;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ EquityTradeService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityTradeService3(EquityOrderIntent equityOrderIntent, EquityTradeService equityTradeService, DirectOrderRequestDraft directOrderRequestDraft, Continuation<? super EquityTradeService3> continuation) {
        super(2, continuation);
        this.$this_with = equityOrderIntent;
        this.this$0 = equityTradeService;
        this.$orderDraft = directOrderRequestDraft;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EquityTradeService3(this.$this_with, this.this$0, this.$orderDraft, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((EquityTradeService3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        if (r13 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        DirectOrderRequestDraft directOrderRequestDraft;
        EquityOrderSummaryService equityOrderSummaryService;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$this_with.getAutoSend()) {
                return null;
            }
            EquityOrderSummaryService summaryService = this.this$0.getSummaryService();
            directOrderRequestDraft = this.$orderDraft;
            Observable<MarketHours> currentMarketHoursObservable = this.this$0.marketHoursManager.getCurrentMarketHoursObservable();
            this.L$0 = summaryService;
            this.L$1 = directOrderRequestDraft;
            this.label = 1;
            Object objAwaitFirst = RxAwait3.awaitFirst(currentMarketHoursObservable, this);
            if (objAwaitFirst != coroutine_suspended) {
                equityOrderSummaryService = summaryService;
                obj = objAwaitFirst;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return (String) obj;
        }
        directOrderRequestDraft = (DirectOrderRequestDraft) this.L$1;
        EquityOrderSummaryService equityOrderSummaryService2 = (EquityOrderSummaryService) this.L$0;
        ResultKt.throwOnFailure(obj);
        equityOrderSummaryService = equityOrderSummaryService2;
        DirectOrderRequestDraft directOrderRequestDraft2 = directOrderRequestDraft;
        Intrinsics.checkNotNullExpressionValue(obj, "awaitFirst(...)");
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        obj = EquityOrderSummaryService2.getOrderSummary$default(equityOrderSummaryService, directOrderRequestDraft2, (MarketHours) obj, false, this, 4, null);
    }
}
