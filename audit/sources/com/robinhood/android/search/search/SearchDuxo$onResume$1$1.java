package com.robinhood.android.search.search;

import com.robinhood.models.api.CuratedListObjectType;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p320db.CuratedListItems;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequencesKt;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SearchDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/search/SearchViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchDuxo$onResume$1$1", m3645f = "SearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class SearchDuxo$onResume$1$1 extends ContinuationImpl7 implements Function2<SearchViewState, Continuation<? super SearchViewState>, Object> {
    final /* synthetic */ CuratedListItems $curatedListItems;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchDuxo$onResume$1$1(CuratedListItems curatedListItems, Continuation<? super SearchDuxo$onResume$1$1> continuation) {
        super(2, continuation);
        this.$curatedListItems = curatedListItems;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchDuxo$onResume$1$1 searchDuxo$onResume$1$1 = new SearchDuxo$onResume$1$1(this.$curatedListItems, continuation);
        searchDuxo$onResume$1$1.L$0 = obj;
        return searchDuxo$onResume$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SearchViewState searchViewState, Continuation<? super SearchViewState> continuation) {
        return ((SearchDuxo$onResume$1$1) create(searchViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return SearchViewState.copy$default((SearchViewState) this.L$0, null, false, null, null, null, null, null, null, null, null, SequencesKt.toList(SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(this.$curatedListItems.getListItems()), new Function1() { // from class: com.robinhood.android.search.search.SearchDuxo$onResume$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(SearchDuxo$onResume$1$1.invokeSuspend$lambda$0((CuratedListItem) obj2));
            }
        }), new Function1() { // from class: com.robinhood.android.search.search.SearchDuxo$onResume$1$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return ((CuratedListItem) obj2).getId();
            }
        })), SequencesKt.toList(SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(this.$curatedListItems.getListItems()), new Function1() { // from class: com.robinhood.android.search.search.SearchDuxo$onResume$1$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(SearchDuxo$onResume$1$1.invokeSuspend$lambda$2((CuratedListItem) obj2));
            }
        }), new Function1() { // from class: com.robinhood.android.search.search.SearchDuxo$onResume$1$1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return ((CuratedListItem) obj2).getId();
            }
        })), SequencesKt.toList(SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(this.$curatedListItems.getListItems()), new Function1() { // from class: com.robinhood.android.search.search.SearchDuxo$onResume$1$1$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(SearchDuxo$onResume$1$1.invokeSuspend$lambda$4((CuratedListItem) obj2));
            }
        }), new Function1() { // from class: com.robinhood.android.search.search.SearchDuxo$onResume$1$1$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return ((CuratedListItem) obj2).getId();
            }
        })), extensions2.toImmutableList(SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(this.$curatedListItems.getListItems()), new Function1() { // from class: com.robinhood.android.search.search.SearchDuxo$onResume$1$1$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(SearchDuxo$onResume$1$1.invokeSuspend$lambda$6((CuratedListItem) obj2));
            }
        }), new Function1() { // from class: com.robinhood.android.search.search.SearchDuxo$onResume$1$1$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return ((CuratedListItem) obj2).getId();
            }
        })), false, null, null, null, null, null, null, null, false, null, false, null, null, null, null, false, false, false, null, null, -15361, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(CuratedListItem curatedListItem) {
        return curatedListItem.getObjectType() == CuratedListObjectType.INSTRUMENT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$2(CuratedListItem curatedListItem) {
        return curatedListItem.getObjectType() == CuratedListObjectType.CURRENCY_PAIR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$4(CuratedListItem curatedListItem) {
        return curatedListItem.getObjectType() == CuratedListObjectType.FUTURES_CONTRACT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$6(CuratedListItem curatedListItem) {
        return curatedListItem.getObjectType() == CuratedListObjectType.INDEX;
    }
}
