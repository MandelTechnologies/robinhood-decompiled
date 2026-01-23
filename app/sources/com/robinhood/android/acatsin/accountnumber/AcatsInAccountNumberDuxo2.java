package com.robinhood.android.acatsin.accountnumber;

import com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberEvent;
import com.robinhood.models.acats.p299db.p300ui.UiAcatsValidationResponse;
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
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberDuxo$validateAccountNumber$2$1", m3645f = "AcatsInAccountNumberDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberDuxo$validateAccountNumber$2$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsInAccountNumberDuxo2 extends ContinuationImpl7 implements Function2<AcatsInAccountNumberDataState, Continuation<? super AcatsInAccountNumberDataState>, Object> {
    final /* synthetic */ String $accountNumber;
    final /* synthetic */ UiAcatsValidationResponse $validationResponse;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AcatsInAccountNumberDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsInAccountNumberDuxo2(AcatsInAccountNumberDuxo acatsInAccountNumberDuxo, String str, UiAcatsValidationResponse uiAcatsValidationResponse, Continuation<? super AcatsInAccountNumberDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = acatsInAccountNumberDuxo;
        this.$accountNumber = str;
        this.$validationResponse = uiAcatsValidationResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AcatsInAccountNumberDuxo2 acatsInAccountNumberDuxo2 = new AcatsInAccountNumberDuxo2(this.this$0, this.$accountNumber, this.$validationResponse, continuation);
        acatsInAccountNumberDuxo2.L$0 = obj;
        return acatsInAccountNumberDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AcatsInAccountNumberDataState acatsInAccountNumberDataState, Continuation<? super AcatsInAccountNumberDataState> continuation) {
        return ((AcatsInAccountNumberDuxo2) create(acatsInAccountNumberDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AcatsInAccountNumberDataState acatsInAccountNumberDataState = (AcatsInAccountNumberDataState) this.L$0;
        this.this$0.submit(new AcatsInAccountNumberEvent.AccountNumberToValidationResponseEvent(this.$accountNumber, this.$validationResponse));
        return AcatsInAccountNumberDataState.copy$default(acatsInAccountNumberDataState, null, null, false, null, 11, null);
    }
}
