package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.bonfire.ApiDirectDepositRelationship;
import com.robinhood.models.dao.bonfire.DirectDepositRelationshipDao;
import com.robinhood.models.p320db.bonfire.DirectDepositRelationship2;
import java.util.ArrayList;
import java.util.Iterator;
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

/* compiled from: DirectDepositRelationshipStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "apiDirectDepositRelationships", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/bonfire/ApiDirectDepositRelationship;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore$endpoint$2", m3645f = "DirectDepositRelationshipStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class DirectDepositRelationshipStore3 extends ContinuationImpl7 implements Function2<PaginatedResult<? extends ApiDirectDepositRelationship>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DirectDepositRelationshipStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DirectDepositRelationshipStore3(DirectDepositRelationshipStore directDepositRelationshipStore, Continuation<? super DirectDepositRelationshipStore3> continuation) {
        super(2, continuation);
        this.this$0 = directDepositRelationshipStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DirectDepositRelationshipStore3 directDepositRelationshipStore3 = new DirectDepositRelationshipStore3(this.this$0, continuation);
        directDepositRelationshipStore3.L$0 = obj;
        return directDepositRelationshipStore3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaginatedResult<ApiDirectDepositRelationship> paginatedResult, Continuation<? super Unit> continuation) {
        return ((DirectDepositRelationshipStore3) create(paginatedResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends ApiDirectDepositRelationship> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((PaginatedResult<ApiDirectDepositRelationship>) paginatedResult, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            PaginatedResult paginatedResult = (PaginatedResult) this.L$0;
            DirectDepositRelationshipDao directDepositRelationshipDao = this.this$0.dao;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(paginatedResult, 10));
            Iterator<T> it = paginatedResult.iterator();
            while (it.hasNext()) {
                arrayList.add(DirectDepositRelationship2.toDbModel((ApiDirectDepositRelationship) it.next()));
            }
            directDepositRelationshipDao.insert(arrayList);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
