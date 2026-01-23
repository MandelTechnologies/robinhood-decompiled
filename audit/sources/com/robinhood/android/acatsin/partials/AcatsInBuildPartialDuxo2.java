package com.robinhood.android.acatsin.partials;

import com.robinhood.models.p320db.Account;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AcatsInBuildPartialDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/partials/AcatsInBuildPartialDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.AcatsInBuildPartialDuxo$onStart$2$1", m3645f = "AcatsInBuildPartialDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.acatsin.partials.AcatsInBuildPartialDuxo$onStart$2$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsInBuildPartialDuxo2 extends ContinuationImpl7 implements Function2<AcatsInBuildPartialDataState, Continuation<? super AcatsInBuildPartialDataState>, Object> {
    final /* synthetic */ Account $account;
    final /* synthetic */ boolean $hasAccessToOptions;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsInBuildPartialDuxo2(Account account, boolean z, Continuation<? super AcatsInBuildPartialDuxo2> continuation) {
        super(2, continuation);
        this.$account = account;
        this.$hasAccessToOptions = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AcatsInBuildPartialDuxo2 acatsInBuildPartialDuxo2 = new AcatsInBuildPartialDuxo2(this.$account, this.$hasAccessToOptions, continuation);
        acatsInBuildPartialDuxo2.L$0 = obj;
        return acatsInBuildPartialDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AcatsInBuildPartialDataState acatsInBuildPartialDataState, Continuation<? super AcatsInBuildPartialDataState> continuation) {
        return ((AcatsInBuildPartialDuxo2) create(acatsInBuildPartialDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return AcatsInBuildPartialDataState.copy$default((AcatsInBuildPartialDataState) this.L$0, null, null, null, null, null, this.$account, null, null, null, this.$hasAccessToOptions, 479, null);
    }
}
