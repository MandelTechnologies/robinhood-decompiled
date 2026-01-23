package com.robinhood.android.options.p208ui.detail;

import com.robinhood.models.p320db.MarketHours;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionsDetailPageDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onStart$1$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes11.dex */
final class OptionsDetailPageDuxo$onStart$1$1 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {
    final /* synthetic */ MarketHours $marketHours;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionsDetailPageDuxo$onStart$1$1(MarketHours marketHours, Continuation<? super OptionsDetailPageDuxo$onStart$1$1> continuation) {
        super(2, continuation);
        this.$marketHours = marketHours;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionsDetailPageDuxo$onStart$1$1 optionsDetailPageDuxo$onStart$1$1 = new OptionsDetailPageDuxo$onStart$1$1(this.$marketHours, continuation);
        optionsDetailPageDuxo$onStart$1$1.L$0 = obj;
        return optionsDetailPageDuxo$onStart$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
        return ((OptionsDetailPageDuxo$onStart$1$1) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return OptionsDetailPageDataState.copy$default((OptionsDetailPageDataState) this.L$0, null, null, null, null, false, false, this.$marketHours, null, null, false, false, false, null, 0, false, false, false, null, false, false, null, null, false, false, null, 33554367, null);
    }
}
