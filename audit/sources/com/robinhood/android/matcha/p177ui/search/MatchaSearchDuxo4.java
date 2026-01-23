package com.robinhood.android.matcha.p177ui.search;

import com.robinhood.models.contacts.ReferralContact;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaSearchDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$onStart$7$1", m3645f = "MatchaSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$onStart$7$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MatchaSearchDuxo4 extends ContinuationImpl7 implements Function2<MatchaSearchDataState, Continuation<? super MatchaSearchDataState>, Object> {
    final /* synthetic */ List<ReferralContact> $contacts;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchaSearchDuxo4(List<ReferralContact> list, Continuation<? super MatchaSearchDuxo4> continuation) {
        super(2, continuation);
        this.$contacts = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MatchaSearchDuxo4 matchaSearchDuxo4 = new MatchaSearchDuxo4(this.$contacts, continuation);
        matchaSearchDuxo4.L$0 = obj;
        return matchaSearchDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MatchaSearchDataState matchaSearchDataState, Continuation<? super MatchaSearchDataState> continuation) {
        return ((MatchaSearchDuxo4) create(matchaSearchDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MatchaSearchDataState matchaSearchDataState = (MatchaSearchDataState) this.L$0;
        List<ReferralContact> list = this.$contacts;
        Intrinsics.checkNotNull(list);
        return MatchaSearchDataState.copy$default(matchaSearchDataState, false, null, null, null, null, null, list, null, null, false, null, null, null, 8127, null);
    }
}
