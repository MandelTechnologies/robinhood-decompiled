package com.robinhood.android.equityscreener.filters;

import com.robinhood.models.serverdriven.experimental.api.ScreenerIndicatorGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EquityScreenerFilterDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityscreener/filters/EquityScreenerFilterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equityscreener.filters.EquityScreenerFilterDuxo$onResume$1$1", m3645f = "EquityScreenerFilterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equityscreener.filters.EquityScreenerFilterDuxo$onResume$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityScreenerFilterDuxo2 extends ContinuationImpl7 implements Function2<EquityScreenerFilterDataState, Continuation<? super EquityScreenerFilterDataState>, Object> {
    final /* synthetic */ List<ScreenerIndicatorGroup> $indicatorGroups;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityScreenerFilterDuxo2(List<ScreenerIndicatorGroup> list, Continuation<? super EquityScreenerFilterDuxo2> continuation) {
        super(2, continuation);
        this.$indicatorGroups = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityScreenerFilterDuxo2 equityScreenerFilterDuxo2 = new EquityScreenerFilterDuxo2(this.$indicatorGroups, continuation);
        equityScreenerFilterDuxo2.L$0 = obj;
        return equityScreenerFilterDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EquityScreenerFilterDataState equityScreenerFilterDataState, Continuation<? super EquityScreenerFilterDataState> continuation) {
        return ((EquityScreenerFilterDuxo2) create(equityScreenerFilterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return EquityScreenerFilterDataState.copy$default((EquityScreenerFilterDataState) this.L$0, this.$indicatorGroups, null, false, null, 14, null);
    }
}
