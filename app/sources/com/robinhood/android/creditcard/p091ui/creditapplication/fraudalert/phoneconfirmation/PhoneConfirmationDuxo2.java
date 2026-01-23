package com.robinhood.android.creditcard.p091ui.creditapplication.fraudalert.phoneconfirmation;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PhoneConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/fraudalert/phoneconfirmation/PhoneConfirmationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.PhoneConfirmationDuxo$doneLoading$1", m3645f = "PhoneConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.PhoneConfirmationDuxo$doneLoading$1, reason: use source file name */
/* loaded from: classes2.dex */
final class PhoneConfirmationDuxo2 extends ContinuationImpl7 implements Function2<PhoneConfirmationViewState, Continuation<? super PhoneConfirmationViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    PhoneConfirmationDuxo2(Continuation<? super PhoneConfirmationDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PhoneConfirmationDuxo2 phoneConfirmationDuxo2 = new PhoneConfirmationDuxo2(continuation);
        phoneConfirmationDuxo2.L$0 = obj;
        return phoneConfirmationDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PhoneConfirmationViewState phoneConfirmationViewState, Continuation<? super PhoneConfirmationViewState> continuation) {
        return ((PhoneConfirmationDuxo2) create(phoneConfirmationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((PhoneConfirmationViewState) this.L$0).copy(false);
    }
}
