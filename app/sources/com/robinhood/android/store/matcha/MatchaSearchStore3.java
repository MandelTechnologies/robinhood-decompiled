package com.robinhood.android.store.matcha;

import com.robinhood.android.models.matcha.api.ApiMatchaSearchContent;
import com.robinhood.android.models.matcha.api.ApiSearchResult;
import com.robinhood.android.models.matcha.api.ApiSearchUserItem;
import com.robinhood.android.models.matcha.api.ApiSearchUsersResponse;
import com.robinhood.android.models.matcha.api.SearchContentType;
import com.robinhood.models.p320db.matcha.MatchaSearchUser2;
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

/* compiled from: MatchaSearchStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/android/models/matcha/api/ApiSearchUsersResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.store.matcha.MatchaSearchStore$searchEmptyStateEndpoint$2", m3645f = "MatchaSearchStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.store.matcha.MatchaSearchStore$searchEmptyStateEndpoint$2, reason: use source file name */
/* loaded from: classes5.dex */
final class MatchaSearchStore3 extends ContinuationImpl7 implements Function2<ApiSearchUsersResponse, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MatchaSearchStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchaSearchStore3(MatchaSearchStore matchaSearchStore, Continuation<? super MatchaSearchStore3> continuation) {
        super(2, continuation);
        this.this$0 = matchaSearchStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MatchaSearchStore3 matchaSearchStore3 = new MatchaSearchStore3(this.this$0, continuation);
        matchaSearchStore3.L$0 = obj;
        return matchaSearchStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiSearchUsersResponse apiSearchUsersResponse, Continuation<? super Unit> continuation) {
        return ((MatchaSearchStore3) create(apiSearchUsersResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        List<ApiSearchUserItem> listEmptyList;
        Object next;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Iterator<T> it = ((ApiSearchUsersResponse) this.L$0).getResults().iterator();
        while (true) {
            listEmptyList = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ApiSearchResult) next).getContent().getContent_type() == SearchContentType.CONNECTIONS) {
                break;
            }
        }
        ApiSearchResult apiSearchResult = (ApiSearchResult) next;
        if (apiSearchResult != null) {
            ApiMatchaSearchContent content = apiSearchResult.getContent();
            ApiMatchaSearchContent.UserContent userContent = content instanceof ApiMatchaSearchContent.UserContent ? (ApiMatchaSearchContent.UserContent) content : null;
            if (userContent != null) {
                listEmptyList = userContent.getData();
            }
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<ApiSearchUserItem> list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(MatchaSearchUser2.toDbModel(((ApiSearchUserItem) it2.next()).getItem()));
        }
        this.this$0.emptyStateConnections.accept(arrayList);
        return Unit.INSTANCE;
    }
}
