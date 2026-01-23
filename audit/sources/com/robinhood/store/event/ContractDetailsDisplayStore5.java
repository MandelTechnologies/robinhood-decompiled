package com.robinhood.store.event;

import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractDisplayDetails;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Await2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;

/* compiled from: ContractDetailsDisplayStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractDisplayDetails;", "paramsList", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.ContractDetailsDisplayStore$getMultipleContractDisplayDetailsEndpoint$1", m3645f = "ContractDetailsDisplayStore.kt", m3646l = {75}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.event.ContractDetailsDisplayStore$getMultipleContractDisplayDetailsEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class ContractDetailsDisplayStore5 extends ContinuationImpl7 implements Function2<List<? extends ContractIdWithSide>, Continuation<? super List<? extends ContractDisplayDetails>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContractDetailsDisplayStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContractDetailsDisplayStore5(ContractDetailsDisplayStore contractDetailsDisplayStore, Continuation<? super ContractDetailsDisplayStore5> continuation) {
        super(2, continuation);
        this.this$0 = contractDetailsDisplayStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContractDetailsDisplayStore5 contractDetailsDisplayStore5 = new ContractDetailsDisplayStore5(this.this$0, continuation);
        contractDetailsDisplayStore5.L$0 = obj;
        return contractDetailsDisplayStore5;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends ContractIdWithSide> list, Continuation<? super List<? extends ContractDisplayDetails>> continuation) {
        return invoke2((List<ContractIdWithSide>) list, (Continuation<? super List<ContractDisplayDetails>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<ContractIdWithSide> list, Continuation<? super List<ContractDisplayDetails>> continuation) {
        return ((ContractDetailsDisplayStore5) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: ContractDetailsDisplayStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractDisplayDetails;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.event.ContractDetailsDisplayStore$getMultipleContractDisplayDetailsEndpoint$1$1", m3645f = "ContractDetailsDisplayStore.kt", m3646l = {90}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.store.event.ContractDetailsDisplayStore$getMultipleContractDisplayDetailsEndpoint$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends ContractDisplayDetails>>, Object> {
        final /* synthetic */ List<ContractIdWithSide> $paramsList;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ContractDetailsDisplayStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<ContractIdWithSide> list, ContractDetailsDisplayStore contractDetailsDisplayStore, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$paramsList = list;
            this.this$0 = contractDetailsDisplayStore;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$paramsList, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends ContractDisplayDetails>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<ContractDisplayDetails>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<ContractDisplayDetails>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                List<ContractIdWithSide> list = this.$paramsList;
                ContractDetailsDisplayStore contractDetailsDisplayStore = this.this$0;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new ContractDetailsDisplayStore6(contractDetailsDisplayStore, (ContractIdWithSide) it.next(), null), 3, null));
                }
                this.label = 1;
                obj = Await2.awaitAll(arrayList, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return CollectionsKt.filterNotNull((Iterable) obj);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1((List) this.L$0, this.this$0, null);
        this.label = 1;
        Object objCoroutineScope = CoroutineScope2.coroutineScope(anonymousClass1, this);
        return objCoroutineScope == coroutine_suspended ? coroutine_suspended : objCoroutineScope;
    }
}
