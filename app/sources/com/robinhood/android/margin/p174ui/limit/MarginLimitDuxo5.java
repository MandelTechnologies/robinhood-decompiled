package com.robinhood.android.margin.p174ui.limit;

import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MarginLimitDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/ui/limit/MarginLimitDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.margin.ui.limit.MarginLimitDuxo$onCreate$5$1", m3645f = "MarginLimitDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.margin.ui.limit.MarginLimitDuxo$onCreate$5$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MarginLimitDuxo5 extends ContinuationImpl7 implements Function2<MarginLimitDataState, Continuation<? super MarginLimitDataState>, Object> {
    final /* synthetic */ MarginSettings $marginSettings;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginLimitDuxo5(MarginSettings marginSettings, Continuation<? super MarginLimitDuxo5> continuation) {
        super(2, continuation);
        this.$marginSettings = marginSettings;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarginLimitDuxo5 marginLimitDuxo5 = new MarginLimitDuxo5(this.$marginSettings, continuation);
        marginLimitDuxo5.L$0 = obj;
        return marginLimitDuxo5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MarginLimitDataState marginLimitDataState, Continuation<? super MarginLimitDataState> continuation) {
        return ((MarginLimitDuxo5) create(marginLimitDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return MarginLimitDataState.copy$default((MarginLimitDataState) this.L$0, null, null, null, this.$marginSettings, null, null, null, null, null, false, null, null, 4087, null);
    }
}
