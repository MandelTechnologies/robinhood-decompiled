package com.robinhood.android.matcha.p177ui.search;

import com.robinhood.models.p320db.matcha.MatchaSearchUser;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MatchaSearchDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$onStart$1$1", m3645f = "MatchaSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.matcha.ui.search.MatchaSearchDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MatchaSearchDuxo2 extends ContinuationImpl7 implements Function2<MatchaSearchDataState, Continuation<? super MatchaSearchDataState>, Object> {
    final /* synthetic */ List<MatchaSearchUser> $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchaSearchDuxo2(List<MatchaSearchUser> list, Continuation<? super MatchaSearchDuxo2> continuation) {
        super(2, continuation);
        this.$it = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MatchaSearchDuxo2 matchaSearchDuxo2 = new MatchaSearchDuxo2(this.$it, continuation);
        matchaSearchDuxo2.L$0 = obj;
        return matchaSearchDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MatchaSearchDataState matchaSearchDataState, Continuation<? super MatchaSearchDataState> continuation) {
        return ((MatchaSearchDuxo2) create(matchaSearchDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return MatchaSearchDataState.copy$default((MatchaSearchDataState) this.L$0, false, null, null, null, null, this.$it, null, null, null, false, null, null, null, 8159, null);
    }
}
