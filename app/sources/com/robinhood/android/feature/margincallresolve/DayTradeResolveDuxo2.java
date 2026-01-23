package com.robinhood.android.feature.margincallresolve;

import com.robinhood.android.lib.margincallresolve.api.models.ApiDayTradeCallView;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: DayTradeResolveDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/margincallresolve/DayTradeResolveDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.feature.margincallresolve.DayTradeResolveDuxo$init$2$1", m3645f = "DayTradeResolveDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.feature.margincallresolve.DayTradeResolveDuxo$init$2$1, reason: use source file name */
/* loaded from: classes3.dex */
final class DayTradeResolveDuxo2 extends ContinuationImpl7 implements Function2<DayTradeResolveDataState, Continuation<? super DayTradeResolveDataState>, Object> {
    final /* synthetic */ ApiDayTradeCallView $dayTradeCallView;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DayTradeResolveDuxo2(ApiDayTradeCallView apiDayTradeCallView, Continuation<? super DayTradeResolveDuxo2> continuation) {
        super(2, continuation);
        this.$dayTradeCallView = apiDayTradeCallView;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DayTradeResolveDuxo2 dayTradeResolveDuxo2 = new DayTradeResolveDuxo2(this.$dayTradeCallView, continuation);
        dayTradeResolveDuxo2.L$0 = obj;
        return dayTradeResolveDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DayTradeResolveDataState dayTradeResolveDataState, Continuation<? super DayTradeResolveDataState> continuation) {
        return ((DayTradeResolveDuxo2) create(dayTradeResolveDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return DayTradeResolveDataState.copy$default((DayTradeResolveDataState) this.L$0, this.$dayTradeCallView, null, 2, null);
    }
}
