package com.robinhood.store.event;

import com.robinhood.android.models.event.p186db.predictionmarkets.ContractDisplayDetails;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ContractDetailsDisplayStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "results", "", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractDisplayDetails;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.ContractDetailsDisplayStore$getMultipleContractDisplayDetailsEndpoint$2", m3645f = "ContractDetailsDisplayStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.event.ContractDetailsDisplayStore$getMultipleContractDisplayDetailsEndpoint$2, reason: use source file name */
/* loaded from: classes12.dex */
final class ContractDetailsDisplayStore7 extends ContinuationImpl7 implements Function2<List<? extends ContractDisplayDetails>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContractDetailsDisplayStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContractDetailsDisplayStore7(ContractDetailsDisplayStore contractDetailsDisplayStore, Continuation<? super ContractDetailsDisplayStore7> continuation) {
        super(2, continuation);
        this.this$0 = contractDetailsDisplayStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContractDetailsDisplayStore7 contractDetailsDisplayStore7 = new ContractDetailsDisplayStore7(this.this$0, continuation);
        contractDetailsDisplayStore7.L$0 = obj;
        return contractDetailsDisplayStore7;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends ContractDisplayDetails> list, Continuation<? super Unit> continuation) {
        return invoke2((List<ContractDisplayDetails>) list, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<ContractDisplayDetails> list, Continuation<? super Unit> continuation) {
        return ((ContractDetailsDisplayStore7) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.contractDisplayDetailsDao.insert((Iterable) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
