package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchRateSelection6;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchRateSelectionContributions;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RetirementTransfersMatchRateSelectionStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/retirement/api/contributions/ApiMatchRateSelectionContributions;", "entryPoint", "Lcom/robinhood/android/models/retirement/api/contributions/MatchRateEntryPoint;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementTransfersMatchRateSelectionStore$endpoint$1", m3645f = "RetirementTransfersMatchRateSelectionStore.kt", m3646l = {24}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementTransfersMatchRateSelectionStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class RetirementTransfersMatchRateSelectionStore2 extends ContinuationImpl7 implements Function2<ApiMatchRateSelection6, Continuation<? super ApiMatchRateSelectionContributions>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RetirementTransfersMatchRateSelectionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetirementTransfersMatchRateSelectionStore2(RetirementTransfersMatchRateSelectionStore retirementTransfersMatchRateSelectionStore, Continuation<? super RetirementTransfersMatchRateSelectionStore2> continuation) {
        super(2, continuation);
        this.this$0 = retirementTransfersMatchRateSelectionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RetirementTransfersMatchRateSelectionStore2 retirementTransfersMatchRateSelectionStore2 = new RetirementTransfersMatchRateSelectionStore2(this.this$0, continuation);
        retirementTransfersMatchRateSelectionStore2.L$0 = obj;
        return retirementTransfersMatchRateSelectionStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiMatchRateSelection6 apiMatchRateSelection6, Continuation<? super ApiMatchRateSelectionContributions> continuation) {
        return ((RetirementTransfersMatchRateSelectionStore2) create(apiMatchRateSelection6, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ApiMatchRateSelection6 apiMatchRateSelection6 = (ApiMatchRateSelection6) this.L$0;
        RetirementApi retirementApi = this.this$0.retirementApi;
        this.label = 1;
        Object transfersMatchRateSelectionViewModels = retirementApi.getTransfersMatchRateSelectionViewModels(apiMatchRateSelection6, this);
        return transfersMatchRateSelectionViewModels == coroutine_suspended ? coroutine_suspended : transfersMatchRateSelectionViewModels;
    }
}
