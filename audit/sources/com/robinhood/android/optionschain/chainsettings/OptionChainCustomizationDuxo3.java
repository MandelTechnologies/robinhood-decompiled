package com.robinhood.android.optionschain.chainsettings;

import com.robinhood.models.p320db.OptionChainSelectedMetrics;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionChainCustomizationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainCustomizationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationDuxo$onCreate$3$1", m3645f = "OptionChainCustomizationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationDuxo$onCreate$3$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionChainCustomizationDuxo3 extends ContinuationImpl7 implements Function2<OptionChainCustomizationDataState, Continuation<? super OptionChainCustomizationDataState>, Object> {
    final /* synthetic */ OptionChainSelectedMetrics $selectedMetrics;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionChainCustomizationDuxo3(OptionChainSelectedMetrics optionChainSelectedMetrics, Continuation<? super OptionChainCustomizationDuxo3> continuation) {
        super(2, continuation);
        this.$selectedMetrics = optionChainSelectedMetrics;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionChainCustomizationDuxo3 optionChainCustomizationDuxo3 = new OptionChainCustomizationDuxo3(this.$selectedMetrics, continuation);
        optionChainCustomizationDuxo3.L$0 = obj;
        return optionChainCustomizationDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OptionChainCustomizationDataState optionChainCustomizationDataState, Continuation<? super OptionChainCustomizationDataState> continuation) {
        return ((OptionChainCustomizationDuxo3) create(optionChainCustomizationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return OptionChainCustomizationDataState.copy$default((OptionChainCustomizationDataState) this.L$0, null, null, this.$selectedMetrics.getSelectedMetricOne(), this.$selectedMetrics.getSelectedMetricTwo(), null, null, 51, null);
    }
}
