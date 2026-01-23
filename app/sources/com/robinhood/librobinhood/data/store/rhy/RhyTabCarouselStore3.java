package com.robinhood.librobinhood.data.store.rhy;

import com.robinhood.models.api.bonfire.rhy.ApiRhyTabCarouselItem;
import com.robinhood.models.dao.RhyTabCarouselItemDao;
import com.robinhood.models.p320db.rhy.RhyTabCarouselItem2;
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

/* compiled from: RhyTabCarouselStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "apiRhyTabCarouselItemList", "", "Lcom/robinhood/models/api/bonfire/rhy/ApiRhyTabCarouselItem;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.rhy.RhyTabCarouselStore$rhyTabCarouselEndpoint$2", m3645f = "RhyTabCarouselStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.rhy.RhyTabCarouselStore$rhyTabCarouselEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class RhyTabCarouselStore3 extends ContinuationImpl7 implements Function2<List<? extends ApiRhyTabCarouselItem>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RhyTabCarouselStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyTabCarouselStore3(RhyTabCarouselStore rhyTabCarouselStore, Continuation<? super RhyTabCarouselStore3> continuation) {
        super(2, continuation);
        this.this$0 = rhyTabCarouselStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RhyTabCarouselStore3 rhyTabCarouselStore3 = new RhyTabCarouselStore3(this.this$0, continuation);
        rhyTabCarouselStore3.L$0 = obj;
        return rhyTabCarouselStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends ApiRhyTabCarouselItem> list, Continuation<? super Unit> continuation) {
        return invoke2((List<ApiRhyTabCarouselItem>) list, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<ApiRhyTabCarouselItem> list, Continuation<? super Unit> continuation) {
        return ((RhyTabCarouselStore3) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            List list = (List) this.L$0;
            RhyTabCarouselItemDao rhyTabCarouselItemDao = this.this$0.dao;
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(RhyTabCarouselItem2.toDbModel((ApiRhyTabCarouselItem) it.next()));
            }
            rhyTabCarouselItemDao.clearAndInsert(arrayList);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
