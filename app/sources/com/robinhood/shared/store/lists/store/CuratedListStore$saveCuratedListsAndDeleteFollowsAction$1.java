package com.robinhood.shared.store.lists.store;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiCuratedList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CuratedListStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "paginatedResults", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiCuratedList;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.CuratedListStore$saveCuratedListsAndDeleteFollowsAction$1", m3645f = "CuratedListStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes6.dex */
final class CuratedListStore$saveCuratedListsAndDeleteFollowsAction$1 extends ContinuationImpl7 implements Function2<PaginatedResult<? extends ApiCuratedList>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CuratedListStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CuratedListStore$saveCuratedListsAndDeleteFollowsAction$1(CuratedListStore curatedListStore, Continuation<? super CuratedListStore$saveCuratedListsAndDeleteFollowsAction$1> continuation) {
        super(2, continuation);
        this.this$0 = curatedListStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CuratedListStore$saveCuratedListsAndDeleteFollowsAction$1 curatedListStore$saveCuratedListsAndDeleteFollowsAction$1 = new CuratedListStore$saveCuratedListsAndDeleteFollowsAction$1(this.this$0, continuation);
        curatedListStore$saveCuratedListsAndDeleteFollowsAction$1.L$0 = obj;
        return curatedListStore$saveCuratedListsAndDeleteFollowsAction$1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaginatedResult<ApiCuratedList> paginatedResult, Continuation<? super Unit> continuation) {
        return ((CuratedListStore$saveCuratedListsAndDeleteFollowsAction$1) create(paginatedResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends ApiCuratedList> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((PaginatedResult<ApiCuratedList>) paginatedResult, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            PaginatedResult<ApiCuratedList> paginatedResult = (PaginatedResult) this.L$0;
            this.this$0.dao.insert(paginatedResult, true);
            this.this$0.followedCuratedListIdDao.insert(paginatedResult);
            this.this$0.curatedListItemViewModeStore.syncViewModes(paginatedResult.getResults());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
