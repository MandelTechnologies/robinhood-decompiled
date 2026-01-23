package com.robinhood.android.optionschain;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionChainActivityDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/OptionChainActivityViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainActivityDuxo$getLatestAdjustedOptionChainDisplayModeIfChanged$adjustedDisplayMode$1", m3645f = "OptionChainActivityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionschain.OptionChainActivityDuxo$getLatestAdjustedOptionChainDisplayModeIfChanged$adjustedDisplayMode$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionChainActivityDuxo2 extends ContinuationImpl7 implements Function2<OptionChainActivityViewState, Continuation<? super OptionChainActivityViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    OptionChainActivityDuxo2(Continuation<? super OptionChainActivityDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionChainActivityDuxo2 optionChainActivityDuxo2 = new OptionChainActivityDuxo2(continuation);
        optionChainActivityDuxo2.L$0 = obj;
        return optionChainActivityDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OptionChainActivityViewState optionChainActivityViewState, Continuation<? super OptionChainActivityViewState> continuation) {
        return ((OptionChainActivityDuxo2) create(optionChainActivityViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return OptionChainActivityViewState.copy$default((OptionChainActivityViewState) this.L$0, null, true, null, false, false, null, null, null, false, null, 1021, null);
    }
}
