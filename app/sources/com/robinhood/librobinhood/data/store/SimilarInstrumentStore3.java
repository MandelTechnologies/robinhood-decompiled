package com.robinhood.librobinhood.data.store;

import com.robinhood.models.p320db.SimilarInstrument;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SimilarInstrumentStore.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n"}, m3636d2 = {"<anonymous>", "", "instrumentIdSimilarTo", "Ljava/util/UUID;", "similarInstruments", "", "Lcom/robinhood/models/db/SimilarInstrument;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SimilarInstrumentStore$endpoint$2", m3645f = "SimilarInstrumentStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.SimilarInstrumentStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class SimilarInstrumentStore3 extends ContinuationImpl7 implements Function3<UUID, List<? extends SimilarInstrument>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ SimilarInstrumentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SimilarInstrumentStore3(SimilarInstrumentStore similarInstrumentStore, Continuation<? super SimilarInstrumentStore3> continuation) {
        super(3, continuation);
        this.this$0 = similarInstrumentStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(UUID uuid, List<? extends SimilarInstrument> list, Continuation<? super Unit> continuation) {
        return invoke2(uuid, (List<SimilarInstrument>) list, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(UUID uuid, List<SimilarInstrument> list, Continuation<? super Unit> continuation) {
        SimilarInstrumentStore3 similarInstrumentStore3 = new SimilarInstrumentStore3(this.this$0, continuation);
        similarInstrumentStore3.L$0 = uuid;
        similarInstrumentStore3.L$1 = list;
        return similarInstrumentStore3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        UUID uuid = (UUID) this.L$0;
        List list = (List) this.L$1;
        if (!list.isEmpty()) {
            InstrumentStore instrumentStore = this.this$0.instrumentStore;
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((SimilarInstrument) it.next()).getInstrumentId());
            }
            instrumentStore.pingInstruments(arrayList);
        }
        this.this$0.dao.replaceSimilarInstruments(uuid, list);
        return Unit.INSTANCE;
    }
}
