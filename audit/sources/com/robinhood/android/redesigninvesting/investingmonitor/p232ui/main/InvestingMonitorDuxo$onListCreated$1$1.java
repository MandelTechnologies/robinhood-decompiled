package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.main;

import com.robinhood.models.p320db.CuratedList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InvestingMonitorDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$onListCreated$1$1", m3645f = "InvestingMonitorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class InvestingMonitorDuxo$onListCreated$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CuratedList $curatedList;
    final /* synthetic */ InvestingMonitorDataState $dataState;
    int label;
    final /* synthetic */ InvestingMonitorDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InvestingMonitorDuxo$onListCreated$1$1(InvestingMonitorDataState investingMonitorDataState, CuratedList curatedList, InvestingMonitorDuxo investingMonitorDuxo, Continuation<? super InvestingMonitorDuxo$onListCreated$1$1> continuation) {
        super(2, continuation);
        this.$dataState = investingMonitorDataState;
        this.$curatedList = curatedList;
        this.this$0 = investingMonitorDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestingMonitorDuxo$onListCreated$1$1(this.$dataState, this.$curatedList, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestingMonitorDuxo$onListCreated$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$dataState.getRecentlyCreatedCuratedListItems().add(this.$curatedList);
        this.this$0.listOrderStore.refresh(true);
        return Unit.INSTANCE;
    }
}
