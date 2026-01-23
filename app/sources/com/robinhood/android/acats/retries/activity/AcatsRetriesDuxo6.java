package com.robinhood.android.acats.retries.activity;

import com.robinhood.models.acats.p299db.bonfire.AvailableAccount;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AcatsRetriesDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/retries/activity/AcatsRetriesDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$onStart$2$1$2$1", m3645f = "AcatsRetriesDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.acats.retries.activity.AcatsRetriesDuxo$onStart$2$1$2$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsRetriesDuxo6 extends ContinuationImpl7 implements Function2<AcatsRetriesDataState, Continuation<? super AcatsRetriesDataState>, Object> {
    final /* synthetic */ AvailableAccount $transferRhsAccount;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsRetriesDuxo6(AvailableAccount availableAccount, Continuation<? super AcatsRetriesDuxo6> continuation) {
        super(2, continuation);
        this.$transferRhsAccount = availableAccount;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AcatsRetriesDuxo6 acatsRetriesDuxo6 = new AcatsRetriesDuxo6(this.$transferRhsAccount, continuation);
        acatsRetriesDuxo6.L$0 = obj;
        return acatsRetriesDuxo6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AcatsRetriesDataState acatsRetriesDataState, Continuation<? super AcatsRetriesDataState> continuation) {
        return ((AcatsRetriesDuxo6) create(acatsRetriesDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return AcatsRetriesDataState.copy$default((AcatsRetriesDataState) this.L$0, null, null, this.$transferRhsAccount, null, null, false, null, null, null, null, 1019, null);
    }
}
