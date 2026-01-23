package com.robinhood.android.retirementhistory;

import com.robinhood.android.models.retirement.api.ApiRetirementFeeHistoryDetail;
import com.robinhood.android.models.retirement.p194db.RetirementHistoryItem;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RetirementHistoryItemDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirementhistory/RetirementHistoryItemDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.retirementhistory.RetirementHistoryItemDetailDuxo$onStart$2$1", m3645f = "RetirementHistoryItemDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.retirementhistory.RetirementHistoryItemDetailDuxo$onStart$2$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RetirementHistoryItemDetailDuxo2 extends ContinuationImpl7 implements Function2<RetirementHistoryItemDataState, Continuation<? super RetirementHistoryItemDataState>, Object> {
    final /* synthetic */ ApiRetirementFeeHistoryDetail $detail;
    final /* synthetic */ RetirementHistoryItem $item;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetirementHistoryItemDetailDuxo2(RetirementHistoryItem retirementHistoryItem, ApiRetirementFeeHistoryDetail apiRetirementFeeHistoryDetail, Continuation<? super RetirementHistoryItemDetailDuxo2> continuation) {
        super(2, continuation);
        this.$item = retirementHistoryItem;
        this.$detail = apiRetirementFeeHistoryDetail;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RetirementHistoryItemDetailDuxo2 retirementHistoryItemDetailDuxo2 = new RetirementHistoryItemDetailDuxo2(this.$item, this.$detail, continuation);
        retirementHistoryItemDetailDuxo2.L$0 = obj;
        return retirementHistoryItemDetailDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RetirementHistoryItemDataState retirementHistoryItemDataState, Continuation<? super RetirementHistoryItemDataState> continuation) {
        return ((RetirementHistoryItemDetailDuxo2) create(retirementHistoryItemDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((RetirementHistoryItemDataState) this.L$0).copy(this.$item, this.$detail);
    }
}
