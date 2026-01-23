package com.robinhood.store.event;

import com.plaid.internal.EnumC7081g;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
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

/* compiled from: EventOrderStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Ljava/util/UUID;", "Ljava/math/BigDecimal;", "params", "Lcom/robinhood/store/event/EstimatedFeesParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventOrderStore$getEstimatedFeesForMultipleContractsEndpoint$1", m3645f = "EventOrderStore.kt", m3646l = {112}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class EventOrderStore$getEstimatedFeesForMultipleContractsEndpoint$1 extends ContinuationImpl7 implements Function2<EstimatedFeesParams, Continuation<? super Map<UUID, ? extends BigDecimal>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventOrderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventOrderStore$getEstimatedFeesForMultipleContractsEndpoint$1(EventOrderStore eventOrderStore, Continuation<? super EventOrderStore$getEstimatedFeesForMultipleContractsEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = eventOrderStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventOrderStore$getEstimatedFeesForMultipleContractsEndpoint$1 eventOrderStore$getEstimatedFeesForMultipleContractsEndpoint$1 = new EventOrderStore$getEstimatedFeesForMultipleContractsEndpoint$1(this.this$0, continuation);
        eventOrderStore$getEstimatedFeesForMultipleContractsEndpoint$1.L$0 = obj;
        return eventOrderStore$getEstimatedFeesForMultipleContractsEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EstimatedFeesParams estimatedFeesParams, Continuation<? super Map<UUID, ? extends BigDecimal>> continuation) {
        return ((EventOrderStore$getEstimatedFeesForMultipleContractsEndpoint$1) create(estimatedFeesParams, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: EventOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Ljava/util/UUID;", "Ljava/math/BigDecimal;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.event.EventOrderStore$getEstimatedFeesForMultipleContractsEndpoint$1$1", m3645f = "EventOrderStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.store.event.EventOrderStore$getEstimatedFeesForMultipleContractsEndpoint$1$1 */
    static final class C413811 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Map<UUID, ? extends BigDecimal>>, Object> {
        final /* synthetic */ EstimatedFeesParams $params;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ EventOrderStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C413811(EstimatedFeesParams estimatedFeesParams, EventOrderStore eventOrderStore, Continuation<? super C413811> continuation) {
            super(2, continuation);
            this.$params = estimatedFeesParams;
            this.this$0 = eventOrderStore;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C413811 c413811 = new C413811(this.$params, this.this$0, continuation);
            c413811.L$0 = obj;
            return c413811;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<UUID, ? extends BigDecimal>> continuation) {
            return ((C413811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Set<UUID> contractIds = this.$params.getContractIds();
                EventOrderStore eventOrderStore = this.this$0;
                EstimatedFeesParams estimatedFeesParams = this.$params;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contractIds, 10));
                Iterator<T> it = contractIds.iterator();
                while (it.hasNext()) {
                    arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new C41382xa56439fb(eventOrderStore, estimatedFeesParams, (UUID) it.next(), null), 3, null));
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
            ArrayList arrayList2 = new ArrayList();
            for (Tuples2 tuples2 : (Iterable) obj) {
                UUID uuid = (UUID) tuples2.component1();
                BigDecimal bigDecimal = (BigDecimal) tuples2.component2();
                Tuples2 tuples2M3642to = bigDecimal != null ? Tuples4.m3642to(uuid, bigDecimal) : null;
                if (tuples2M3642to != null) {
                    arrayList2.add(tuples2M3642to);
                }
            }
            return MapsKt.toMap(arrayList2);
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
        C413811 c413811 = new C413811((EstimatedFeesParams) this.L$0, this.this$0, null);
        this.label = 1;
        Object objCoroutineScope = CoroutineScope2.coroutineScope(c413811, this);
        return objCoroutineScope == coroutine_suspended ? coroutine_suspended : objCoroutineScope;
    }
}
