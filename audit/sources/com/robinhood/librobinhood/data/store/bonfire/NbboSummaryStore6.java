package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.moria.network.Endpoint;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: NbboSummaryStore.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.NbboSummaryStore$streamNbboSummaryQuery$1$1", m3645f = "NbboSummaryStore.kt", m3646l = {69}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.NbboSummaryStore$streamNbboSummaryQuery$1$1, reason: use source file name */
/* loaded from: classes13.dex */
final class NbboSummaryStore6 extends ContinuationImpl7 implements Function2<FlowCollector<? super Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ UUID $instrumentId;
    int label;
    final /* synthetic */ NbboSummaryStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NbboSummaryStore6(NbboSummaryStore nbboSummaryStore, UUID uuid, Continuation<? super NbboSummaryStore6> continuation) {
        super(2, continuation);
        this.this$0 = nbboSummaryStore;
        this.$instrumentId = uuid;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NbboSummaryStore6(this.this$0, this.$instrumentId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Object> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<Object>) flowCollector, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<Object> flowCollector, Continuation<? super Unit> continuation) {
        return ((NbboSummaryStore6) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        do {
            Endpoint.DefaultImpls.refresh$default(this.this$0.endpoint, this.$instrumentId, false, null, 4, null);
            this.label = 1;
        } while (DelayKt.delay(5000L, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
