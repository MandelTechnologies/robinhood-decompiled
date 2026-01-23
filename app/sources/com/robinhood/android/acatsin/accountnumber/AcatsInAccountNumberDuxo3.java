package com.robinhood.android.acatsin.accountnumber;

import com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberEvent;
import com.robinhood.utils.extensions.Throwables;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AcatsInAccountNumberDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberDuxo$validateAccountNumber$3$1", m3645f = "AcatsInAccountNumberDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberDuxo$validateAccountNumber$3$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsInAccountNumberDuxo3 extends ContinuationImpl7 implements Function2<AcatsInAccountNumberDataState, Continuation<? super AcatsInAccountNumberDataState>, Object> {
    final /* synthetic */ String $accountNumber;

    /* renamed from: $t */
    final /* synthetic */ Throwable f3876$t;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AcatsInAccountNumberDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsInAccountNumberDuxo3(Throwable th, AcatsInAccountNumberDuxo acatsInAccountNumberDuxo, String str, Continuation<? super AcatsInAccountNumberDuxo3> continuation) {
        super(2, continuation);
        this.f3876$t = th;
        this.this$0 = acatsInAccountNumberDuxo;
        this.$accountNumber = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AcatsInAccountNumberDuxo3 acatsInAccountNumberDuxo3 = new AcatsInAccountNumberDuxo3(this.f3876$t, this.this$0, this.$accountNumber, continuation);
        acatsInAccountNumberDuxo3.L$0 = obj;
        return acatsInAccountNumberDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AcatsInAccountNumberDataState acatsInAccountNumberDataState, Continuation<? super AcatsInAccountNumberDataState> continuation) {
        return ((AcatsInAccountNumberDuxo3) create(acatsInAccountNumberDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AcatsInAccountNumberDataState acatsInAccountNumberDataState = (AcatsInAccountNumberDataState) this.L$0;
        if (Throwables.isHttpException(this.f3876$t)) {
            this.this$0.submit(new AcatsInAccountNumberEvent.AccountNumberToValidationResponseEvent(this.$accountNumber, null));
            return AcatsInAccountNumberDataState.copy$default(acatsInAccountNumberDataState, null, null, false, null, 11, null);
        }
        this.this$0.submit(new AcatsInAccountNumberEvent.NetworkErrorEvent(this.f3876$t));
        return AcatsInAccountNumberDataState.copy$default(acatsInAccountNumberDataState, null, null, false, null, 11, null);
    }
}
