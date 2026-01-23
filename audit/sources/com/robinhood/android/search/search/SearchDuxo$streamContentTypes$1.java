package com.robinhood.android.search.search;

import com.robinhood.models.api.search.SearchContentType;
import com.robinhood.store.search.SearchStore4;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function6;

/* compiled from: SearchDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/models/api/search/SearchContentType;", "allowCrypto", "", "allowCryptoSearchForBitstampUkUpsell", "allowFutures", "allowECs", "allowOptions"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchDuxo$streamContentTypes$1", m3645f = "SearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class SearchDuxo$streamContentTypes$1 extends ContinuationImpl7 implements Function6<Boolean, Boolean, Boolean, Boolean, Boolean, Continuation<? super List<? extends SearchContentType>>, Object> {
    final /* synthetic */ SearchStore4 $searchSource;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    /* synthetic */ boolean Z$2;
    /* synthetic */ boolean Z$3;
    /* synthetic */ boolean Z$4;
    int label;
    final /* synthetic */ SearchDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchDuxo$streamContentTypes$1(SearchDuxo searchDuxo, SearchStore4 searchStore4, Continuation<? super SearchDuxo$streamContentTypes$1> continuation) {
        super(6, continuation);
        this.this$0 = searchDuxo;
        this.$searchSource = searchStore4;
    }

    @Override // kotlin.jvm.functions.Function6
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Continuation<? super List<? extends SearchContentType>> continuation) {
        return invoke(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), bool5.booleanValue(), continuation);
    }

    public final Object invoke(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Continuation<? super List<? extends SearchContentType>> continuation) {
        SearchDuxo$streamContentTypes$1 searchDuxo$streamContentTypes$1 = new SearchDuxo$streamContentTypes$1(this.this$0, this.$searchSource, continuation);
        searchDuxo$streamContentTypes$1.Z$0 = z;
        searchDuxo$streamContentTypes$1.Z$1 = z2;
        searchDuxo$streamContentTypes$1.Z$2 = z3;
        searchDuxo$streamContentTypes$1.Z$3 = z4;
        searchDuxo$streamContentTypes$1.Z$4 = z5;
        return searchDuxo$streamContentTypes$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        List<SearchContentType> listContentTypesBySource$feature_search_externalRelease;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        boolean z3 = this.Z$2;
        boolean z4 = this.Z$3;
        if (this.Z$4) {
            listContentTypesBySource$feature_search_externalRelease = this.this$0.contentTypesBySourceWithIndices$feature_search_externalRelease(this.$searchSource);
        } else {
            listContentTypesBySource$feature_search_externalRelease = this.this$0.contentTypesBySource$feature_search_externalRelease(this.$searchSource);
        }
        List mutableList = CollectionsKt.toMutableList((Collection) listContentTypesBySource$feature_search_externalRelease);
        if (!z && !z2) {
            mutableList.remove(SearchContentType.CURRENCY_PAIRS);
        }
        if (!z3) {
            mutableList.remove(SearchContentType.ACTIVE_FUTURES);
            mutableList.remove(SearchContentType.NON_ACTIVE_FUTURES);
            mutableList.remove(SearchContentType.FUTURES_CONTRACTS);
            mutableList.remove(SearchContentType.FUTURES_PRODUCTS);
        }
        if (!z4) {
            mutableList.remove(SearchContentType.EVENTS);
        }
        return CollectionsKt.toList(mutableList);
    }
}
