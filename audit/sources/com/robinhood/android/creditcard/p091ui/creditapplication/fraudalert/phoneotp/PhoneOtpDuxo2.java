package com.robinhood.android.creditcard.p091ui.creditapplication.fraudalert.phoneotp;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PhoneOtpDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/fraudalert/phoneotp/PhoneOtpViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtpDuxo$doneLoading$1", m3645f = "PhoneOtpDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtpDuxo$doneLoading$1, reason: use source file name */
/* loaded from: classes2.dex */
final class PhoneOtpDuxo2 extends ContinuationImpl7 implements Function2<PhoneOtpViewState, Continuation<? super PhoneOtpViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    PhoneOtpDuxo2(Continuation<? super PhoneOtpDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PhoneOtpDuxo2 phoneOtpDuxo2 = new PhoneOtpDuxo2(continuation);
        phoneOtpDuxo2.L$0 = obj;
        return phoneOtpDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PhoneOtpViewState phoneOtpViewState, Continuation<? super PhoneOtpViewState> continuation) {
        return ((PhoneOtpDuxo2) create(phoneOtpViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return PhoneOtpViewState.copy$default((PhoneOtpViewState) this.L$0, false, null, 2, null);
    }
}
