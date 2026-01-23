package com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RhyOverviewNuxDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$onStart$9$1", m3645f = "RhyOverviewNuxDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes7.dex */
final class RhyOverviewNuxDuxo$onStart$9$1 extends ContinuationImpl7 implements Function2<RhyOverviewNuxDataState, Continuation<? super RhyOverviewNuxDataState>, Object> {
    final /* synthetic */ Boolean $hasSpentOnDebitCard;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyOverviewNuxDuxo$onStart$9$1(Boolean bool, Continuation<? super RhyOverviewNuxDuxo$onStart$9$1> continuation) {
        super(2, continuation);
        this.$hasSpentOnDebitCard = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RhyOverviewNuxDuxo$onStart$9$1 rhyOverviewNuxDuxo$onStart$9$1 = new RhyOverviewNuxDuxo$onStart$9$1(this.$hasSpentOnDebitCard, continuation);
        rhyOverviewNuxDuxo$onStart$9$1.L$0 = obj;
        return rhyOverviewNuxDuxo$onStart$9$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RhyOverviewNuxDataState rhyOverviewNuxDataState, Continuation<? super RhyOverviewNuxDataState> continuation) {
        return ((RhyOverviewNuxDuxo$onStart$9$1) create(rhyOverviewNuxDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return RhyOverviewNuxDataState.copy$default((RhyOverviewNuxDataState) this.L$0, null, null, null, this.$hasSpentOnDebitCard, null, null, null, null, null, null, null, null, false, null, null, null, false, false, 262135, null);
    }
}
