package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$pollAndStreamMap$$inlined$flatMapLatest$1", m3645f = "AggregateOptionQuoteStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore$pollAndStreamMap$$inlined$flatMapLatest$1 */
/* loaded from: classes13.dex */
public final class C33577xd264a4cf extends ContinuationImpl7 implements Function3<FlowCollector<? super List<? extends AggregateOptionQuoteStore.PositionRequest>>, Tuples2<? extends List<? extends AggregateOptionQuoteStore.PositionRequest>, ? extends Boolean>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ AggregateOptionQuoteStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33577xd264a4cf(Continuation continuation, AggregateOptionQuoteStore aggregateOptionQuoteStore) {
        super(3, continuation);
        this.this$0 = aggregateOptionQuoteStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super List<? extends AggregateOptionQuoteStore.PositionRequest>> flowCollector, Tuples2<? extends List<? extends AggregateOptionQuoteStore.PositionRequest>, ? extends Boolean> tuples2, Continuation<? super Unit> continuation) {
        C33577xd264a4cf c33577xd264a4cf = new C33577xd264a4cf(continuation, this.this$0);
        c33577xd264a4cf.L$0 = flowCollector;
        c33577xd264a4cf.L$1 = tuples2;
        return c33577xd264a4cf.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Tuples2 tuples2 = (Tuples2) this.L$1;
            List list = (List) tuples2.component1();
            if (((Boolean) tuples2.component2()).booleanValue()) {
                List list2 = list;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.this$0.extendedHoursQuery.asFlow((AggregateOptionQuoteStore.PositionRequest) it.next()));
                }
            } else {
                List list3 = list;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(this.this$0.query.asFlow((AggregateOptionQuoteStore.PositionRequest) it2.next()));
                }
            }
            Flow flowMapLatest = FlowKt.mapLatest(FlowKt.onStart(FlowKt.merge(arrayList), new AggregateOptionQuoteStore7(null)), new AggregateOptionQuoteStore8(list, null));
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowMapLatest, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
