package com.robinhood.android.optionsupgrade;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionOnboardingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$getNextScreensFromEndpoint$responseDto$2", m3645f = "OptionOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDuxo$getNextScreensFromEndpoint$responseDto$2, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionOnboardingDuxo6 extends ContinuationImpl7 implements Function2<OptionOnboardingDataState, Continuation<? super OptionOnboardingDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    OptionOnboardingDuxo6(Continuation<? super OptionOnboardingDuxo6> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionOnboardingDuxo6 optionOnboardingDuxo6 = new OptionOnboardingDuxo6(continuation);
        optionOnboardingDuxo6.L$0 = obj;
        return optionOnboardingDuxo6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OptionOnboardingDataState optionOnboardingDataState, Continuation<? super OptionOnboardingDataState> continuation) {
        return ((OptionOnboardingDuxo6) create(optionOnboardingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return OptionOnboardingDataState.copy$default((OptionOnboardingDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, 7935, null);
    }
}
