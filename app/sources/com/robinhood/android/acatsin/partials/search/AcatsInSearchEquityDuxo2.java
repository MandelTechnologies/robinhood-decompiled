package com.robinhood.android.acatsin.partials.search;

import com.robinhood.store.search.SearchStore3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AcatsInSearchEquityDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/partials/search/AcatsInSearchEquityViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.search.AcatsInSearchEquityDuxo$onStart$2$1", m3645f = "AcatsInSearchEquityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.acatsin.partials.search.AcatsInSearchEquityDuxo$onStart$2$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsInSearchEquityDuxo2 extends ContinuationImpl7 implements Function2<AcatsInSearchEquityViewState, Continuation<? super AcatsInSearchEquityViewState>, Object> {
    final /* synthetic */ SearchStore3 $searchResult;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsInSearchEquityDuxo2(SearchStore3 searchStore3, Continuation<? super AcatsInSearchEquityDuxo2> continuation) {
        super(2, continuation);
        this.$searchResult = searchStore3;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AcatsInSearchEquityDuxo2 acatsInSearchEquityDuxo2 = new AcatsInSearchEquityDuxo2(this.$searchResult, continuation);
        acatsInSearchEquityDuxo2.L$0 = obj;
        return acatsInSearchEquityDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AcatsInSearchEquityViewState acatsInSearchEquityViewState, Continuation<? super AcatsInSearchEquityViewState> continuation) {
        return ((AcatsInSearchEquityDuxo2) create(acatsInSearchEquityViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((AcatsInSearchEquityViewState) this.L$0).copy(this.$searchResult);
    }
}
