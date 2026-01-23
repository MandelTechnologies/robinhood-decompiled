package com.robinhood.android.matcha.p177ui.history.detail.incentive;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaIncentiveDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/history/detail/incentive/MatchaIncentiveDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.history.detail.incentive.MatchaIncentiveDetailDuxo$onStart$2$1", m3645f = "MatchaIncentiveDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.matcha.ui.history.detail.incentive.MatchaIncentiveDetailDuxo$onStart$2$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MatchaIncentiveDetailDuxo3 extends ContinuationImpl7 implements Function2<MatchaIncentiveDetailDataState, Continuation<? super MatchaIncentiveDetailDataState>, Object> {
    final /* synthetic */ Boolean $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchaIncentiveDetailDuxo3(Boolean bool, Continuation<? super MatchaIncentiveDetailDuxo3> continuation) {
        super(2, continuation);
        this.$it = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MatchaIncentiveDetailDuxo3 matchaIncentiveDetailDuxo3 = new MatchaIncentiveDetailDuxo3(this.$it, continuation);
        matchaIncentiveDetailDuxo3.L$0 = obj;
        return matchaIncentiveDetailDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MatchaIncentiveDetailDataState matchaIncentiveDetailDataState, Continuation<? super MatchaIncentiveDetailDataState> continuation) {
        return ((MatchaIncentiveDetailDuxo3) create(matchaIncentiveDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MatchaIncentiveDetailDataState matchaIncentiveDetailDataState = (MatchaIncentiveDetailDataState) this.L$0;
        Boolean bool = this.$it;
        Intrinsics.checkNotNull(bool);
        return MatchaIncentiveDetailDataState.copy$default(matchaIncentiveDetailDataState, null, null, null, bool.booleanValue(), null, 23, null);
    }
}
