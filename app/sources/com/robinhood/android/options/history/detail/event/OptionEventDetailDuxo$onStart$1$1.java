package com.robinhood.android.options.history.detail.event;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.p355ui.UiOptionChain;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionEventDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/history/detail/event/OptionEventDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.options.history.detail.event.OptionEventDetailDuxo$onStart$1$1", m3645f = "OptionEventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes11.dex */
final class OptionEventDetailDuxo$onStart$1$1 extends ContinuationImpl7 implements Function2<OptionEventDetailDataState, Continuation<? super OptionEventDetailDataState>, Object> {
    final /* synthetic */ UiOptionChain $uiOptionChain;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionEventDetailDuxo$onStart$1$1(UiOptionChain uiOptionChain, Continuation<? super OptionEventDetailDuxo$onStart$1$1> continuation) {
        super(2, continuation);
        this.$uiOptionChain = uiOptionChain;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionEventDetailDuxo$onStart$1$1 optionEventDetailDuxo$onStart$1$1 = new OptionEventDetailDuxo$onStart$1$1(this.$uiOptionChain, continuation);
        optionEventDetailDuxo$onStart$1$1.L$0 = obj;
        return optionEventDetailDuxo$onStart$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OptionEventDetailDataState optionEventDetailDataState, Continuation<? super OptionEventDetailDataState> continuation) {
        return ((OptionEventDetailDuxo$onStart$1$1) create(optionEventDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return OptionEventDetailDataState.copy$default((OptionEventDetailDataState) this.L$0, null, null, this.$uiOptionChain, null, false, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
    }
}
