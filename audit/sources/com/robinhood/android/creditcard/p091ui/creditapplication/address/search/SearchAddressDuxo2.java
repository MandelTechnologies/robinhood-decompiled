package com.robinhood.android.creditcard.p091ui.creditapplication.address.search;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SearchAddressDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/search/SearchAddressViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onCreate$1$5$1", m3645f = "SearchAddressDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.search.SearchAddressDuxo$onCreate$1$5$1, reason: use source file name */
/* loaded from: classes2.dex */
final class SearchAddressDuxo2 extends ContinuationImpl7 implements Function2<SearchAddressViewState, Continuation<? super SearchAddressViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    SearchAddressDuxo2(Continuation<? super SearchAddressDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchAddressDuxo2 searchAddressDuxo2 = new SearchAddressDuxo2(continuation);
        searchAddressDuxo2.L$0 = obj;
        return searchAddressDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SearchAddressViewState searchAddressViewState, Continuation<? super SearchAddressViewState> continuation) {
        return ((SearchAddressDuxo2) create(searchAddressViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((SearchAddressViewState) this.L$0).copy(false, CollectionsKt.emptyList(), true);
    }
}
