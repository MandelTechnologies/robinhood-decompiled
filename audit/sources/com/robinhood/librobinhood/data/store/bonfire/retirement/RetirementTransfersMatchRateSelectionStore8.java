package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchRateSelectionSubmitRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RetirementTransfersMatchRateSelectionStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", CarResultComposable2.BODY, "Lcom/robinhood/android/models/retirement/api/contributions/ApiMatchRateSelectionSubmitRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementTransfersMatchRateSelectionStore$submitEndpoint$1", m3645f = "RetirementTransfersMatchRateSelectionStore.kt", m3646l = {33}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementTransfersMatchRateSelectionStore$submitEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class RetirementTransfersMatchRateSelectionStore8 extends ContinuationImpl7 implements Function2<ApiMatchRateSelectionSubmitRequest, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RetirementTransfersMatchRateSelectionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetirementTransfersMatchRateSelectionStore8(RetirementTransfersMatchRateSelectionStore retirementTransfersMatchRateSelectionStore, Continuation<? super RetirementTransfersMatchRateSelectionStore8> continuation) {
        super(2, continuation);
        this.this$0 = retirementTransfersMatchRateSelectionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RetirementTransfersMatchRateSelectionStore8 retirementTransfersMatchRateSelectionStore8 = new RetirementTransfersMatchRateSelectionStore8(this.this$0, continuation);
        retirementTransfersMatchRateSelectionStore8.L$0 = obj;
        return retirementTransfersMatchRateSelectionStore8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiMatchRateSelectionSubmitRequest apiMatchRateSelectionSubmitRequest, Continuation<? super Unit> continuation) {
        return ((RetirementTransfersMatchRateSelectionStore8) create(apiMatchRateSelectionSubmitRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ApiMatchRateSelectionSubmitRequest apiMatchRateSelectionSubmitRequest = (ApiMatchRateSelectionSubmitRequest) this.L$0;
            RetirementApi retirementApi = this.this$0.retirementApi;
            this.label = 1;
            if (retirementApi.submitRetirementMatchRateSelectionInTransfers(apiMatchRateSelectionSubmitRequest, this) == coroutine_suspended) {
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
