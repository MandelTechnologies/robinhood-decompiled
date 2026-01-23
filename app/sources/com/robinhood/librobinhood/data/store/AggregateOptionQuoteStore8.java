package com.robinhood.librobinhood.data.store;

import com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AggregateOptionQuoteStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore$PositionRequest;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$pollAndStreamMap$2$4", m3645f = "AggregateOptionQuoteStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$pollAndStreamMap$2$4, reason: use source file name */
/* loaded from: classes13.dex */
final class AggregateOptionQuoteStore8 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super List<? extends AggregateOptionQuoteStore.PositionRequest>>, Object> {
    final /* synthetic */ List<AggregateOptionQuoteStore.PositionRequest> $requests;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AggregateOptionQuoteStore8(List<AggregateOptionQuoteStore.PositionRequest> list, Continuation<? super AggregateOptionQuoteStore8> continuation) {
        super(2, continuation);
        this.$requests = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AggregateOptionQuoteStore8(this.$requests, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Unit unit, Continuation<? super List<? extends AggregateOptionQuoteStore.PositionRequest>> continuation) {
        return invoke2(unit, (Continuation<? super List<AggregateOptionQuoteStore.PositionRequest>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Unit unit, Continuation<? super List<AggregateOptionQuoteStore.PositionRequest>> continuation) {
        return ((AggregateOptionQuoteStore8) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return this.$requests;
    }
}
