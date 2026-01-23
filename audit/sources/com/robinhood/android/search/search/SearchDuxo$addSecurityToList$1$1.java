package com.robinhood.android.search.search;

import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.models.futures.api.bonfire.ApiFuturesContractSearchItem;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Security;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Preconditions;
import java.util.Collection;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SearchDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/search/search/SearchViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchDuxo$addSecurityToList$1$1", m3645f = "SearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class SearchDuxo$addSecurityToList$1$1 extends ContinuationImpl7 implements Function2<SearchViewState, Continuation<? super SearchViewState>, Object> {
    final /* synthetic */ Security $security;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchDuxo$addSecurityToList$1$1(Security security, Continuation<? super SearchDuxo$addSecurityToList$1$1> continuation) {
        super(2, continuation);
        this.$security = security;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchDuxo$addSecurityToList$1$1 searchDuxo$addSecurityToList$1$1 = new SearchDuxo$addSecurityToList$1$1(this.$security, continuation);
        searchDuxo$addSecurityToList$1$1.L$0 = obj;
        return searchDuxo$addSecurityToList$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SearchViewState searchViewState, Continuation<? super SearchViewState> continuation) {
        return ((SearchDuxo$addSecurityToList$1$1) create(searchViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SearchViewState searchViewState = (SearchViewState) this.L$0;
        Security security = this.$security;
        if (security instanceof Instrument) {
            return SearchViewState.copy$default(searchViewState, null, false, null, null, null, null, null, null, null, null, CollectionsKt.plus((Collection<? extends UUID>) searchViewState.getInstrumentIdsInList(), ((Instrument) this.$security).getId()), null, null, null, false, null, new UiEvent(this.$security), null, null, null, null, null, false, null, false, null, null, null, null, false, false, false, null, null, -66561, 3, null);
        }
        if (security instanceof UiCurrencyPair) {
            return SearchViewState.copy$default(searchViewState, null, false, null, null, null, null, null, null, null, null, null, CollectionsKt.plus((Collection<? extends UUID>) searchViewState.getCryptoIdsInList(), ((UiCurrencyPair) this.$security).getId()), null, null, false, null, new UiEvent(this.$security), null, null, null, null, null, false, null, false, null, null, null, null, false, false, false, null, null, -67585, 3, null);
        }
        if ((security instanceof ApiFuturesContractSearchItem) || (security instanceof FuturesContract)) {
            return SearchViewState.copy$default(searchViewState, null, false, null, null, null, null, null, null, null, null, null, null, CollectionsKt.plus((Collection<? extends UUID>) searchViewState.getFuturesContractIdsInList(), this.$security.getId()), null, false, null, new UiEvent(this.$security), null, null, null, null, null, false, null, false, null, null, null, null, false, false, false, null, null, -69633, 3, null);
        }
        if (security instanceof Index) {
            return SearchViewState.copy$default(searchViewState, null, false, null, null, null, null, null, null, null, null, null, null, null, extensions2.toImmutableList(CollectionsKt.plus((Collection<? extends UUID>) searchViewState.getIndexIdsInList(), ((Index) this.$security).getId())), false, null, new UiEvent(this.$security), null, null, null, null, null, false, null, false, null, null, null, null, false, false, false, null, null, -73729, 3, null);
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(security);
        throw new ExceptionsH();
    }
}
