package com.robinhood.librobinhood.data.store;

import com.robinhood.api.trade.equity.retrofit.TradeEquityBonfireApi;
import com.robinhood.models.api.ApiSduiInfoSheetResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SduiInfoSheetStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiSduiInfoSheetResponse;", "sheetId", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SduiInfoSheetStore$endpoint$1", m3645f = "SduiInfoSheetStore.kt", m3646l = {19}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.SduiInfoSheetStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class SduiInfoSheetStore2 extends ContinuationImpl7 implements Function2<String, Continuation<? super ApiSduiInfoSheetResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SduiInfoSheetStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SduiInfoSheetStore2(SduiInfoSheetStore sduiInfoSheetStore, Continuation<? super SduiInfoSheetStore2> continuation) {
        super(2, continuation);
        this.this$0 = sduiInfoSheetStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SduiInfoSheetStore2 sduiInfoSheetStore2 = new SduiInfoSheetStore2(this.this$0, continuation);
        sduiInfoSheetStore2.L$0 = obj;
        return sduiInfoSheetStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super ApiSduiInfoSheetResponse> continuation) {
        return ((SduiInfoSheetStore2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            TradeEquityBonfireApi tradeEquityBonfireApi = this.this$0.tradeEquityBonfireApi;
            this.label = 1;
            obj = tradeEquityBonfireApi.sduiInfoSheet(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return (ApiSduiInfoSheetResponse) obj;
    }
}
