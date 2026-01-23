package com.robinhood.librobinhood.data.store;

import com.robinhood.api.retrofit.DoraApi;
import com.robinhood.models.api.ApiSimilarInstrument;
import com.robinhood.models.api.ApiSimilarInstrument2;
import com.robinhood.models.p320db.SimilarInstrument;
import com.robinhood.models.p320db.SimilarInstrument2;
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
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SimilarInstrumentStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/models/db/SimilarInstrument;", "instrumentIdSimilarTo", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SimilarInstrumentStore$endpoint$1", m3645f = "SimilarInstrumentStore.kt", m3646l = {29}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.SimilarInstrumentStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class SimilarInstrumentStore2 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super List<? extends SimilarInstrument>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SimilarInstrumentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SimilarInstrumentStore2(SimilarInstrumentStore similarInstrumentStore, Continuation<? super SimilarInstrumentStore2> continuation) {
        super(2, continuation);
        this.this$0 = similarInstrumentStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SimilarInstrumentStore2 similarInstrumentStore2 = new SimilarInstrumentStore2(this.this$0, continuation);
        similarInstrumentStore2.L$0 = obj;
        return similarInstrumentStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(UUID uuid, Continuation<? super List<? extends SimilarInstrument>> continuation) {
        return invoke2(uuid, (Continuation<? super List<SimilarInstrument>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(UUID uuid, Continuation<? super List<SimilarInstrument>> continuation) {
        return ((SimilarInstrumentStore2) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        UUID uuid;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UUID uuid2 = (UUID) this.L$0;
            DoraApi doraApi = this.this$0.doraApi;
            this.L$0 = uuid2;
            this.label = 1;
            Object similarInstruments = doraApi.getSimilarInstruments(uuid2, this);
            if (similarInstruments == coroutine_suspended) {
                return coroutine_suspended;
            }
            uuid = uuid2;
            obj = similarInstruments;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uuid = (UUID) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        List<ApiSimilarInstrument> similar = ((ApiSimilarInstrument2) obj).getSimilar();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(similar, 10));
        Iterator<T> it = similar.iterator();
        while (it.hasNext()) {
            arrayList.add(SimilarInstrument2.toDbModel((ApiSimilarInstrument) it.next(), uuid));
        }
        return arrayList;
    }
}
