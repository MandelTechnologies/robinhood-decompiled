package com.robinhood.librobinhood.data.store.bonfire.slip;

import com.robinhood.models.p320db.SlipEnabledResponse;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.StateFlow2;

/* compiled from: SlipStatusStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/models/db/SlipEnabledResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.slip.SlipStatusStore$putEndpoint$2", m3645f = "SlipStatusStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.slip.SlipStatusStore$putEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class SlipStatusStore5 extends ContinuationImpl7 implements Function2<SlipEnabledResponse, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SlipStatusStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SlipStatusStore5(SlipStatusStore slipStatusStore, Continuation<? super SlipStatusStore5> continuation) {
        super(2, continuation);
        this.this$0 = slipStatusStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SlipStatusStore5 slipStatusStore5 = new SlipStatusStore5(this.this$0, continuation);
        slipStatusStore5.L$0 = obj;
        return slipStatusStore5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SlipEnabledResponse slipEnabledResponse, Continuation<? super Unit> continuation) {
        return ((SlipStatusStore5) create(slipEnabledResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object value;
        List mutableList;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            final SlipEnabledResponse slipEnabledResponse = (SlipEnabledResponse) this.L$0;
            StateFlow2 stateFlow2 = this.this$0.slipEnabledSharedFlow;
            do {
                value = stateFlow2.getValue();
                mutableList = CollectionsKt.toMutableList((Collection) value);
                mutableList.removeIf(new Predicate() { // from class: com.robinhood.librobinhood.data.store.bonfire.slip.SlipStatusStore$putEndpoint$2$1$1$1
                    @Override // java.util.function.Predicate
                    public final boolean test(SlipEnabledResponse it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Intrinsics.areEqual(slipEnabledResponse.getAccountNumber(), it.getAccountNumber());
                    }
                });
                mutableList.add(slipEnabledResponse);
            } while (!stateFlow2.compareAndSet(value, mutableList));
            this.this$0.slipHubCardStore.refresh(slipEnabledResponse.getAccountNumber(), true);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
