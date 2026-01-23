package com.robinhood.android.common.options.tradebar;

import com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDataState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsDetailPageTradebarDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$1$1", m3645f = "OptionsDetailPageTradebarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class OptionsDetailPageTradebarDuxo2 extends ContinuationImpl7 implements Function2<OptionsDetailPageTradebarDataState, Continuation<? super OptionsDetailPageTradebarDataState>, Object> {
    final /* synthetic */ Boolean $inSelloutImprovementExperiment;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionsDetailPageTradebarDuxo2(Boolean bool, Continuation<? super OptionsDetailPageTradebarDuxo2> continuation) {
        super(2, continuation);
        this.$inSelloutImprovementExperiment = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionsDetailPageTradebarDuxo2 optionsDetailPageTradebarDuxo2 = new OptionsDetailPageTradebarDuxo2(this.$inSelloutImprovementExperiment, continuation);
        optionsDetailPageTradebarDuxo2.L$0 = obj;
        return optionsDetailPageTradebarDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OptionsDetailPageTradebarDataState optionsDetailPageTradebarDataState, Continuation<? super OptionsDetailPageTradebarDataState> continuation) {
        return ((OptionsDetailPageTradebarDuxo2) create(optionsDetailPageTradebarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        OptionsDetailPageTradebarDataState optionsDetailPageTradebarDataState = (OptionsDetailPageTradebarDataState) this.L$0;
        final Boolean bool = this.$inSelloutImprovementExperiment;
        return optionsDetailPageTradebarDataState.copyGlobalData(new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDuxo$onCreate$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return OptionsDetailPageTradebarDuxo2.invokeSuspend$lambda$0(bool, (OptionsDetailPageTradebarDataState.GlobalData) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsDetailPageTradebarDataState.GlobalData invokeSuspend$lambda$0(Boolean bool, OptionsDetailPageTradebarDataState.GlobalData globalData) {
        Intrinsics.checkNotNull(bool);
        return OptionsDetailPageTradebarDataState.GlobalData.copy$default(globalData, null, null, null, null, false, bool.booleanValue(), 31, null);
    }
}
