package com.robinhood.android.verification.phone;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PhoneUpdateDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/verification/phone/PhoneUpdateDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.verification.phone.PhoneUpdateDuxo$startSuv$2$3$1", m3645f = "PhoneUpdateDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.verification.phone.PhoneUpdateDuxo$startSuv$2$3$1, reason: use source file name */
/* loaded from: classes9.dex */
final class PhoneUpdateDuxo3 extends ContinuationImpl7 implements Function2<PhoneUpdateDataState, Continuation<? super PhoneUpdateDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    PhoneUpdateDuxo3(Continuation<? super PhoneUpdateDuxo3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PhoneUpdateDuxo3 phoneUpdateDuxo3 = new PhoneUpdateDuxo3(continuation);
        phoneUpdateDuxo3.L$0 = obj;
        return phoneUpdateDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PhoneUpdateDataState phoneUpdateDataState, Continuation<? super PhoneUpdateDataState> continuation) {
        return ((PhoneUpdateDuxo3) create(phoneUpdateDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return PhoneUpdateDataState.copy$default((PhoneUpdateDataState) this.L$0, false, null, null, 6, null);
    }
}
