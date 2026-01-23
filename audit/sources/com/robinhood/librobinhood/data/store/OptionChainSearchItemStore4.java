package com.robinhood.librobinhood.data.store;

import com.robinhood.models.p320db.OptionInstrumentPosition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: OptionChainSearchItemStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionChainSearchItemStore$streamUiOptionChainSearchItemsByHoldingOptionInstrumentPositions$1$1", m3645f = "OptionChainSearchItemStore.kt", m3646l = {52}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.OptionChainSearchItemStore$streamUiOptionChainSearchItemsByHoldingOptionInstrumentPositions$1$1, reason: use source file name */
/* loaded from: classes13.dex */
final class OptionChainSearchItemStore4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountNumber;
    int label;
    final /* synthetic */ OptionChainSearchItemStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionChainSearchItemStore4(OptionChainSearchItemStore optionChainSearchItemStore, String str, Continuation<? super OptionChainSearchItemStore4> continuation) {
        super(2, continuation);
        this.this$0 = optionChainSearchItemStore;
        this.$accountNumber = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionChainSearchItemStore4(this.this$0, this.$accountNumber, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionChainSearchItemStore4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.optionInstrumentPositionStore.refresh(false, (UUID) null, this.$accountNumber);
            Flow<List<OptionInstrumentPosition>> optionPositions = this.this$0.optionInstrumentPositionStore.getOptionPositions(this.$accountNumber);
            final OptionChainSearchItemStore optionChainSearchItemStore = this.this$0;
            FlowCollector<? super List<OptionInstrumentPosition>> flowCollector = new FlowCollector() { // from class: com.robinhood.librobinhood.data.store.OptionChainSearchItemStore$streamUiOptionChainSearchItemsByHoldingOptionInstrumentPositions$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List<OptionInstrumentPosition>) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(List<OptionInstrumentPosition> list, Continuation<? super Unit> continuation) {
                    OptionChainStore optionChainStore = optionChainSearchItemStore.optionChainStore;
                    List<OptionInstrumentPosition> list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((OptionInstrumentPosition) it.next()).getOptionChainId());
                    }
                    OptionChainStore.pingOptionChainsCompletable$default(optionChainStore, arrayList, false, 2, null);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (optionPositions.collect(flowCollector, this) == coroutine_suspended) {
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
