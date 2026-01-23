package com.robinhood.android.equityscreener.filters;

import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: IndicatorFilterDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityscreener/filters/IndicatorFilterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equityscreener.filters.IndicatorFilterDuxo$onStart$3$1", m3645f = "IndicatorFilterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equityscreener.filters.IndicatorFilterDuxo$onStart$3$1, reason: use source file name */
/* loaded from: classes3.dex */
final class IndicatorFilterDuxo2 extends ContinuationImpl7 implements Function2<IndicatorFilterDataState, Continuation<? super IndicatorFilterDataState>, Object> {
    final /* synthetic */ Optional<Screener.Filter> $filter;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IndicatorFilterDuxo2(Optional<Screener.Filter> optional, Continuation<? super IndicatorFilterDuxo2> continuation) {
        super(2, continuation);
        this.$filter = optional;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IndicatorFilterDuxo2 indicatorFilterDuxo2 = new IndicatorFilterDuxo2(this.$filter, continuation);
        indicatorFilterDuxo2.L$0 = obj;
        return indicatorFilterDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(IndicatorFilterDataState indicatorFilterDataState, Continuation<? super IndicatorFilterDataState> continuation) {
        return ((IndicatorFilterDuxo2) create(indicatorFilterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return IndicatorFilterDataState.copy$default((IndicatorFilterDataState) this.L$0, null, false, null, null, this.$filter.getOrNull(), null, 47, null);
    }
}
